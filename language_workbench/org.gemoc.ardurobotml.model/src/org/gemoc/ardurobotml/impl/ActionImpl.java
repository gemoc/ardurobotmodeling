/**
 */
package org.gemoc.ardurobotml.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.ardurobotml.Action;
import org.gemoc.ardurobotml.ArdurobotmlPackage;
import org.gemoc.ardurobotml.facade.RobotFacadeRegistry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class ActionImpl extends NamedElementImpl implements Action {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArdurobotmlPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void begin() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		RobotFacadeRegistry.getUniqueFacade().beginAction(this);		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void end() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		RobotFacadeRegistry.getUniqueFacade().endAction(this);		

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ArdurobotmlPackage.ACTION___BEGIN:
				begin();
				return null;
			case ArdurobotmlPackage.ACTION___END:
				end();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ActionImpl
