/**
 */
package tableModel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tableModel.TableModelFactory;
import tableModel.Tableau;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tableau</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TableauTest extends TestCase {

	/**
	 * The fixture for this Tableau test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tableau fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TableauTest.class);
	}

	/**
	 * Constructs a new Tableau test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableauTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Tableau test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Tableau fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Tableau test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tableau getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TableModelFactory.eINSTANCE.createTableau());
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

} //TableauTest
