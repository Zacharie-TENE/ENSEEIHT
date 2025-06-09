/**
 */
package expression.util;

import expression.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see expression.ExpressionPackage
 * @generated
 */
public class ExpressionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExpressionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionSwitch() {
		if (modelPackage == null) {
			modelPackage = ExpressionPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ExpressionPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.INPUT: {
				Input input = (Input)theEObject;
				T result = caseInput(input);
				if (result == null) result = caseFlux(input);
				if (result == null) result = caseExpressionElement(input);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.OUTPUT: {
				Output output = (Output)theEObject;
				T result = caseOutput(output);
				if (result == null) result = caseFlux(output);
				if (result == null) result = caseExpressionElement(output);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.FLUX: {
				Flux flux = (Flux)theEObject;
				T result = caseFlux(flux);
				if (result == null) result = caseExpressionElement(flux);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.EXPRESSION_ELEMENT: {
				ExpressionElement expressionElement = (ExpressionElement)theEObject;
				T result = caseExpressionElement(expressionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.FONCTION_BINAIRE: {
				FonctionBinaire fonctionBinaire = (FonctionBinaire)theEObject;
				T result = caseFonctionBinaire(fonctionBinaire);
				if (result == null) result = caseExpressionElement(fonctionBinaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.FONCTION_UNAIRE: {
				FonctionUnaire fonctionUnaire = (FonctionUnaire)theEObject;
				T result = caseFonctionUnaire(fonctionUnaire);
				if (result == null) result = caseExpressionElement(fonctionUnaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.FONCTION_CONSTANTE: {
				FonctionConstante fonctionConstante = (FonctionConstante)theEObject;
				T result = caseFonctionConstante(fonctionConstante);
				if (result == null) result = caseExpressionElement(fonctionConstante);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.INVERSE: {
				Inverse inverse = (Inverse)theEObject;
				T result = caseInverse(inverse);
				if (result == null) result = caseFonctionUnaire(inverse);
				if (result == null) result = caseExpressionElement(inverse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.COSINUS: {
				Cosinus cosinus = (Cosinus)theEObject;
				T result = caseCosinus(cosinus);
				if (result == null) result = caseFonctionUnaire(cosinus);
				if (result == null) result = caseExpressionElement(cosinus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.SINUS: {
				Sinus sinus = (Sinus)theEObject;
				T result = caseSinus(sinus);
				if (result == null) result = caseFonctionUnaire(sinus);
				if (result == null) result = caseExpressionElement(sinus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.OPPOSE: {
				Oppose oppose = (Oppose)theEObject;
				T result = caseOppose(oppose);
				if (result == null) result = caseFonctionUnaire(oppose);
				if (result == null) result = caseExpressionElement(oppose);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.SQRT: {
				Sqrt sqrt = (Sqrt)theEObject;
				T result = caseSqrt(sqrt);
				if (result == null) result = caseFonctionUnaire(sqrt);
				if (result == null) result = caseExpressionElement(sqrt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.EXPONENTIELLE: {
				Exponentielle exponentielle = (Exponentielle)theEObject;
				T result = caseExponentielle(exponentielle);
				if (result == null) result = caseFonctionUnaire(exponentielle);
				if (result == null) result = caseExpressionElement(exponentielle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.ADDITION: {
				Addition addition = (Addition)theEObject;
				T result = caseAddition(addition);
				if (result == null) result = caseFonctionBinaire(addition);
				if (result == null) result = caseExpressionElement(addition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.MULTIPLICATION: {
				Multiplication multiplication = (Multiplication)theEObject;
				T result = caseMultiplication(multiplication);
				if (result == null) result = caseFonctionBinaire(multiplication);
				if (result == null) result = caseExpressionElement(multiplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.SOUSTRACTION: {
				Soustraction soustraction = (Soustraction)theEObject;
				T result = caseSoustraction(soustraction);
				if (result == null) result = caseFonctionBinaire(soustraction);
				if (result == null) result = caseExpressionElement(soustraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.DIVISION: {
				Division division = (Division)theEObject;
				T result = caseDivision(division);
				if (result == null) result = caseFonctionBinaire(division);
				if (result == null) result = caseExpressionElement(division);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.MAX: {
				Max max = (Max)theEObject;
				T result = caseMax(max);
				if (result == null) result = caseFonctionBinaire(max);
				if (result == null) result = caseExpressionElement(max);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.MIN: {
				Min min = (Min)theEObject;
				T result = caseMin(min);
				if (result == null) result = caseFonctionBinaire(min);
				if (result == null) result = caseExpressionElement(min);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.CONST: {
				Const const_ = (Const)theEObject;
				T result = caseConst(const_);
				if (result == null) result = caseFonctionConstante(const_);
				if (result == null) result = caseExpressionElement(const_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput(Input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutput(Output object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flux</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flux</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlux(Flux object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionElement(ExpressionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fonction Binaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fonction Binaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFonctionBinaire(FonctionBinaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fonction Unaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fonction Unaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFonctionUnaire(FonctionUnaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fonction Constante</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fonction Constante</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFonctionConstante(FonctionConstante object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inverse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inverse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInverse(Inverse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cosinus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cosinus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCosinus(Cosinus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sinus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sinus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSinus(Sinus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oppose</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oppose</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOppose(Oppose object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqrt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqrt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqrt(Sqrt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exponentielle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exponentielle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExponentielle(Exponentielle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddition(Addition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplication(Multiplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Soustraction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Soustraction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoustraction(Soustraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Division</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Division</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivision(Division object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMax(Max object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Min</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMin(Min object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Const</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Const</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConst(Const object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ExpressionSwitch
