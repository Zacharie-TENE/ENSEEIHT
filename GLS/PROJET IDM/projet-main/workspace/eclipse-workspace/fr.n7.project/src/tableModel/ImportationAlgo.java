/**
 */
package tableModel;

import algorithmProject.Algo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Importation Algo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tableModel.ImportationAlgo#getColonneIN <em>Colonne IN</em>}</li>
 *   <li>{@link tableModel.ImportationAlgo#getAlgorithm <em>Algorithm</em>}</li>
 * </ul>
 *
 * @see tableModel.TableModelPackage#getImportationAlgo()
 * @model
 * @generated
 */
public interface ImportationAlgo extends ColonneType {
	/**
	 * Returns the value of the '<em><b>Colonne IN</b></em>' reference list.
	 * The list contents are of type {@link tableModel.Colonne}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colonne IN</em>' reference list.
	 * @see tableModel.TableModelPackage#getImportationAlgo_ColonneIN()
	 * @model
	 * @generated
	 */
	EList<Colonne> getColonneIN();

	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' reference.
	 * @see #setAlgorithm(Algo)
	 * @see tableModel.TableModelPackage#getImportationAlgo_Algorithm()
	 * @model required="true"
	 * @generated
	 */
	Algo getAlgorithm();

	/**
	 * Sets the value of the '{@link tableModel.ImportationAlgo#getAlgorithm <em>Algorithm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' reference.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(Algo value);

} // ImportationAlgo
