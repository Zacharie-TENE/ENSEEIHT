/**
 */
package algorithmProject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flux</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithmProject.Flux#getType <em>Type</em>}</li>
 *   <li>{@link algorithmProject.Flux#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see algorithmProject.AlgorithmProjectPackage#getFlux()
 * @model
 * @generated
 */
public interface Flux extends Documentable {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link algorithmProject.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see algorithmProject.DataType
	 * @see #setType(DataType)
	 * @see algorithmProject.AlgorithmProjectPackage#getFlux_Type()
	 * @model required="true"
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link algorithmProject.Flux#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see algorithmProject.DataType
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see algorithmProject.AlgorithmProjectPackage#getFlux_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link algorithmProject.Flux#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Flux
