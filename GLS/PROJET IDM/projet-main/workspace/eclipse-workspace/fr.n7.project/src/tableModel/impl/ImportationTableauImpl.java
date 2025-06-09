/**
 */
package tableModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tableModel.ImportationTableau;
import tableModel.TableModelPackage;
import tableModel.Tableau;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Importation Tableau</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tableModel.impl.ImportationTableauImpl#getIdentifiantColonne <em>Identifiant Colonne</em>}</li>
 *   <li>{@link tableModel.impl.ImportationTableauImpl#getTableau <em>Tableau</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportationTableauImpl extends ColonneTypeImpl implements ImportationTableau {
	/**
	 * The default value of the '{@link #getIdentifiantColonne() <em>Identifiant Colonne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiantColonne()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIANT_COLONNE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifiantColonne() <em>Identifiant Colonne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiantColonne()
	 * @generated
	 * @ordered
	 */
	protected String identifiantColonne = IDENTIFIANT_COLONNE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTableau() <em>Tableau</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableau()
	 * @generated
	 * @ordered
	 */
	protected Tableau tableau;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportationTableauImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TableModelPackage.Literals.IMPORTATION_TABLEAU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentifiantColonne() {
		return identifiantColonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifiantColonne(String newIdentifiantColonne) {
		String oldIdentifiantColonne = identifiantColonne;
		identifiantColonne = newIdentifiantColonne;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TableModelPackage.IMPORTATION_TABLEAU__IDENTIFIANT_COLONNE, oldIdentifiantColonne, identifiantColonne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tableau getTableau() {
		if (tableau != null && tableau.eIsProxy()) {
			InternalEObject oldTableau = (InternalEObject)tableau;
			tableau = (Tableau)eResolveProxy(oldTableau);
			if (tableau != oldTableau) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TableModelPackage.IMPORTATION_TABLEAU__TABLEAU, oldTableau, tableau));
			}
		}
		return tableau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tableau basicGetTableau() {
		return tableau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableau(Tableau newTableau) {
		Tableau oldTableau = tableau;
		tableau = newTableau;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TableModelPackage.IMPORTATION_TABLEAU__TABLEAU, oldTableau, tableau));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TableModelPackage.IMPORTATION_TABLEAU__IDENTIFIANT_COLONNE:
				return getIdentifiantColonne();
			case TableModelPackage.IMPORTATION_TABLEAU__TABLEAU:
				if (resolve) return getTableau();
				return basicGetTableau();
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
			case TableModelPackage.IMPORTATION_TABLEAU__IDENTIFIANT_COLONNE:
				setIdentifiantColonne((String)newValue);
				return;
			case TableModelPackage.IMPORTATION_TABLEAU__TABLEAU:
				setTableau((Tableau)newValue);
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
			case TableModelPackage.IMPORTATION_TABLEAU__IDENTIFIANT_COLONNE:
				setIdentifiantColonne(IDENTIFIANT_COLONNE_EDEFAULT);
				return;
			case TableModelPackage.IMPORTATION_TABLEAU__TABLEAU:
				setTableau((Tableau)null);
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
			case TableModelPackage.IMPORTATION_TABLEAU__IDENTIFIANT_COLONNE:
				return IDENTIFIANT_COLONNE_EDEFAULT == null ? identifiantColonne != null : !IDENTIFIANT_COLONNE_EDEFAULT.equals(identifiantColonne);
			case TableModelPackage.IMPORTATION_TABLEAU__TABLEAU:
				return tableau != null;
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
		result.append(" (identifiantColonne: ");
		result.append(identifiantColonne);
		result.append(')');
		return result.toString();
	}

} //ImportationTableauImpl
