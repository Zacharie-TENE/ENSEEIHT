/**
 */
package tableModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tableau</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tableModel.Tableau#getName <em>Name</em>}</li>
 *   <li>{@link tableModel.Tableau#getColonneDeLignes <em>Colonne De Lignes</em>}</li>
 *   <li>{@link tableModel.Tableau#getColonnes <em>Colonnes</em>}</li>
 * </ul>
 *
 * @see tableModel.TableModelPackage#getTableau()
 * @model
 * @generated
 */
public interface Tableau extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tableModel.TableModelPackage#getTableau_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tableModel.Tableau#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Colonne De Lignes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colonne De Lignes</em>' reference.
	 * @see #setColonneDeLignes(Colonne)
	 * @see tableModel.TableModelPackage#getTableau_ColonneDeLignes()
	 * @model required="true"
	 * @generated
	 */
	Colonne getColonneDeLignes();

	/**
	 * Sets the value of the '{@link tableModel.Tableau#getColonneDeLignes <em>Colonne De Lignes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colonne De Lignes</em>' reference.
	 * @see #getColonneDeLignes()
	 * @generated
	 */
	void setColonneDeLignes(Colonne value);

	/**
	 * Returns the value of the '<em><b>Colonnes</b></em>' containment reference list.
	 * The list contents are of type {@link tableModel.Colonne}.
	 * It is bidirectional and its opposite is '{@link tableModel.Colonne#getTableau <em>Tableau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colonnes</em>' containment reference list.
	 * @see tableModel.TableModelPackage#getTableau_Colonnes()
	 * @see tableModel.Colonne#getTableau
	 * @model opposite="tableau" containment="true"
	 * @generated
	 */
	EList<Colonne> getColonnes();

} // Tableau
