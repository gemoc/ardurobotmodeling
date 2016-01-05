/**
 */
package org.gemoc.ardurobotml.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.gemoc.ardurobotml.ArdurobotmlPackage;
import org.gemoc.ardurobotml.FSMEvent;
import org.gemoc.ardurobotml.Guard;
import org.gemoc.ardurobotml.State;
import org.gemoc.ardurobotml.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.ardurobotml.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.gemoc.ardurobotml.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.gemoc.ardurobotml.impl.TransitionImpl#getOwnedGuard <em>Owned Guard</em>}</li>
 *   <li>{@link org.gemoc.ardurobotml.impl.TransitionImpl#getGeneratedEvents <em>Generated Events</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends NamedElementImpl implements Transition {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected State source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected State target;

	/**
	 * The cached value of the '{@link #getOwnedGuard() <em>Owned Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedGuard()
	 * @generated
	 * @ordered
	 */
	protected Guard ownedGuard;

	/**
	 * The cached value of the '{@link #getGeneratedEvents() <em>Generated Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<FSMEvent> generatedEvents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArdurobotmlPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArdurobotmlPackage.TRANSITION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(State newSource, NotificationChain msgs) {
		State oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArdurobotmlPackage.TRANSITION__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(State newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, ArdurobotmlPackage.STATE__OUTGOING_TRANSITIONS, State.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, ArdurobotmlPackage.STATE__OUTGOING_TRANSITIONS, State.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArdurobotmlPackage.TRANSITION__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArdurobotmlPackage.TRANSITION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(State newTarget, NotificationChain msgs) {
		State oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArdurobotmlPackage.TRANSITION__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(State newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, ArdurobotmlPackage.STATE__INCOMING_TRANSITIONS, State.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, ArdurobotmlPackage.STATE__INCOMING_TRANSITIONS, State.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArdurobotmlPackage.TRANSITION__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guard getOwnedGuard() {
		return ownedGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedGuard(Guard newOwnedGuard, NotificationChain msgs) {
		Guard oldOwnedGuard = ownedGuard;
		ownedGuard = newOwnedGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArdurobotmlPackage.TRANSITION__OWNED_GUARD, oldOwnedGuard, newOwnedGuard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedGuard(Guard newOwnedGuard) {
		if (newOwnedGuard != ownedGuard) {
			NotificationChain msgs = null;
			if (ownedGuard != null)
				msgs = ((InternalEObject)ownedGuard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArdurobotmlPackage.TRANSITION__OWNED_GUARD, null, msgs);
			if (newOwnedGuard != null)
				msgs = ((InternalEObject)newOwnedGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArdurobotmlPackage.TRANSITION__OWNED_GUARD, null, msgs);
			msgs = basicSetOwnedGuard(newOwnedGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArdurobotmlPackage.TRANSITION__OWNED_GUARD, newOwnedGuard, newOwnedGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FSMEvent> getGeneratedEvents() {
		if (generatedEvents == null) {
			generatedEvents = new EObjectResolvingEList<FSMEvent>(FSMEvent.class, this, ArdurobotmlPackage.TRANSITION__GENERATED_EVENTS);
		}
		return generatedEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String fire() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArdurobotmlPackage.TRANSITION__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, ArdurobotmlPackage.STATE__OUTGOING_TRANSITIONS, State.class, msgs);
				return basicSetSource((State)otherEnd, msgs);
			case ArdurobotmlPackage.TRANSITION__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, ArdurobotmlPackage.STATE__INCOMING_TRANSITIONS, State.class, msgs);
				return basicSetTarget((State)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArdurobotmlPackage.TRANSITION__SOURCE:
				return basicSetSource(null, msgs);
			case ArdurobotmlPackage.TRANSITION__TARGET:
				return basicSetTarget(null, msgs);
			case ArdurobotmlPackage.TRANSITION__OWNED_GUARD:
				return basicSetOwnedGuard(null, msgs);
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
			case ArdurobotmlPackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ArdurobotmlPackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ArdurobotmlPackage.TRANSITION__OWNED_GUARD:
				return getOwnedGuard();
			case ArdurobotmlPackage.TRANSITION__GENERATED_EVENTS:
				return getGeneratedEvents();
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
			case ArdurobotmlPackage.TRANSITION__SOURCE:
				setSource((State)newValue);
				return;
			case ArdurobotmlPackage.TRANSITION__TARGET:
				setTarget((State)newValue);
				return;
			case ArdurobotmlPackage.TRANSITION__OWNED_GUARD:
				setOwnedGuard((Guard)newValue);
				return;
			case ArdurobotmlPackage.TRANSITION__GENERATED_EVENTS:
				getGeneratedEvents().clear();
				getGeneratedEvents().addAll((Collection<? extends FSMEvent>)newValue);
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
			case ArdurobotmlPackage.TRANSITION__SOURCE:
				setSource((State)null);
				return;
			case ArdurobotmlPackage.TRANSITION__TARGET:
				setTarget((State)null);
				return;
			case ArdurobotmlPackage.TRANSITION__OWNED_GUARD:
				setOwnedGuard((Guard)null);
				return;
			case ArdurobotmlPackage.TRANSITION__GENERATED_EVENTS:
				getGeneratedEvents().clear();
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
			case ArdurobotmlPackage.TRANSITION__SOURCE:
				return source != null;
			case ArdurobotmlPackage.TRANSITION__TARGET:
				return target != null;
			case ArdurobotmlPackage.TRANSITION__OWNED_GUARD:
				return ownedGuard != null;
			case ArdurobotmlPackage.TRANSITION__GENERATED_EVENTS:
				return generatedEvents != null && !generatedEvents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ArdurobotmlPackage.TRANSITION___FIRE:
				return fire();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TransitionImpl
