/**
 */
package expression;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link expression.ExpressionElement#getInput <em>Input</em>}</li>
 *   <li>{@link expression.ExpressionElement#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see expression.ExpressionPackage#getExpressionElement()
 * @model abstract="true"
 * @generated
 */
public interface ExpressionElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link expression.ExpressionElement}.
	 * It is bidirectional and its opposite is '{@link expression.ExpressionElement#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see expression.ExpressionPackage#getExpressionElement_Input()
	 * @see expression.ExpressionElement#getOutput
	 * @model opposite="output"
	 * @generated
	 */
	EList<ExpressionElement> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link expression.ExpressionElement#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(ExpressionElement)
	 * @see expression.ExpressionPackage#getExpressionElement_Output()
	 * @see expression.ExpressionElement#getInput
	 * @model opposite="input"
	 * @generated
	 */
	ExpressionElement getOutput();

	/**
	 * Sets the value of the '{@link expression.ExpressionElement#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(ExpressionElement value);

} // ExpressionElement
