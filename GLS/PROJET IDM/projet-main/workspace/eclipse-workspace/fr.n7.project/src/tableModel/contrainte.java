/**
 */
package tableModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>contrainte</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tableModel.TableModelPackage#getcontrainte()
 * @model
 * @generated
 */
public enum contrainte implements Enumerator {
	/**
	 * The '<em><b>DOIT ETRE NEGATIF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOIT_ETRE_NEGATIF_VALUE
	 * @generated
	 * @ordered
	 */
	DOIT_ETRE_NEGATIF(1, "DOIT_ETRE_NEGATIF", "DOIT_ETRE_NEGATIF"),

	/**
	 * The '<em><b>DOIT ETRE POSITIF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOIT_ETRE_POSITIF_VALUE
	 * @generated
	 * @ordered
	 */
	DOIT_ETRE_POSITIF(0, "DOIT_ETRE_POSITIF", "DOIT_ETRE_POSITIF"),

	/**
	 * The '<em><b>NON NUL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_NUL_VALUE
	 * @generated
	 * @ordered
	 */
	NON_NUL(3, "NON_NUL", "NON_NUL"),

	/**
	 * The '<em><b>CUSTOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM(4, "CUSTOM", "CUSTOM");

	/**
	 * The '<em><b>DOIT ETRE NEGATIF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOIT_ETRE_NEGATIF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOIT_ETRE_NEGATIF_VALUE = 1;

	/**
	 * The '<em><b>DOIT ETRE POSITIF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOIT_ETRE_POSITIF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOIT_ETRE_POSITIF_VALUE = 0;

	/**
	 * The '<em><b>NON NUL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_NUL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NON_NUL_VALUE = 3;

	/**
	 * The '<em><b>CUSTOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM_VALUE = 4;

	/**
	 * An array of all the '<em><b>contrainte</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final contrainte[] VALUES_ARRAY =
		new contrainte[] {
			DOIT_ETRE_NEGATIF,
			DOIT_ETRE_POSITIF,
			NON_NUL,
			CUSTOM,
		};

	/**
	 * A public read-only list of all the '<em><b>contrainte</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<contrainte> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>contrainte</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static contrainte get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			contrainte result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>contrainte</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static contrainte getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			contrainte result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>contrainte</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static contrainte get(int value) {
		switch (value) {
			case DOIT_ETRE_NEGATIF_VALUE: return DOIT_ETRE_NEGATIF;
			case DOIT_ETRE_POSITIF_VALUE: return DOIT_ETRE_POSITIF;
			case NON_NUL_VALUE: return NON_NUL;
			case CUSTOM_VALUE: return CUSTOM;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private contrainte(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //contrainte
