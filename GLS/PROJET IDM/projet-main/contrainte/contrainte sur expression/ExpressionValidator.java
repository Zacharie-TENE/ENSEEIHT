package expression.validation;

import java.util.List;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import expression.Expression;
import expression.ExpressionElement;
import expression.Input;
import expression.Output;
import expression.FonctionBinaire;
import expression.FonctionUnaire;
import expression.FonctionConstante;
import expression.ExpressionPackage;
import expression.util.ExpressionSwitch;

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
public class ExpressionValidator extends ExpressionSwitch<Boolean> {
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
	public ExpressionValidator() {}
	
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
	public Boolean caseExpression(expression.Expression object) {
		// Contraintes sur l'agoritme
		this.result.recordIfFailed(
				object.getName() != null && !object.getName().isBlank(), 
				object, 
				"Le nom de l'expression doit être défini");
		
		for (ExpressionElement e : object.getElements()) {
			if (e instanceof FonctionConstante)
			{
				this.result.recordIfFailed(
						e.getInput().size() == 0, 
						object, 
						"Aucune entrée pour une fonction constante: " + e);
			}
			else if (e instanceof FonctionUnaire) {
				this.result.recordIfFailed(
						e.getInput().size() == 1, 
						object, 
						"Une entrée est necessaire pour une fonction unaire: " + e);

			}
			
			else if (e instanceof FonctionBinaire) {
				this.result.recordIfFailed(
						e.getInput().size() == 2, 
						object, 
						"Deux entrées sont nécessaires pour une fonction binaire: " + e);
			}
			else if (e instanceof Input) {
			// Contraintes sur le flux(entrée/sortie)
				Input e2 = (Input)e;
				this.result.recordIfFailed(
					e2.getName() != null && !e2.getName().isBlank(), 
					object, 
					"Le nom du flux doit être défini:" + e);
			}
			else if (e instanceof Output) {
				// Contraintes sur le flux(entrée/sortie)
					Output e2 = (Output)e;
					this.result.recordIfFailed(
						e2.getName() != null && !e2.getName().isBlank(), 
						object, 
						"Le nom du flux doit être défini:" + e);
				}
		}
		//Visite
		for (ExpressionElement e : object.getElements()) {
			this.doSwitch(e);
		}
		
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