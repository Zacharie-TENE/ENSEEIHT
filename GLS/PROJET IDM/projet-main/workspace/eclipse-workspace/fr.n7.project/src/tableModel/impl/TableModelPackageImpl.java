/**
 */
package tableModel.impl;

import algorithmProject.AlgorithmProjectPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tableModel.Colonne;
import tableModel.ColonneType;
import tableModel.ImportationAlgo;
import tableModel.ImportationTableau;
import tableModel.TableModelFactory;
import tableModel.TableModelPackage;
import tableModel.Tableau;
import tableModel.contrainte;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TableModelPackageImpl extends EPackageImpl implements TableModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableauEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colonneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importationTableauEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colonneTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importationAlgoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contrainteEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see tableModel.TableModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TableModelPackageImpl() {
		super(eNS_URI, TableModelFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TableModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TableModelPackage init() {
		if (isInited) return (TableModelPackage)EPackage.Registry.INSTANCE.getEPackage(TableModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTableModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TableModelPackageImpl theTableModelPackage = registeredTableModelPackage instanceof TableModelPackageImpl ? (TableModelPackageImpl)registeredTableModelPackage : new TableModelPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		AlgorithmProjectPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTableModelPackage.createPackageContents();

		// Initialize created meta-data
		theTableModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTableModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TableModelPackage.eNS_URI, theTableModelPackage);
		return theTableModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableau() {
		return tableauEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableau_Name() {
		return (EAttribute)tableauEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTableau_ColonneDeLignes() {
		return (EReference)tableauEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTableau_Colonnes() {
		return (EReference)tableauEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColonne() {
		return colonneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColonne_Name() {
		return (EAttribute)colonneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColonne_DataType() {
		return (EAttribute)colonneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColonne_Identifier() {
		return (EAttribute)colonneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColonne_Constraints() {
		return (EReference)colonneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColonne_Tableau() {
		return (EReference)colonneEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColonne_ColonneType() {
		return (EReference)colonneEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColonne_Contrainte() {
		return (EAttribute)colonneEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImportationTableau() {
		return importationTableauEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImportationTableau_IdentifiantColonne() {
		return (EAttribute)importationTableauEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImportationTableau_Tableau() {
		return (EReference)importationTableauEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColonneType() {
		return colonneTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColonneType_Colonne() {
		return (EReference)colonneTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImportationAlgo() {
		return importationAlgoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImportationAlgo_ColonneIN() {
		return (EReference)importationAlgoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImportationAlgo_Algorithm() {
		return (EReference)importationAlgoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getcontrainte() {
		return contrainteEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableModelFactory getTableModelFactory() {
		return (TableModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		tableauEClass = createEClass(TABLEAU);
		createEAttribute(tableauEClass, TABLEAU__NAME);
		createEReference(tableauEClass, TABLEAU__COLONNE_DE_LIGNES);
		createEReference(tableauEClass, TABLEAU__COLONNES);

		colonneEClass = createEClass(COLONNE);
		createEAttribute(colonneEClass, COLONNE__NAME);
		createEAttribute(colonneEClass, COLONNE__DATA_TYPE);
		createEAttribute(colonneEClass, COLONNE__IDENTIFIER);
		createEReference(colonneEClass, COLONNE__CONSTRAINTS);
		createEReference(colonneEClass, COLONNE__TABLEAU);
		createEReference(colonneEClass, COLONNE__COLONNE_TYPE);
		createEAttribute(colonneEClass, COLONNE__CONTRAINTE);

		importationTableauEClass = createEClass(IMPORTATION_TABLEAU);
		createEAttribute(importationTableauEClass, IMPORTATION_TABLEAU__IDENTIFIANT_COLONNE);
		createEReference(importationTableauEClass, IMPORTATION_TABLEAU__TABLEAU);

		colonneTypeEClass = createEClass(COLONNE_TYPE);
		createEReference(colonneTypeEClass, COLONNE_TYPE__COLONNE);

		importationAlgoEClass = createEClass(IMPORTATION_ALGO);
		createEReference(importationAlgoEClass, IMPORTATION_ALGO__COLONNE_IN);
		createEReference(importationAlgoEClass, IMPORTATION_ALGO__ALGORITHM);

		// Create enums
		contrainteEEnum = createEEnum(CONTRAINTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AlgorithmProjectPackage theAlgorithmProjectPackage = (AlgorithmProjectPackage)EPackage.Registry.INSTANCE.getEPackage(AlgorithmProjectPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		importationTableauEClass.getESuperTypes().add(this.getColonneType());
		importationAlgoEClass.getESuperTypes().add(this.getColonneType());

		// Initialize classes, features, and operations; add parameters
		initEClass(tableauEClass, Tableau.class, "Tableau", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableau_Name(), ecorePackage.getEString(), "name", null, 1, 1, Tableau.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableau_ColonneDeLignes(), this.getColonne(), null, "colonneDeLignes", null, 1, 1, Tableau.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableau_Colonnes(), this.getColonne(), this.getColonne_Tableau(), "colonnes", null, 0, -1, Tableau.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colonneEClass, Colonne.class, "Colonne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColonne_Name(), ecorePackage.getEString(), "name", null, 1, 1, Colonne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColonne_DataType(), theAlgorithmProjectPackage.getDataType(), "dataType", null, 1, 1, Colonne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColonne_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, Colonne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColonne_Constraints(), theAlgorithmProjectPackage.getAlgo(), null, "constraints", null, 0, -1, Colonne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColonne_Tableau(), this.getTableau(), this.getTableau_Colonnes(), "tableau", null, 1, 1, Colonne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColonne_ColonneType(), this.getColonneType(), this.getColonneType_Colonne(), "colonneType", null, 0, 1, Colonne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColonne_Contrainte(), this.getcontrainte(), "contrainte", null, 0, 2, Colonne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importationTableauEClass, ImportationTableau.class, "ImportationTableau", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImportationTableau_IdentifiantColonne(), ecorePackage.getEString(), "identifiantColonne", null, 1, 1, ImportationTableau.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImportationTableau_Tableau(), this.getTableau(), null, "tableau", null, 1, 1, ImportationTableau.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colonneTypeEClass, ColonneType.class, "ColonneType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColonneType_Colonne(), this.getColonne(), this.getColonne_ColonneType(), "colonne", null, 1, 1, ColonneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importationAlgoEClass, ImportationAlgo.class, "ImportationAlgo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImportationAlgo_ColonneIN(), this.getColonne(), null, "ColonneIN", null, 0, -1, ImportationAlgo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImportationAlgo_Algorithm(), theAlgorithmProjectPackage.getAlgo(), null, "algorithm", null, 1, 1, ImportationAlgo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(contrainteEEnum, contrainte.class, "contrainte");
		addEEnumLiteral(contrainteEEnum, contrainte.DOIT_ETRE_NEGATIF);
		addEEnumLiteral(contrainteEEnum, contrainte.DOIT_ETRE_POSITIF);
		addEEnumLiteral(contrainteEEnum, contrainte.NON_NUL);
		addEEnumLiteral(contrainteEEnum, contrainte.CUSTOM);

		// Create resource
		createResource(eNS_URI);
	}

} //TableModelPackageImpl
