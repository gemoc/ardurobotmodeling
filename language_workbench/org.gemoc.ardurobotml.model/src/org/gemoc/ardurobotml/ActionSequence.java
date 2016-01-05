/**
 */
package org.gemoc.ardurobotml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.ardurobotml.ActionSequence#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.ardurobotml.ArdurobotmlPackage#getActionSequence()
 * @model
 * @generated
 */
public interface ActionSequence extends Action {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.ardurobotml.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see org.gemoc.ardurobotml.ArdurobotmlPackage#getActionSequence_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

} // ActionSequence
