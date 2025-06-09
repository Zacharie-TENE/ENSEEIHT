package simplepdl.validation;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import simplepdl.Guidance;
import simplepdl.ProcessElement;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.util.SimplepdlSwitch;

/**
 * Réalise la validation d'un EObject issu de SimplePDL (en théorie, d'un process).
 * Cet classe visite le modèle et utilise les caseXXX pour rediriger l'algo vers la
 * bonne méthode.
 * Attention, lorsqu'une classe est un parent il faut aller faire la visite des enfants
 * manuellement (cf. caseProcess typiquement).
 * 
 * La classe Switch exige un paramètre de généricité (et gère une partie de la visite à
 * base de comparaison à null). Ici le paramètre est un booléen mais en réalité on ne
 * s'en sert pas...
 * 
 * @author Guillaume Dupont
 * @version 0.1
 */
public class SimplePDLValidator extends SimplepdlSwitch<Boolean> {
	/**
	 * Expression régulière qui correspond à un identifiant bien formé.
	 */
	private static final String IDENT_REGEX = "^[A-Za-z_][A-Za-z0-9_]+$";
	
	/**
	 * Résultat de la validation (état interne réinitialisé à chaque nouvelle validation).
	 */
	private ValidationResult result = null;
	
	/**
	 * Construire un validateur
	 */
	public SimplePDLValidator() {}
	
	/**
	 * Lancer la validation et compiler les résultats dans un ValidationResult.
	 * Cette méthode se charge de créer un résultat de validation vide puis de
	 *  visiter les process présents dans la ressource.
	 * @param resource resource à valider
	 * @return résultat de validation
	 */
	public ValidationResult validate(Resource resource) {
		this.result = new ValidationResult();
		
		for (EObject object : resource.getContents()) {
			this.doSwitch(object);
		}
		
		return this.result;
	}


	/**
	 * Méthode appelée lorsque l'objet visité est un Process.
	 * Cet méthode amorce aussi la visite des éléments enfants.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseProcess(simplepdl.Process object) {
		// Contraintes sur process
		this.result.recordIfFailed(
				object.getName() != null && object.getName().matches(IDENT_REGEX), 
				object, 
				"Le nom du process ne respecte pas les conventions Java et ne contient pas au moins 02 caracteres alphanumeriques.");
		
		// Contrainte sur les noms uniques des ressources et workdefinitions
        Set<String> names = new HashSet<>();
        
		// Visite
		for (ProcessElement pe : object.getProcessElements()) {
			
			if (pe instanceof WorkDefinition || pe instanceof simplepdl.Resource) {
                String name = pe instanceof WorkDefinition ? ((WorkDefinition) pe).getName() : ((simplepdl.Resource) pe).getName();
                this.result.recordIfFailed(
                        !names.contains(name),
                        pe,
                        "Le nom '" + name + "' est déjà utilisé par une autre ressource ou activité dans ce processus"
                );
                names.add(name);
            }
			
			
			this.doSwitch(pe);
		}
				
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est un ProcessElement (ou un sous type).
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseProcessElement(ProcessElement object) {
		
		
		
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une WorkDefinition.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseWorkDefinition(WorkDefinition object) {
		
		// CONTRAINTE SUR LE NOM D'UNE ACTIVITE
		
		// Contraintes sur WD, 
		this.result.recordIfFailed(
				object.getName() != null && object.getName().matches(IDENT_REGEX), 
				object, 
				"Le nom de l'activité ne respecte pas les conventions Java ou ne contient pas au moins 02 caracteres alphanumeriques.");
		
	    // Contrainte sur la dépendance à elle-même
		this.result.recordIfFailed(
				object.getProcess().getProcessElements().stream()
					.filter(p -> p.eClass().getClassifierID() == SimplepdlPackage.WORK_DEFINITION)
					.allMatch(pe -> (pe.equals(object) ||!((WorkDefinition) pe).getName().contains(object.getName()))),
				object, 
				"Le nom de l'activité (" + object.getName() + ") n'est pas unique");
		
	    
        
       /***
        * (Une activité ne doit pas dépendre d'elle même) DÉJÀ GERER DANS LES WORKSEQUENCE
        * 
        *  for (WorkSequence ws : object.getLinksToPredecessors()) {
            this.result.recordIfFailed(
                    !ws.getPredecessor().equals(object),
                    ws,
                    "L'activité '" + object.getName() + "' ne doit pas dépendre d'elle-même"
            );
        }***/
        
		
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une WorkSequence.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseWorkSequence(WorkSequence object) {
		   
		/**
		  // Contrainte sur la dépendance dans le même processus
        this.result.recordIfFailed(
                object.getPredecessor().getProcess().equals(object.getSuccessor().getProcess()),
                //faux si jamais c est pas identique
                object,
                "La dépendance doit être entre des activités du même processus"
        );**/
        
        // Contraintes sur WS,
        //une dépendance ne doit pas relier une activité à elle même(Une activité ne doit pas dépendre d'elle même)
		this.result.recordIfFailed(
				!object.getPredecessor().equals(object.getSuccessor()), 
				object,
				"La dépendance relie l'activité " + object.getPredecessor().getName() + " à elle-même");
		
		 
        // Contrainte sur les dépendances uniques
		//( Deux dependances differentes de même type entre deux mêmes activites ne peuvent cohexister)
        for (WorkSequence ws : object.getSuccessor().getLinksToPredecessors()) {
            if (ws != object && ws.getPredecessor().equals(object.getPredecessor()) && ws.getLinkType() == object.getLinkType()) {
                this.result.recordIfFailed(
                        false,
                        object,
                        "Il existe déjà une dépendance de même type entre '" + object.getPredecessor().getName() + "' et '" + object.getSuccessor().getName() + "'"
                );
            }
        }
		
		
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une Guidance.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 * *pour le ressources
	 */
	@Override
	public Boolean caseGuidance(Guidance object) {
		this.result.recordIfFailed(
				!( object.getText() == null || object.getText().trim().isEmpty()), 
				object,
				"La guidance doit avoir un texte non vide et  ne peut pas contenir que des espaces " );
		
		return null;
	}

	/**
	 * Cas par défaut, lorsque l'objet visité ne correspond pas à un des autres cas.
	 * Cette méthode est aussi appelée lorsqu'une méthode renvoie null (comme une sorte de
	 * fallback).
	 * On pourrait implémenter le switch différemment, en ne renvoyant null dans les autres
	 * méthodes que si la contrainte ne sert à rien, et se servir de cette méthode pour
	 * identifier les éléments étrangers (qui de toute façon ne doivent pas exister).
	 * C'est aussi la méthode appelée si on ne redéfini pas un des caseXXX.
	 * @param object objet visité
	 * @return résultat, null ici
	 */
	@Override
	public Boolean defaultCase(EObject object) {
		return null;
	}
	
	
	@Override
    public Boolean caseResource(simplepdl.Resource object) {
        // Contrainte sur le nom de la ressource
        this.result.recordIfFailed(
        		object.getName() != null && object.getName().matches(IDENT_REGEX), 
				object, 
				"Le nom de la ressource ne respecte pas les conventions Java ou ne contient pas au moins 02 caracteres alphanumeriques");
         
        // Contrainte sur le nombre d'occurrences d'une resource
        this.result.recordIfFailed(
                object.getTotalResources() >= 1,
                object,
                "Le nombre d'occurrences d'une ressource doit être supérieur à 1"
        );
        
        return null;
    }
	
    @Override
    public Boolean caseResourceAllocator(simplepdl.ResourceAllocator object) {
        // Contrainte sur la quantité de ressources
        this.result.recordIfFailed(
                object.getResourceCost() > 0,
                object,
                "La quantité en besoin d'une ressource doit être strictement supérieure à 0"
        );
        
        return null;
    }

	
}
