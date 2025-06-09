/**
 */
package algorithmProject.impl;

import algorithmProject.AlgorithmProjectPackage;
import algorithmProject.Documentable;
import algorithmProject.Documentation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link algorithmProject.impl.DocumentationImpl#getLinkToDocumentable <em>Link To Documentable</em>}</li>
 *   <li>{@link algorithmProject.impl.DocumentationImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentationImpl extends MinimalEObjectImpl.Container implements Documentation {
	/**
	 * The cached value of the '{@link #getLinkToDocumentable() <em>Link To Documentable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkToDocumentable()
	 * @generated
	 * @ordered
	 */
	protected Documentable linkToDocumentable;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmProjectPackage.Literals.DOCUMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Documentable getLinkToDocumentable() {
		if (linkToDocumentable != null && linkToDocumentable.eIsProxy()) {
			InternalEObject oldLinkToDocumentable = (InternalEObject)linkToDocumentable;
			linkToDocumentable = (Documentable)eResolveProxy(oldLinkToDocumentable);
			if (linkToDocumentable != oldLinkToDocumentable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgorithmProjectPackage.DOCUMENTATION__LINK_TO_DOCUMENTABLE, oldLinkToDocumentable, linkToDocumentable));
			}
		}
		return linkToDocumentable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documentable basicGetLinkToDocumentable() {
		return linkToDocumentable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkToDocumentable(Documentable newLinkToDocumentable) {
		Documentable oldLinkToDocumentable = linkToDocumentable;
		linkToDocumentable = newLinkToDocumentable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmProjectPackage.DOCUMENTATION__LINK_TO_DOCUMENTABLE, oldLinkToDocumentable, linkToDocumentable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmProjectPackage.DOCUMENTATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlgorithmProjectPackage.DOCUMENTATION__LINK_TO_DOCUMENTABLE:
				if (resolve) return getLinkToDocumentable();
				return basicGetLinkToDocumentable();
			case AlgorithmProjectPackage.DOCUMENTATION__DESCRIPTION:
				return getDescription();
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
			case AlgorithmProjectPackage.DOCUMENTATION__LINK_TO_DOCUMENTABLE:
				setLinkToDocumentable((Documentable)newValue);
				return;
			case AlgorithmProjectPackage.DOCUMENTATION__DESCRIPTION:
				setDescription((String)newValue);
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
			case AlgorithmProjectPackage.DOCUMENTATION__LINK_TO_DOCUMENTABLE:
				setLinkToDocumentable((Documentable)null);
				return;
			case AlgorithmProjectPackage.DOCUMENTATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case AlgorithmProjectPackage.DOCUMENTATION__LINK_TO_DOCUMENTABLE:
				return linkToDocumentable != null;
			case AlgorithmProjectPackage.DOCUMENTATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //DocumentationImpl
