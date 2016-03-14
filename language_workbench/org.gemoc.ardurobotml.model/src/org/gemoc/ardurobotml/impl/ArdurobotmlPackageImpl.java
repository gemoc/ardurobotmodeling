/**
 */
package org.gemoc.ardurobotml.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.ardurobotml.AcceleratetAction;
import org.gemoc.ardurobotml.Action;
import org.gemoc.ardurobotml.ActionSequence;
import org.gemoc.ardurobotml.AllActionFinishedCondition;
import org.gemoc.ardurobotml.ArdurobotmlFactory;
import org.gemoc.ardurobotml.ArdurobotmlPackage;
import org.gemoc.ardurobotml.CollisionSensorCondition;
import org.gemoc.ardurobotml.Condition;
import org.gemoc.ardurobotml.DeceleratetAction;
import org.gemoc.ardurobotml.EmergencyStopAction;
import org.gemoc.ardurobotml.EvaluateGuard;
import org.gemoc.ardurobotml.EventGuard;
import org.gemoc.ardurobotml.FSMClock;
import org.gemoc.ardurobotml.FSMEvent;
import org.gemoc.ardurobotml.Guard;
import org.gemoc.ardurobotml.MoveBackardAction;
import org.gemoc.ardurobotml.MoveBackardAndTurningLeftAction;
import org.gemoc.ardurobotml.MoveBackardAndTurningRightAction;
import org.gemoc.ardurobotml.MoveForwardAction;
import org.gemoc.ardurobotml.MoveForwardAndTurningLeftAction;
import org.gemoc.ardurobotml.MoveForwardAndTurningRightAction;
import org.gemoc.ardurobotml.NamedElement;
import org.gemoc.ardurobotml.Region;
import org.gemoc.ardurobotml.RegionContainer;
import org.gemoc.ardurobotml.SCANCollisionAction;
import org.gemoc.ardurobotml.State;
import org.gemoc.ardurobotml.StopAction;
import org.gemoc.ardurobotml.SystemPropertyCondition;
import org.gemoc.ardurobotml.TemporalGuard;
import org.gemoc.ardurobotml.TimedSystem;
import org.gemoc.ardurobotml.Transition;
import org.gemoc.ardurobotml.TurningLeftAction;
import org.gemoc.ardurobotml.TurningRightAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArdurobotmlPackageImpl extends EPackageImpl implements ArdurobotmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tfsmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalGuardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventGuardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsmEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsmClockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluateGuardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveForwardActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveBackardActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveForwardAndTurningRightActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveForwardAndTurningLeftActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveBackardAndTurningRightActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveBackardAndTurningLeftActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turningLeftActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turningRightActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceleratetActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deceleratetActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scanCollisionActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emergencyStopActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allActionFinishedConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemPropertyConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collisionSensorConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionSequenceEClass = null;

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
	 * @see org.gemoc.ardurobotml.ArdurobotmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArdurobotmlPackageImpl() {
		super(eNS_URI, ArdurobotmlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ArdurobotmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArdurobotmlPackage init() {
		if (isInited) return (ArdurobotmlPackage)EPackage.Registry.INSTANCE.getEPackage(ArdurobotmlPackage.eNS_URI);

		// Obtain or create and register package
		ArdurobotmlPackageImpl theArdurobotmlPackage = (ArdurobotmlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArdurobotmlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArdurobotmlPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theArdurobotmlPackage.createPackageContents();

		// Initialize created meta-data
		theArdurobotmlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArdurobotmlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArdurobotmlPackage.eNS_URI, theArdurobotmlPackage);
		return theArdurobotmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedSystem() {
		return timedSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimedSystem_Tfsms() {
		return (EReference)timedSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimedSystem_GlobalClocks() {
		return (EReference)timedSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimedSystem_GlobalEvents() {
		return (EReference)timedSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTFSM() {
		return tfsmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTFSM_InitialState() {
		return (EReference)tfsmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTFSM_LocalEvents() {
		return (EReference)tfsmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTFSM_LocalClock() {
		return (EReference)tfsmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTFSM_OwnedTransitions() {
		return (EReference)tfsmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTFSM_CurrentState() {
		return (EReference)tfsmEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTFSM_OwnedStates() {
		return (EReference)tfsmEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTFSM__Initialize() {
		return tfsmEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_OutgoingTransitions() {
		return (EReference)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_IncomingTransitions() {
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Actions() {
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_OwningFSM() {
		return (EReference)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getState__OnEnter() {
		return stateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getState__OnLeave() {
		return stateEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Source() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Target() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_OwnedGuard() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_GeneratedEvents() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition__Fire() {
		return transitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuard() {
		return guardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalGuard() {
		return temporalGuardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalGuard_OnClock() {
		return (EReference)temporalGuardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalGuard_AfterDuration() {
		return (EAttribute)temporalGuardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventGuard() {
		return eventGuardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventGuard_TriggeringEvent() {
		return (EReference)eventGuardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFSMEvent() {
		return fsmEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFSMEvent_SollicitingTransitions() {
		return (EReference)fsmEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFSMClock() {
		return fsmClockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFSMClock_Value() {
		return (EAttribute)fsmClockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFSMClock__Ticks() {
		return fsmClockEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluateGuard() {
		return evaluateGuardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluateGuard_Condition() {
		return (EReference)evaluateGuardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegion() {
		return regionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_OwnedStates() {
		return (EReference)regionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegion_Name() {
		return (EAttribute)regionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegionContainer() {
		return regionContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegionContainer_OwnedRegions() {
		return (EReference)regionContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStopAction() {
		return stopActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoveForwardAction() {
		return moveForwardActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveForwardAction_Duration() {
		return (EAttribute)moveForwardActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveForwardAction_StartTick() {
		return (EAttribute)moveForwardActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveForwardAction_Speed() {
		return (EAttribute)moveForwardActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoveBackardAction() {
		return moveBackardActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveBackardAction_Duration() {
		return (EAttribute)moveBackardActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveBackardAction_StartTick() {
		return (EAttribute)moveBackardActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveBackardAction_Speed() {
		return (EAttribute)moveBackardActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoveForwardAndTurningRightAction() {
		return moveForwardAndTurningRightActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveForwardAndTurningRightAction_Duration() {
		return (EAttribute)moveForwardAndTurningRightActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveForwardAndTurningRightAction_StartTick() {
		return (EAttribute)moveForwardAndTurningRightActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveForwardAndTurningRightAction_Diff() {
		return (EAttribute)moveForwardAndTurningRightActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveForwardAndTurningRightAction_Speed() {
		return (EAttribute)moveForwardAndTurningRightActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoveForwardAndTurningLeftAction() {
		return moveForwardAndTurningLeftActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveForwardAndTurningLeftAction_Duration() {
		return (EAttribute)moveForwardAndTurningLeftActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveForwardAndTurningLeftAction_StartTick() {
		return (EAttribute)moveForwardAndTurningLeftActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveForwardAndTurningLeftAction_Diff() {
		return (EAttribute)moveForwardAndTurningLeftActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveForwardAndTurningLeftAction_Speed() {
		return (EAttribute)moveForwardAndTurningLeftActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoveBackardAndTurningRightAction() {
		return moveBackardAndTurningRightActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveBackardAndTurningRightAction_Duration() {
		return (EAttribute)moveBackardAndTurningRightActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveBackardAndTurningRightAction_StartTick() {
		return (EAttribute)moveBackardAndTurningRightActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveBackardAndTurningRightAction_Diff() {
		return (EAttribute)moveBackardAndTurningRightActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveBackardAndTurningRightAction_Speed() {
		return (EAttribute)moveBackardAndTurningRightActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoveBackardAndTurningLeftAction() {
		return moveBackardAndTurningLeftActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveBackardAndTurningLeftAction_Duration() {
		return (EAttribute)moveBackardAndTurningLeftActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveBackardAndTurningLeftAction_StartTick() {
		return (EAttribute)moveBackardAndTurningLeftActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveBackardAndTurningLeftAction_Diff() {
		return (EAttribute)moveBackardAndTurningLeftActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveBackardAndTurningLeftAction_Speed() {
		return (EAttribute)moveBackardAndTurningLeftActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurningLeftAction() {
		return turningLeftActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurningLeftAction_Duration() {
		return (EAttribute)turningLeftActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurningLeftAction_StartTick() {
		return (EAttribute)turningLeftActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurningLeftAction_Speed() {
		return (EAttribute)turningLeftActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurningRightAction() {
		return turningRightActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurningRightAction_Duration() {
		return (EAttribute)turningRightActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurningRightAction_StartTick() {
		return (EAttribute)turningRightActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurningRightAction_Speed() {
		return (EAttribute)turningRightActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceleratetAction() {
		return acceleratetActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcceleratetAction_Ratio() {
		return (EAttribute)acceleratetActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcceleratetAction_StartTick() {
		return (EAttribute)acceleratetActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeceleratetAction() {
		return deceleratetActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeceleratetAction_Ratio() {
		return (EAttribute)deceleratetActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeceleratetAction_StartTick() {
		return (EAttribute)deceleratetActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSCANCollisionAction() {
		return scanCollisionActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAction__Begin() {
		return actionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAction__End() {
		return actionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmergencyStopAction() {
		return emergencyStopActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmergencyStopAction__Begin() {
		return emergencyStopActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllActionFinishedCondition() {
		return allActionFinishedConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemPropertyCondition() {
		return systemPropertyConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemPropertyCondition_ExpectedAttributeValue() {
		return (EAttribute)systemPropertyConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollisionSensorCondition() {
		return collisionSensorConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionSequence() {
		return actionSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionSequence_Actions() {
		return (EReference)actionSequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArdurobotmlFactory getArdurobotmlFactory() {
		return (ArdurobotmlFactory)getEFactoryInstance();
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
		timedSystemEClass = createEClass(TIMED_SYSTEM);
		createEReference(timedSystemEClass, TIMED_SYSTEM__TFSMS);
		createEReference(timedSystemEClass, TIMED_SYSTEM__GLOBAL_CLOCKS);
		createEReference(timedSystemEClass, TIMED_SYSTEM__GLOBAL_EVENTS);

		tfsmEClass = createEClass(TFSM);
		createEReference(tfsmEClass, TFSM__INITIAL_STATE);
		createEReference(tfsmEClass, TFSM__LOCAL_EVENTS);
		createEReference(tfsmEClass, TFSM__LOCAL_CLOCK);
		createEReference(tfsmEClass, TFSM__OWNED_TRANSITIONS);
		createEReference(tfsmEClass, TFSM__CURRENT_STATE);
		createEReference(tfsmEClass, TFSM__OWNED_STATES);
		createEOperation(tfsmEClass, TFSM___INITIALIZE);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__OUTGOING_TRANSITIONS);
		createEReference(stateEClass, STATE__INCOMING_TRANSITIONS);
		createEReference(stateEClass, STATE__ACTIONS);
		createEReference(stateEClass, STATE__OWNING_FSM);
		createEOperation(stateEClass, STATE___ON_ENTER);
		createEOperation(stateEClass, STATE___ON_LEAVE);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEReference(transitionEClass, TRANSITION__OWNED_GUARD);
		createEReference(transitionEClass, TRANSITION__GENERATED_EVENTS);
		createEOperation(transitionEClass, TRANSITION___FIRE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		guardEClass = createEClass(GUARD);

		temporalGuardEClass = createEClass(TEMPORAL_GUARD);
		createEReference(temporalGuardEClass, TEMPORAL_GUARD__ON_CLOCK);
		createEAttribute(temporalGuardEClass, TEMPORAL_GUARD__AFTER_DURATION);

		eventGuardEClass = createEClass(EVENT_GUARD);
		createEReference(eventGuardEClass, EVENT_GUARD__TRIGGERING_EVENT);

		fsmEventEClass = createEClass(FSM_EVENT);
		createEReference(fsmEventEClass, FSM_EVENT__SOLLICITING_TRANSITIONS);

		fsmClockEClass = createEClass(FSM_CLOCK);
		createEAttribute(fsmClockEClass, FSM_CLOCK__VALUE);
		createEOperation(fsmClockEClass, FSM_CLOCK___TICKS);

		evaluateGuardEClass = createEClass(EVALUATE_GUARD);
		createEReference(evaluateGuardEClass, EVALUATE_GUARD__CONDITION);

		regionEClass = createEClass(REGION);
		createEReference(regionEClass, REGION__OWNED_STATES);
		createEAttribute(regionEClass, REGION__NAME);

		regionContainerEClass = createEClass(REGION_CONTAINER);
		createEReference(regionContainerEClass, REGION_CONTAINER__OWNED_REGIONS);

		conditionEClass = createEClass(CONDITION);

		actionEClass = createEClass(ACTION);
		createEOperation(actionEClass, ACTION___BEGIN);
		createEOperation(actionEClass, ACTION___END);

		allActionFinishedConditionEClass = createEClass(ALL_ACTION_FINISHED_CONDITION);

		systemPropertyConditionEClass = createEClass(SYSTEM_PROPERTY_CONDITION);
		createEAttribute(systemPropertyConditionEClass, SYSTEM_PROPERTY_CONDITION__EXPECTED_ATTRIBUTE_VALUE);

		collisionSensorConditionEClass = createEClass(COLLISION_SENSOR_CONDITION);

		actionSequenceEClass = createEClass(ACTION_SEQUENCE);
		createEReference(actionSequenceEClass, ACTION_SEQUENCE__ACTIONS);

		stopActionEClass = createEClass(STOP_ACTION);

		moveForwardActionEClass = createEClass(MOVE_FORWARD_ACTION);
		createEAttribute(moveForwardActionEClass, MOVE_FORWARD_ACTION__DURATION);
		createEAttribute(moveForwardActionEClass, MOVE_FORWARD_ACTION__START_TICK);
		createEAttribute(moveForwardActionEClass, MOVE_FORWARD_ACTION__SPEED);

		moveBackardActionEClass = createEClass(MOVE_BACKARD_ACTION);
		createEAttribute(moveBackardActionEClass, MOVE_BACKARD_ACTION__DURATION);
		createEAttribute(moveBackardActionEClass, MOVE_BACKARD_ACTION__START_TICK);
		createEAttribute(moveBackardActionEClass, MOVE_BACKARD_ACTION__SPEED);

		moveForwardAndTurningRightActionEClass = createEClass(MOVE_FORWARD_AND_TURNING_RIGHT_ACTION);
		createEAttribute(moveForwardAndTurningRightActionEClass, MOVE_FORWARD_AND_TURNING_RIGHT_ACTION__DURATION);
		createEAttribute(moveForwardAndTurningRightActionEClass, MOVE_FORWARD_AND_TURNING_RIGHT_ACTION__START_TICK);
		createEAttribute(moveForwardAndTurningRightActionEClass, MOVE_FORWARD_AND_TURNING_RIGHT_ACTION__DIFF);
		createEAttribute(moveForwardAndTurningRightActionEClass, MOVE_FORWARD_AND_TURNING_RIGHT_ACTION__SPEED);

		moveForwardAndTurningLeftActionEClass = createEClass(MOVE_FORWARD_AND_TURNING_LEFT_ACTION);
		createEAttribute(moveForwardAndTurningLeftActionEClass, MOVE_FORWARD_AND_TURNING_LEFT_ACTION__DURATION);
		createEAttribute(moveForwardAndTurningLeftActionEClass, MOVE_FORWARD_AND_TURNING_LEFT_ACTION__START_TICK);
		createEAttribute(moveForwardAndTurningLeftActionEClass, MOVE_FORWARD_AND_TURNING_LEFT_ACTION__DIFF);
		createEAttribute(moveForwardAndTurningLeftActionEClass, MOVE_FORWARD_AND_TURNING_LEFT_ACTION__SPEED);

		moveBackardAndTurningRightActionEClass = createEClass(MOVE_BACKARD_AND_TURNING_RIGHT_ACTION);
		createEAttribute(moveBackardAndTurningRightActionEClass, MOVE_BACKARD_AND_TURNING_RIGHT_ACTION__DURATION);
		createEAttribute(moveBackardAndTurningRightActionEClass, MOVE_BACKARD_AND_TURNING_RIGHT_ACTION__START_TICK);
		createEAttribute(moveBackardAndTurningRightActionEClass, MOVE_BACKARD_AND_TURNING_RIGHT_ACTION__DIFF);
		createEAttribute(moveBackardAndTurningRightActionEClass, MOVE_BACKARD_AND_TURNING_RIGHT_ACTION__SPEED);

		moveBackardAndTurningLeftActionEClass = createEClass(MOVE_BACKARD_AND_TURNING_LEFT_ACTION);
		createEAttribute(moveBackardAndTurningLeftActionEClass, MOVE_BACKARD_AND_TURNING_LEFT_ACTION__DURATION);
		createEAttribute(moveBackardAndTurningLeftActionEClass, MOVE_BACKARD_AND_TURNING_LEFT_ACTION__START_TICK);
		createEAttribute(moveBackardAndTurningLeftActionEClass, MOVE_BACKARD_AND_TURNING_LEFT_ACTION__DIFF);
		createEAttribute(moveBackardAndTurningLeftActionEClass, MOVE_BACKARD_AND_TURNING_LEFT_ACTION__SPEED);

		turningLeftActionEClass = createEClass(TURNING_LEFT_ACTION);
		createEAttribute(turningLeftActionEClass, TURNING_LEFT_ACTION__DURATION);
		createEAttribute(turningLeftActionEClass, TURNING_LEFT_ACTION__START_TICK);
		createEAttribute(turningLeftActionEClass, TURNING_LEFT_ACTION__SPEED);

		turningRightActionEClass = createEClass(TURNING_RIGHT_ACTION);
		createEAttribute(turningRightActionEClass, TURNING_RIGHT_ACTION__DURATION);
		createEAttribute(turningRightActionEClass, TURNING_RIGHT_ACTION__START_TICK);
		createEAttribute(turningRightActionEClass, TURNING_RIGHT_ACTION__SPEED);

		acceleratetActionEClass = createEClass(ACCELERATET_ACTION);
		createEAttribute(acceleratetActionEClass, ACCELERATET_ACTION__RATIO);
		createEAttribute(acceleratetActionEClass, ACCELERATET_ACTION__START_TICK);

		deceleratetActionEClass = createEClass(DECELERATET_ACTION);
		createEAttribute(deceleratetActionEClass, DECELERATET_ACTION__RATIO);
		createEAttribute(deceleratetActionEClass, DECELERATET_ACTION__START_TICK);

		scanCollisionActionEClass = createEClass(SCAN_COLLISION_ACTION);

		emergencyStopActionEClass = createEClass(EMERGENCY_STOP_ACTION);
		createEOperation(emergencyStopActionEClass, EMERGENCY_STOP_ACTION___BEGIN);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		timedSystemEClass.getESuperTypes().add(this.getNamedElement());
		tfsmEClass.getESuperTypes().add(this.getRegionContainer());
		stateEClass.getESuperTypes().add(this.getRegionContainer());
		transitionEClass.getESuperTypes().add(this.getNamedElement());
		guardEClass.getESuperTypes().add(this.getNamedElement());
		temporalGuardEClass.getESuperTypes().add(this.getGuard());
		eventGuardEClass.getESuperTypes().add(this.getGuard());
		fsmEventEClass.getESuperTypes().add(this.getNamedElement());
		fsmClockEClass.getESuperTypes().add(this.getNamedElement());
		evaluateGuardEClass.getESuperTypes().add(this.getGuard());
		regionContainerEClass.getESuperTypes().add(this.getNamedElement());
		actionEClass.getESuperTypes().add(this.getNamedElement());
		allActionFinishedConditionEClass.getESuperTypes().add(this.getCondition());
		systemPropertyConditionEClass.getESuperTypes().add(this.getCondition());
		collisionSensorConditionEClass.getESuperTypes().add(this.getCondition());
		actionSequenceEClass.getESuperTypes().add(this.getAction());
		stopActionEClass.getESuperTypes().add(this.getAction());
		moveForwardActionEClass.getESuperTypes().add(this.getAction());
		moveBackardActionEClass.getESuperTypes().add(this.getAction());
		moveForwardAndTurningRightActionEClass.getESuperTypes().add(this.getAction());
		moveForwardAndTurningLeftActionEClass.getESuperTypes().add(this.getAction());
		moveBackardAndTurningRightActionEClass.getESuperTypes().add(this.getAction());
		moveBackardAndTurningLeftActionEClass.getESuperTypes().add(this.getAction());
		turningLeftActionEClass.getESuperTypes().add(this.getAction());
		turningRightActionEClass.getESuperTypes().add(this.getAction());
		acceleratetActionEClass.getESuperTypes().add(this.getAction());
		deceleratetActionEClass.getESuperTypes().add(this.getAction());
		scanCollisionActionEClass.getESuperTypes().add(this.getAction());
		emergencyStopActionEClass.getESuperTypes().add(this.getAction());

		// Initialize classes, features, and operations; add parameters
		initEClass(timedSystemEClass, TimedSystem.class, "TimedSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimedSystem_Tfsms(), this.getTFSM(), null, "tfsms", null, 0, -1, TimedSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimedSystem_GlobalClocks(), this.getFSMClock(), null, "globalClocks", null, 0, -1, TimedSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimedSystem_GlobalEvents(), this.getFSMEvent(), null, "globalEvents", null, 0, -1, TimedSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tfsmEClass, org.gemoc.ardurobotml.TFSM.class, "TFSM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTFSM_InitialState(), this.getState(), null, "initialState", null, 1, 1, org.gemoc.ardurobotml.TFSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTFSM_LocalEvents(), this.getFSMEvent(), null, "localEvents", null, 0, -1, org.gemoc.ardurobotml.TFSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTFSM_LocalClock(), this.getFSMClock(), null, "localClock", null, 1, 1, org.gemoc.ardurobotml.TFSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTFSM_OwnedTransitions(), this.getTransition(), null, "ownedTransitions", null, 0, -1, org.gemoc.ardurobotml.TFSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTFSM_CurrentState(), this.getState(), null, "currentState", null, 0, 1, org.gemoc.ardurobotml.TFSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTFSM_OwnedStates(), this.getState(), this.getState_OwningFSM(), "ownedStates", null, 0, -1, org.gemoc.ardurobotml.TFSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getTFSM__Initialize(), ecorePackage.getEString(), "initialize", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_OutgoingTransitions(), this.getTransition(), this.getTransition_Source(), "outgoingTransitions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_IncomingTransitions(), this.getTransition(), this.getTransition_Target(), "incomingTransitions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Actions(), this.getAction(), null, "actions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_OwningFSM(), this.getTFSM(), this.getTFSM_OwnedStates(), "owningFSM", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getState__OnEnter(), ecorePackage.getEString(), "onEnter", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getState__OnLeave(), ecorePackage.getEString(), "onLeave", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Source(), this.getState(), this.getState_OutgoingTransitions(), "source", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getState(), this.getState_IncomingTransitions(), "target", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_OwnedGuard(), this.getGuard(), null, "ownedGuard", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_GeneratedEvents(), this.getFSMEvent(), null, "generatedEvents", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTransition__Fire(), ecorePackage.getEString(), "fire", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guardEClass, Guard.class, "Guard", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(temporalGuardEClass, TemporalGuard.class, "TemporalGuard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemporalGuard_OnClock(), this.getFSMClock(), null, "onClock", null, 1, 1, TemporalGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporalGuard_AfterDuration(), ecorePackage.getEInt(), "afterDuration", null, 1, 1, TemporalGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventGuardEClass, EventGuard.class, "EventGuard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventGuard_TriggeringEvent(), this.getFSMEvent(), null, "triggeringEvent", null, 1, 1, EventGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fsmEventEClass, FSMEvent.class, "FSMEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFSMEvent_SollicitingTransitions(), this.getTransition(), null, "sollicitingTransitions", null, 0, -1, FSMEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fsmClockEClass, FSMClock.class, "FSMClock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFSMClock_Value(), ecorePackage.getEInt(), "value", null, 0, 1, FSMClock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getFSMClock__Ticks(), null, "ticks", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(evaluateGuardEClass, EvaluateGuard.class, "EvaluateGuard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvaluateGuard_Condition(), this.getCondition(), null, "condition", null, 1, 1, EvaluateGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regionEClass, Region.class, "Region", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegion_OwnedStates(), this.getState(), null, "ownedStates", null, 0, -1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegion_Name(), ecorePackage.getEString(), "name", null, 0, 1, Region.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(regionContainerEClass, RegionContainer.class, "RegionContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegionContainer_OwnedRegions(), this.getRegion(), null, "ownedRegions", null, 0, -1, RegionContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAction__Begin(), null, "begin", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAction__End(), null, "end", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(allActionFinishedConditionEClass, AllActionFinishedCondition.class, "AllActionFinishedCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemPropertyConditionEClass, SystemPropertyCondition.class, "SystemPropertyCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemPropertyCondition_ExpectedAttributeValue(), ecorePackage.getEBoolean(), "expectedAttributeValue", null, 0, 1, SystemPropertyCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collisionSensorConditionEClass, CollisionSensorCondition.class, "CollisionSensorCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionSequenceEClass, ActionSequence.class, "ActionSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionSequence_Actions(), this.getAction(), null, "actions", null, 0, -1, ActionSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stopActionEClass, StopAction.class, "StopAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moveForwardActionEClass, MoveForwardAction.class, "MoveForwardAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMoveForwardAction_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, MoveForwardAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoveForwardAction_StartTick(), ecorePackage.getEInt(), "startTick", null, 0, 1, MoveForwardAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoveForwardAction_Speed(), ecorePackage.getEInt(), "speed", null, 0, 1, MoveForwardAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moveBackardActionEClass, MoveBackardAction.class, "MoveBackardAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMoveBackardAction_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, MoveBackardAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoveBackardAction_StartTick(), ecorePackage.getEInt(), "startTick", null, 0, 1, MoveBackardAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoveBackardAction_Speed(), ecorePackage.getEInt(), "speed", null, 0, 1, MoveBackardAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moveForwardAndTurningRightActionEClass, MoveForwardAndTurningRightAction.class, "MoveForwardAndTurningRightAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMoveForwardAndTurningRightAction_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, MoveForwardAndTurningRightAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoveForwardAndTurningRightAction_StartTick(), ecorePackage.getEInt(), "startTick", null, 0, 1, MoveForwardAndTurningRightAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoveForwardAndTurningRightAction_Diff(), ecorePackage.getEInt(), "diff", null, 0, 1, MoveForwardAndTurningRightAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoveForwardAndTurningRightAction_Speed(), ecorePackage.getEInt(), "speed", null, 0, 1, MoveForwardAndTurningRightAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moveForwardAndTurningLeftActionEClass, MoveForwardAndTurningLeftAction.class, "MoveForwardAndTurningLeftAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMoveForwardAndTurningLeftAction_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, MoveForwardAndTurningLeftAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoveForwardAndTurningLeftAction_StartTick(), ecorePackage.getEInt(), "startTick", null, 0, 1, MoveForwardAndTurningLeftAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoveForwardAndTurningLeftAction_Diff(), ecorePackage.getEInt(), "diff", null, 0, 1, MoveForwardAndTurningLeftAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoveForwardAndTurningLeftAction_Speed(), ecorePackage.getEInt(), "speed", null, 0, 1, MoveForwardAndTurningLeftAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moveBackardAndTurningRightActionEClass, MoveBackardAndTurningRightAction.class, "MoveBackardAndTurningRightAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMoveBackardAndTurningRightAction_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, MoveBackardAndTurningRightAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoveBackardAndTurningRightAction_StartTick(), ecorePackage.getEInt(), "startTick", null, 0, 1, MoveBackardAndTurningRightAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoveBackardAndTurningRightAction_Diff(), ecorePackage.getEInt(), "diff", null, 0, 1, MoveBackardAndTurningRightAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoveBackardAndTurningRightAction_Speed(), ecorePackage.getEInt(), "speed", null, 0, 1, MoveBackardAndTurningRightAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moveBackardAndTurningLeftActionEClass, MoveBackardAndTurningLeftAction.class, "MoveBackardAndTurningLeftAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMoveBackardAndTurningLeftAction_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, MoveBackardAndTurningLeftAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoveBackardAndTurningLeftAction_StartTick(), ecorePackage.getEInt(), "startTick", null, 0, 1, MoveBackardAndTurningLeftAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoveBackardAndTurningLeftAction_Diff(), ecorePackage.getEInt(), "diff", null, 0, 1, MoveBackardAndTurningLeftAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoveBackardAndTurningLeftAction_Speed(), ecorePackage.getEInt(), "speed", null, 0, 1, MoveBackardAndTurningLeftAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(turningLeftActionEClass, TurningLeftAction.class, "TurningLeftAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTurningLeftAction_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, TurningLeftAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurningLeftAction_StartTick(), ecorePackage.getEInt(), "startTick", null, 0, 1, TurningLeftAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurningLeftAction_Speed(), ecorePackage.getEInt(), "speed", null, 0, 1, TurningLeftAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(turningRightActionEClass, TurningRightAction.class, "TurningRightAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTurningRightAction_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, TurningRightAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurningRightAction_StartTick(), ecorePackage.getEInt(), "startTick", null, 0, 1, TurningRightAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurningRightAction_Speed(), ecorePackage.getEInt(), "speed", null, 0, 1, TurningRightAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(acceleratetActionEClass, AcceleratetAction.class, "AcceleratetAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAcceleratetAction_Ratio(), ecorePackage.getEInt(), "ratio", null, 0, 1, AcceleratetAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcceleratetAction_StartTick(), ecorePackage.getEInt(), "startTick", null, 0, 1, AcceleratetAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deceleratetActionEClass, DeceleratetAction.class, "DeceleratetAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeceleratetAction_Ratio(), ecorePackage.getEInt(), "ratio", null, 0, 1, DeceleratetAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeceleratetAction_StartTick(), ecorePackage.getEInt(), "startTick", null, 0, 1, DeceleratetAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scanCollisionActionEClass, SCANCollisionAction.class, "SCANCollisionAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emergencyStopActionEClass, EmergencyStopAction.class, "EmergencyStopAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getEmergencyStopAction__Begin(), null, "begin", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// aspect
		createAspectAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>aspect</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAspectAnnotations() {
		String source = "aspect";	
		addAnnotation
		  (getTFSM__Initialize(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTFSM_CurrentState(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getState__OnEnter(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getState__OnLeave(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTransition__Fire(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFSMClock__Ticks(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFSMClock_Value(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEmergencyStopAction__Begin(), 
		   source, 
		   new String[] {
		   });
	}

} //ArdurobotmlPackageImpl
