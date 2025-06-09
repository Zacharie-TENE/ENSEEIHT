/**
 */
package tableModel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tableModel.Colonne;
import tableModel.TableModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Colonne</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ColonneTest extends TestCase {

	/**
	 * The fixture for this Colonne test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Colonne fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ColonneTest.class);
	}

	/**
	 * Constructs a new Colonne test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColonneTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Colonne test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Colonne fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Colonne test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Colonne getFixture() {
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
		setFixture(TableModelFactory.eINSTANCE.createColonne());
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

} //ColonneTest
