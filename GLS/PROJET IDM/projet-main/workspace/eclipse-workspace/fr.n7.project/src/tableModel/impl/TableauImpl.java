/**
 */
package tableModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tableModel.Colonne;
import tableModel.TableModelPackage;
import tableModel.Tableau;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tableau</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tableModel.impl.TableauImpl#getName <em>Name</em>}</li>
 *   <li>{@link tableModel.impl.TableauImpl#getColonneDeLignes <em>Colonne De Lignes</em>}</li>
 *   <li>{@link tableModel.impl.TableauImpl#getColonnes <em>Colonnes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableauImpl extends MinimalEObjectImpl.Container implements Tableau {
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
	 * The cached value of the '{@link #getColonneDeLignes() <em>Colonne De Lignes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColonneDeLignes()
	 * @generated
	 * @ordered
	 */
	protected Colonne colonneDeLignes;

	/**
	 * The cached value of the '{@link #getColonnes() <em>Colonnes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColonnes()
	 * @generated
	 * @ordered
	 */
	protected EList<Colonne> colonnes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableauImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TableModelPackage.Literals.TABLEAU;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TableModelPackage.TABLEAU__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Colonne getColonneDeLignes() {
		if (colonneDeLignes != null && colonneDeLignes.eIsProxy()) {
			InternalEObject oldColonneDeLignes = (InternalEObject)colonneDeLignes;
			colonneDeLignes = (Colonne)eResolveProxy(oldColonneDeLignes);
			if (colonneDeLignes != oldColonneDeLignes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TableModelPackage.TABLEAU__COLONNE_DE_LIGNES, oldColonneDeLignes, colonneDeLignes));
			}
		}
		return colonneDeLignes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Colonne basicGetColonneDeLignes() {
		return colonneDeLignes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColonneDeLignes(Colonne newColonneDeLignes) {
		Colonne oldColonneDeLignes = colonneDeLignes;
		colonneDeLignes = newColonneDeLignes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TableModelPackage.TABLEAU__COLONNE_DE_LIGNES, oldColonneDeLignes, colonneDeLignes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Colonne> getColonnes() {
		if (colonnes == null) {
			colonnes = new EObjectContainmentWithInverseEList<Colonne>(Colonne.class, this, TableModelPackage.TABLEAU__COLONNES, TableModelPackage.COLONNE__TABLEAU);
		}
		return colonnes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TableModelPackage.TABLEAU__COLONNES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getColonnes()).basicAdd(otherEnd, msgs);
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
			case TableModelPackage.TABLEAU__COLONNES:
				return ((InternalEList<?>)getColonnes()).basicRemove(otherEnd, msgs);
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
			case TableModelPackage.TABLEAU__NAME:
				return getName();
			case TableModelPackage.TABLEAU__COLONNE_DE_LIGNES:
				if (resolve) return getColonneDeLignes();
				return basicGetColonneDeLignes();
			case TableModelPackage.TABLEAU__COLONNES:
				return getColonnes();
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
			case TableModelPackage.TABLEAU__NAME:
				setName((String)newValue);
				return;
			case TableModelPackage.TABLEAU__COLONNE_DE_LIGNES:
				setColonneDeLignes((Colonne)newValue);
				return;
			case TableModelPackage.TABLEAU__COLONNES:
				getColonnes().clear();
				getColonnes().addAll((Collection<? extends Colonne>)newValue);
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
			case TableModelPackage.TABLEAU__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TableModelPackage.TABLEAU__COLONNE_DE_LIGNES:
				setColonneDeLignes((Colonne)null);
				return;
			case TableModelPackage.TABLEAU__COLONNES:
				getColonnes().clear();
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
			case TableModelPackage.TABLEAU__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TableModelPackage.TABLEAU__COLONNE_DE_LIGNES:
				return colonneDeLignes != null;
			case TableModelPackage.TABLEAU__COLONNES:
				return colonnes != null && !colonnes.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //TableauImpl
