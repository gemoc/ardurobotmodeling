/**
 */
package org.gemoc.ardurobotml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.ardurobotml.ArdurobotmlPackage;
import org.gemoc.ardurobotml.MoveForwardAndTurningLeftAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move Forward And Turning Left Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.ardurobotml.impl.MoveForwardAndTurningLeftActionImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.gemoc.ardurobotml.impl.MoveForwardAndTurningLeftActionImpl#getStartTick <em>Start Tick</em>}</li>
 *   <li>{@link org.gemoc.ardurobotml.impl.MoveForwardAndTurningLeftActionImpl#getDiff <em>Diff</em>}</li>
 *   <li>{@link org.gemoc.ardurobotml.impl.MoveForwardAndTurningLeftActionImpl#getSpeed <em>Speed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MoveForwardAndTurningLeftActionImpl extends ActionImpl implements MoveForwardAndTurningLeftAction {
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
	 * The default value of the '{@link #getDiff() <em>Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff()
	 * @generated
	 * @ordered
	 */
	protected static final int DIFF_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDiff() <em>Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff()
	 * @generated
	 * @ordered
	 */
	protected int diff = DIFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final int SPEED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected int speed = SPEED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveForwardAndTurningLeftActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArdurobotmlPackage.Literals.MOVE_FORWARD_AND_TURNING_LEFT_ACTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArdurobotmlPackage.MOVE_FORWARD_AND_TURNING_LEFT_ACTION__DURATION, oldDuration, duration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArdurobotmlPackage.MOVE_FORWARD_AND_TURNING_LEFT_ACTION__START_TICK, oldStartTick, startTick));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDiff() {
		return diff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiff(int newDiff) {
		int oldDiff = diff;
		diff = newDiff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArdurobotmlPackage.MOVE_FORWARD_AND_TURNING_LEFT_ACTION__DIFF, oldDiff, diff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeed(int newSpeed) {
		int oldSpeed = speed;
		speed = newSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArdurobotmlPackage.MOVE_FORWARD_AND_TURNING_LEFT_ACTION__SPEED, oldSpeed, speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArdurobotmlPackage.MOVE_FORWARD_AND_TURNING_LEFT_ACTION__DURATION:
				return getDuration();
			case ArdurobotmlPackage.MOVE_FORWARD_AND_TURNING_LEFT_ACTION__START_TICK:
				return getStartTick();
			case ArdurobotmlPackage.MOVE_FORWARD_AND_TURNING_LEFT_ACTION__DIFF:
				return getDiff();
			case ArdurobotmlPackage.MOVE_FORWARD_AND_TURNING_LEFT_ACTION__SPEED:
				return getSpeed();
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
			case ArdurobotmlPackage.MOVE_FORWARD_AND_TURNING_LEFT_ACTION__DURATION:
				setDuration((Integer)newValue);
				return;
			case ArdurobotmlPackage.MOVE_FORWARD_AND_TURNING_LEFT_ACTION__START_TICK:
				setStartTick((Integer)newValue);
				return;
			case ArdurobotmlPackage.MOVE_FORWARD_AND_TURNING_LEFT_ACTION__DIFF:
				setDiff((Integer)newValue);
				return;
			case ArdurobotmlPackage.MOVE_FORWARD_AND_TURNING_LEFT_ACTION__SPEED:
				setSpeed((Integer)newValue);
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
			case ArdurobotmlPackage.MOVE_FORWARD_AND_TURNING_LEFT_ACTION__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case ArdurobotmlPackage.MOVE_FORWARD_AND_TURNING_LEFT_ACTION__START_TICK:
				setStartTick(START_TICK_EDEFAULT);
				return;
			case ArdurobotmlPackage.MOVE_FORWARD_AND_TURNING_LEFT_ACTION__DIFF:
				setDiff(DIFF_EDEFAULT);
				return;
			case ArdurobotmlPackage.MOVE_FORWARD_AND_TURNING_LEFT_ACTION__SPEED:
				setSpeed(SPEED_EDEFAULT);
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
			case ArdurobotmlPackage.MOVE_FORWARD_AND_TURNING_LEFT_ACTION__DURATION:
				return duration != DURATION_EDEFAULT;
			case ArdurobotmlPackage.MOVE_FORWARD_AND_TURNING_LEFT_ACTION__START_TICK:
				return startTick != START_TICK_EDEFAULT;
			case ArdurobotmlPackage.MOVE_FORWARD_AND_TURNING_LEFT_ACTION__DIFF:
				return diff != DIFF_EDEFAULT;
			case ArdurobotmlPackage.MOVE_FORWARD_AND_TURNING_LEFT_ACTION__SPEED:
				return speed != SPEED_EDEFAULT;
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
		result.append(", diff: ");
		result.append(diff);
		result.append(", speed: ");
		result.append(speed);
		result.append(')');
		return result.toString();
	}

} //MoveForwardAndTurningLeftActionImpl
