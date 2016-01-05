/**
 */
package org.gemoc.ardurobotml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.ardurobotml.ArdurobotmlPackage;
import org.gemoc.ardurobotml.MoveForwardAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move Forward Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.ardurobotml.impl.MoveForwardActionImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.gemoc.ardurobotml.impl.MoveForwardActionImpl#getStartTick <em>Start Tick</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MoveForwardActionImpl extends ActionImpl implements MoveForwardAction {
	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartTick() <em>Start Tick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTick()
	 * @generated
	 * @ordered
	 */
	protected static final int START_TICK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartTick() <em>Start Tick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTick()
	 * @generated
	 * @ordered
	 */
	protected int startTick = START_TICK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveForwardActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArdurobotmlPackage.Literals.MOVE_FORWARD_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArdurobotmlPackage.MOVE_FORWARD_ACTION__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStartTick() {
		return startTick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTick(int newStartTick) {
		int oldStartTick = startTick;
		startTick = newStartTick;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArdurobotmlPackage.MOVE_FORWARD_ACTION__START_TICK, oldStartTick, startTick));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArdurobotmlPackage.MOVE_FORWARD_ACTION__DURATION:
				return getDuration();
			case ArdurobotmlPackage.MOVE_FORWARD_ACTION__START_TICK:
				return getStartTick();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArdurobotmlPackage.MOVE_FORWARD_ACTION__DURATION:
				setDuration((Integer)newValue);
				return;
			case ArdurobotmlPackage.MOVE_FORWARD_ACTION__START_TICK:
				setStartTick((Integer)newValue);
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
			case ArdurobotmlPackage.MOVE_FORWARD_ACTION__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case ArdurobotmlPackage.MOVE_FORWARD_ACTION__START_TICK:
				setStartTick(START_TICK_EDEFAULT);
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
			case ArdurobotmlPackage.MOVE_FORWARD_ACTION__DURATION:
				return duration != DURATION_EDEFAULT;
			case ArdurobotmlPackage.MOVE_FORWARD_ACTION__START_TICK:
				return startTick != START_TICK_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (duration: ");
		result.append(duration);
		result.append(", startTick: ");
		result.append(startTick);
		result.append(')');
		return result.toString();
	}

} //MoveForwardActionImpl
