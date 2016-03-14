/**
 */
package org.gemoc.ardurobotml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move Backard And Turning Left Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.ardurobotml.MoveBackardAndTurningLeftAction#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.gemoc.ardurobotml.MoveBackardAndTurningLeftAction#getStartTick <em>Start Tick</em>}</li>
 *   <li>{@link org.gemoc.ardurobotml.MoveBackardAndTurningLeftAction#getDiff <em>Diff</em>}</li>
 *   <li>{@link org.gemoc.ardurobotml.MoveBackardAndTurningLeftAction#getSpeed <em>Speed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.ardurobotml.ArdurobotmlPackage#getMoveBackardAndTurningLeftAction()
 * @model
 * @generated
 */
public interface MoveBackardAndTurningLeftAction extends Action {
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
	 * @see org.gemoc.ardurobotml.ArdurobotmlPackage#getMoveBackardAndTurningLeftAction_Duration()
	 * @model
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link org.gemoc.ardurobotml.MoveBackardAndTurningLeftAction#getDuration <em>Duration</em>}' attribute.
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
	 * @see org.gemoc.ardurobotml.ArdurobotmlPackage#getMoveBackardAndTurningLeftAction_StartTick()
	 * @model
	 * @generated
	 */
	int getStartTick();

	/**
	 * Sets the value of the '{@link org.gemoc.ardurobotml.MoveBackardAndTurningLeftAction#getStartTick <em>Start Tick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Tick</em>' attribute.
	 * @see #getStartTick()
	 * @generated
	 */
	void setStartTick(int value);

	/**
	 * Returns the value of the '<em><b>Diff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Difference of speed between motor
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diff</em>' attribute.
	 * @see #setDiff(int)
	 * @see org.gemoc.ardurobotml.ArdurobotmlPackage#getMoveBackardAndTurningLeftAction_Diff()
	 * @model
	 * @generated
	 */
	int getDiff();

	/**
	 * Sets the value of the '{@link org.gemoc.ardurobotml.MoveBackardAndTurningLeftAction#getDiff <em>Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff</em>' attribute.
	 * @see #getDiff()
	 * @generated
	 */
	void setDiff(int value);

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(int)
	 * @see org.gemoc.ardurobotml.ArdurobotmlPackage#getMoveBackardAndTurningLeftAction_Speed()
	 * @model
	 * @generated
	 */
	int getSpeed();

	/**
	 * Sets the value of the '{@link org.gemoc.ardurobotml.MoveBackardAndTurningLeftAction#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(int value);

} // MoveBackardAndTurningLeftAction
