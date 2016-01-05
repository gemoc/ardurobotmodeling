/**
 */
package org.gemoc.ardurobotml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Property Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.ardurobotml.SystemPropertyCondition#isExpectedAttributeValue <em>Expected Attribute Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.ardurobotml.ArdurobotmlPackage#getSystemPropertyCondition()
 * @model
 * @generated
 */
public interface SystemPropertyCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Expected Attribute Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expected Attribute Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Attribute Value</em>' attribute.
	 * @see #setExpectedAttributeValue(boolean)
	 * @see org.gemoc.ardurobotml.ArdurobotmlPackage#getSystemPropertyCondition_ExpectedAttributeValue()
	 * @model
	 * @generated
	 */
	boolean isExpectedAttributeValue();

	/**
	 * Sets the value of the '{@link org.gemoc.ardurobotml.SystemPropertyCondition#isExpectedAttributeValue <em>Expected Attribute Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Attribute Value</em>' attribute.
	 * @see #isExpectedAttributeValue()
	 * @generated
	 */
	void setExpectedAttributeValue(boolean value);

} // SystemPropertyCondition
