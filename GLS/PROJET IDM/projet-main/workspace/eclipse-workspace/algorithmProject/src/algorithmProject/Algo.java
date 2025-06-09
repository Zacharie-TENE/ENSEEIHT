/**
 */
package algorithmProject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Algo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithmProject.Algo#getName <em>Name</em>}</li>
 *   <li>{@link algorithmProject.Algo#getInput <em>Input</em>}</li>
 *   <li>{@link algorithmProject.Algo#getRessource <em>Ressource</em>}</li>
 *   <li>{@link algorithmProject.Algo#getOutput <em>Output</em>}</li>
 *   <li>{@link algorithmProject.Algo#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link algorithmProject.Algo#isIsConstraints <em>Is Constraints</em>}</li>
 * </ul>
 *
 * @see algorithmProject.AlgorithmProjectPackage#getAlgo()
 * @model
 * @generated
 */
public interface Algo extends Documentable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see algorithmProject.AlgorithmProjectPackage#getAlgo_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link algorithmProject.Algo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link algorithmProject.Flux}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see algorithmProject.AlgorithmProjectPackage#getAlgo_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<Flux> getInput();

	/**
	 * Returns the value of the '<em><b>Ressource</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link algorithmProject.Ressource#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressource</em>' containment reference.
	 * @see #setRessource(Ressource)
	 * @see algorithmProject.AlgorithmProjectPackage#getAlgo_Ressource()
	 * @see algorithmProject.Ressource#getAlgorithm
	 * @model opposite="algorithm" containment="true" required="true"
	 * @generated
	 */
	Ressource getRessource();

	/**
	 * Sets the value of the '{@link algorithmProject.Algo#getRessource <em>Ressource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ressource</em>' containment reference.
	 * @see #getRessource()
	 * @generated
	 */
	void setRessource(Ressource value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(Flux)
	 * @see algorithmProject.AlgorithmProjectPackage#getAlgo_Output()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Flux getOutput();

	/**
	 * Sets the value of the '{@link algorithmProject.Algo#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Flux value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference list.
	 * The list contents are of type {@link algorithmProject.Documentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference list.
	 * @see algorithmProject.AlgorithmProjectPackage#getAlgo_Documentation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Documentation> getDocumentation();

	/**
	 * Returns the value of the '<em><b>Is Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Constraints</em>' attribute.
	 * @see #setIsConstraints(boolean)
	 * @see algorithmProject.AlgorithmProjectPackage#getAlgo_IsConstraints()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsConstraints();

	/**
	 * Sets the value of the '{@link algorithmProject.Algo#isIsConstraints <em>Is Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Constraints</em>' attribute.
	 * @see #isIsConstraints()
	 * @generated
	 */
	void setIsConstraints(boolean value);

} // Algo
