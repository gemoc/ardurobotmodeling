/**
 */
package org.gemoc.ardurobotml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.ardurobotml.Region#getOwnedStates <em>Owned States</em>}</li>
 *   <li>{@link org.gemoc.ardurobotml.Region#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.ardurobotml.ArdurobotmlPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned States</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.ardurobotml.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned States</em>' containment reference list.
	 * @see org.gemoc.ardurobotml.ArdurobotmlPackage#getRegion_OwnedStates()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getOwnedStates();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see org.gemoc.ardurobotml.ArdurobotmlPackage#getRegion_Name()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	String getName();

} // Region
