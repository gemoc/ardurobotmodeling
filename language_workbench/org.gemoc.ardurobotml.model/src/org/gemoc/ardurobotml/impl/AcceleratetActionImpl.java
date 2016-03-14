/**
 */
package org.gemoc.ardurobotml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.ardurobotml.AcceleratetAction;
import org.gemoc.ardurobotml.ArdurobotmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acceleratet Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.ardurobotml.impl.AcceleratetActionImpl#getRatio <em>Ratio</em>}</li>
 *   <li>{@link org.gemoc.ardurobotml.impl.AcceleratetActionImpl#getStartTick <em>Start Tick</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AcceleratetActionImpl extends ActionImpl implements AcceleratetAction {
	/**
	 * The default value of the '{@link #getRatio() <em>Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatio()
	 * @generated
	 * @ordered
	 */
	protected static final int RATIO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRatio() <em>Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatio()
	 * @generated
	 * @ordered
	 */
	protected int ratio = RATIO_EDEFAULT;

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
	protected AcceleratetActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArdurobotmlPackage.Literals.ACCELERATET_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRatio() {
		return ratio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatio(int newRatio) {
		int oldRatio = ratio;
		ratio = newRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArdurobotmlPackage.ACCELERATET_ACTION__RATIO, oldRatio, ratio));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArdurobotmlPackage.ACCELERATET_ACTION__START_TICK, oldStartTick, startTick));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArdurobotmlPackage.ACCELERATET_ACTION__RATIO:
				return getRatio();
			case ArdurobotmlPackage.ACCELERATET_ACTION__START_TICK:
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
			case ArdurobotmlPackage.ACCELERATET_ACTION__RATIO:
				setRatio((Integer)newValue);
				return;
			case ArdurobotmlPackage.ACCELERATET_ACTION__START_TICK:
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
			case ArdurobotmlPackage.ACCELERATET_ACTION__RATIO:
				setRatio(RATIO_EDEFAULT);
				return;
			case ArdurobotmlPackage.ACCELERATET_ACTION__START_TICK:
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
			case ArdurobotmlPackage.ACCELERATET_ACTION__RATIO:
				return ratio != RATIO_EDEFAULT;
			case ArdurobotmlPackage.ACCELERATET_ACTION__START_TICK:
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
		result.append(" (ratio: ");
		result.append(ratio);
		result.append(", startTick: ");
		result.append(startTick);
		result.append(')');
		return result.toString();
	}

} //AcceleratetActionImpl
