/**
 */
package tableModel.impl;

import algorithmProject.Algo;
import algorithmProject.DataType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import tableModel.Colonne;
import tableModel.ColonneType;
import tableModel.TableModelPackage;
import tableModel.Tableau;
import tableModel.contrainte;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Colonne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tableModel.impl.ColonneImpl#getName <em>Name</em>}</li>
 *   <li>{@link tableModel.impl.ColonneImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link tableModel.impl.ColonneImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link tableModel.impl.ColonneImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link tableModel.impl.ColonneImpl#getTableau <em>Tableau</em>}</li>
 *   <li>{@link tableModel.impl.ColonneImpl#getColonneType <em>Colonne Type</em>}</li>
 *   <li>{@link tableModel.impl.ColonneImpl#getContrainte <em>Contrainte</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColonneImpl extends MinimalEObjectImpl.Container implements Colonne {
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
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final DataType DATA_TYPE_EDEFAULT = DataType.STRING;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType dataType = DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Algo> constraints;

	/**
	 * The cached value of the '{@link #getColonneType() <em>Colonne Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColonneType()
	 * @generated
	 * @ordered
	 */
	protected ColonneType colonneType;

	/**
	 * The cached value of the '{@link #getContrainte() <em>Contrainte</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContrainte()
	 * @generated
	 * @ordered
	 */
	protected EList<contrainte> contrainte;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColonneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TableModelPackage.Literals.COLONNE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TableModelPackage.COLONNE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataType(DataType newDataType) {
		DataType oldDataType = dataType;
		dataType = newDataType == null ? DATA_TYPE_EDEFAULT : newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TableModelPackage.COLONNE__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TableModelPackage.COLONNE__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Algo> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectResolvingEList<Algo>(Algo.class, this, TableModelPackage.COLONNE__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tableau getTableau() {
		if (eContainerFeatureID() != TableModelPackage.COLONNE__TABLEAU) return null;
		return (Tableau)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableau(Tableau newTableau, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTableau, TableModelPackage.COLONNE__TABLEAU, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableau(Tableau newTableau) {
		if (newTableau != eInternalContainer() || (eContainerFeatureID() != TableModelPackage.COLONNE__TABLEAU && newTableau != null)) {
			if (EcoreUtil.isAncestor(this, newTableau))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTableau != null)
				msgs = ((InternalEObject)newTableau).eInverseAdd(this, TableModelPackage.TABLEAU__COLONNES, Tableau.class, msgs);
			msgs = basicSetTableau(newTableau, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TableModelPackage.COLONNE__TABLEAU, newTableau, newTableau));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColonneType getColonneType() {
		return colonneType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColonneType(ColonneType newColonneType, NotificationChain msgs) {
		ColonneType oldColonneType = colonneType;
		colonneType = newColonneType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TableModelPackage.COLONNE__COLONNE_TYPE, oldColonneType, newColonneType);
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
	public void setColonneType(ColonneType newColonneType) {
		if (newColonneType != colonneType) {
			NotificationChain msgs = null;
			if (colonneType != null)
				msgs = ((InternalEObject)colonneType).eInverseRemove(this, TableModelPackage.COLONNE_TYPE__COLONNE, ColonneType.class, msgs);
			if (newColonneType != null)
				msgs = ((InternalEObject)newColonneType).eInverseAdd(this, TableModelPackage.COLONNE_TYPE__COLONNE, ColonneType.class, msgs);
			msgs = basicSetColonneType(newColonneType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TableModelPackage.COLONNE__COLONNE_TYPE, newColonneType, newColonneType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<contrainte> getContrainte() {
		if (contrainte == null) {
			contrainte = new EDataTypeUniqueEList<contrainte>(contrainte.class, this, TableModelPackage.COLONNE__CONTRAINTE);
		}
		return contrainte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TableModelPackage.COLONNE__TABLEAU:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTableau((Tableau)otherEnd, msgs);
			case TableModelPackage.COLONNE__COLONNE_TYPE:
				if (colonneType != null)
					msgs = ((InternalEObject)colonneType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TableModelPackage.COLONNE__COLONNE_TYPE, null, msgs);
				return basicSetColonneType((ColonneType)otherEnd, msgs);
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
			case TableModelPackage.COLONNE__TABLEAU:
				return basicSetTableau(null, msgs);
			case TableModelPackage.COLONNE__COLONNE_TYPE:
				return basicSetColonneType(null, msgs);
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
			case TableModelPackage.COLONNE__TABLEAU:
				return eInternalContainer().eInverseRemove(this, TableModelPackage.TABLEAU__COLONNES, Tableau.class, msgs);
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
			case TableModelPackage.COLONNE__NAME:
				return getName();
			case TableModelPackage.COLONNE__DATA_TYPE:
				return getDataType();
			case TableModelPackage.COLONNE__IDENTIFIER:
				return getIdentifier();
			case TableModelPackage.COLONNE__CONSTRAINTS:
				return getConstraints();
			case TableModelPackage.COLONNE__TABLEAU:
				return getTableau();
			case TableModelPackage.COLONNE__COLONNE_TYPE:
				return getColonneType();
			case TableModelPackage.COLONNE__CONTRAINTE:
				return getContrainte();
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
			case TableModelPackage.COLONNE__NAME:
				setName((String)newValue);
				return;
			case TableModelPackage.COLONNE__DATA_TYPE:
				setDataType((DataType)newValue);
				return;
			case TableModelPackage.COLONNE__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case TableModelPackage.COLONNE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Algo>)newValue);
				return;
			case TableModelPackage.COLONNE__TABLEAU:
				setTableau((Tableau)newValue);
				return;
			case TableModelPackage.COLONNE__COLONNE_TYPE:
				setColonneType((ColonneType)newValue);
				return;
			case TableModelPackage.COLONNE__CONTRAINTE:
				getContrainte().clear();
				getContrainte().addAll((Collection<? extends contrainte>)newValue);
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
			case TableModelPackage.COLONNE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TableModelPackage.COLONNE__DATA_TYPE:
				setDataType(DATA_TYPE_EDEFAULT);
				return;
			case TableModelPackage.COLONNE__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case TableModelPackage.COLONNE__CONSTRAINTS:
				getConstraints().clear();
				return;
			case TableModelPackage.COLONNE__TABLEAU:
				setTableau((Tableau)null);
				return;
			case TableModelPackage.COLONNE__COLONNE_TYPE:
				setColonneType((ColonneType)null);
				return;
			case TableModelPackage.COLONNE__CONTRAINTE:
				getContrainte().clear();
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
			case TableModelPackage.COLONNE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TableModelPackage.COLONNE__DATA_TYPE:
				return dataType != DATA_TYPE_EDEFAULT;
			case TableModelPackage.COLONNE__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case TableModelPackage.COLONNE__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case TableModelPackage.COLONNE__TABLEAU:
				return getTableau() != null;
			case TableModelPackage.COLONNE__COLONNE_TYPE:
				return colonneType != null;
			case TableModelPackage.COLONNE__CONTRAINTE:
				return contrainte != null && !contrainte.isEmpty();
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
		result.append(", dataType: ");
		result.append(dataType);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(", contrainte: ");
		result.append(contrainte);
		result.append(')');
		return result.toString();
	}

} //ColonneImpl
