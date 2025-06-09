/**
 */
package tableModel;

import algorithmProject.Algo;
import algorithmProject.DataType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colonne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tableModel.Colonne#getName <em>Name</em>}</li>
 *   <li>{@link tableModel.Colonne#getDataType <em>Data Type</em>}</li>
 *   <li>{@link tableModel.Colonne#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link tableModel.Colonne#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link tableModel.Colonne#getTableau <em>Tableau</em>}</li>
 *   <li>{@link tableModel.Colonne#getColonneType <em>Colonne Type</em>}</li>
 *   <li>{@link tableModel.Colonne#getContrainte <em>Contrainte</em>}</li>
 * </ul>
 *
 * @see tableModel.TableModelPackage#getColonne()
 * @model
 * @generated
 */
public interface Colonne extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tableModel.TableModelPackage#getColonne_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tableModel.Colonne#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link algorithmProject.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see algorithmProject.DataType
	 * @see #setDataType(DataType)
	 * @see tableModel.TableModelPackage#getColonne_DataType()
	 * @model required="true"
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link tableModel.Colonne#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see algorithmProject.DataType
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see tableModel.TableModelPackage#getColonne_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link tableModel.Colonne#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' reference list.
	 * The list contents are of type {@link algorithmProject.Algo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' reference list.
	 * @see tableModel.TableModelPackage#getColonne_Constraints()
	 * @model
	 * @generated
	 */
	EList<Algo> getConstraints();

	/**
	 * Returns the value of the '<em><b>Tableau</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tableModel.Tableau#getColonnes <em>Colonnes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tableau</em>' container reference.
	 * @see #setTableau(Tableau)
	 * @see tableModel.TableModelPackage#getColonne_Tableau()
	 * @see tableModel.Tableau#getColonnes
	 * @model opposite="colonnes" required="true" transient="false"
	 * @generated
	 */
	Tableau getTableau();

	/**
	 * Sets the value of the '{@link tableModel.Colonne#getTableau <em>Tableau</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tableau</em>' container reference.
	 * @see #getTableau()
	 * @generated
	 */
	void setTableau(Tableau value);

	/**
	 * Returns the value of the '<em><b>Colonne Type</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link tableModel.ColonneType#getColonne <em>Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colonne Type</em>' containment reference.
	 * @see #setColonneType(ColonneType)
	 * @see tableModel.TableModelPackage#getColonne_ColonneType()
	 * @see tableModel.ColonneType#getColonne
	 * @model opposite="colonne" containment="true"
	 * @generated
	 */
	ColonneType getColonneType();

	/**
	 * Sets the value of the '{@link tableModel.Colonne#getColonneType <em>Colonne Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colonne Type</em>' containment reference.
	 * @see #getColonneType()
	 * @generated
	 */
	void setColonneType(ColonneType value);

	/**
	 * Returns the value of the '<em><b>Contrainte</b></em>' attribute list.
	 * The list contents are of type {@link tableModel.contrainte}.
	 * The literals are from the enumeration {@link tableModel.contrainte}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contrainte</em>' attribute list.
	 * @see tableModel.contrainte
	 * @see tableModel.TableModelPackage#getColonne_Contrainte()
	 * @model upper="2"
	 * @generated
	 */
	EList<contrainte> getContrainte();

} // Colonne
