/**
 */
package org.gemoc.ardurobotml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.gemoc.ardurobotml.ArdurobotmlFactory
 * @model kind="package"
 * @generated
 */
public interface ArdurobotmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ardurobotml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.gemoc/ardurobotml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ardurobotml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArdurobotmlPackage eINSTANCE = org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gemoc.ardurobotml.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ardurobotml.impl.NamedElementImpl
	 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ardurobotml.impl.TimedSystemImpl <em>Timed System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ardurobotml.impl.TimedSystemImpl
	 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getTimedSystem()
	 * @generated
	 */
	int TIMED_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_SYSTEM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tfsms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_SYSTEM__TFSMS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Global Clocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_SYSTEM__GLOBAL_CLOCKS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Global Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_SYSTEM__GLOBAL_EVENTS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Timed System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_SYSTEM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Timed System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_SYSTEM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ardurobotml.impl.RegionContainerImpl <em>Region Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ardurobotml.impl.RegionContainerImpl
	 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getRegionContainer()
	 * @generated
	 */
	int REGION_CONTAINER = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_CONTAINER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Regions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_CONTAINER__OWNED_REGIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Region Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_CONTAINER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Region Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_CONTAINER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ardurobotml.impl.TFSMImpl <em>TFSM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ardurobotml.impl.TFSMImpl
	 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getTFSM()
	 * @generated
	 */
	int TFSM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFSM__NAME = REGION_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Owned Regions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFSM__OWNED_REGIONS = REGION_CONTAINER__OWNED_REGIONS;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFSM__INITIAL_STATE = REGION_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Local Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFSM__LOCAL_EVENTS = REGION_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Local Clock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFSM__LOCAL_CLOCK = REGION_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFSM__OWNED_TRANSITIONS = REGION_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Current State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFSM__CURRENT_STATE = REGION_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owned States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFSM__OWNED_STATES = REGION_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>TFSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFSM_FEATURE_COUNT = REGION_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFSM___INITIALIZE = REGION_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>TFSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFSM_OPERATION_COUNT = REGION_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.ardurobotml.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ardurobotml.impl.StateImpl
	 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getState()
	 * @generated
	 */
	int STATE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = REGION_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Owned Regions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OWNED_REGIONS = REGION_CONTAINER__OWNED_REGIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING_TRANSITIONS = REGION_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING_TRANSITIONS = REGION_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIONS = REGION_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owning FSM</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OWNING_FSM = REGION_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = REGION_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>On Enter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___ON_ENTER = REGION_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>On Leave</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___ON_LEAVE = REGION_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = REGION_CONTAINER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.ardurobotml.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ardurobotml.impl.TransitionImpl
	 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OWNED_GUARD = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Generated Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GENERATED_EVENTS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Fire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___FIRE = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.ardurobotml.impl.GuardImpl <em>Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ardurobotml.impl.GuardImpl
	 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getGuard()
	 * @generated
	 */
	int GUARD = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ardurobotml.impl.TemporalGuardImpl <em>Temporal Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ardurobotml.impl.TemporalGuardImpl
	 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getTemporalGuard()
	 * @generated
	 */
	int TEMPORAL_GUARD = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_GUARD__NAME = GUARD__NAME;

	/**
	 * The feature id for the '<em><b>On Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_GUARD__ON_CLOCK = GUARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>After Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_GUARD__AFTER_DURATION = GUARD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Temporal Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_GUARD_FEATURE_COUNT = GUARD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Temporal Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_GUARD_OPERATION_COUNT = GUARD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ardurobotml.impl.EventGuardImpl <em>Event Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ardurobotml.impl.EventGuardImpl
	 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getEventGuard()
	 * @generated
	 */
	int EVENT_GUARD = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GUARD__NAME = GUARD__NAME;

	/**
	 * The feature id for the '<em><b>Triggering Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GUARD__TRIGGERING_EVENT = GUARD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GUARD_FEATURE_COUNT = GUARD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GUARD_OPERATION_COUNT = GUARD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ardurobotml.impl.FSMEventImpl <em>FSM Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ardurobotml.impl.FSMEventImpl
	 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getFSMEvent()
	 * @generated
	 */
	int FSM_EVENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_EVENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Solliciting Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_EVENT__SOLLICITING_TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FSM Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_EVENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>FSM Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_EVENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ardurobotml.impl.FSMClockImpl <em>FSM Clock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ardurobotml.impl.FSMClockImpl
	 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getFSMClock()
	 * @generated
	 */
	int FSM_CLOCK = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CLOCK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CLOCK__VALUE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FSM Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CLOCK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Ticks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CLOCK___TICKS = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>FSM Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CLOCK_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.ardurobotml.impl.EvaluateGuardImpl <em>Evaluate Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ardurobotml.impl.EvaluateGuardImpl
	 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getEvaluateGuard()
	 * @generated
	 */
	int EVALUATE_GUARD = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_GUARD__NAME = GUARD__NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_GUARD__CONDITION = GUARD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evaluate Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_GUARD_FEATURE_COUNT = GUARD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Evaluate Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_GUARD_OPERATION_COUNT = GUARD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ardurobotml.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ardurobotml.impl.RegionImpl
	 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 11;

	/**
	 * The feature id for the '<em><b>Owned States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__OWNED_STATES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ardurobotml.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ardurobotml.impl.ConditionImpl
	 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 13;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ardurobotml.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ardurobotml.impl.ActionImpl
	 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Begin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___BEGIN = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___END = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.ardurobotml.impl.StopActionImpl <em>Stop Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ardurobotml.impl.StopActionImpl
	 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getStopAction()
	 * @generated
	 */
	int STOP_ACTION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION__NAME = ACTION__NAME;

	/**
	 * The number of structural features of the '<em>Stop Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Begin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION___BEGIN = ACTION___BEGIN;

	/**
	 * The operation id for the '<em>End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION___END = ACTION___END;

	/**
	 * The number of operations of the '<em>Stop Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ardurobotml.impl.MoveForwardActionImpl <em>Move Forward Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ardurobotml.impl.MoveForwardActionImpl
	 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getMoveForwardAction()
	 * @generated
	 */
	int MOVE_FORWARD_ACTION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FORWARD_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FORWARD_ACTION__DURATION = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Tick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FORWARD_ACTION__START_TICK = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Move Forward Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FORWARD_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Begin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FORWARD_ACTION___BEGIN = ACTION___BEGIN;

	/**
	 * The operation id for the '<em>End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FORWARD_ACTION___END = ACTION___END;

	/**
	 * The number of operations of the '<em>Move Forward Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FORWARD_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ardurobotml.impl.EmergencyStopActionImpl <em>Emergency Stop Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ardurobotml.impl.EmergencyStopActionImpl
	 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getEmergencyStopAction()
	 * @generated
	 */
	int EMERGENCY_STOP_ACTION = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGENCY_STOP_ACTION__NAME = ACTION__NAME;

	/**
	 * The number of structural features of the '<em>Emergency Stop Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGENCY_STOP_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGENCY_STOP_ACTION___END = ACTION___END;

	/**
	 * The operation id for the '<em>Begin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGENCY_STOP_ACTION___BEGIN = ACTION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Emergency Stop Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGENCY_STOP_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.ardurobotml.impl.AllActionFinishedConditionImpl <em>All Action Finished Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ardurobotml.impl.AllActionFinishedConditionImpl
	 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getAllActionFinishedCondition()
	 * @generated
	 */
	int ALL_ACTION_FINISHED_CONDITION = 18;

	/**
	 * The number of structural features of the '<em>All Action Finished Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_ACTION_FINISHED_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>All Action Finished Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_ACTION_FINISHED_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ardurobotml.impl.SystemPropertyConditionImpl <em>System Property Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ardurobotml.impl.SystemPropertyConditionImpl
	 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getSystemPropertyCondition()
	 * @generated
	 */
	int SYSTEM_PROPERTY_CONDITION = 19;

	/**
	 * The feature id for the '<em><b>Expected Attribute Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PROPERTY_CONDITION__EXPECTED_ATTRIBUTE_VALUE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Property Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PROPERTY_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>System Property Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PROPERTY_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ardurobotml.impl.ActionSequenceImpl <em>Action Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ardurobotml.impl.ActionSequenceImpl
	 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getActionSequence()
	 * @generated
	 */
	int ACTION_SEQUENCE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SEQUENCE__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SEQUENCE__ACTIONS = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SEQUENCE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Begin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SEQUENCE___BEGIN = ACTION___BEGIN;

	/**
	 * The operation id for the '<em>End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SEQUENCE___END = ACTION___END;

	/**
	 * The number of operations of the '<em>Action Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SEQUENCE_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.gemoc.ardurobotml.TimedSystem <em>Timed System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed System</em>'.
	 * @see org.gemoc.ardurobotml.TimedSystem
	 * @generated
	 */
	EClass getTimedSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.ardurobotml.TimedSystem#getTfsms <em>Tfsms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tfsms</em>'.
	 * @see org.gemoc.ardurobotml.TimedSystem#getTfsms()
	 * @see #getTimedSystem()
	 * @generated
	 */
	EReference getTimedSystem_Tfsms();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.ardurobotml.TimedSystem#getGlobalClocks <em>Global Clocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Clocks</em>'.
	 * @see org.gemoc.ardurobotml.TimedSystem#getGlobalClocks()
	 * @see #getTimedSystem()
	 * @generated
	 */
	EReference getTimedSystem_GlobalClocks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.ardurobotml.TimedSystem#getGlobalEvents <em>Global Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Events</em>'.
	 * @see org.gemoc.ardurobotml.TimedSystem#getGlobalEvents()
	 * @see #getTimedSystem()
	 * @generated
	 */
	EReference getTimedSystem_GlobalEvents();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ardurobotml.TFSM <em>TFSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TFSM</em>'.
	 * @see org.gemoc.ardurobotml.TFSM
	 * @generated
	 */
	EClass getTFSM();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.ardurobotml.TFSM#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial State</em>'.
	 * @see org.gemoc.ardurobotml.TFSM#getInitialState()
	 * @see #getTFSM()
	 * @generated
	 */
	EReference getTFSM_InitialState();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.ardurobotml.TFSM#getLocalEvents <em>Local Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Events</em>'.
	 * @see org.gemoc.ardurobotml.TFSM#getLocalEvents()
	 * @see #getTFSM()
	 * @generated
	 */
	EReference getTFSM_LocalEvents();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.ardurobotml.TFSM#getLocalClock <em>Local Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Clock</em>'.
	 * @see org.gemoc.ardurobotml.TFSM#getLocalClock()
	 * @see #getTFSM()
	 * @generated
	 */
	EReference getTFSM_LocalClock();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.ardurobotml.TFSM#getOwnedTransitions <em>Owned Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Transitions</em>'.
	 * @see org.gemoc.ardurobotml.TFSM#getOwnedTransitions()
	 * @see #getTFSM()
	 * @generated
	 */
	EReference getTFSM_OwnedTransitions();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.ardurobotml.TFSM#getCurrentState <em>Current State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current State</em>'.
	 * @see org.gemoc.ardurobotml.TFSM#getCurrentState()
	 * @see #getTFSM()
	 * @generated
	 */
	EReference getTFSM_CurrentState();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.ardurobotml.TFSM#getOwnedStates <em>Owned States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned States</em>'.
	 * @see org.gemoc.ardurobotml.TFSM#getOwnedStates()
	 * @see #getTFSM()
	 * @generated
	 */
	EReference getTFSM_OwnedStates();

	/**
	 * Returns the meta object for the '{@link org.gemoc.ardurobotml.TFSM#initialize() <em>Initialize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialize</em>' operation.
	 * @see org.gemoc.ardurobotml.TFSM#initialize()
	 * @generated
	 */
	EOperation getTFSM__Initialize();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ardurobotml.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see org.gemoc.ardurobotml.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.ardurobotml.State#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Transitions</em>'.
	 * @see org.gemoc.ardurobotml.State#getOutgoingTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OutgoingTransitions();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.ardurobotml.State#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Transitions</em>'.
	 * @see org.gemoc.ardurobotml.State#getIncomingTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_IncomingTransitions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.ardurobotml.State#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.gemoc.ardurobotml.State#getActions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Actions();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.ardurobotml.State#getOwningFSM <em>Owning FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owning FSM</em>'.
	 * @see org.gemoc.ardurobotml.State#getOwningFSM()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OwningFSM();

	/**
	 * Returns the meta object for the '{@link org.gemoc.ardurobotml.State#onEnter() <em>On Enter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>On Enter</em>' operation.
	 * @see org.gemoc.ardurobotml.State#onEnter()
	 * @generated
	 */
	EOperation getState__OnEnter();

	/**
	 * Returns the meta object for the '{@link org.gemoc.ardurobotml.State#onLeave() <em>On Leave</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>On Leave</em>' operation.
	 * @see org.gemoc.ardurobotml.State#onLeave()
	 * @generated
	 */
	EOperation getState__OnLeave();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ardurobotml.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.gemoc.ardurobotml.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.ardurobotml.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gemoc.ardurobotml.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.ardurobotml.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gemoc.ardurobotml.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.ardurobotml.Transition#getOwnedGuard <em>Owned Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Guard</em>'.
	 * @see org.gemoc.ardurobotml.Transition#getOwnedGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_OwnedGuard();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.ardurobotml.Transition#getGeneratedEvents <em>Generated Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generated Events</em>'.
	 * @see org.gemoc.ardurobotml.Transition#getGeneratedEvents()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_GeneratedEvents();

	/**
	 * Returns the meta object for the '{@link org.gemoc.ardurobotml.Transition#fire() <em>Fire</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fire</em>' operation.
	 * @see org.gemoc.ardurobotml.Transition#fire()
	 * @generated
	 */
	EOperation getTransition__Fire();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ardurobotml.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.gemoc.ardurobotml.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.ardurobotml.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gemoc.ardurobotml.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ardurobotml.Guard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard</em>'.
	 * @see org.gemoc.ardurobotml.Guard
	 * @generated
	 */
	EClass getGuard();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ardurobotml.TemporalGuard <em>Temporal Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Guard</em>'.
	 * @see org.gemoc.ardurobotml.TemporalGuard
	 * @generated
	 */
	EClass getTemporalGuard();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.ardurobotml.TemporalGuard#getOnClock <em>On Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>On Clock</em>'.
	 * @see org.gemoc.ardurobotml.TemporalGuard#getOnClock()
	 * @see #getTemporalGuard()
	 * @generated
	 */
	EReference getTemporalGuard_OnClock();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.ardurobotml.TemporalGuard#getAfterDuration <em>After Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>After Duration</em>'.
	 * @see org.gemoc.ardurobotml.TemporalGuard#getAfterDuration()
	 * @see #getTemporalGuard()
	 * @generated
	 */
	EAttribute getTemporalGuard_AfterDuration();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ardurobotml.EventGuard <em>Event Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Guard</em>'.
	 * @see org.gemoc.ardurobotml.EventGuard
	 * @generated
	 */
	EClass getEventGuard();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.ardurobotml.EventGuard#getTriggeringEvent <em>Triggering Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Triggering Event</em>'.
	 * @see org.gemoc.ardurobotml.EventGuard#getTriggeringEvent()
	 * @see #getEventGuard()
	 * @generated
	 */
	EReference getEventGuard_TriggeringEvent();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ardurobotml.FSMEvent <em>FSM Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FSM Event</em>'.
	 * @see org.gemoc.ardurobotml.FSMEvent
	 * @generated
	 */
	EClass getFSMEvent();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.ardurobotml.FSMEvent#getSollicitingTransitions <em>Solliciting Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Solliciting Transitions</em>'.
	 * @see org.gemoc.ardurobotml.FSMEvent#getSollicitingTransitions()
	 * @see #getFSMEvent()
	 * @generated
	 */
	EReference getFSMEvent_SollicitingTransitions();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ardurobotml.FSMClock <em>FSM Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FSM Clock</em>'.
	 * @see org.gemoc.ardurobotml.FSMClock
	 * @generated
	 */
	EClass getFSMClock();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.ardurobotml.FSMClock#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gemoc.ardurobotml.FSMClock#getValue()
	 * @see #getFSMClock()
	 * @generated
	 */
	EAttribute getFSMClock_Value();

	/**
	 * Returns the meta object for the '{@link org.gemoc.ardurobotml.FSMClock#ticks() <em>Ticks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ticks</em>' operation.
	 * @see org.gemoc.ardurobotml.FSMClock#ticks()
	 * @generated
	 */
	EOperation getFSMClock__Ticks();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ardurobotml.EvaluateGuard <em>Evaluate Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluate Guard</em>'.
	 * @see org.gemoc.ardurobotml.EvaluateGuard
	 * @generated
	 */
	EClass getEvaluateGuard();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.ardurobotml.EvaluateGuard#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.gemoc.ardurobotml.EvaluateGuard#getCondition()
	 * @see #getEvaluateGuard()
	 * @generated
	 */
	EReference getEvaluateGuard_Condition();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ardurobotml.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see org.gemoc.ardurobotml.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.ardurobotml.Region#getOwnedStates <em>Owned States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned States</em>'.
	 * @see org.gemoc.ardurobotml.Region#getOwnedStates()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_OwnedStates();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.ardurobotml.Region#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gemoc.ardurobotml.Region#getName()
	 * @see #getRegion()
	 * @generated
	 */
	EAttribute getRegion_Name();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ardurobotml.RegionContainer <em>Region Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region Container</em>'.
	 * @see org.gemoc.ardurobotml.RegionContainer
	 * @generated
	 */
	EClass getRegionContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.ardurobotml.RegionContainer#getOwnedRegions <em>Owned Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Regions</em>'.
	 * @see org.gemoc.ardurobotml.RegionContainer#getOwnedRegions()
	 * @see #getRegionContainer()
	 * @generated
	 */
	EReference getRegionContainer_OwnedRegions();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ardurobotml.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see org.gemoc.ardurobotml.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ardurobotml.StopAction <em>Stop Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Action</em>'.
	 * @see org.gemoc.ardurobotml.StopAction
	 * @generated
	 */
	EClass getStopAction();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ardurobotml.MoveForwardAction <em>Move Forward Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Forward Action</em>'.
	 * @see org.gemoc.ardurobotml.MoveForwardAction
	 * @generated
	 */
	EClass getMoveForwardAction();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.ardurobotml.MoveForwardAction#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.gemoc.ardurobotml.MoveForwardAction#getDuration()
	 * @see #getMoveForwardAction()
	 * @generated
	 */
	EAttribute getMoveForwardAction_Duration();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.ardurobotml.MoveForwardAction#getStartTick <em>Start Tick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Tick</em>'.
	 * @see org.gemoc.ardurobotml.MoveForwardAction#getStartTick()
	 * @see #getMoveForwardAction()
	 * @generated
	 */
	EAttribute getMoveForwardAction_StartTick();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ardurobotml.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.gemoc.ardurobotml.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the '{@link org.gemoc.ardurobotml.Action#begin() <em>Begin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Begin</em>' operation.
	 * @see org.gemoc.ardurobotml.Action#begin()
	 * @generated
	 */
	EOperation getAction__Begin();

	/**
	 * Returns the meta object for the '{@link org.gemoc.ardurobotml.Action#end() <em>End</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>End</em>' operation.
	 * @see org.gemoc.ardurobotml.Action#end()
	 * @generated
	 */
	EOperation getAction__End();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ardurobotml.EmergencyStopAction <em>Emergency Stop Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emergency Stop Action</em>'.
	 * @see org.gemoc.ardurobotml.EmergencyStopAction
	 * @generated
	 */
	EClass getEmergencyStopAction();

	/**
	 * Returns the meta object for the '{@link org.gemoc.ardurobotml.EmergencyStopAction#begin() <em>Begin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Begin</em>' operation.
	 * @see org.gemoc.ardurobotml.EmergencyStopAction#begin()
	 * @generated
	 */
	EOperation getEmergencyStopAction__Begin();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ardurobotml.AllActionFinishedCondition <em>All Action Finished Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Action Finished Condition</em>'.
	 * @see org.gemoc.ardurobotml.AllActionFinishedCondition
	 * @generated
	 */
	EClass getAllActionFinishedCondition();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ardurobotml.SystemPropertyCondition <em>System Property Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Property Condition</em>'.
	 * @see org.gemoc.ardurobotml.SystemPropertyCondition
	 * @generated
	 */
	EClass getSystemPropertyCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.ardurobotml.SystemPropertyCondition#isExpectedAttributeValue <em>Expected Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Attribute Value</em>'.
	 * @see org.gemoc.ardurobotml.SystemPropertyCondition#isExpectedAttributeValue()
	 * @see #getSystemPropertyCondition()
	 * @generated
	 */
	EAttribute getSystemPropertyCondition_ExpectedAttributeValue();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ardurobotml.ActionSequence <em>Action Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Sequence</em>'.
	 * @see org.gemoc.ardurobotml.ActionSequence
	 * @generated
	 */
	EClass getActionSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.ardurobotml.ActionSequence#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.gemoc.ardurobotml.ActionSequence#getActions()
	 * @see #getActionSequence()
	 * @generated
	 */
	EReference getActionSequence_Actions();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArdurobotmlFactory getArdurobotmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.gemoc.ardurobotml.impl.TimedSystemImpl <em>Timed System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ardurobotml.impl.TimedSystemImpl
		 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getTimedSystem()
		 * @generated
		 */
		EClass TIMED_SYSTEM = eINSTANCE.getTimedSystem();

		/**
		 * The meta object literal for the '<em><b>Tfsms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_SYSTEM__TFSMS = eINSTANCE.getTimedSystem_Tfsms();

		/**
		 * The meta object literal for the '<em><b>Global Clocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_SYSTEM__GLOBAL_CLOCKS = eINSTANCE.getTimedSystem_GlobalClocks();

		/**
		 * The meta object literal for the '<em><b>Global Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_SYSTEM__GLOBAL_EVENTS = eINSTANCE.getTimedSystem_GlobalEvents();

		/**
		 * The meta object literal for the '{@link org.gemoc.ardurobotml.impl.TFSMImpl <em>TFSM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ardurobotml.impl.TFSMImpl
		 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getTFSM()
		 * @generated
		 */
		EClass TFSM = eINSTANCE.getTFSM();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFSM__INITIAL_STATE = eINSTANCE.getTFSM_InitialState();

		/**
		 * The meta object literal for the '<em><b>Local Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFSM__LOCAL_EVENTS = eINSTANCE.getTFSM_LocalEvents();

		/**
		 * The meta object literal for the '<em><b>Local Clock</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFSM__LOCAL_CLOCK = eINSTANCE.getTFSM_LocalClock();

		/**
		 * The meta object literal for the '<em><b>Owned Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFSM__OWNED_TRANSITIONS = eINSTANCE.getTFSM_OwnedTransitions();

		/**
		 * The meta object literal for the '<em><b>Current State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFSM__CURRENT_STATE = eINSTANCE.getTFSM_CurrentState();

		/**
		 * The meta object literal for the '<em><b>Owned States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFSM__OWNED_STATES = eINSTANCE.getTFSM_OwnedStates();

		/**
		 * The meta object literal for the '<em><b>Initialize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TFSM___INITIALIZE = eINSTANCE.getTFSM__Initialize();

		/**
		 * The meta object literal for the '{@link org.gemoc.ardurobotml.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ardurobotml.impl.StateImpl
		 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Outgoing Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUTGOING_TRANSITIONS = eINSTANCE.getState_OutgoingTransitions();

		/**
		 * The meta object literal for the '<em><b>Incoming Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INCOMING_TRANSITIONS = eINSTANCE.getState_IncomingTransitions();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIONS = eINSTANCE.getState_Actions();

		/**
		 * The meta object literal for the '<em><b>Owning FSM</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OWNING_FSM = eINSTANCE.getState_OwningFSM();

		/**
		 * The meta object literal for the '<em><b>On Enter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___ON_ENTER = eINSTANCE.getState__OnEnter();

		/**
		 * The meta object literal for the '<em><b>On Leave</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___ON_LEAVE = eINSTANCE.getState__OnLeave();

		/**
		 * The meta object literal for the '{@link org.gemoc.ardurobotml.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ardurobotml.impl.TransitionImpl
		 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Owned Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__OWNED_GUARD = eINSTANCE.getTransition_OwnedGuard();

		/**
		 * The meta object literal for the '<em><b>Generated Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__GENERATED_EVENTS = eINSTANCE.getTransition_GeneratedEvents();

		/**
		 * The meta object literal for the '<em><b>Fire</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION___FIRE = eINSTANCE.getTransition__Fire();

		/**
		 * The meta object literal for the '{@link org.gemoc.ardurobotml.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ardurobotml.impl.NamedElementImpl
		 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.gemoc.ardurobotml.impl.GuardImpl <em>Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ardurobotml.impl.GuardImpl
		 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getGuard()
		 * @generated
		 */
		EClass GUARD = eINSTANCE.getGuard();

		/**
		 * The meta object literal for the '{@link org.gemoc.ardurobotml.impl.TemporalGuardImpl <em>Temporal Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ardurobotml.impl.TemporalGuardImpl
		 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getTemporalGuard()
		 * @generated
		 */
		EClass TEMPORAL_GUARD = eINSTANCE.getTemporalGuard();

		/**
		 * The meta object literal for the '<em><b>On Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_GUARD__ON_CLOCK = eINSTANCE.getTemporalGuard_OnClock();

		/**
		 * The meta object literal for the '<em><b>After Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_GUARD__AFTER_DURATION = eINSTANCE.getTemporalGuard_AfterDuration();

		/**
		 * The meta object literal for the '{@link org.gemoc.ardurobotml.impl.EventGuardImpl <em>Event Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ardurobotml.impl.EventGuardImpl
		 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getEventGuard()
		 * @generated
		 */
		EClass EVENT_GUARD = eINSTANCE.getEventGuard();

		/**
		 * The meta object literal for the '<em><b>Triggering Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_GUARD__TRIGGERING_EVENT = eINSTANCE.getEventGuard_TriggeringEvent();

		/**
		 * The meta object literal for the '{@link org.gemoc.ardurobotml.impl.FSMEventImpl <em>FSM Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ardurobotml.impl.FSMEventImpl
		 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getFSMEvent()
		 * @generated
		 */
		EClass FSM_EVENT = eINSTANCE.getFSMEvent();

		/**
		 * The meta object literal for the '<em><b>Solliciting Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSM_EVENT__SOLLICITING_TRANSITIONS = eINSTANCE.getFSMEvent_SollicitingTransitions();

		/**
		 * The meta object literal for the '{@link org.gemoc.ardurobotml.impl.FSMClockImpl <em>FSM Clock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ardurobotml.impl.FSMClockImpl
		 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getFSMClock()
		 * @generated
		 */
		EClass FSM_CLOCK = eINSTANCE.getFSMClock();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FSM_CLOCK__VALUE = eINSTANCE.getFSMClock_Value();

		/**
		 * The meta object literal for the '<em><b>Ticks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FSM_CLOCK___TICKS = eINSTANCE.getFSMClock__Ticks();

		/**
		 * The meta object literal for the '{@link org.gemoc.ardurobotml.impl.EvaluateGuardImpl <em>Evaluate Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ardurobotml.impl.EvaluateGuardImpl
		 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getEvaluateGuard()
		 * @generated
		 */
		EClass EVALUATE_GUARD = eINSTANCE.getEvaluateGuard();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATE_GUARD__CONDITION = eINSTANCE.getEvaluateGuard_Condition();

		/**
		 * The meta object literal for the '{@link org.gemoc.ardurobotml.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ardurobotml.impl.RegionImpl
		 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getRegion()
		 * @generated
		 */
		EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '<em><b>Owned States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__OWNED_STATES = eINSTANCE.getRegion_OwnedStates();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION__NAME = eINSTANCE.getRegion_Name();

		/**
		 * The meta object literal for the '{@link org.gemoc.ardurobotml.impl.RegionContainerImpl <em>Region Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ardurobotml.impl.RegionContainerImpl
		 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getRegionContainer()
		 * @generated
		 */
		EClass REGION_CONTAINER = eINSTANCE.getRegionContainer();

		/**
		 * The meta object literal for the '<em><b>Owned Regions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION_CONTAINER__OWNED_REGIONS = eINSTANCE.getRegionContainer_OwnedRegions();

		/**
		 * The meta object literal for the '{@link org.gemoc.ardurobotml.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ardurobotml.impl.ConditionImpl
		 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link org.gemoc.ardurobotml.impl.StopActionImpl <em>Stop Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ardurobotml.impl.StopActionImpl
		 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getStopAction()
		 * @generated
		 */
		EClass STOP_ACTION = eINSTANCE.getStopAction();

		/**
		 * The meta object literal for the '{@link org.gemoc.ardurobotml.impl.MoveForwardActionImpl <em>Move Forward Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ardurobotml.impl.MoveForwardActionImpl
		 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getMoveForwardAction()
		 * @generated
		 */
		EClass MOVE_FORWARD_ACTION = eINSTANCE.getMoveForwardAction();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_FORWARD_ACTION__DURATION = eINSTANCE.getMoveForwardAction_Duration();

		/**
		 * The meta object literal for the '<em><b>Start Tick</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_FORWARD_ACTION__START_TICK = eINSTANCE.getMoveForwardAction_StartTick();

		/**
		 * The meta object literal for the '{@link org.gemoc.ardurobotml.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ardurobotml.impl.ActionImpl
		 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___BEGIN = eINSTANCE.getAction__Begin();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___END = eINSTANCE.getAction__End();

		/**
		 * The meta object literal for the '{@link org.gemoc.ardurobotml.impl.EmergencyStopActionImpl <em>Emergency Stop Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ardurobotml.impl.EmergencyStopActionImpl
		 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getEmergencyStopAction()
		 * @generated
		 */
		EClass EMERGENCY_STOP_ACTION = eINSTANCE.getEmergencyStopAction();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMERGENCY_STOP_ACTION___BEGIN = eINSTANCE.getEmergencyStopAction__Begin();

		/**
		 * The meta object literal for the '{@link org.gemoc.ardurobotml.impl.AllActionFinishedConditionImpl <em>All Action Finished Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ardurobotml.impl.AllActionFinishedConditionImpl
		 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getAllActionFinishedCondition()
		 * @generated
		 */
		EClass ALL_ACTION_FINISHED_CONDITION = eINSTANCE.getAllActionFinishedCondition();

		/**
		 * The meta object literal for the '{@link org.gemoc.ardurobotml.impl.SystemPropertyConditionImpl <em>System Property Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ardurobotml.impl.SystemPropertyConditionImpl
		 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getSystemPropertyCondition()
		 * @generated
		 */
		EClass SYSTEM_PROPERTY_CONDITION = eINSTANCE.getSystemPropertyCondition();

		/**
		 * The meta object literal for the '<em><b>Expected Attribute Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_PROPERTY_CONDITION__EXPECTED_ATTRIBUTE_VALUE = eINSTANCE.getSystemPropertyCondition_ExpectedAttributeValue();

		/**
		 * The meta object literal for the '{@link org.gemoc.ardurobotml.impl.ActionSequenceImpl <em>Action Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ardurobotml.impl.ActionSequenceImpl
		 * @see org.gemoc.ardurobotml.impl.ArdurobotmlPackageImpl#getActionSequence()
		 * @generated
		 */
		EClass ACTION_SEQUENCE = eINSTANCE.getActionSequence();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_SEQUENCE__ACTIONS = eINSTANCE.getActionSequence_Actions();

	}

} //ArdurobotmlPackage
