package petrinet.validation;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import petrinet.PetrinetPackage;
import petrinet.Arc;
import petrinet.PetriNet;
import petrinet.PetriNetElement;
import petrinet.Transition;
import petrinet.Place;
import petrinet.PlaceTransition;
import petrinet.util.PetrinetSwitch;




public class PetrinetValidator  extends PetrinetSwitch<Boolean> {
	
	/**
	 * Expression régulière qui correspond à un identifiant bien formé.
	 */
	private static final String IDENT_REGEX = "^[A-Za-z_][A-Za-z0-9_]*$";
	
	private static final String IDENT_REGEX_F = "^[A-Za-z_][A-Za-z0-9_]+$";
	
	/**
	 * Résultat de la validation (état interne réinitialisé à chaque nouvelle validation).
	 */
	private ValidationResult result = null;
	
	/**
	 * Construire un validateur
	 */
	public PetrinetValidator() {}
	
	
	public ValidationResult validate(Resource resource) {
		this.result = new ValidationResult();
		
		for (EObject object : resource.getContents()) {
			this.doSwitch(object);
		}
		
		return this.result;
	}

	@Override
	public Boolean casePetriNet(PetriNet object) {
		
		// Contraintes sur process
			this.result.recordIfFailed(
						object.getName() != null && object.getName().matches(IDENT_REGEX), 
						object, 
						"Le nom du petrinet ne respecte pas les conventions Java");
			
	        Set<String> names = new HashSet<>();
	        
			// Visite
			for (PetriNetElement pe : object.getPetriNetElements()) {
				
				if (pe instanceof Place || pe instanceof Transition) {
	                String name = pe instanceof Place ? ((Place) pe).getName() : ((Transition) pe).getName();
	                this.result.recordIfFailed(
	                        !names.contains(name),
	                        pe,
	                        "Le nom '" + name + "' est déjà utilisé par une autre place ou transition"
	                );
	                names.add(name);
	            }
				
				
				this.doSwitch(pe);
			}
				
		return null;
	}

	@Override
	public Boolean casePetriNetElement(PetriNetElement object) {
		return null;
	}

	@Override
	public Boolean caseArc(Arc object) {
		

		
		if(object.getSource() instanceof Transition &&  object.getDestination() instanceof Transition) {
	                this.result.recordIfFailed(
	                        false,
	                        object,
	                        "Un arc doit toujours relier une transition  ou une place et non deux places/transitions'"
	                );
	            }
	   
		
		if(object.getSource() instanceof Place && object.getDestination() instanceof Place) {
	                this.result.recordIfFailed(
	                        false,
	                        object,
	                        "Un arc doit toujours relier une transition  ou une place et non deux places/transitions'"
	                );
	            }
	    
		   this.result.recordIfFailed(
	                object.getWeight() >= 1,
	                object,
	                "Le poids d'un arc doit etre supérieur ou égal à 1"
	        );
		   

		
				
				return null;
	        	
	  
	}

	@Override
	public Boolean casePlaceTransition(PlaceTransition object) {
		return null;
	}

	@Override
	public Boolean casePlace(Place object) {
		
		this.result.recordIfFailed(
				object.getName() != null && object.getName().matches(IDENT_REGEX), 
				object, 
				"Le nom de la place ne respecte pas les conventions Java");
		
		
		this.result.recordIfFailed(
				object.getPetriNet().getPetriNetElements().stream()
					.filter(p -> p.eClass().getClassifierID() == PetrinetPackage.PLACE)
					.allMatch(pe -> (pe.equals(object) || !((Place) pe).getName().contains(object.getName()))),
				object, 
				"Le nom de la place (" + object.getName() + ") n'est pas unique");
		
		   this.result.recordIfFailed(
	                object.getNumJetons() >= 0,
	                object,
	                "Le nombre de jeton d'une place ou d'une transition doit etre un entier naturel"
	        );
		
		return null;
	}

	@Override
	public Boolean caseTransition(Transition object) {
		
		return null;
	}

	
	@Override
	public Boolean defaultCase(EObject object) {
		return null;
	}

}
