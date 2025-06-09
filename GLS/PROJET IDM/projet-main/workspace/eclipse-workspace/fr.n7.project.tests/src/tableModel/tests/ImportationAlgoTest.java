/**
 */
package tableModel.tests;

import junit.textui.TestRunner;

import tableModel.ImportationAlgo;
import tableModel.TableModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Importation Algo</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImportationAlgoTest extends ColonneTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ImportationAlgoTest.class);
	}

	/**
	 * Constructs a new Importation Algo test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportationAlgoTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Importation Algo test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ImportationAlgo getFixture() {
		return (ImportationAlgo)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TableModelFactory.eINSTANCE.createImportationAlgo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ImportationAlgoTest
