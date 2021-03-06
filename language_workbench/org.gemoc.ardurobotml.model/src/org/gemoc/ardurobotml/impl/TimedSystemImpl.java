/**
 */
package org.gemoc.ardurobotml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gemoc.ardurobotml.ArdurobotmlPackage;
import org.gemoc.ardurobotml.FSMClock;
import org.gemoc.ardurobotml.FSMEvent;
import org.gemoc.ardurobotml.TFSM;
import org.gemoc.ardurobotml.TimedSystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timed System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.ardurobotml.impl.TimedSystemImpl#getTfsms <em>Tfsms</em>}</li>
 *   <li>{@link org.gemoc.ardurobotml.impl.TimedSystemImpl#getGlobalClocks <em>Global Clocks</em>}</li>
 *   <li>{@link org.gemoc.ardurobotml.impl.TimedSystemImpl#getGlobalEvents <em>Global Events</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimedSystemImpl extends NamedElementImpl implements TimedSystem {
	/**
	 * The cached value of the '{@link #getTfsms() <em>Tfsms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTfsms()
	 * @generated
	 * @ordered
	 */
	protected EList<TFSM> tfsms;

	/**
	 * The cached value of the '{@link #getGlobalClocks() <em>Global Clocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalClocks()
	 * @generated
	 * @ordered
	 */
	protected EList<FSMClock> globalClocks;

	/**
	 * The cached value of the '{@link #getGlobalEvents() <em>Global Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<FSMEvent> globalEvents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArdurobotmlPackage.Literals.TIMED_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TFSM> getTfsms() {
		if (tfsms == null) {
			tfsms = new EObjectContainmentEList<TFSM>(TFSM.class, this, ArdurobotmlPackage.TIMED_SYSTEM__TFSMS);
		}
		return tfsms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FSMClock> getGlobalClocks() {
		if (globalClocks == null) {
			globalClocks = new EObjectContainmentEList<FSMClock>(FSMClock.class, this, ArdurobotmlPackage.TIMED_SYSTEM__GLOBAL_CLOCKS);
		}
		return globalClocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FSMEvent> getGlobalEvents() {
		if (globalEvents == null) {
			globalEvents = new EObjectContainmentEList<FSMEvent>(FSMEvent.class, this, ArdurobotmlPackage.TIMED_SYSTEM__GLOBAL_EVENTS);
		}
		return globalEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArdurobotmlPackage.TIMED_SYSTEM__TFSMS:
				return ((InternalEList<?>)getTfsms()).basicRemove(otherEnd, msgs);
			case ArdurobotmlPackage.TIMED_SYSTEM__GLOBAL_CLOCKS:
				return ((InternalEList<?>)getGlobalClocks()).basicRemove(otherEnd, msgs);
			case ArdurobotmlPackage.TIMED_SYSTEM__GLOBAL_EVENTS:
				return ((InternalEList<?>)getGlobalEvents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArdurobotmlPackage.TIMED_SYSTEM__TFSMS:
				return getTfsms();
			case ArdurobotmlPackage.TIMED_SYSTEM__GLOBAL_CLOCKS:
				return getGlobalClocks();
			case ArdurobotmlPackage.TIMED_SYSTEM__GLOBAL_EVENTS:
				return getGlobalEvents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArdurobotmlPackage.TIMED_SYSTEM__TFSMS:
				getTfsms().clear();
				getTfsms().addAll((Collection<? extends TFSM>)newValue);
				return;
			case ArdurobotmlPackage.TIMED_SYSTEM__GLOBAL_CLOCKS:
				getGlobalClocks().clear();
				getGlobalClocks().addAll((Collection<? extends FSMClock>)newValue);
				return;
			case ArdurobotmlPackage.TIMED_SYSTEM__GLOBAL_EVENTS:
				getGlobalEvents().clear();
				getGlobalEvents().addAll((Collection<? extends FSMEvent>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ArdurobotmlPackage.TIMED_SYSTEM__TFSMS:
				getTfsms().clear();
				return;
			case ArdurobotmlPackage.TIMED_SYSTEM__GLOBAL_CLOCKS:
				getGlobalClocks().clear();
				return;
			case ArdurobotmlPackage.TIMED_SYSTEM__GLOBAL_EVENTS:
				getGlobalEvents().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ArdurobotmlPackage.TIMED_SYSTEM__TFSMS:
				return tfsms != null && !tfsms.isEmpty();
			case ArdurobotmlPackage.TIMED_SYSTEM__GLOBAL_CLOCKS:
				return globalClocks != null && !globalClocks.isEmpty();
			case ArdurobotmlPackage.TIMED_SYSTEM__GLOBAL_EVENTS:
				return globalEvents != null && !globalEvents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TimedSystemImpl
