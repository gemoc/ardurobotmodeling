/**
 */
package org.gemoc.ardurobotml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move Forward Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.ardurobotml.MoveForwardAction#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.gemoc.ardurobotml.MoveForwardAction#getStartTick <em>Start Tick</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.ardurobotml.ArdurobotmlPackage#getMoveForwardAction()
 * @model
 * @generated
 */
public interface MoveForwardAction extends Action {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see org.gemoc.ardurobotml.ArdurobotmlPackage#getMoveForwardAction_Duration()
	 * @model
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link org.gemoc.ardurobotml.MoveForwardAction#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Start Tick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Tick</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Tick</em>' attribute.
	 * @see #setStartTick(int)
	 * @see org.gemoc.ardurobotml.ArdurobotmlPackage#getMoveForwardAction_StartTick()
	 * @model
	 * @generated
	 */
	int getStartTick();

	/**
	 * Sets the value of the '{@link org.gemoc.ardurobotml.MoveForwardAction#getStartTick <em>Start Tick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Tick</em>' attribute.
	 * @see #getStartTick()
	 * @generated
	 */
	void setStartTick(int value);

} // MoveForwardAction