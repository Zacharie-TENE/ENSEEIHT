/**
 */
package tableModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Importation Tableau</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tableModel.ImportationTableau#getIdentifiantColonne <em>Identifiant Colonne</em>}</li>
 *   <li>{@link tableModel.ImportationTableau#getTableau <em>Tableau</em>}</li>
 * </ul>
 *
 * @see tableModel.TableModelPackage#getImportationTableau()
 * @model
 * @generated
 */
public interface ImportationTableau extends ColonneType {
	/**
	 * Returns the value of the '<em><b>Identifiant Colonne</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiant Colonne</em>' attribute.
	 * @see #setIdentifiantColonne(String)
	 * @see tableModel.TableModelPackage#getImportationTableau_IdentifiantColonne()
	 * @model required="true"
	 * @generated
	 */
	String getIdentifiantColonne();

	/**
	 * Sets the value of the '{@link tableModel.ImportationTableau#getIdentifiantColonne <em>Identifiant Colonne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifiant Colonne</em>' attribute.
	 * @see #getIdentifiantColonne()
	 * @generated
	 */
	void setIdentifiantColonne(String value);

	/**
	 * Returns the value of the '<em><b>Tableau</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tableau</em>' reference.
	 * @see #setTableau(Tableau)
	 * @see tableModel.TableModelPackage#getImportationTableau_Tableau()
	 * @model required="true"
	 * @generated
	 */
	Tableau getTableau();

	/**
	 * Sets the value of the '{@link tableModel.ImportationTableau#getTableau <em>Tableau</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tableau</em>' reference.
	 * @see #getTableau()
	 * @generated
	 */
	void setTableau(Tableau value);

} // ImportationTableau
