/**
 */
package tableModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tableModel.TableModelPackage
 * @generated
 */
public interface TableModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TableModelFactory eINSTANCE = tableModel.impl.TableModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Tableau</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tableau</em>'.
	 * @generated
	 */
	Tableau createTableau();

	/**
	 * Returns a new object of class '<em>Colonne</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Colonne</em>'.
	 * @generated
	 */
	Colonne createColonne();

	/**
	 * Returns a new object of class '<em>Importation Tableau</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Importation Tableau</em>'.
	 * @generated
	 */
	ImportationTableau createImportationTableau();

	/**
	 * Returns a new object of class '<em>Importation Algo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Importation Algo</em>'.
	 * @generated
	 */
	ImportationAlgo createImportationAlgo();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TableModelPackage getTableModelPackage();

} //TableModelFactory
