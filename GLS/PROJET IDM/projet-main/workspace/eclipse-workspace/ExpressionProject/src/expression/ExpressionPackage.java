/**
 */
package expression;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see expression.ExpressionFactory
 * @model kind="package"
 * @generated
 */
public interface ExpressionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "expression";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/expression";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "expression";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionPackage eINSTANCE = expression.impl.ExpressionPackageImpl.init();

	/**
	 * The meta object id for the '{@link expression.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.ExpressionImpl
	 * @see expression.impl.ExpressionPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__INPUT = 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OUTPUT = 2;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ELEMENTS = 3;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link expression.impl.ExpressionElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.ExpressionElementImpl
	 * @see expression.impl.ExpressionPackageImpl#getExpressionElement()
	 * @generated
	 */
	int EXPRESSION_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ELEMENT__INPUT = 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ELEMENT__OUTPUT = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link expression.impl.FluxImpl <em>Flux</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.FluxImpl
	 * @see expression.impl.ExpressionPackageImpl#getFlux()
	 * @generated
	 */
	int FLUX = 3;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUX__INPUT = EXPRESSION_ELEMENT__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUX__OUTPUT = EXPRESSION_ELEMENT__OUTPUT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUX__NAME = EXPRESSION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Flux</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUX_FEATURE_COUNT = EXPRESSION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Flux</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUX_OPERATION_COUNT = EXPRESSION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expression.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.InputImpl
	 * @see expression.impl.ExpressionPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__INPUT = FLUX__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__OUTPUT = FLUX__OUTPUT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = FLUX__NAME;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = FLUX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = FLUX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expression.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.OutputImpl
	 * @see expression.impl.ExpressionPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 2;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__INPUT = FLUX__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__OUTPUT = FLUX__OUTPUT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = FLUX__NAME;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = FLUX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = FLUX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expression.impl.FonctionBinaireImpl <em>Fonction Binaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.FonctionBinaireImpl
	 * @see expression.impl.ExpressionPackageImpl#getFonctionBinaire()
	 * @generated
	 */
	int FONCTION_BINAIRE = 5;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION_BINAIRE__INPUT = EXPRESSION_ELEMENT__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION_BINAIRE__OUTPUT = EXPRESSION_ELEMENT__OUTPUT;

	/**
	 * The number of structural features of the '<em>Fonction Binaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION_BINAIRE_FEATURE_COUNT = EXPRESSION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fonction Binaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION_BINAIRE_OPERATION_COUNT = EXPRESSION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expression.impl.FonctionUnaireImpl <em>Fonction Unaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.FonctionUnaireImpl
	 * @see expression.impl.ExpressionPackageImpl#getFonctionUnaire()
	 * @generated
	 */
	int FONCTION_UNAIRE = 6;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION_UNAIRE__INPUT = EXPRESSION_ELEMENT__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION_UNAIRE__OUTPUT = EXPRESSION_ELEMENT__OUTPUT;

	/**
	 * The number of structural features of the '<em>Fonction Unaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION_UNAIRE_FEATURE_COUNT = EXPRESSION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fonction Unaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION_UNAIRE_OPERATION_COUNT = EXPRESSION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expression.impl.FonctionConstanteImpl <em>Fonction Constante</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.FonctionConstanteImpl
	 * @see expression.impl.ExpressionPackageImpl#getFonctionConstante()
	 * @generated
	 */
	int FONCTION_CONSTANTE = 7;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION_CONSTANTE__INPUT = EXPRESSION_ELEMENT__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION_CONSTANTE__OUTPUT = EXPRESSION_ELEMENT__OUTPUT;

	/**
	 * The number of structural features of the '<em>Fonction Constante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION_CONSTANTE_FEATURE_COUNT = EXPRESSION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fonction Constante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION_CONSTANTE_OPERATION_COUNT = EXPRESSION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expression.impl.InverseImpl <em>Inverse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.InverseImpl
	 * @see expression.impl.ExpressionPackageImpl#getInverse()
	 * @generated
	 */
	int INVERSE = 8;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE__INPUT = FONCTION_UNAIRE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE__OUTPUT = FONCTION_UNAIRE__OUTPUT;

	/**
	 * The number of structural features of the '<em>Inverse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_FEATURE_COUNT = FONCTION_UNAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inverse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_OPERATION_COUNT = FONCTION_UNAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expression.impl.CosinusImpl <em>Cosinus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.CosinusImpl
	 * @see expression.impl.ExpressionPackageImpl#getCosinus()
	 * @generated
	 */
	int COSINUS = 9;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSINUS__INPUT = FONCTION_UNAIRE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSINUS__OUTPUT = FONCTION_UNAIRE__OUTPUT;

	/**
	 * The number of structural features of the '<em>Cosinus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSINUS_FEATURE_COUNT = FONCTION_UNAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cosinus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSINUS_OPERATION_COUNT = FONCTION_UNAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expression.impl.SinusImpl <em>Sinus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.SinusImpl
	 * @see expression.impl.ExpressionPackageImpl#getSinus()
	 * @generated
	 */
	int SINUS = 10;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINUS__INPUT = FONCTION_UNAIRE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINUS__OUTPUT = FONCTION_UNAIRE__OUTPUT;

	/**
	 * The number of structural features of the '<em>Sinus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINUS_FEATURE_COUNT = FONCTION_UNAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sinus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINUS_OPERATION_COUNT = FONCTION_UNAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expression.impl.OpposeImpl <em>Oppose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.OpposeImpl
	 * @see expression.impl.ExpressionPackageImpl#getOppose()
	 * @generated
	 */
	int OPPOSE = 11;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSE__INPUT = FONCTION_UNAIRE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSE__OUTPUT = FONCTION_UNAIRE__OUTPUT;

	/**
	 * The number of structural features of the '<em>Oppose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSE_FEATURE_COUNT = FONCTION_UNAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Oppose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSE_OPERATION_COUNT = FONCTION_UNAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expression.impl.SqrtImpl <em>Sqrt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.SqrtImpl
	 * @see expression.impl.ExpressionPackageImpl#getSqrt()
	 * @generated
	 */
	int SQRT = 12;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQRT__INPUT = FONCTION_UNAIRE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQRT__OUTPUT = FONCTION_UNAIRE__OUTPUT;

	/**
	 * The number of structural features of the '<em>Sqrt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQRT_FEATURE_COUNT = FONCTION_UNAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sqrt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQRT_OPERATION_COUNT = FONCTION_UNAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expression.impl.ExponentielleImpl <em>Exponentielle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.ExponentielleImpl
	 * @see expression.impl.ExpressionPackageImpl#getExponentielle()
	 * @generated
	 */
	int EXPONENTIELLE = 13;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIELLE__INPUT = FONCTION_UNAIRE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIELLE__OUTPUT = FONCTION_UNAIRE__OUTPUT;

	/**
	 * The number of structural features of the '<em>Exponentielle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIELLE_FEATURE_COUNT = FONCTION_UNAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exponentielle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIELLE_OPERATION_COUNT = FONCTION_UNAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expression.impl.AdditionImpl <em>Addition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.AdditionImpl
	 * @see expression.impl.ExpressionPackageImpl#getAddition()
	 * @generated
	 */
	int ADDITION = 14;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__INPUT = FONCTION_BINAIRE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__OUTPUT = FONCTION_BINAIRE__OUTPUT;

	/**
	 * The number of structural features of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_FEATURE_COUNT = FONCTION_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_OPERATION_COUNT = FONCTION_BINAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expression.impl.MultiplicationImpl <em>Multiplication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.MultiplicationImpl
	 * @see expression.impl.ExpressionPackageImpl#getMultiplication()
	 * @generated
	 */
	int MULTIPLICATION = 15;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__INPUT = FONCTION_BINAIRE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__OUTPUT = FONCTION_BINAIRE__OUTPUT;

	/**
	 * The number of structural features of the '<em>Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION_FEATURE_COUNT = FONCTION_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION_OPERATION_COUNT = FONCTION_BINAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expression.impl.SoustractionImpl <em>Soustraction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.SoustractionImpl
	 * @see expression.impl.ExpressionPackageImpl#getSoustraction()
	 * @generated
	 */
	int SOUSTRACTION = 16;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUSTRACTION__INPUT = FONCTION_BINAIRE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUSTRACTION__OUTPUT = FONCTION_BINAIRE__OUTPUT;

	/**
	 * The number of structural features of the '<em>Soustraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUSTRACTION_FEATURE_COUNT = FONCTION_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Soustraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUSTRACTION_OPERATION_COUNT = FONCTION_BINAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expression.impl.DivisionImpl <em>Division</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.DivisionImpl
	 * @see expression.impl.ExpressionPackageImpl#getDivision()
	 * @generated
	 */
	int DIVISION = 17;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__INPUT = FONCTION_BINAIRE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__OUTPUT = FONCTION_BINAIRE__OUTPUT;

	/**
	 * The number of structural features of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_FEATURE_COUNT = FONCTION_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_OPERATION_COUNT = FONCTION_BINAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expression.impl.MaxImpl <em>Max</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.MaxImpl
	 * @see expression.impl.ExpressionPackageImpl#getMax()
	 * @generated
	 */
	int MAX = 18;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX__INPUT = FONCTION_BINAIRE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX__OUTPUT = FONCTION_BINAIRE__OUTPUT;

	/**
	 * The number of structural features of the '<em>Max</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_FEATURE_COUNT = FONCTION_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Max</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_OPERATION_COUNT = FONCTION_BINAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expression.impl.MinImpl <em>Min</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.MinImpl
	 * @see expression.impl.ExpressionPackageImpl#getMin()
	 * @generated
	 */
	int MIN = 19;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN__INPUT = FONCTION_BINAIRE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN__OUTPUT = FONCTION_BINAIRE__OUTPUT;

	/**
	 * The number of structural features of the '<em>Min</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_FEATURE_COUNT = FONCTION_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Min</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_OPERATION_COUNT = FONCTION_BINAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expression.impl.ConstImpl <em>Const</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.ConstImpl
	 * @see expression.impl.ExpressionPackageImpl#getConst()
	 * @generated
	 */
	int CONST = 20;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST__INPUT = FONCTION_CONSTANTE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST__OUTPUT = FONCTION_CONSTANTE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST__VALUE = FONCTION_CONSTANTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_FEATURE_COUNT = FONCTION_CONSTANTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_OPERATION_COUNT = FONCTION_CONSTANTE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link expression.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see expression.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the attribute '{@link expression.Expression#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see expression.Expression#getName()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Name();

	/**
	 * Returns the meta object for the reference list '{@link expression.Expression#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see expression.Expression#getInput()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Input();

	/**
	 * Returns the meta object for the reference '{@link expression.Expression#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see expression.Expression#getOutput()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Output();

	/**
	 * Returns the meta object for the containment reference list '{@link expression.Expression#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see expression.Expression#getElements()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Elements();

	/**
	 * Returns the meta object for class '{@link expression.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see expression.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for class '{@link expression.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see expression.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for class '{@link expression.Flux <em>Flux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flux</em>'.
	 * @see expression.Flux
	 * @generated
	 */
	EClass getFlux();

	/**
	 * Returns the meta object for the attribute '{@link expression.Flux#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see expression.Flux#getName()
	 * @see #getFlux()
	 * @generated
	 */
	EAttribute getFlux_Name();

	/**
	 * Returns the meta object for class '{@link expression.ExpressionElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see expression.ExpressionElement
	 * @generated
	 */
	EClass getExpressionElement();

	/**
	 * Returns the meta object for the reference list '{@link expression.ExpressionElement#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see expression.ExpressionElement#getInput()
	 * @see #getExpressionElement()
	 * @generated
	 */
	EReference getExpressionElement_Input();

	/**
	 * Returns the meta object for the reference '{@link expression.ExpressionElement#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see expression.ExpressionElement#getOutput()
	 * @see #getExpressionElement()
	 * @generated
	 */
	EReference getExpressionElement_Output();

	/**
	 * Returns the meta object for class '{@link expression.FonctionBinaire <em>Fonction Binaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fonction Binaire</em>'.
	 * @see expression.FonctionBinaire
	 * @generated
	 */
	EClass getFonctionBinaire();

	/**
	 * Returns the meta object for class '{@link expression.FonctionUnaire <em>Fonction Unaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fonction Unaire</em>'.
	 * @see expression.FonctionUnaire
	 * @generated
	 */
	EClass getFonctionUnaire();

	/**
	 * Returns the meta object for class '{@link expression.FonctionConstante <em>Fonction Constante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fonction Constante</em>'.
	 * @see expression.FonctionConstante
	 * @generated
	 */
	EClass getFonctionConstante();

	/**
	 * Returns the meta object for class '{@link expression.Inverse <em>Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inverse</em>'.
	 * @see expression.Inverse
	 * @generated
	 */
	EClass getInverse();

	/**
	 * Returns the meta object for class '{@link expression.Cosinus <em>Cosinus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cosinus</em>'.
	 * @see expression.Cosinus
	 * @generated
	 */
	EClass getCosinus();

	/**
	 * Returns the meta object for class '{@link expression.Sinus <em>Sinus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sinus</em>'.
	 * @see expression.Sinus
	 * @generated
	 */
	EClass getSinus();

	/**
	 * Returns the meta object for class '{@link expression.Oppose <em>Oppose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oppose</em>'.
	 * @see expression.Oppose
	 * @generated
	 */
	EClass getOppose();

	/**
	 * Returns the meta object for class '{@link expression.Sqrt <em>Sqrt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqrt</em>'.
	 * @see expression.Sqrt
	 * @generated
	 */
	EClass getSqrt();

	/**
	 * Returns the meta object for class '{@link expression.Exponentielle <em>Exponentielle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exponentielle</em>'.
	 * @see expression.Exponentielle
	 * @generated
	 */
	EClass getExponentielle();

	/**
	 * Returns the meta object for class '{@link expression.Addition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition</em>'.
	 * @see expression.Addition
	 * @generated
	 */
	EClass getAddition();

	/**
	 * Returns the meta object for class '{@link expression.Multiplication <em>Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplication</em>'.
	 * @see expression.Multiplication
	 * @generated
	 */
	EClass getMultiplication();

	/**
	 * Returns the meta object for class '{@link expression.Soustraction <em>Soustraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Soustraction</em>'.
	 * @see expression.Soustraction
	 * @generated
	 */
	EClass getSoustraction();

	/**
	 * Returns the meta object for class '{@link expression.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Division</em>'.
	 * @see expression.Division
	 * @generated
	 */
	EClass getDivision();

	/**
	 * Returns the meta object for class '{@link expression.Max <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max</em>'.
	 * @see expression.Max
	 * @generated
	 */
	EClass getMax();

	/**
	 * Returns the meta object for class '{@link expression.Min <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min</em>'.
	 * @see expression.Min
	 * @generated
	 */
	EClass getMin();

	/**
	 * Returns the meta object for class '{@link expression.Const <em>Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Const</em>'.
	 * @see expression.Const
	 * @generated
	 */
	EClass getConst();

	/**
	 * Returns the meta object for the attribute '{@link expression.Const#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see expression.Const#getValue()
	 * @see #getConst()
	 * @generated
	 */
	EAttribute getConst_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExpressionFactory getExpressionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link expression.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.ExpressionImpl
		 * @see expression.impl.ExpressionPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__NAME = eINSTANCE.getExpression_Name();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__INPUT = eINSTANCE.getExpression_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__OUTPUT = eINSTANCE.getExpression_Output();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__ELEMENTS = eINSTANCE.getExpression_Elements();

		/**
		 * The meta object literal for the '{@link expression.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.InputImpl
		 * @see expression.impl.ExpressionPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '{@link expression.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.OutputImpl
		 * @see expression.impl.ExpressionPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '{@link expression.impl.FluxImpl <em>Flux</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.FluxImpl
		 * @see expression.impl.ExpressionPackageImpl#getFlux()
		 * @generated
		 */
		EClass FLUX = eINSTANCE.getFlux();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLUX__NAME = eINSTANCE.getFlux_Name();

		/**
		 * The meta object literal for the '{@link expression.impl.ExpressionElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.ExpressionElementImpl
		 * @see expression.impl.ExpressionPackageImpl#getExpressionElement()
		 * @generated
		 */
		EClass EXPRESSION_ELEMENT = eINSTANCE.getExpressionElement();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_ELEMENT__INPUT = eINSTANCE.getExpressionElement_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_ELEMENT__OUTPUT = eINSTANCE.getExpressionElement_Output();

		/**
		 * The meta object literal for the '{@link expression.impl.FonctionBinaireImpl <em>Fonction Binaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.FonctionBinaireImpl
		 * @see expression.impl.ExpressionPackageImpl#getFonctionBinaire()
		 * @generated
		 */
		EClass FONCTION_BINAIRE = eINSTANCE.getFonctionBinaire();

		/**
		 * The meta object literal for the '{@link expression.impl.FonctionUnaireImpl <em>Fonction Unaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.FonctionUnaireImpl
		 * @see expression.impl.ExpressionPackageImpl#getFonctionUnaire()
		 * @generated
		 */
		EClass FONCTION_UNAIRE = eINSTANCE.getFonctionUnaire();

		/**
		 * The meta object literal for the '{@link expression.impl.FonctionConstanteImpl <em>Fonction Constante</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.FonctionConstanteImpl
		 * @see expression.impl.ExpressionPackageImpl#getFonctionConstante()
		 * @generated
		 */
		EClass FONCTION_CONSTANTE = eINSTANCE.getFonctionConstante();

		/**
		 * The meta object literal for the '{@link expression.impl.InverseImpl <em>Inverse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.InverseImpl
		 * @see expression.impl.ExpressionPackageImpl#getInverse()
		 * @generated
		 */
		EClass INVERSE = eINSTANCE.getInverse();

		/**
		 * The meta object literal for the '{@link expression.impl.CosinusImpl <em>Cosinus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.CosinusImpl
		 * @see expression.impl.ExpressionPackageImpl#getCosinus()
		 * @generated
		 */
		EClass COSINUS = eINSTANCE.getCosinus();

		/**
		 * The meta object literal for the '{@link expression.impl.SinusImpl <em>Sinus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.SinusImpl
		 * @see expression.impl.ExpressionPackageImpl#getSinus()
		 * @generated
		 */
		EClass SINUS = eINSTANCE.getSinus();

		/**
		 * The meta object literal for the '{@link expression.impl.OpposeImpl <em>Oppose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.OpposeImpl
		 * @see expression.impl.ExpressionPackageImpl#getOppose()
		 * @generated
		 */
		EClass OPPOSE = eINSTANCE.getOppose();

		/**
		 * The meta object literal for the '{@link expression.impl.SqrtImpl <em>Sqrt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.SqrtImpl
		 * @see expression.impl.ExpressionPackageImpl#getSqrt()
		 * @generated
		 */
		EClass SQRT = eINSTANCE.getSqrt();

		/**
		 * The meta object literal for the '{@link expression.impl.ExponentielleImpl <em>Exponentielle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.ExponentielleImpl
		 * @see expression.impl.ExpressionPackageImpl#getExponentielle()
		 * @generated
		 */
		EClass EXPONENTIELLE = eINSTANCE.getExponentielle();

		/**
		 * The meta object literal for the '{@link expression.impl.AdditionImpl <em>Addition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.AdditionImpl
		 * @see expression.impl.ExpressionPackageImpl#getAddition()
		 * @generated
		 */
		EClass ADDITION = eINSTANCE.getAddition();

		/**
		 * The meta object literal for the '{@link expression.impl.MultiplicationImpl <em>Multiplication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.MultiplicationImpl
		 * @see expression.impl.ExpressionPackageImpl#getMultiplication()
		 * @generated
		 */
		EClass MULTIPLICATION = eINSTANCE.getMultiplication();

		/**
		 * The meta object literal for the '{@link expression.impl.SoustractionImpl <em>Soustraction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.SoustractionImpl
		 * @see expression.impl.ExpressionPackageImpl#getSoustraction()
		 * @generated
		 */
		EClass SOUSTRACTION = eINSTANCE.getSoustraction();

		/**
		 * The meta object literal for the '{@link expression.impl.DivisionImpl <em>Division</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.DivisionImpl
		 * @see expression.impl.ExpressionPackageImpl#getDivision()
		 * @generated
		 */
		EClass DIVISION = eINSTANCE.getDivision();

		/**
		 * The meta object literal for the '{@link expression.impl.MaxImpl <em>Max</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.MaxImpl
		 * @see expression.impl.ExpressionPackageImpl#getMax()
		 * @generated
		 */
		EClass MAX = eINSTANCE.getMax();

		/**
		 * The meta object literal for the '{@link expression.impl.MinImpl <em>Min</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.MinImpl
		 * @see expression.impl.ExpressionPackageImpl#getMin()
		 * @generated
		 */
		EClass MIN = eINSTANCE.getMin();

		/**
		 * The meta object literal for the '{@link expression.impl.ConstImpl <em>Const</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.ConstImpl
		 * @see expression.impl.ExpressionPackageImpl#getConst()
		 * @generated
		 */
		EClass CONST = eINSTANCE.getConst();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONST__VALUE = eINSTANCE.getConst_Value();

	}

} //ExpressionPackage
