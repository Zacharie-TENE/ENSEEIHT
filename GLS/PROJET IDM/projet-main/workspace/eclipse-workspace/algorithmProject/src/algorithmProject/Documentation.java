/**
 */
package algorithmProject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithmProject.Documentation#getLinkToDocumentable <em>Link To Documentable</em>}</li>
 *   <li>{@link algorithmProject.Documentation#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see algorithmProject.AlgorithmProjectPackage#getDocumentation()
 * @model
 * @generated
 */
public interface Documentation extends EObject {
	/**
	 * Returns the value of the '<em><b>Link To Documentable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link To Documentable</em>' reference.
	 * @see #setLinkToDocumentable(Documentable)
	 * @see algorithmProject.AlgorithmProjectPackage#getDocumentation_LinkToDocumentable()
	 * @model required="true"
	 * @generated
	 */
	Documentable getLinkToDocumentable();

	/**
	 * Sets the value of the '{@link algorithmProject.Documentation#getLinkToDocumentable <em>Link To Documentable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link To Documentable</em>' reference.
	 * @see #getLinkToDocumentable()
	 * @generated
	 */
	void setLinkToDocumentable(Documentable value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see algorithmProject.AlgorithmProjectPackage#getDocumentation_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link algorithmProject.Documentation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Documentation
