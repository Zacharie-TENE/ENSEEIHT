/**
 */
package tableModel.tests;

import junit.textui.TestRunner;

import tableModel.ImportationTableau;
import tableModel.TableModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Importation Tableau</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImportationTableauTest extends ColonneTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ImportationTableauTest.class);
	}

	/**
	 * Constructs a new Importation Tableau test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportationTableauTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Importation Tableau test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ImportationTableau getFixture() {
		return (ImportationTableau)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TableModelFactory.eINSTANCE.createImportationTableau());
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

} //ImportationTableauTest
