/**
 */
package algorithmProject;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see algorithmProject.AlgorithmProjectPackage
 * @generated
 */
public interface AlgorithmProjectFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AlgorithmProjectFactory eINSTANCE = algorithmProject.impl.AlgorithmProjectFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Documentation</em>'.
	 * @generated
	 */
	Documentation createDocumentation();

	/**
	 * Returns a new object of class '<em>Ressource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ressource</em>'.
	 * @generated
	 */
	Ressource createRessource();

	/**
	 * Returns a new object of class '<em>Algo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Algo</em>'.
	 * @generated
	 */
	Algo createAlgo();

	/**
	 * Returns a new object of class '<em>Flux</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flux</em>'.
	 * @generated
	 */
	Flux createFlux();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AlgorithmProjectPackage getAlgorithmProjectPackage();

} //AlgorithmProjectFactory
