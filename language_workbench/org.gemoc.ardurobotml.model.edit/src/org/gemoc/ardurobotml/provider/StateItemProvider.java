/**
 */
package org.gemoc.ardurobotml.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.gemoc.ardurobotml.ArdurobotmlFactory;
import org.gemoc.ardurobotml.ArdurobotmlPackage;
import org.gemoc.ardurobotml.State;

/**
 * This is the item provider adapter for a {@link org.gemoc.ardurobotml.State} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StateItemProvider extends RegionContainerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addOutgoingTransitionsPropertyDescriptor(object);
			addIncomingTransitionsPropertyDescriptor(object);
			addOwningFSMPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Outgoing Transitions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutgoingTransitionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_State_outgoingTransitions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_State_outgoingTransitions_feature", "_UI_State_type"),
				 ArdurobotmlPackage.Literals.STATE__OUTGOING_TRANSITIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incoming Transitions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncomingTransitionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_State_incomingTransitions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_State_incomingTransitions_feature", "_UI_State_type"),
				 ArdurobotmlPackage.Literals.STATE__INCOMING_TRANSITIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owning FSM feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwningFSMPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_State_owningFSM_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_State_owningFSM_feature", "_UI_State_type"),
				 ArdurobotmlPackage.Literals.STATE__OWNING_FSM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ArdurobotmlPackage.Literals.STATE__ACTIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns State.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/State"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((State)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_State_type") :
			getString("_UI_State_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(State.class)) {
			case ArdurobotmlPackage.STATE__ACTIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ArdurobotmlPackage.Literals.STATE__ACTIONS,
				 ArdurobotmlFactory.eINSTANCE.createActionSequence()));

		newChildDescriptors.add
			(createChildParameter
				(ArdurobotmlPackage.Literals.STATE__ACTIONS,
				 ArdurobotmlFactory.eINSTANCE.createStopAction()));

		newChildDescriptors.add
			(createChildParameter
				(ArdurobotmlPackage.Literals.STATE__ACTIONS,
				 ArdurobotmlFactory.eINSTANCE.createMoveForwardAction()));

		newChildDescriptors.add
			(createChildParameter
				(ArdurobotmlPackage.Literals.STATE__ACTIONS,
				 ArdurobotmlFactory.eINSTANCE.createMoveBackardAction()));

		newChildDescriptors.add
			(createChildParameter
				(ArdurobotmlPackage.Literals.STATE__ACTIONS,
				 ArdurobotmlFactory.eINSTANCE.createMoveForwardAndTurningRightAction()));

		newChildDescriptors.add
			(createChildParameter
				(ArdurobotmlPackage.Literals.STATE__ACTIONS,
				 ArdurobotmlFactory.eINSTANCE.createMoveForwardAndTurningLeftAction()));

		newChildDescriptors.add
			(createChildParameter
				(ArdurobotmlPackage.Literals.STATE__ACTIONS,
				 ArdurobotmlFactory.eINSTANCE.createMoveBackardAndTurningRightAction()));

		newChildDescriptors.add
			(createChildParameter
				(ArdurobotmlPackage.Literals.STATE__ACTIONS,
				 ArdurobotmlFactory.eINSTANCE.createMoveBackardAndTurningLeftAction()));

		newChildDescriptors.add
			(createChildParameter
				(ArdurobotmlPackage.Literals.STATE__ACTIONS,
				 ArdurobotmlFactory.eINSTANCE.createTurningLeftAction()));

		newChildDescriptors.add
			(createChildParameter
				(ArdurobotmlPackage.Literals.STATE__ACTIONS,
				 ArdurobotmlFactory.eINSTANCE.createTurningRightAction()));

		newChildDescriptors.add
			(createChildParameter
				(ArdurobotmlPackage.Literals.STATE__ACTIONS,
				 ArdurobotmlFactory.eINSTANCE.createAcceleratetAction()));

		newChildDescriptors.add
			(createChildParameter
				(ArdurobotmlPackage.Literals.STATE__ACTIONS,
				 ArdurobotmlFactory.eINSTANCE.createDeceleratetAction()));

		newChildDescriptors.add
			(createChildParameter
				(ArdurobotmlPackage.Literals.STATE__ACTIONS,
				 ArdurobotmlFactory.eINSTANCE.createSCANCollisionAction()));

		newChildDescriptors.add
			(createChildParameter
				(ArdurobotmlPackage.Literals.STATE__ACTIONS,
				 ArdurobotmlFactory.eINSTANCE.createEmergencyStopAction()));
	}

}
