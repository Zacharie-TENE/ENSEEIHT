/**
 */
package tableModel.impl;

import algorithmProject.Algo;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import tableModel.Colonne;
import tableModel.ImportationAlgo;
import tableModel.TableModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Importation Algo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tableModel.impl.ImportationAlgoImpl#getColonneIN <em>Colonne IN</em>}</li>
 *   <li>{@link tableModel.impl.ImportationAlgoImpl#getAlgorithm <em>Algorithm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportationAlgoImpl extends ColonneTypeImpl implements ImportationAlgo {
	/**
	 * The cached value of the '{@link #getColonneIN() <em>Colonne IN</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColonneIN()
	 * @generated
	 * @ordered
	 */
	protected EList<Colonne> colonneIN;

	/**
	 * The cached value of the '{@link #getAlgorithm() <em>Algorithm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected Algo algorithm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportationAlgoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TableModelPackage.Literals.IMPORTATION_ALGO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Colonne> getColonneIN() {
		if (colonneIN == null) {
			colonneIN = new EObjectResolvingEList<Colonne>(Colonne.class, this, TableModelPackage.IMPORTATION_ALGO__COLONNE_IN);
		}
		return colonneIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Algo getAlgorithm() {
		if (algorithm != null && algorithm.eIsProxy()) {
			InternalEObject oldAlgorithm = (InternalEObject)algorithm;
			algorithm = (Algo)eResolveProxy(oldAlgorithm);
			if (algorithm != oldAlgorithm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TableModelPackage.IMPORTATION_ALGO__ALGORITHM, oldAlgorithm, algorithm));
			}
		}
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Algo basicGetAlgorithm() {
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlgorithm(Algo newAlgorithm) {
		Algo oldAlgorithm = algorithm;
		algorithm = newAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TableModelPackage.IMPORTATION_ALGO__ALGORITHM, oldAlgorithm, algorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TableModelPackage.IMPORTATION_ALGO__COLONNE_IN:
				return getColonneIN();
			case TableModelPackage.IMPORTATION_ALGO__ALGORITHM:
				if (resolve) return getAlgorithm();
				return basicGetAlgorithm();
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
			case TableModelPackage.IMPORTATION_ALGO__COLONNE_IN:
				getColonneIN().clear();
				getColonneIN().addAll((Collection<? extends Colonne>)newValue);
				return;
			case TableModelPackage.IMPORTATION_ALGO__ALGORITHM:
				setAlgorithm((Algo)newValue);
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
			case TableModelPackage.IMPORTATION_ALGO__COLONNE_IN:
				getColonneIN().clear();
				return;
			case TableModelPackage.IMPORTATION_ALGO__ALGORITHM:
				setAlgorithm((Algo)null);
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
			case TableModelPackage.IMPORTATION_ALGO__COLONNE_IN:
				return colonneIN != null && !colonneIN.isEmpty();
			case TableModelPackage.IMPORTATION_ALGO__ALGORITHM:
				return algorithm != null;
		}
		return super.eIsSet(featureID);
	}

} //ImportationAlgoImpl
