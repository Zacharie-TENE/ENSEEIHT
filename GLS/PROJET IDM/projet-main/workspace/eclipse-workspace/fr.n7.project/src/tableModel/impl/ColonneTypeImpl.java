/**
 */
package tableModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import tableModel.Colonne;
import tableModel.ColonneType;
import tableModel.TableModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Colonne Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tableModel.impl.ColonneTypeImpl#getColonne <em>Colonne</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ColonneTypeImpl extends MinimalEObjectImpl.Container implements ColonneType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColonneTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TableModelPackage.Literals.COLONNE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Colonne getColonne() {
		if (eContainerFeatureID() != TableModelPackage.COLONNE_TYPE__COLONNE) return null;
		return (Colonne)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColonne(Colonne newColonne, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newColonne, TableModelPackage.COLONNE_TYPE__COLONNE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColonne(Colonne newColonne) {
		if (newColonne != eInternalContainer() || (eContainerFeatureID() != TableModelPackage.COLONNE_TYPE__COLONNE && newColonne != null)) {
			if (EcoreUtil.isAncestor(this, newColonne))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newColonne != null)
				msgs = ((InternalEObject)newColonne).eInverseAdd(this, TableModelPackage.COLONNE__COLONNE_TYPE, Colonne.class, msgs);
			msgs = basicSetColonne(newColonne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TableModelPackage.COLONNE_TYPE__COLONNE, newColonne, newColonne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TableModelPackage.COLONNE_TYPE__COLONNE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetColonne((Colonne)otherEnd, msgs);
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
			case TableModelPackage.COLONNE_TYPE__COLONNE:
				return basicSetColonne(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TableModelPackage.COLONNE_TYPE__COLONNE:
				return eInternalContainer().eInverseRemove(this, TableModelPackage.COLONNE__COLONNE_TYPE, Colonne.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TableModelPackage.COLONNE_TYPE__COLONNE:
				return getColonne();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TableModelPackage.COLONNE_TYPE__COLONNE:
				setColonne((Colonne)newValue);
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
			case TableModelPackage.COLONNE_TYPE__COLONNE:
				setColonne((Colonne)null);
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
			case TableModelPackage.COLONNE_TYPE__COLONNE:
				return getColonne() != null;
		}
		return super.eIsSet(featureID);
	}

} //ColonneTypeImpl
