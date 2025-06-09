package algorithmProject.validation;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import algorithmProject.Algo;
import algorithmProject.Flux;
import algorithmProject.AlgorithmProjectPackage;
import algorithmProject.DataType;
import algorithmProject.Ressource;
import algorithmProject.Documentation;
import algorithmProject.util.AlgorithmProjectSwitch;

/**
 * RÃ©alise la validation d'un EObject issu de SimplePDL (en thÃ©orie, d'un process).
 * Cet classe visite le modÃ¨le et utilise les caseXXX pour rediriger l'algo vers la
 * bonne mÃ©thode.
 * Attention, lorsqu'une classe est un parent il faut aller faire la visite des enfants
 * manuellement (cf. caseProcess typiquement).
 * 
 * La classe Switch exige un paramÃ¨tre de gÃ©nÃ©ricitÃ© (et gÃ¨re une partie de la visite Ã 
 * base de comparaison Ã  null). Ici le paramÃ¨tre est un boolÃ©en mais en rÃ©alitÃ© on ne
 * s'en sert pas...
 * 
 * @author Guillaume Dupont
 * @version 0.1
 */
public class AlgorithmProjectValidator extends AlgorithmProjectSwitch<Boolean> {
	/**
	 * Expression rÃ©guliÃ¨re qui correspond Ã  un identifiant bien formÃ©.
	 */
	private static final String IDENT_REGEX = "^[A-Za-z_][A-Za-z0-9_]*$";
	
	/**
	 * RÃ©sultat de la validation (Ã©tat interne rÃ©initialisÃ© Ã  chaque nouvelle validation).
	 */
	private ValidationResult result = null;
	
	/**
	 * Construire un validateur
	 */
	public AlgorithmProjectValidator() {}
	
	/**
	 * Lancer la validation et compiler les rÃ©sultats dans un ValidationResult.
	 * Cette mÃ©thode se charge de crÃ©er un rÃ©sultat de validation vide puis de
	 *  visiter les process prÃ©sents dans la ressource.
	 * @param resource resource Ã  valider
	 * @return rÃ©sultat de validation
	 */
	public ValidationResult validate(Resource resource) {
		this.result = new ValidationResult();
		
		for (EObject object : resource.getContents()) {
			this.doSwitch(object);
		}
		
		return this.result;
	}


	/**
	 * MÃ©thode appelÃ©e lorsque l'objet visitÃ© est un Tableau.
	 * Cet mÃ©thode amorce aussi la visite des Ã©lÃ©ments enfants.
	 * @param object Ã©lÃ©ment visitÃ©
	 * @return rÃ©sultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas Ã©chÃ©ant)
	 */
	@Override
	public Boolean caseAlgo(algorithmProject.Algo object) {
		// Contraintes sur l'algoritme
		this.result.recordIfFailed(
				object.getName() != null && !object.getName().isBlank(), 
				object, 
				"Le nom de l'algo ne doit pas être vide");
		
		if(object.isIsConstraints()) {
			this.result.recordIfFailed(
					object.getOutput().getType() == DataType.BOOL, 
					object, 
					"La contrainte doit retourner un booléen");
		}
		
		//Visite
		for (Flux f : object.getInput()) {
			this.doSwitch(f);
		}
		this.doSwitch(object.getOutput());
		this.doSwitch(object.getRessource());
		for (Documentation doc : object.getDocumentation())
		{
			this.doSwitch(doc);
		}
		
		return null;
	}

	/**
	 * MÃ©thode appelÃ©e lorsque l'objet visitÃ© est une Colonne (ou un sous type).
	 * @param object Ã©lÃ©ment visitÃ©
	 * @return rÃ©sultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas Ã©chÃ©ant)
	 */
	@Override
	public Boolean caseFlux(Flux object) {
		// Contraintes sur le flux(entrée/sortie)
		return null;
	}

	/**
	 * MÃ©thode appelÃ©e lorsque l'objet visitÃ© est une WorkDefinition.
	 * @param object Ã©lÃ©ment visitÃ©
	 * @return rÃ©sultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas Ã©chÃ©ant)
	 */
	@Override
	public Boolean caseRessource(Ressource object) {
		// Contraintes sur ressource
		
		this.result.recordIfFailed(
				object.getPath().endsWith(".py"), 
				object, 
				"Le chemin de l'agorithme ne se termine pas par un fichier .py");
		
		return null;
	}

	/**
	 * MÃ©thode appelÃ©e lorsque l'objet visitÃ© est une WorkSequence.
	 * @param object Ã©lÃ©ment visitÃ©
	 * @return rÃ©sultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas Ã©chÃ©ant)
	 */
	@Override
	public Boolean caseDocumentation(Documentation object) {
		// Contraintes sur la documentation
		this.result.recordIfFailed(
				object.getDescription() != null && !object.getDescription().isBlank(), 
				object, 
				"La description de l'algoritme ne doit pas être vide");
		
		return null;
	}

	/**
	 * MÃ©thode appelÃ©e lorsque l'objet visitÃ© est une Guidance.
	 * @param object Ã©lÃ©ment visitÃ©
	 * @return rÃ©sultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas Ã©chÃ©ant)
	 */

	@Override
	public Boolean defaultCase(EObject object) {
		return null;
	}
	
	
}