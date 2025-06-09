/**
 */
package algorithmProject.tests;

import algorithmProject.Algo;
import algorithmProject.AlgorithmProjectFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Algo</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlgoTest extends DocumentableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AlgoTest.class);
	}

	/**
	 * Constructs a new Algo test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgoTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Algo test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Algo getFixture() {
		return (Algo)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AlgorithmProjectFactory.eINSTANCE.createAlgo());
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

} //AlgoTest
