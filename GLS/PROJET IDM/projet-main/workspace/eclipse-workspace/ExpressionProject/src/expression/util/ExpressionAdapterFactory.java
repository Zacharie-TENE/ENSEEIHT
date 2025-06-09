/**
 */
package expression.util;

import expression.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see expression.ExpressionPackage
 * @generated
 */
public class ExpressionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExpressionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExpressionPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionSwitch<Adapter> modelSwitch =
		new ExpressionSwitch<Adapter>() {
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseInput(Input object) {
				return createInputAdapter();
			}
			@Override
			public Adapter caseOutput(Output object) {
				return createOutputAdapter();
			}
			@Override
			public Adapter caseFlux(Flux object) {
				return createFluxAdapter();
			}
			@Override
			public Adapter caseExpressionElement(ExpressionElement object) {
				return createExpressionElementAdapter();
			}
			@Override
			public Adapter caseFonctionBinaire(FonctionBinaire object) {
				return createFonctionBinaireAdapter();
			}
			@Override
			public Adapter caseFonctionUnaire(FonctionUnaire object) {
				return createFonctionUnaireAdapter();
			}
			@Override
			public Adapter caseFonctionConstante(FonctionConstante object) {
				return createFonctionConstanteAdapter();
			}
			@Override
			public Adapter caseInverse(Inverse object) {
				return createInverseAdapter();
			}
			@Override
			public Adapter caseCosinus(Cosinus object) {
				return createCosinusAdapter();
			}
			@Override
			public Adapter caseSinus(Sinus object) {
				return createSinusAdapter();
			}
			@Override
			public Adapter caseOppose(Oppose object) {
				return createOpposeAdapter();
			}
			@Override
			public Adapter caseSqrt(Sqrt object) {
				return createSqrtAdapter();
			}
			@Override
			public Adapter caseExponentielle(Exponentielle object) {
				return createExponentielleAdapter();
			}
			@Override
			public Adapter caseAddition(Addition object) {
				return createAdditionAdapter();
			}
			@Override
			public Adapter caseMultiplication(Multiplication object) {
				return createMultiplicationAdapter();
			}
			@Override
			public Adapter caseSoustraction(Soustraction object) {
				return createSoustractionAdapter();
			}
			@Override
			public Adapter caseDivision(Division object) {
				return createDivisionAdapter();
			}
			@Override
			public Adapter caseMax(Max object) {
				return createMaxAdapter();
			}
			@Override
			public Adapter caseMin(Min object) {
				return createMinAdapter();
			}
			@Override
			public Adapter caseConst(Const object) {
				return createConstAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link expression.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see expression.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link expression.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see expression.Input
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link expression.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see expression.Output
	 * @generated
	 */
	public Adapter createOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link expression.Flux <em>Flux</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see expression.Flux
	 * @generated
	 */
	public Adapter createFluxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link expression.ExpressionElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see expression.ExpressionElement
	 * @generated
	 */
	public Adapter createExpressionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link expression.FonctionBinaire <em>Fonction Binaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see expression.FonctionBinaire
	 * @generated
	 */
	public Adapter createFonctionBinaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link expression.FonctionUnaire <em>Fonction Unaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see expression.FonctionUnaire
	 * @generated
	 */
	public Adapter createFonctionUnaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link expression.FonctionConstante <em>Fonction Constante</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see expression.FonctionConstante
	 * @generated
	 */
	public Adapter createFonctionConstanteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link expression.Inverse <em>Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see expression.Inverse
	 * @generated
	 */
	public Adapter createInverseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link expression.Cosinus <em>Cosinus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see expression.Cosinus
	 * @generated
	 */
	public Adapter createCosinusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link expression.Sinus <em>Sinus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see expression.Sinus
	 * @generated
	 */
	public Adapter createSinusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link expression.Oppose <em>Oppose</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see expression.Oppose
	 * @generated
	 */
	public Adapter createOpposeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link expression.Sqrt <em>Sqrt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see expression.Sqrt
	 * @generated
	 */
	public Adapter createSqrtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link expression.Exponentielle <em>Exponentielle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see expression.Exponentielle
	 * @generated
	 */
	public Adapter createExponentielleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link expression.Addition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see expression.Addition
	 * @generated
	 */
	public Adapter createAdditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link expression.Multiplication <em>Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see expression.Multiplication
	 * @generated
	 */
	public Adapter createMultiplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link expression.Soustraction <em>Soustraction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see expression.Soustraction
	 * @generated
	 */
	public Adapter createSoustractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link expression.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see expression.Division
	 * @generated
	 */
	public Adapter createDivisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link expression.Max <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see expression.Max
	 * @generated
	 */
	public Adapter createMaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link expression.Min <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see expression.Min
	 * @generated
	 */
	public Adapter createMinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link expression.Const <em>Const</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see expression.Const
	 * @generated
	 */
	public Adapter createConstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ExpressionAdapterFactory
