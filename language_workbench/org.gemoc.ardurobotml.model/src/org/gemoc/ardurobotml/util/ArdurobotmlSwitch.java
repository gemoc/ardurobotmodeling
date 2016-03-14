/**
 */
package org.gemoc.ardurobotml.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gemoc.ardurobotml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.gemoc.ardurobotml.ArdurobotmlPackage
 * @generated
 */
public class ArdurobotmlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArdurobotmlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArdurobotmlSwitch() {
		if (modelPackage == null) {
			modelPackage = ArdurobotmlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ArdurobotmlPackage.TIMED_SYSTEM: {
				TimedSystem timedSystem = (TimedSystem)theEObject;
				T result = caseTimedSystem(timedSystem);
				if (result == null) result = caseNamedElement(timedSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArdurobotmlPackage.TFSM: {
				TFSM tfsm = (TFSM)theEObject;
				T result = caseTFSM(tfsm);
				if (result == null) result = caseRegionContainer(tfsm);
				if (result == null) result = caseNamedElement(tfsm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArdurobotmlPackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = caseRegionContainer(state);
				if (result == null) result = caseNamedElement(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArdurobotmlPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseNamedElement(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArdurobotmlPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArdurobotmlPackage.GUARD: {
				Guard guard = (Guard)theEObject;
				T result = caseGuard(guard);
				if (result == null) result = caseNamedElement(guard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArdurobotmlPackage.TEMPORAL_GUARD: {
				TemporalGuard temporalGuard = (TemporalGuard)theEObject;
				T result = caseTemporalGuard(temporalGuard);
				if (result == null) result = caseGuard(temporalGuard);
				if (result == null) result = caseNamedElement(temporalGuard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArdurobotmlPackage.EVENT_GUARD: {
				EventGuard eventGuard = (EventGuard)theEObject;
				T result = caseEventGuard(eventGuard);
				if (result == null) result = caseGuard(eventGuard);
				if (result == null) result = caseNamedElement(eventGuard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArdurobotmlPackage.FSM_EVENT: {
				FSMEvent fsmEvent = (FSMEvent)theEObject;
				T result = caseFSMEvent(fsmEvent);
				if (result == null) result = caseNamedElement(fsmEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArdurobotmlPackage.FSM_CLOCK: {
				FSMClock fsmClock = (FSMClock)theEObject;
				T result = caseFSMClock(fsmClock);
				if (result == null) result = caseNamedElement(fsmClock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArdurobotmlPackage.EVALUATE_GUARD: {
				EvaluateGuard evaluateGuard = (EvaluateGuard)theEObject;
				T result = caseEvaluateGuard(evaluateGuard);
				if (result == null) result = caseGuard(evaluateGuard);
				if (result == null) result = caseNamedElement(evaluateGuard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArdurobotmlPackage.REGION: {
				Region region = (Region)theEObject;
				T result = caseRegion(region);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArdurobotmlPackage.REGION_CONTAINER: {
				RegionContainer regionContainer = (RegionContainer)theEObject;
				T result = caseRegionContainer(regionContainer);
				if (result == null) result = caseNamedElement(regionContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArdurobotmlPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArdurobotmlPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseNamedElement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArdurobotmlPackage.ALL_ACTION_FINISHED_CONDITION: {
				AllActionFinishedCondition allActionFinishedCondition = (AllActionFinishedCondition)theEObject;
				T result = caseAllActionFinishedCondition(allActionFinishedCondition);
				if (result == null) result = caseCondition(allActionFinishedCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArdurobotmlPackage.SYSTEM_PROPERTY_CONDITION: {
				SystemPropertyCondition systemPropertyCondition = (SystemPropertyCondition)theEObject;
				T result = caseSystemPropertyCondition(systemPropertyCondition);
				if (result == null) result = caseCondition(systemPropertyCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArdurobotmlPackage.COLLISION_SENSOR_CONDITION: {
				CollisionSensorCondition collisionSensorCondition = (CollisionSensorCondition)theEObject;
				T result = caseCollisionSensorCondition(collisionSensorCondition);
				if (result == null) result = caseCondition(collisionSensorCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArdurobotmlPackage.ACTION_SEQUENCE: {
				ActionSequence actionSequence = (ActionSequence)theEObject;
				T result = caseActionSequence(actionSequence);
				if (result == null) result = caseAction(actionSequence);
				if (result == null) result = caseNamedElement(actionSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArdurobotmlPackage.STOP_ACTION: {
				StopAction stopAction = (StopAction)theEObject;
				T result = caseStopAction(stopAction);
				if (result == null) result = caseAction(stopAction);
				if (result == null) result = caseNamedElement(stopAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArdurobotmlPackage.MOVE_FORWARD_ACTION: {
				MoveForwardAction moveForwardAction = (MoveForwardAction)theEObject;
				T result = caseMoveForwardAction(moveForwardAction);
				if (result == null) result = caseAction(moveForwardAction);
				if (result == null) result = caseNamedElement(moveForwardAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArdurobotmlPackage.MOVE_BACKARD_ACTION: {
				MoveBackardAction moveBackardAction = (MoveBackardAction)theEObject;
				T result = caseMoveBackardAction(moveBackardAction);
				if (result == null) result = caseAction(moveBackardAction);
				if (result == null) result = caseNamedElement(moveBackardAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArdurobotmlPackage.MOVE_FORWARD_AND_TURNING_RIGHT_ACTION: {
				MoveForwardAndTurningRightAction moveForwardAndTurningRightAction = (MoveForwardAndTurningRightAction)theEObject;
				T result = caseMoveForwardAndTurningRightAction(moveForwardAndTurningRightAction);
				if (result == null) result = caseAction(moveForwardAndTurningRightAction);
				if (result == null) result = caseNamedElement(moveForwardAndTurningRightAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArdurobotmlPackage.MOVE_FORWARD_AND_TURNING_LEFT_ACTION: {
				MoveForwardAndTurningLeftAction moveForwardAndTurningLeftAction = (MoveForwardAndTurningLeftAction)theEObject;
				T result = caseMoveForwardAndTurningLeftAction(moveForwardAndTurningLeftAction);
				if (result == null) result = caseAction(moveForwardAndTurningLeftAction);
				if (result == null) result = caseNamedElement(moveForwardAndTurningLeftAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArdurobotmlPackage.MOVE_BACKARD_AND_TURNING_RIGHT_ACTION: {
				MoveBackardAndTurningRightAction moveBackardAndTurningRightAction = (MoveBackardAndTurningRightAction)theEObject;
				T result = caseMoveBackardAndTurningRightAction(moveBackardAndTurningRightAction);
				if (result == null) result = caseAction(moveBackardAndTurningRightAction);
				if (result == null) result = caseNamedElement(moveBackardAndTurningRightAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArdurobotmlPackage.MOVE_BACKARD_AND_TURNING_LEFT_ACTION: {
				MoveBackardAndTurningLeftAction moveBackardAndTurningLeftAction = (MoveBackardAndTurningLeftAction)theEObject;
				T result = caseMoveBackardAndTurningLeftAction(moveBackardAndTurningLeftAction);
				if (result == null) result = caseAction(moveBackardAndTurningLeftAction);
				if (result == null) result = caseNamedElement(moveBackardAndTurningLeftAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArdurobotmlPackage.TURNING_LEFT_ACTION: {
				TurningLeftAction turningLeftAction = (TurningLeftAction)theEObject;
				T result = caseTurningLeftAction(turningLeftAction);
				if (result == null) result = caseAction(turningLeftAction);
				if (result == null) result = caseNamedElement(turningLeftAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArdurobotmlPackage.TURNING_RIGHT_ACTION: {
				TurningRightAction turningRightAction = (TurningRightAction)theEObject;
				T result = caseTurningRightAction(turningRightAction);
				if (result == null) result = caseAction(turningRightAction);
				if (result == null) result = caseNamedElement(turningRightAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArdurobotmlPackage.ACCELERATET_ACTION: {
				AcceleratetAction acceleratetAction = (AcceleratetAction)theEObject;
				T result = caseAcceleratetAction(acceleratetAction);
				if (result == null) result = caseAction(acceleratetAction);
				if (result == null) result = caseNamedElement(acceleratetAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArdurobotmlPackage.DECELERATET_ACTION: {
				DeceleratetAction deceleratetAction = (DeceleratetAction)theEObject;
				T result = caseDeceleratetAction(deceleratetAction);
				if (result == null) result = caseAction(deceleratetAction);
				if (result == null) result = caseNamedElement(deceleratetAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArdurobotmlPackage.SCAN_COLLISION_ACTION: {
				SCANCollisionAction scanCollisionAction = (SCANCollisionAction)theEObject;
				T result = caseSCANCollisionAction(scanCollisionAction);
				if (result == null) result = caseAction(scanCollisionAction);
				if (result == null) result = caseNamedElement(scanCollisionAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArdurobotmlPackage.EMERGENCY_STOP_ACTION: {
				EmergencyStopAction emergencyStopAction = (EmergencyStopAction)theEObject;
				T result = caseEmergencyStopAction(emergencyStopAction);
				if (result == null) result = caseAction(emergencyStopAction);
				if (result == null) result = caseNamedElement(emergencyStopAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedSystem(TimedSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TFSM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TFSM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTFSM(TFSM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuard(Guard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalGuard(TemporalGuard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventGuard(EventGuard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FSM Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FSM Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFSMEvent(FSMEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FSM Clock</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FSM Clock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFSMClock(FSMClock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluate Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluate Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluateGuard(EvaluateGuard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegion(Region object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Region Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Region Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegionContainer(RegionContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopAction(StopAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Forward Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Forward Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveForwardAction(MoveForwardAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Backard Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Backard Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveBackardAction(MoveBackardAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Forward And Turning Right Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Forward And Turning Right Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveForwardAndTurningRightAction(MoveForwardAndTurningRightAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Forward And Turning Left Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Forward And Turning Left Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveForwardAndTurningLeftAction(MoveForwardAndTurningLeftAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Backard And Turning Right Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Backard And Turning Right Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveBackardAndTurningRightAction(MoveBackardAndTurningRightAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Backard And Turning Left Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Backard And Turning Left Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveBackardAndTurningLeftAction(MoveBackardAndTurningLeftAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turning Left Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turning Left Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurningLeftAction(TurningLeftAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turning Right Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turning Right Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurningRightAction(TurningRightAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acceleratet Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acceleratet Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceleratetAction(AcceleratetAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deceleratet Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deceleratet Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeceleratetAction(DeceleratetAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SCAN Collision Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SCAN Collision Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSCANCollisionAction(SCANCollisionAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emergency Stop Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emergency Stop Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmergencyStopAction(EmergencyStopAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Action Finished Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Action Finished Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllActionFinishedCondition(AllActionFinishedCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Property Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Property Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemPropertyCondition(SystemPropertyCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collision Sensor Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collision Sensor Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollisionSensorCondition(CollisionSensorCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionSequence(ActionSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ArdurobotmlSwitch
