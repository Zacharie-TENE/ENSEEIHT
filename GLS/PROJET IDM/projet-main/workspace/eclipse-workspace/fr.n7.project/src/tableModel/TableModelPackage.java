/**
 */
package tableModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tableModel.TableModelFactory
 * @model kind="package"
 * @generated
 */
public interface TableModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tableModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://www.exemple.org/tableModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tableModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TableModelPackage eINSTANCE = tableModel.impl.TableModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link tableModel.impl.TableauImpl <em>Tableau</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tableModel.impl.TableauImpl
	 * @see tableModel.impl.TableModelPackageImpl#getTableau()
	 * @generated
	 */
	int TABLEAU = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLEAU__NAME = 0;

	/**
	 * The feature id for the '<em><b>Colonne De Lignes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLEAU__COLONNE_DE_LIGNES = 1;

	/**
	 * The feature id for the '<em><b>Colonnes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLEAU__COLONNES = 2;

	/**
	 * The number of structural features of the '<em>Tableau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLEAU_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Tableau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLEAU_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tableModel.impl.ColonneImpl <em>Colonne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tableModel.impl.ColonneImpl
	 * @see tableModel.impl.TableModelPackageImpl#getColonne()
	 * @generated
	 */
	int COLONNE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__CONSTRAINTS = 3;

	/**
	 * The feature id for the '<em><b>Tableau</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__TABLEAU = 4;

	/**
	 * The feature id for the '<em><b>Colonne Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__COLONNE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Contrainte</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__CONTRAINTE = 6;

	/**
	 * The number of structural features of the '<em>Colonne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Colonne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tableModel.impl.ColonneTypeImpl <em>Colonne Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tableModel.impl.ColonneTypeImpl
	 * @see tableModel.impl.TableModelPackageImpl#getColonneType()
	 * @generated
	 */
	int COLONNE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Colonne</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_TYPE__COLONNE = 0;

	/**
	 * The number of structural features of the '<em>Colonne Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Colonne Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tableModel.impl.ImportationTableauImpl <em>Importation Tableau</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tableModel.impl.ImportationTableauImpl
	 * @see tableModel.impl.TableModelPackageImpl#getImportationTableau()
	 * @generated
	 */
	int IMPORTATION_TABLEAU = 2;

	/**
	 * The feature id for the '<em><b>Colonne</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTATION_TABLEAU__COLONNE = COLONNE_TYPE__COLONNE;

	/**
	 * The feature id for the '<em><b>Identifiant Colonne</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTATION_TABLEAU__IDENTIFIANT_COLONNE = COLONNE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tableau</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTATION_TABLEAU__TABLEAU = COLONNE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Importation Tableau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTATION_TABLEAU_FEATURE_COUNT = COLONNE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Importation Tableau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTATION_TABLEAU_OPERATION_COUNT = COLONNE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tableModel.impl.ImportationAlgoImpl <em>Importation Algo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tableModel.impl.ImportationAlgoImpl
	 * @see tableModel.impl.TableModelPackageImpl#getImportationAlgo()
	 * @generated
	 */
	int IMPORTATION_ALGO = 4;

	/**
	 * The feature id for the '<em><b>Colonne</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTATION_ALGO__COLONNE = COLONNE_TYPE__COLONNE;

	/**
	 * The feature id for the '<em><b>Colonne IN</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTATION_ALGO__COLONNE_IN = COLONNE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTATION_ALGO__ALGORITHM = COLONNE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Importation Algo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTATION_ALGO_FEATURE_COUNT = COLONNE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Importation Algo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTATION_ALGO_OPERATION_COUNT = COLONNE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tableModel.contrainte <em>contrainte</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tableModel.contrainte
	 * @see tableModel.impl.TableModelPackageImpl#getcontrainte()
	 * @generated
	 */
	int CONTRAINTE = 5;


	/**
	 * Returns the meta object for class '{@link tableModel.Tableau <em>Tableau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tableau</em>'.
	 * @see tableModel.Tableau
	 * @generated
	 */
	EClass getTableau();

	/**
	 * Returns the meta object for the attribute '{@link tableModel.Tableau#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tableModel.Tableau#getName()
	 * @see #getTableau()
	 * @generated
	 */
	EAttribute getTableau_Name();

	/**
	 * Returns the meta object for the reference '{@link tableModel.Tableau#getColonneDeLignes <em>Colonne De Lignes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Colonne De Lignes</em>'.
	 * @see tableModel.Tableau#getColonneDeLignes()
	 * @see #getTableau()
	 * @generated
	 */
	EReference getTableau_ColonneDeLignes();

	/**
	 * Returns the meta object for the containment reference list '{@link tableModel.Tableau#getColonnes <em>Colonnes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Colonnes</em>'.
	 * @see tableModel.Tableau#getColonnes()
	 * @see #getTableau()
	 * @generated
	 */
	EReference getTableau_Colonnes();

	/**
	 * Returns the meta object for class '{@link tableModel.Colonne <em>Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colonne</em>'.
	 * @see tableModel.Colonne
	 * @generated
	 */
	EClass getColonne();

	/**
	 * Returns the meta object for the attribute '{@link tableModel.Colonne#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tableModel.Colonne#getName()
	 * @see #getColonne()
	 * @generated
	 */
	EAttribute getColonne_Name();

	/**
	 * Returns the meta object for the attribute '{@link tableModel.Colonne#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see tableModel.Colonne#getDataType()
	 * @see #getColonne()
	 * @generated
	 */
	EAttribute getColonne_DataType();

	/**
	 * Returns the meta object for the attribute '{@link tableModel.Colonne#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see tableModel.Colonne#getIdentifier()
	 * @see #getColonne()
	 * @generated
	 */
	EAttribute getColonne_Identifier();

	/**
	 * Returns the meta object for the reference list '{@link tableModel.Colonne#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constraints</em>'.
	 * @see tableModel.Colonne#getConstraints()
	 * @see #getColonne()
	 * @generated
	 */
	EReference getColonne_Constraints();

	/**
	 * Returns the meta object for the container reference '{@link tableModel.Colonne#getTableau <em>Tableau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tableau</em>'.
	 * @see tableModel.Colonne#getTableau()
	 * @see #getColonne()
	 * @generated
	 */
	EReference getColonne_Tableau();

	/**
	 * Returns the meta object for the containment reference '{@link tableModel.Colonne#getColonneType <em>Colonne Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Colonne Type</em>'.
	 * @see tableModel.Colonne#getColonneType()
	 * @see #getColonne()
	 * @generated
	 */
	EReference getColonne_ColonneType();

	/**
	 * Returns the meta object for the attribute list '{@link tableModel.Colonne#getContrainte <em>Contrainte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Contrainte</em>'.
	 * @see tableModel.Colonne#getContrainte()
	 * @see #getColonne()
	 * @generated
	 */
	EAttribute getColonne_Contrainte();

	/**
	 * Returns the meta object for class '{@link tableModel.ImportationTableau <em>Importation Tableau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Importation Tableau</em>'.
	 * @see tableModel.ImportationTableau
	 * @generated
	 */
	EClass getImportationTableau();

	/**
	 * Returns the meta object for the attribute '{@link tableModel.ImportationTableau#getIdentifiantColonne <em>Identifiant Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifiant Colonne</em>'.
	 * @see tableModel.ImportationTableau#getIdentifiantColonne()
	 * @see #getImportationTableau()
	 * @generated
	 */
	EAttribute getImportationTableau_IdentifiantColonne();

	/**
	 * Returns the meta object for the reference '{@link tableModel.ImportationTableau#getTableau <em>Tableau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tableau</em>'.
	 * @see tableModel.ImportationTableau#getTableau()
	 * @see #getImportationTableau()
	 * @generated
	 */
	EReference getImportationTableau_Tableau();

	/**
	 * Returns the meta object for class '{@link tableModel.ColonneType <em>Colonne Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colonne Type</em>'.
	 * @see tableModel.ColonneType
	 * @generated
	 */
	EClass getColonneType();

	/**
	 * Returns the meta object for the container reference '{@link tableModel.ColonneType#getColonne <em>Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Colonne</em>'.
	 * @see tableModel.ColonneType#getColonne()
	 * @see #getColonneType()
	 * @generated
	 */
	EReference getColonneType_Colonne();

	/**
	 * Returns the meta object for class '{@link tableModel.ImportationAlgo <em>Importation Algo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Importation Algo</em>'.
	 * @see tableModel.ImportationAlgo
	 * @generated
	 */
	EClass getImportationAlgo();

	/**
	 * Returns the meta object for the reference list '{@link tableModel.ImportationAlgo#getColonneIN <em>Colonne IN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Colonne IN</em>'.
	 * @see tableModel.ImportationAlgo#getColonneIN()
	 * @see #getImportationAlgo()
	 * @generated
	 */
	EReference getImportationAlgo_ColonneIN();

	/**
	 * Returns the meta object for the reference '{@link tableModel.ImportationAlgo#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Algorithm</em>'.
	 * @see tableModel.ImportationAlgo#getAlgorithm()
	 * @see #getImportationAlgo()
	 * @generated
	 */
	EReference getImportationAlgo_Algorithm();

	/**
	 * Returns the meta object for enum '{@link tableModel.contrainte <em>contrainte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>contrainte</em>'.
	 * @see tableModel.contrainte
	 * @generated
	 */
	EEnum getcontrainte();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TableModelFactory getTableModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tableModel.impl.TableauImpl <em>Tableau</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tableModel.impl.TableauImpl
		 * @see tableModel.impl.TableModelPackageImpl#getTableau()
		 * @generated
		 */
		EClass TABLEAU = eINSTANCE.getTableau();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLEAU__NAME = eINSTANCE.getTableau_Name();

		/**
		 * The meta object literal for the '<em><b>Colonne De Lignes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLEAU__COLONNE_DE_LIGNES = eINSTANCE.getTableau_ColonneDeLignes();

		/**
		 * The meta object literal for the '<em><b>Colonnes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLEAU__COLONNES = eINSTANCE.getTableau_Colonnes();

		/**
		 * The meta object literal for the '{@link tableModel.impl.ColonneImpl <em>Colonne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tableModel.impl.ColonneImpl
		 * @see tableModel.impl.TableModelPackageImpl#getColonne()
		 * @generated
		 */
		EClass COLONNE = eINSTANCE.getColonne();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLONNE__NAME = eINSTANCE.getColonne_Name();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLONNE__DATA_TYPE = eINSTANCE.getColonne_DataType();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLONNE__IDENTIFIER = eINSTANCE.getColonne_Identifier();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLONNE__CONSTRAINTS = eINSTANCE.getColonne_Constraints();

		/**
		 * The meta object literal for the '<em><b>Tableau</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLONNE__TABLEAU = eINSTANCE.getColonne_Tableau();

		/**
		 * The meta object literal for the '<em><b>Colonne Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLONNE__COLONNE_TYPE = eINSTANCE.getColonne_ColonneType();

		/**
		 * The meta object literal for the '<em><b>Contrainte</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLONNE__CONTRAINTE = eINSTANCE.getColonne_Contrainte();

		/**
		 * The meta object literal for the '{@link tableModel.impl.ImportationTableauImpl <em>Importation Tableau</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tableModel.impl.ImportationTableauImpl
		 * @see tableModel.impl.TableModelPackageImpl#getImportationTableau()
		 * @generated
		 */
		EClass IMPORTATION_TABLEAU = eINSTANCE.getImportationTableau();

		/**
		 * The meta object literal for the '<em><b>Identifiant Colonne</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTATION_TABLEAU__IDENTIFIANT_COLONNE = eINSTANCE.getImportationTableau_IdentifiantColonne();

		/**
		 * The meta object literal for the '<em><b>Tableau</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTATION_TABLEAU__TABLEAU = eINSTANCE.getImportationTableau_Tableau();

		/**
		 * The meta object literal for the '{@link tableModel.impl.ColonneTypeImpl <em>Colonne Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tableModel.impl.ColonneTypeImpl
		 * @see tableModel.impl.TableModelPackageImpl#getColonneType()
		 * @generated
		 */
		EClass COLONNE_TYPE = eINSTANCE.getColonneType();

		/**
		 * The meta object literal for the '<em><b>Colonne</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLONNE_TYPE__COLONNE = eINSTANCE.getColonneType_Colonne();

		/**
		 * The meta object literal for the '{@link tableModel.impl.ImportationAlgoImpl <em>Importation Algo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tableModel.impl.ImportationAlgoImpl
		 * @see tableModel.impl.TableModelPackageImpl#getImportationAlgo()
		 * @generated
		 */
		EClass IMPORTATION_ALGO = eINSTANCE.getImportationAlgo();

		/**
		 * The meta object literal for the '<em><b>Colonne IN</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTATION_ALGO__COLONNE_IN = eINSTANCE.getImportationAlgo_ColonneIN();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTATION_ALGO__ALGORITHM = eINSTANCE.getImportationAlgo_Algorithm();

		/**
		 * The meta object literal for the '{@link tableModel.contrainte <em>contrainte</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tableModel.contrainte
		 * @see tableModel.impl.TableModelPackageImpl#getcontrainte()
		 * @generated
		 */
		EEnum CONTRAINTE = eINSTANCE.getcontrainte();

	}

} //TableModelPackage
