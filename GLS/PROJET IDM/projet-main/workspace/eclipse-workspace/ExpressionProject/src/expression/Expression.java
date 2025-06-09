/**
 */
package expression;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link expression.Expression#getName <em>Name</em>}</li>
 *   <li>{@link expression.Expression#getInput <em>Input</em>}</li>
 *   <li>{@link expression.Expression#getOutput <em>Output</em>}</li>
 *   <li>{@link expression.Expression#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see expression.ExpressionPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see expression.ExpressionPackage#getExpression_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link expression.Expression#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link expression.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see expression.ExpressionPackage#getExpression_Input()
	 * @model
	 * @generated
	 */
	EList<Input> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(Output)
	 * @see expression.ExpressionPackage#getExpression_Output()
	 * @model required="true"
	 * @generated
	 */
	Output getOutput();

	/**
	 * Sets the value of the '{@link expression.Expression#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Output value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link expression.ExpressionElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see expression.ExpressionPackage#getExpression_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpressionElement> getElements();

} // Expression
