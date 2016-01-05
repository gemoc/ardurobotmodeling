/**
 */
package org.gemoc.ardurobotml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.ardurobotml.ArdurobotmlPackage;
import org.gemoc.ardurobotml.SystemPropertyCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Property Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.ardurobotml.impl.SystemPropertyConditionImpl#isExpectedAttributeValue <em>Expected Attribute Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemPropertyConditionImpl extends ConditionImpl implements SystemPropertyCondition {
	/**
	 * The default value of the '{@link #isExpectedAttributeValue() <em>Expected Attribute Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExpectedAttributeValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPECTED_ATTRIBUTE_VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExpectedAttributeValue() <em>Expected Attribute Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExpectedAttributeValue()
	 * @generated
	 * @ordered
	 */
	protected boolean expectedAttributeValue = EXPECTED_ATTRIBUTE_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemPropertyConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArdurobotmlPackage.Literals.SYSTEM_PROPERTY_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExpectedAttributeValue() {
		return expectedAttributeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectedAttributeValue(boolean newExpectedAttributeValue) {
		boolean oldExpectedAttributeValue = expectedAttributeValue;
		expectedAttributeValue = newExpectedAttributeValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArdurobotmlPackage.SYSTEM_PROPERTY_CONDITION__EXPECTED_ATTRIBUTE_VALUE, oldExpectedAttributeValue, expectedAttributeValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArdurobotmlPackage.SYSTEM_PROPERTY_CONDITION__EXPECTED_ATTRIBUTE_VALUE:
				return isExpectedAttributeValue();
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
			case ArdurobotmlPackage.SYSTEM_PROPERTY_CONDITION__EXPECTED_ATTRIBUTE_VALUE:
				setExpectedAttributeValue((Boolean)newValue);
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
			case ArdurobotmlPackage.SYSTEM_PROPERTY_CONDITION__EXPECTED_ATTRIBUTE_VALUE:
				setExpectedAttributeValue(EXPECTED_ATTRIBUTE_VALUE_EDEFAULT);
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
			case ArdurobotmlPackage.SYSTEM_PROPERTY_CONDITION__EXPECTED_ATTRIBUTE_VALUE:
				return expectedAttributeValue != EXPECTED_ATTRIBUTE_VALUE_EDEFAULT;
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
		result.append(" (expectedAttributeValue: ");
		result.append(expectedAttributeValue);
		result.append(')');
		return result.toString();
	}

} //SystemPropertyConditionImpl
