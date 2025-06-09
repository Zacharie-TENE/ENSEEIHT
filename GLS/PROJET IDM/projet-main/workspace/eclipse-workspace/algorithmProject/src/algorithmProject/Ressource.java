/**
 */
package algorithmProject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithmProject.Ressource#getPath <em>Path</em>}</li>
 *   <li>{@link algorithmProject.Ressource#getAlgorithm <em>Algorithm</em>}</li>
 * </ul>
 *
 * @see algorithmProject.AlgorithmProjectPackage#getRessource()
 * @model
 * @generated
 */
public interface Ressource extends Documentable {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see algorithmProject.AlgorithmProjectPackage#getRessource_Path()
	 * @model required="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link algorithmProject.Ressource#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link algorithmProject.Algo#getRessource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' container reference.
	 * @see #setAlgorithm(Algo)
	 * @see algorithmProject.AlgorithmProjectPackage#getRessource_Algorithm()
	 * @see algorithmProject.Algo#getRessource
	 * @model opposite="ressource" required="true" transient="false"
	 * @generated
	 */
	Algo getAlgorithm();

	/**
	 * Sets the value of the '{@link algorithmProject.Ressource#getAlgorithm <em>Algorithm</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' container reference.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(Algo value);

} // Ressource
