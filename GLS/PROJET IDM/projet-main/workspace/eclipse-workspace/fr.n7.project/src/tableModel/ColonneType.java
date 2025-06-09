/**
 */
package tableModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colonne Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tableModel.ColonneType#getColonne <em>Colonne</em>}</li>
 * </ul>
 *
 * @see tableModel.TableModelPackage#getColonneType()
 * @model abstract="true"
 * @generated
 */
public interface ColonneType extends EObject {
	/**
	 * Returns the value of the '<em><b>Colonne</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tableModel.Colonne#getColonneType <em>Colonne Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colonne</em>' container reference.
	 * @see #setColonne(Colonne)
	 * @see tableModel.TableModelPackage#getColonneType_Colonne()
	 * @see tableModel.Colonne#getColonneType
	 * @model opposite="colonneType" required="true" transient="false"
	 * @generated
	 */
	Colonne getColonne();

	/**
	 * Sets the value of the '{@link tableModel.ColonneType#getColonne <em>Colonne</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colonne</em>' container reference.
	 * @see #getColonne()
	 * @generated
	 */
	void setColonne(Colonne value);

} // ColonneType
