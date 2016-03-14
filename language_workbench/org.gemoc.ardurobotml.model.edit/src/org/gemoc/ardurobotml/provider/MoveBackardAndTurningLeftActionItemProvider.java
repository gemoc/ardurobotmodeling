/**
 */
package org.gemoc.ardurobotml.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.gemoc.ardurobotml.ArdurobotmlPackage;
import org.gemoc.ardurobotml.MoveBackardAndTurningLeftAction;

/**
 * This is the item provider adapter for a {@link org.gemoc.ardurobotml.MoveBackardAndTurningLeftAction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MoveBackardAndTurningLeftActionItemProvider extends ActionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveBackardAndTurningLeftActionItemProvider(AdapterFactory adapterFactory) {
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

			addDurationPropertyDescriptor(object);
			addStartTickPropertyDescriptor(object);
			addDiffPropertyDescriptor(object);
			addSpeedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MoveBackardAndTurningLeftAction_duration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MoveBackardAndTurningLeftAction_duration_feature", "_UI_MoveBackardAndTurningLeftAction_type"),
				 ArdurobotmlPackage.Literals.MOVE_BACKARD_AND_TURNING_LEFT_ACTION__DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Tick feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartTickPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MoveBackardAndTurningLeftAction_startTick_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MoveBackardAndTurningLeftAction_startTick_feature", "_UI_MoveBackardAndTurningLeftAction_type"),
				 ArdurobotmlPackage.Literals.MOVE_BACKARD_AND_TURNING_LEFT_ACTION__START_TICK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Diff feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiffPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MoveBackardAndTurningLeftAction_diff_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MoveBackardAndTurningLeftAction_diff_feature", "_UI_MoveBackardAndTurningLeftAction_type"),
				 ArdurobotmlPackage.Literals.MOVE_BACKARD_AND_TURNING_LEFT_ACTION__DIFF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Speed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpeedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MoveBackardAndTurningLeftAction_speed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MoveBackardAndTurningLeftAction_speed_feature", "_UI_MoveBackardAndTurningLeftAction_type"),
				 ArdurobotmlPackage.Literals.MOVE_BACKARD_AND_TURNING_LEFT_ACTION__SPEED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns MoveBackardAndTurningLeftAction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MoveBackardAndTurningLeftAction"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MoveBackardAndTurningLeftAction)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MoveBackardAndTurningLeftAction_type") :
			getString("_UI_MoveBackardAndTurningLeftAction_type") + " " + label;
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

		switch (notification.getFeatureID(MoveBackardAndTurningLeftAction.class)) {
			case ArdurobotmlPackage.MOVE_BACKARD_AND_TURNING_LEFT_ACTION__DURATION:
			case ArdurobotmlPackage.MOVE_BACKARD_AND_TURNING_LEFT_ACTION__START_TICK:
			case ArdurobotmlPackage.MOVE_BACKARD_AND_TURNING_LEFT_ACTION__DIFF:
			case ArdurobotmlPackage.MOVE_BACKARD_AND_TURNING_LEFT_ACTION__SPEED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
