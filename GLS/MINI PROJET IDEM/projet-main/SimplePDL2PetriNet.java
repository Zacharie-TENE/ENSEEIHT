package simplepdl.manip;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import petrinet.Arc;
import petrinet.ArcDirection;
import petrinet.ArcType;
import petrinet.PetriNet;
import petrinet.PetriNetElement;
import petrinet.PetrinetFactory;
import petrinet.PetrinetPackage;
import petrinet.Place;
import petrinet.PlaceTransition;
import petrinet.Transition;
import simplepdl.*;
import simplepdl.Process;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.WorkSequenceType;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class SimplePDL2PetriNet {
	
	  private static Map<String, PlaceTransition> petriNetElements = new HashMap<>();
	
	  public static void main(String[] args) {
		  
	

        // Charger les packages SimplePDL et PetriNet
        SimplepdlPackage simplepdlPackage = SimplepdlPackage.eINSTANCE;
        PetrinetPackage petrinetPackage = PetrinetPackage.eINSTANCE;

        // Enregistrer l'extension ".xmi" pour qu'elle soit ouverte avec XMIResourceFactoryImpl
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());

        // Créer un ResourceSet pour charger le modèle SimplePDL
        ResourceSet resSet = new ResourceSetImpl();

		//charger le modele simplePDL
        URI simplepdlURI = URI.createURI("../Target/simplepdlModel/pdl-process.xmi");
        Resource simplepdlResource = resSet.getResource(simplepdlURI, true);

        // Créer un ResourceSet pour le modèle PetriNet
        ResourceSet resSetPetriNet = new ResourceSetImpl();
		//definir le modele
        URI petriNetURI = URI.createURI("../Target/petrinetModelEmf/net-created_PetriNet_with_emf.xmi");
        Resource petriNetResource = resSetPetriNet.createResource(petriNetURI);

        // Créer une fabrique pour les éléments de PetriNet
        PetrinetFactory petrinetFactory = PetrinetFactory.eINSTANCE;

        // Charger le premier élément du modèle SimplePDL
        Process process = (Process) simplepdlResource.getContents().get(0);

        // Créer le premier élément du modèle PetriNet
        PetriNet petriNet = petrinetFactory.createPetriNet();
        petriNet.setName(process.getName());
   

        // Ajouter PetriNet au modèle
        petriNetResource.getContents().add(petriNet);

        // Transformer les ressources en places avec des jetons
        for (ProcessElement pe : process.getProcessElements()) {
            if (pe instanceof simplepdl.Resource) {
            	simplepdl.Resource r = (simplepdl.Resource) pe;
                Place place = petrinetFactory.createPlace();
                place.setNumJetons(r.getTotalResources());
                place.setName(r.getName() + "_resource");
                petriNet.getPetriNetElements().add(place);

            }
        }

        // Transformer les WorkDefinitions en places et transitions
        for (ProcessElement pe : process.getProcessElements()) {
            if (pe instanceof WorkDefinition) {
                WorkDefinition wd = (WorkDefinition) pe;

                // Créer les places
                Place notStarted = petrinetFactory.createPlace();
                notStarted.setNumJetons(1);
                notStarted.setName(wd.getName() + "_ready");//notstarted p1
                
                Place running = petrinetFactory.createPlace();
                running.setNumJetons(0);
                running.setName(wd.getName() + "_running");//p2

                Place finished = petrinetFactory.createPlace();
                finished.setNumJetons(0);
                finished.setName(wd.getName() + "_finished");//p3
                
                Place started = petrinetFactory.createPlace();
                started.setNumJetons(0);
                started.setName(wd.getName() + "_started");//p4

                // Créer les transitions
                Transition start = petrinetFactory.createTransition();
                start.setName(wd.getName() + "_start");
            
                Transition finish = petrinetFactory.createTransition();
                finish.setName(wd.getName() + "_finish");
              
         
                // Créer les arcs avec des noms
                createArc(petriNet, petrinetFactory, notStarted, start, 1, ArcType.NORMAL, ArcDirection.PLACE_TO_TRANSITION, wd.getName() + "_Start_IN");
                createArc(petriNet, petrinetFactory, start,running, 1, ArcType.NORMAL, ArcDirection.TRANSITION_TO_PLACE, wd.getName() + "_Start_OUT");
                createArc(petriNet, petrinetFactory, running, finish, 1, ArcType.NORMAL, ArcDirection.PLACE_TO_TRANSITION, wd.getName() + "_Finish_IN");
                createArc(petriNet, petrinetFactory, finish, finished, 1, ArcType.NORMAL, ArcDirection.TRANSITION_TO_PLACE, wd.getName() + "_Finish_OUT");
                createArc(petriNet, petrinetFactory, start, started, 1, ArcType.NORMAL, ArcDirection.TRANSITION_TO_PLACE, wd.getName() + "_Started");
              
                // Ajouter les éléments au PetriNet
                petriNet.getPetriNetElements().add(notStarted);
                petriNet.getPetriNetElements().add(finished);
                petriNet.getPetriNetElements().add(started);
                petriNet.getPetriNetElements().add(running);
                petriNet.getPetriNetElements().add(start);
                petriNet.getPetriNetElements().add(finish);

                // Modéliser la demande et la libération des ressources
                for (ResourceAllocator ra : wd.getLinksToAllocator()) {
                	simplepdl.Resource resource = ra.getResource();

					  // Demande de ressources
					  createArc(petriNet,petrinetFactory, findPlace(petriNet, resource.getName() + "_resource"), start, ra.getResourceCost(), ArcType.NORMAL, ArcDirection.PLACE_TO_TRANSITION,    wd.getName() + "_Acquire_" + resource.getName());

					  // Libération de ressources
					  createArc(petriNet,petrinetFactory, finish, findPlace(petriNet, resource.getName() + "_resource"), ra.getResourceCost(), ArcType.NORMAL, ArcDirection.TRANSITION_TO_PLACE, wd.getName() + "_Release_" + resource.getName());
                }
            }
        }

        // Transformer les WorkSequences en arcs
     
        for (ProcessElement pe : process.getProcessElements()) {
        	
        if (pe instanceof WorkSequence) {
            WorkSequence ws = (WorkSequence) pe;
            ArcType arcType = ArcType.READ_ARC;
            String arcName = ws.getPredecessor().getName() + "_to_" + ws.getSuccessor().getName();
            
            if (ws.getLinkType() == WorkSequenceType.FINISH_TO_START) {
            
                createArc(petriNet, petrinetFactory, findPlace(petriNet, ws.getPredecessor().getName() + "_finished"), 
                		
                		findTransition(petriNet, ws.getSuccessor().getName() + "_start"), 1, arcType, ArcDirection.PLACE_TO_TRANSITION, arcName);
                
                
            } else if (ws.getLinkType() == WorkSequenceType.FINISH_TO_FINISH) {
            	String newArcName = arcName+"_finish";
                createArc(petriNet, petrinetFactory, findPlace(petriNet, ws.getPredecessor().getName() + "_finished"), 
                          findTransition(petriNet, ws.getSuccessor().getName() + "_finish"), 1, arcType, ArcDirection.PLACE_TO_TRANSITION, newArcName);
                
            } else if (ws.getLinkType() == WorkSequenceType.START_TO_FINISH) {
            	String newArcName = arcName+"_finish";
                createArc(petriNet, petrinetFactory, findPlace(petriNet, ws.getPredecessor().getName() + "_started"), 
                          findTransition(petriNet, ws.getSuccessor().getName() + "_finish"), 1, arcType, ArcDirection.PLACE_TO_TRANSITION, newArcName);
                
            } else if (ws.getLinkType() == WorkSequenceType.START_TO_START) {
            	
                createArc(petriNet, petrinetFactory, findPlace(petriNet, ws.getPredecessor().getName() + "_started"), 
                          findTransition(petriNet, ws.getSuccessor().getName() + "_start"), 1, arcType, ArcDirection.PLACE_TO_TRANSITION, arcName);
            }
        }
        }

        // Sauvegarder le modèle PetriNet
        try {
            petriNetResource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



	
    private static void createArc(PetriNet petriNet,PetrinetFactory factory, PlaceTransition source, PlaceTransition destination, int weight, ArcType type, ArcDirection direction,String name) {
        Arc arc = factory.createArc();
        arc.setSource(source);
        arc.setDestination(destination);
        arc.setWeight(weight);
        arc.setType(type);
        arc.setName(name);  
        arc.setDirection(direction);
        source.getSuccessors().add(arc);
        destination.getPredecessors().add(arc);
        petriNet.getPetriNetElements().add(arc); // Ajouter l'arc à petriNetElements
    }
    
    //AJOUT
    private static Place createPlace(PetriNet petriNet, PetrinetFactory factory, String name, int tokens) {
        Place place = factory.createPlace();
        place.setName(name);
        place.setNumJetons(tokens);
        petriNet.getPetriNetElements().add(place);
        petriNetElements.put(name, place);
        return place;
    }

    private static Transition createTransition(PetriNet petriNet, PetrinetFactory factory, String name) {
        Transition transition = factory.createTransition();
        transition.setName(name);
        petriNet.getPetriNetElements().add(transition);
        petriNetElements.put(name, transition);
        return transition;
    }
//

    private static Place findPlace(PetriNet petriNet, String name) {
        for (PetriNetElement element : petriNet.getPetriNetElements()) {
            if (element instanceof Place && element.getName().equals(name)) {
                return (Place) element;
            }
        }
        return null;
    }

    private static Transition findTransition(PetriNet petriNet, String name) {
        for (PetriNetElement element : petriNet.getPetriNetElements()) {
            if (element instanceof Transition && element.getName().equals(name)) {
                return (Transition) element;
            }
        }
        return null;
    }

}