/**
 */
package expression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flux</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link expression.Flux#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see expression.ExpressionPackage#getFlux()
 * @model abstract="true"
 * @generated
 */
public interface Flux extends ExpressionElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see expression.ExpressionPackage#getFlux_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link expression.Flux#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Flux
