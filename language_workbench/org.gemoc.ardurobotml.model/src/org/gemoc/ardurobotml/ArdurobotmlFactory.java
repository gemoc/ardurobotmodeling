/**
 */
package org.gemoc.ardurobotml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.ardurobotml.ArdurobotmlPackage
 * @generated
 */
public interface ArdurobotmlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArdurobotmlFactory eINSTANCE = org.gemoc.ardurobotml.impl.ArdurobotmlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Timed System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed System</em>'.
	 * @generated
	 */
	TimedSystem createTimedSystem();

	/**
	 * Returns a new object of class '<em>TFSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TFSM</em>'.
	 * @generated
	 */
	TFSM createTFSM();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Element</em>'.
	 * @generated
	 */
	NamedElement createNamedElement();

	/**
	 * Returns a new object of class '<em>Temporal Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temporal Guard</em>'.
	 * @generated
	 */
	TemporalGuard createTemporalGuard();

	/**
	 * Returns a new object of class '<em>Event Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Guard</em>'.
	 * @generated
	 */
	EventGuard createEventGuard();

	/**
	 * Returns a new object of class '<em>FSM Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FSM Event</em>'.
	 * @generated
	 */
	FSMEvent createFSMEvent();

	/**
	 * Returns a new object of class '<em>FSM Clock</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FSM Clock</em>'.
	 * @generated
	 */
	FSMClock createFSMClock();

	/**
	 * Returns a new object of class '<em>Evaluate Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evaluate Guard</em>'.
	 * @generated
	 */
	EvaluateGuard createEvaluateGuard();

	/**
	 * Returns a new object of class '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Region</em>'.
	 * @generated
	 */
	Region createRegion();

	/**
	 * Returns a new object of class '<em>Stop Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop Action</em>'.
	 * @generated
	 */
	StopAction createStopAction();

	/**
	 * Returns a new object of class '<em>Move Forward Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Forward Action</em>'.
	 * @generated
	 */
	MoveForwardAction createMoveForwardAction();

	/**
	 * Returns a new object of class '<em>Move Backard Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Backard Action</em>'.
	 * @generated
	 */
	MoveBackardAction createMoveBackardAction();

	/**
	 * Returns a new object of class '<em>Move Forward And Turning Right Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Forward And Turning Right Action</em>'.
	 * @generated
	 */
	MoveForwardAndTurningRightAction createMoveForwardAndTurningRightAction();

	/**
	 * Returns a new object of class '<em>Move Forward And Turning Left Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Forward And Turning Left Action</em>'.
	 * @generated
	 */
	MoveForwardAndTurningLeftAction createMoveForwardAndTurningLeftAction();

	/**
	 * Returns a new object of class '<em>Move Backard And Turning Right Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Backard And Turning Right Action</em>'.
	 * @generated
	 */
	MoveBackardAndTurningRightAction createMoveBackardAndTurningRightAction();

	/**
	 * Returns a new object of class '<em>Move Backard And Turning Left Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Backard And Turning Left Action</em>'.
	 * @generated
	 */
	MoveBackardAndTurningLeftAction createMoveBackardAndTurningLeftAction();

	/**
	 * Returns a new object of class '<em>Turning Left Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turning Left Action</em>'.
	 * @generated
	 */
	TurningLeftAction createTurningLeftAction();

	/**
	 * Returns a new object of class '<em>Turning Right Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turning Right Action</em>'.
	 * @generated
	 */
	TurningRightAction createTurningRightAction();

	/**
	 * Returns a new object of class '<em>Acceleratet Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acceleratet Action</em>'.
	 * @generated
	 */
	AcceleratetAction createAcceleratetAction();

	/**
	 * Returns a new object of class '<em>Deceleratet Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deceleratet Action</em>'.
	 * @generated
	 */
	DeceleratetAction createDeceleratetAction();

	/**
	 * Returns a new object of class '<em>SCAN Collision Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SCAN Collision Action</em>'.
	 * @generated
	 */
	SCANCollisionAction createSCANCollisionAction();

	/**
	 * Returns a new object of class '<em>Emergency Stop Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Emergency Stop Action</em>'.
	 * @generated
	 */
	EmergencyStopAction createEmergencyStopAction();

	/**
	 * Returns a new object of class '<em>All Action Finished Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All Action Finished Condition</em>'.
	 * @generated
	 */
	AllActionFinishedCondition createAllActionFinishedCondition();

	/**
	 * Returns a new object of class '<em>System Property Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Property Condition</em>'.
	 * @generated
	 */
	SystemPropertyCondition createSystemPropertyCondition();

	/**
	 * Returns a new object of class '<em>Collision Sensor Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collision Sensor Condition</em>'.
	 * @generated
	 */
	CollisionSensorCondition createCollisionSensorCondition();

	/**
	 * Returns a new object of class '<em>Action Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Sequence</em>'.
	 * @generated
	 */
	ActionSequence createActionSequence();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ArdurobotmlPackage getArdurobotmlPackage();

} //ArdurobotmlFactory
