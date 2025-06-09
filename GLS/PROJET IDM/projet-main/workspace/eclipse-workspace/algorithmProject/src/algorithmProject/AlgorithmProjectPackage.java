/**
 */
package algorithmProject;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see algorithmProject.AlgorithmProjectFactory
 * @model kind="package"
 * @generated
 */
public interface AlgorithmProjectPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "algorithmProject";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/algorithmProject";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "algorithmProject";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AlgorithmProjectPackage eINSTANCE = algorithmProject.impl.AlgorithmProjectPackageImpl.init();

	/**
	 * The meta object id for the '{@link algorithmProject.impl.DocumentableImpl <em>Documentable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithmProject.impl.DocumentableImpl
	 * @see algorithmProject.impl.AlgorithmProjectPackageImpl#getDocumentable()
	 * @generated
	 */
	int DOCUMENTABLE = 0;

	/**
	 * The number of structural features of the '<em>Documentable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Documentable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link algorithmProject.impl.DocumentationImpl <em>Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithmProject.impl.DocumentationImpl
	 * @see algorithmProject.impl.AlgorithmProjectPackageImpl#getDocumentation()
	 * @generated
	 */
	int DOCUMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Link To Documentable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__LINK_TO_DOCUMENTABLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link algorithmProject.impl.RessourceImpl <em>Ressource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithmProject.impl.RessourceImpl
	 * @see algorithmProject.impl.AlgorithmProjectPackageImpl#getRessource()
	 * @generated
	 */
	int RESSOURCE = 2;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__PATH = DOCUMENTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__ALGORITHM = DOCUMENTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_FEATURE_COUNT = DOCUMENTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_OPERATION_COUNT = DOCUMENTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link algorithmProject.impl.AlgoImpl <em>Algo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithmProject.impl.AlgoImpl
	 * @see algorithmProject.impl.AlgorithmProjectPackageImpl#getAlgo()
	 * @generated
	 */
	int ALGO = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO__NAME = DOCUMENTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO__INPUT = DOCUMENTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ressource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO__RESSOURCE = DOCUMENTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO__OUTPUT = DOCUMENTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO__DOCUMENTATION = DOCUMENTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO__IS_CONSTRAINTS = DOCUMENTABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Algo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO_FEATURE_COUNT = DOCUMENTABLE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Algo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO_OPERATION_COUNT = DOCUMENTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link algorithmProject.impl.FluxImpl <em>Flux</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithmProject.impl.FluxImpl
	 * @see algorithmProject.impl.AlgorithmProjectPackageImpl#getFlux()
	 * @generated
	 */
	int FLUX = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUX__TYPE = DOCUMENTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUX__VALUE = DOCUMENTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Flux</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUX_FEATURE_COUNT = DOCUMENTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Flux</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUX_OPERATION_COUNT = DOCUMENTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link algorithmProject.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithmProject.DataType
	 * @see algorithmProject.impl.AlgorithmProjectPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link algorithmProject.Documentable <em>Documentable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentable</em>'.
	 * @see algorithmProject.Documentable
	 * @generated
	 */
	EClass getDocumentable();

	/**
	 * Returns the meta object for class '{@link algorithmProject.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation</em>'.
	 * @see algorithmProject.Documentation
	 * @generated
	 */
	EClass getDocumentation();

	/**
	 * Returns the meta object for the reference '{@link algorithmProject.Documentation#getLinkToDocumentable <em>Link To Documentable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link To Documentable</em>'.
	 * @see algorithmProject.Documentation#getLinkToDocumentable()
	 * @see #getDocumentation()
	 * @generated
	 */
	EReference getDocumentation_LinkToDocumentable();

	/**
	 * Returns the meta object for the attribute '{@link algorithmProject.Documentation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see algorithmProject.Documentation#getDescription()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Description();

	/**
	 * Returns the meta object for class '{@link algorithmProject.Ressource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ressource</em>'.
	 * @see algorithmProject.Ressource
	 * @generated
	 */
	EClass getRessource();

	/**
	 * Returns the meta object for the attribute '{@link algorithmProject.Ressource#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see algorithmProject.Ressource#getPath()
	 * @see #getRessource()
	 * @generated
	 */
	EAttribute getRessource_Path();

	/**
	 * Returns the meta object for the container reference '{@link algorithmProject.Ressource#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Algorithm</em>'.
	 * @see algorithmProject.Ressource#getAlgorithm()
	 * @see #getRessource()
	 * @generated
	 */
	EReference getRessource_Algorithm();

	/**
	 * Returns the meta object for class '{@link algorithmProject.Algo <em>Algo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algo</em>'.
	 * @see algorithmProject.Algo
	 * @generated
	 */
	EClass getAlgo();

	/**
	 * Returns the meta object for the attribute '{@link algorithmProject.Algo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see algorithmProject.Algo#getName()
	 * @see #getAlgo()
	 * @generated
	 */
	EAttribute getAlgo_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link algorithmProject.Algo#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see algorithmProject.Algo#getInput()
	 * @see #getAlgo()
	 * @generated
	 */
	EReference getAlgo_Input();

	/**
	 * Returns the meta object for the containment reference '{@link algorithmProject.Algo#getRessource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ressource</em>'.
	 * @see algorithmProject.Algo#getRessource()
	 * @see #getAlgo()
	 * @generated
	 */
	EReference getAlgo_Ressource();

	/**
	 * Returns the meta object for the containment reference '{@link algorithmProject.Algo#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see algorithmProject.Algo#getOutput()
	 * @see #getAlgo()
	 * @generated
	 */
	EReference getAlgo_Output();

	/**
	 * Returns the meta object for the containment reference list '{@link algorithmProject.Algo#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see algorithmProject.Algo#getDocumentation()
	 * @see #getAlgo()
	 * @generated
	 */
	EReference getAlgo_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link algorithmProject.Algo#isIsConstraints <em>Is Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Constraints</em>'.
	 * @see algorithmProject.Algo#isIsConstraints()
	 * @see #getAlgo()
	 * @generated
	 */
	EAttribute getAlgo_IsConstraints();

	/**
	 * Returns the meta object for class '{@link algorithmProject.Flux <em>Flux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flux</em>'.
	 * @see algorithmProject.Flux
	 * @generated
	 */
	EClass getFlux();

	/**
	 * Returns the meta object for the attribute '{@link algorithmProject.Flux#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see algorithmProject.Flux#getType()
	 * @see #getFlux()
	 * @generated
	 */
	EAttribute getFlux_Type();

	/**
	 * Returns the meta object for the attribute '{@link algorithmProject.Flux#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see algorithmProject.Flux#getValue()
	 * @see #getFlux()
	 * @generated
	 */
	EAttribute getFlux_Value();

	/**
	 * Returns the meta object for enum '{@link algorithmProject.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see algorithmProject.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AlgorithmProjectFactory getAlgorithmProjectFactory();

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
		 * The meta object literal for the '{@link algorithmProject.impl.DocumentableImpl <em>Documentable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithmProject.impl.DocumentableImpl
		 * @see algorithmProject.impl.AlgorithmProjectPackageImpl#getDocumentable()
		 * @generated
		 */
		EClass DOCUMENTABLE = eINSTANCE.getDocumentable();

		/**
		 * The meta object literal for the '{@link algorithmProject.impl.DocumentationImpl <em>Documentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithmProject.impl.DocumentationImpl
		 * @see algorithmProject.impl.AlgorithmProjectPackageImpl#getDocumentation()
		 * @generated
		 */
		EClass DOCUMENTATION = eINSTANCE.getDocumentation();

		/**
		 * The meta object literal for the '<em><b>Link To Documentable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION__LINK_TO_DOCUMENTABLE = eINSTANCE.getDocumentation_LinkToDocumentable();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__DESCRIPTION = eINSTANCE.getDocumentation_Description();

		/**
		 * The meta object literal for the '{@link algorithmProject.impl.RessourceImpl <em>Ressource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithmProject.impl.RessourceImpl
		 * @see algorithmProject.impl.AlgorithmProjectPackageImpl#getRessource()
		 * @generated
		 */
		EClass RESSOURCE = eINSTANCE.getRessource();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCE__PATH = eINSTANCE.getRessource_Path();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESSOURCE__ALGORITHM = eINSTANCE.getRessource_Algorithm();

		/**
		 * The meta object literal for the '{@link algorithmProject.impl.AlgoImpl <em>Algo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithmProject.impl.AlgoImpl
		 * @see algorithmProject.impl.AlgorithmProjectPackageImpl#getAlgo()
		 * @generated
		 */
		EClass ALGO = eINSTANCE.getAlgo();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGO__NAME = eINSTANCE.getAlgo_Name();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGO__INPUT = eINSTANCE.getAlgo_Input();

		/**
		 * The meta object literal for the '<em><b>Ressource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGO__RESSOURCE = eINSTANCE.getAlgo_Ressource();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGO__OUTPUT = eINSTANCE.getAlgo_Output();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGO__DOCUMENTATION = eINSTANCE.getAlgo_Documentation();

		/**
		 * The meta object literal for the '<em><b>Is Constraints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGO__IS_CONSTRAINTS = eINSTANCE.getAlgo_IsConstraints();

		/**
		 * The meta object literal for the '{@link algorithmProject.impl.FluxImpl <em>Flux</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithmProject.impl.FluxImpl
		 * @see algorithmProject.impl.AlgorithmProjectPackageImpl#getFlux()
		 * @generated
		 */
		EClass FLUX = eINSTANCE.getFlux();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLUX__TYPE = eINSTANCE.getFlux_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLUX__VALUE = eINSTANCE.getFlux_Value();

		/**
		 * The meta object literal for the '{@link algorithmProject.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithmProject.DataType
		 * @see algorithmProject.impl.AlgorithmProjectPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

	}

} //AlgorithmProjectPackage
