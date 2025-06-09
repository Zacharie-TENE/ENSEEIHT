package tableModel.validation;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import algorithmProject.DataType;
import tableModel.Tableau;
import tableModel.ColonneType;
import tableModel.Colonne;
import tableModel.TableModelPackage;
import tableModel.ImportationAlgo;
import tableModel.ImportationTableau;
import tableModel.util.TableModelSwitch;

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
public class TableModelValidator extends TableModelSwitch<Boolean> {
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
	public TableModelValidator() {}
	
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
	public Boolean caseTableau(tableModel.Tableau object) {
		// Contraintes sur process
		this.result.recordIfFailed(
				object.getName() != null && !object.getName().isBlank(), 
				object, 
				"Un tableau doit avoir un nom");
		
		//Contraintes entre colonnes
		List<Colonne> colonnes = object.getColonnes();
		for (int i = 0; i < colonnes.size(); i++) {
		    Colonne ci = colonnes.get(i);
		    for (int j = i + 1; j < colonnes.size(); j++) {
		        Colonne cj = colonnes.get(j);
		        
		        this.result.recordIfFailed(
						!ci.getIdentifier().equals(cj.getIdentifier()), 
						object, 
						"Deux colonnes ne peuvent pas avoir le même identifiant: "+ ci.getName() + " et " + cj.getName());
		        
		        this.result.recordIfFailed(
						!ci.getName().equals(cj.getName()), 
						object, 
						"Deux colonnes ne peuvent pas avoir le même nom: " + ci.getIdentifier() + " et " + cj.getIdentifier());
		    }
		}
		
		//Visite
	    for (Colonne c : object.getColonnes()) {
			this.doSwitch(c);
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
	public Boolean caseColonne(Colonne object) {
		this.result.recordIfFailed(
				object.getName() != null && !object.getName().isBlank(), 
				object, 
				"Une colonne doit avoir un nom");
		
		this.result.recordIfFailed(
				object.getIdentifier() != null && !object.getIdentifier().isBlank(), 
				object, 
				"L'id de la colonne n'est pas bon il est null ou composé seulement d'espace");
		
		//Visite
	    if (object.getColonneType() != null) {
	    	this.doSwitch(object.getColonneType());
	    }
		
		return null;
	}

	/**
	 * MÃ©thode appelÃ©e lorsque l'objet visitÃ© est une WorkDefinition.
	 * @param object Ã©lÃ©ment visitÃ©
	 * @return rÃ©sultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas Ã©chÃ©ant)
	 */
	@Override
	public Boolean caseImportationTableau(ImportationTableau object) {
		// Contraintes sur IT
		return null;
	}

	/**
	 * MÃ©thode appelÃ©e lorsque l'objet visitÃ© est une WorkSequence.
	 * @param object Ã©lÃ©ment visitÃ©
	 * @return rÃ©sultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas Ã©chÃ©ant)
	 */
	@Override
	public Boolean caseImportationAlgo(ImportationAlgo object) {
		// Contraintes sur IA
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