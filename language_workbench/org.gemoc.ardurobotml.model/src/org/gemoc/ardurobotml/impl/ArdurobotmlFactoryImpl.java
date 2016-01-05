/**
 */
package org.gemoc.ardurobotml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gemoc.ardurobotml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArdurobotmlFactoryImpl extends EFactoryImpl implements ArdurobotmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArdurobotmlFactory init() {
		try {
			ArdurobotmlFactory theArdurobotmlFactory = (ArdurobotmlFactory)EPackage.Registry.INSTANCE.getEFactory(ArdurobotmlPackage.eNS_URI);
			if (theArdurobotmlFactory != null) {
				return theArdurobotmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArdurobotmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArdurobotmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ArdurobotmlPackage.TIMED_SYSTEM: return createTimedSystem();
			case ArdurobotmlPackage.TFSM: return createTFSM();
			case ArdurobotmlPackage.STATE: return createState();
			case ArdurobotmlPackage.TRANSITION: return createTransition();
			case ArdurobotmlPackage.NAMED_ELEMENT: return createNamedElement();
			case ArdurobotmlPackage.TEMPORAL_GUARD: return createTemporalGuard();
			case ArdurobotmlPackage.EVENT_GUARD: return createEventGuard();
			case ArdurobotmlPackage.FSM_EVENT: return createFSMEvent();
			case ArdurobotmlPackage.FSM_CLOCK: return createFSMClock();
			case ArdurobotmlPackage.EVALUATE_GUARD: return createEvaluateGuard();
			case ArdurobotmlPackage.REGION: return createRegion();
			case ArdurobotmlPackage.STOP_ACTION: return createStopAction();
			case ArdurobotmlPackage.MOVE_FORWARD_ACTION: return createMoveForwardAction();
			case ArdurobotmlPackage.EMERGENCY_STOP_ACTION: return createEmergencyStopAction();
			case ArdurobotmlPackage.ALL_ACTION_FINISHED_CONDITION: return createAllActionFinishedCondition();
			case ArdurobotmlPackage.SYSTEM_PROPERTY_CONDITION: return createSystemPropertyCondition();
			case ArdurobotmlPackage.ACTION_SEQUENCE: return createActionSequence();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedSystem createTimedSystem() {
		TimedSystemImpl timedSystem = new TimedSystemImpl();
		return timedSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFSM createTFSM() {
		TFSMImpl tfsm = new TFSMImpl();
		return tfsm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalGuard createTemporalGuard() {
		TemporalGuardImpl temporalGuard = new TemporalGuardImpl();
		return temporalGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventGuard createEventGuard() {
		EventGuardImpl eventGuard = new EventGuardImpl();
		return eventGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSMEvent createFSMEvent() {
		FSMEventImpl fsmEvent = new FSMEventImpl();
		return fsmEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSMClock createFSMClock() {
		FSMClockImpl fsmClock = new FSMClockImpl();
		return fsmClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluateGuard createEvaluateGuard() {
		EvaluateGuardImpl evaluateGuard = new EvaluateGuardImpl();
		return evaluateGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region createRegion() {
		RegionImpl region = new RegionImpl();
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopAction createStopAction() {
		StopActionImpl stopAction = new StopActionImpl();
		return stopAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveForwardAction createMoveForwardAction() {
		MoveForwardActionImpl moveForwardAction = new MoveForwardActionImpl();
		return moveForwardAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmergencyStopAction createEmergencyStopAction() {
		EmergencyStopActionImpl emergencyStopAction = new EmergencyStopActionImpl();
		return emergencyStopAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllActionFinishedCondition createAllActionFinishedCondition() {
		AllActionFinishedConditionImpl allActionFinishedCondition = new AllActionFinishedConditionImpl();
		return allActionFinishedCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemPropertyCondition createSystemPropertyCondition() {
		SystemPropertyConditionImpl systemPropertyCondition = new SystemPropertyConditionImpl();
		return systemPropertyCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionSequence createActionSequence() {
		ActionSequenceImpl actionSequence = new ActionSequenceImpl();
		return actionSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArdurobotmlPackage getArdurobotmlPackage() {
		return (ArdurobotmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArdurobotmlPackage getPackage() {
		return ArdurobotmlPackage.eINSTANCE;
	}

} //ArdurobotmlFactoryImpl
