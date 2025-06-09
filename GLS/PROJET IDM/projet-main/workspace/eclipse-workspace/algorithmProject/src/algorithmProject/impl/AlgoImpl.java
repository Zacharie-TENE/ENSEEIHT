/**
 */
package algorithmProject.impl;

import algorithmProject.Algo;
import algorithmProject.AlgorithmProjectPackage;
import algorithmProject.Documentation;
import algorithmProject.Flux;
import algorithmProject.Ressource;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Algo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link algorithmProject.impl.AlgoImpl#getName <em>Name</em>}</li>
 *   <li>{@link algorithmProject.impl.AlgoImpl#getInput <em>Input</em>}</li>
 *   <li>{@link algorithmProject.impl.AlgoImpl#getRessource <em>Ressource</em>}</li>
 *   <li>{@link algorithmProject.impl.AlgoImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link algorithmProject.impl.AlgoImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link algorithmProject.impl.AlgoImpl#isIsConstraints <em>Is Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlgoImpl extends DocumentableImpl implements Algo {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Flux> input;

	/**
	 * The cached value of the '{@link #getRessource() <em>Ressource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessource()
	 * @generated
	 * @ordered
	 */
	protected Ressource ressource;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected Flux output;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected EList<Documentation> documentation;

	/**
	 * The default value of the '{@link #isIsConstraints() <em>Is Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConstraints()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONSTRAINTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsConstraints() <em>Is Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConstraints()
	 * @generated
	 * @ordered
	 */
	protected boolean isConstraints = IS_CONSTRAINTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlgoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmProjectPackage.Literals.ALGO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmProjectPackage.ALGO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Flux> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<Flux>(Flux.class, this, AlgorithmProjectPackage.ALGO__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ressource getRessource() {
		return ressource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRessource(Ressource newRessource, NotificationChain msgs) {
		Ressource oldRessource = ressource;
		ressource = newRessource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlgorithmProjectPackage.ALGO__RESSOURCE, oldRessource, newRessource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRessource(Ressource newRessource) {
		if (newRessource != ressource) {
			NotificationChain msgs = null;
			if (ressource != null)
				msgs = ((InternalEObject)ressource).eInverseRemove(this, AlgorithmProjectPackage.RESSOURCE__ALGORITHM, Ressource.class, msgs);
			if (newRessource != null)
				msgs = ((InternalEObject)newRessource).eInverseAdd(this, AlgorithmProjectPackage.RESSOURCE__ALGORITHM, Ressource.class, msgs);
			msgs = basicSetRessource(newRessource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmProjectPackage.ALGO__RESSOURCE, newRessource, newRessource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Flux getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput(Flux newOutput, NotificationChain msgs) {
		Flux oldOutput = output;
		output = newOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlgorithmProjectPackage.ALGO__OUTPUT, oldOutput, newOutput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutput(Flux newOutput) {
		if (newOutput != output) {
			NotificationChain msgs = null;
			if (output != null)
				msgs = ((InternalEObject)output).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlgorithmProjectPackage.ALGO__OUTPUT, null, msgs);
			if (newOutput != null)
				msgs = ((InternalEObject)newOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlgorithmProjectPackage.ALGO__OUTPUT, null, msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmProjectPackage.ALGO__OUTPUT, newOutput, newOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Documentation> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectContainmentEList<Documentation>(Documentation.class, this, AlgorithmProjectPackage.ALGO__DOCUMENTATION);
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsConstraints() {
		return isConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsConstraints(boolean newIsConstraints) {
		boolean oldIsConstraints = isConstraints;
		isConstraints = newIsConstraints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmProjectPackage.ALGO__IS_CONSTRAINTS, oldIsConstraints, isConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlgorithmProjectPackage.ALGO__RESSOURCE:
				if (ressource != null)
					msgs = ((InternalEObject)ressource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlgorithmProjectPackage.ALGO__RESSOURCE, null, msgs);
				return basicSetRessource((Ressource)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlgorithmProjectPackage.ALGO__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case AlgorithmProjectPackage.ALGO__RESSOURCE:
				return basicSetRessource(null, msgs);
			case AlgorithmProjectPackage.ALGO__OUTPUT:
				return basicSetOutput(null, msgs);
			case AlgorithmProjectPackage.ALGO__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlgorithmProjectPackage.ALGO__NAME:
				return getName();
			case AlgorithmProjectPackage.ALGO__INPUT:
				return getInput();
			case AlgorithmProjectPackage.ALGO__RESSOURCE:
				return getRessource();
			case AlgorithmProjectPackage.ALGO__OUTPUT:
				return getOutput();
			case AlgorithmProjectPackage.ALGO__DOCUMENTATION:
				return getDocumentation();
			case AlgorithmProjectPackage.ALGO__IS_CONSTRAINTS:
				return isIsConstraints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AlgorithmProjectPackage.ALGO__NAME:
				setName((String)newValue);
				return;
			case AlgorithmProjectPackage.ALGO__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends Flux>)newValue);
				return;
			case AlgorithmProjectPackage.ALGO__RESSOURCE:
				setRessource((Ressource)newValue);
				return;
			case AlgorithmProjectPackage.ALGO__OUTPUT:
				setOutput((Flux)newValue);
				return;
			case AlgorithmProjectPackage.ALGO__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends Documentation>)newValue);
				return;
			case AlgorithmProjectPackage.ALGO__IS_CONSTRAINTS:
				setIsConstraints((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AlgorithmProjectPackage.ALGO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AlgorithmProjectPackage.ALGO__INPUT:
				getInput().clear();
				return;
			case AlgorithmProjectPackage.ALGO__RESSOURCE:
				setRessource((Ressource)null);
				return;
			case AlgorithmProjectPackage.ALGO__OUTPUT:
				setOutput((Flux)null);
				return;
			case AlgorithmProjectPackage.ALGO__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case AlgorithmProjectPackage.ALGO__IS_CONSTRAINTS:
				setIsConstraints(IS_CONSTRAINTS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AlgorithmProjectPackage.ALGO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AlgorithmProjectPackage.ALGO__INPUT:
				return input != null && !input.isEmpty();
			case AlgorithmProjectPackage.ALGO__RESSOURCE:
				return ressource != null;
			case AlgorithmProjectPackage.ALGO__OUTPUT:
				return output != null;
			case AlgorithmProjectPackage.ALGO__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case AlgorithmProjectPackage.ALGO__IS_CONSTRAINTS:
				return isConstraints != IS_CONSTRAINTS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", isConstraints: ");
		result.append(isConstraints);
		result.append(')');
		return result.toString();
	}

} //AlgoImpl
