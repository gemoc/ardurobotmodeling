/**
 */
package org.gemoc.ardurobotml.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.gemoc.ardurobotml.util.ArdurobotmlAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArdurobotmlItemProviderAdapterFactory extends ArdurobotmlAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArdurobotmlItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.gemoc.ardurobotml.TimedSystem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedSystemItemProvider timedSystemItemProvider;

	/**
	 * This creates an adapter for a {@link org.gemoc.ardurobotml.TimedSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimedSystemAdapter() {
		if (timedSystemItemProvider == null) {
			timedSystemItemProvider = new TimedSystemItemProvider(this);
		}

		return timedSystemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.gemoc.ardurobotml.TFSM} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TFSMItemProvider tfsmItemProvider;

	/**
	 * This creates an adapter for a {@link org.gemoc.ardurobotml.TFSM}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTFSMAdapter() {
		if (tfsmItemProvider == null) {
			tfsmItemProvider = new TFSMItemProvider(this);
		}

		return tfsmItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.gemoc.ardurobotml.State} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateItemProvider stateItemProvider;

	/**
	 * This creates an adapter for a {@link org.gemoc.ardurobotml.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStateAdapter() {
		if (stateItemProvider == null) {
			stateItemProvider = new StateItemProvider(this);
		}

		return stateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.gemoc.ardurobotml.Transition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionItemProvider transitionItemProvider;

	/**
	 * This creates an adapter for a {@link org.gemoc.ardurobotml.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransitionAdapter() {
		if (transitionItemProvider == null) {
			transitionItemProvider = new TransitionItemProvider(this);
		}

		return transitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.gemoc.ardurobotml.NamedElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElementItemProvider namedElementItemProvider;

	/**
	 * This creates an adapter for a {@link org.gemoc.ardurobotml.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNamedElementAdapter() {
		if (namedElementItemProvider == null) {
			namedElementItemProvider = new NamedElementItemProvider(this);
		}

		return namedElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.gemoc.ardurobotml.TemporalGuard} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalGuardItemProvider temporalGuardItemProvider;

	/**
	 * This creates an adapter for a {@link org.gemoc.ardurobotml.TemporalGuard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTemporalGuardAdapter() {
		if (temporalGuardItemProvider == null) {
			temporalGuardItemProvider = new TemporalGuardItemProvider(this);
		}

		return temporalGuardItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.gemoc.ardurobotml.EventGuard} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventGuardItemProvider eventGuardItemProvider;

	/**
	 * This creates an adapter for a {@link org.gemoc.ardurobotml.EventGuard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventGuardAdapter() {
		if (eventGuardItemProvider == null) {
			eventGuardItemProvider = new EventGuardItemProvider(this);
		}

		return eventGuardItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.gemoc.ardurobotml.FSMEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FSMEventItemProvider fsmEventItemProvider;

	/**
	 * This creates an adapter for a {@link org.gemoc.ardurobotml.FSMEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFSMEventAdapter() {
		if (fsmEventItemProvider == null) {
			fsmEventItemProvider = new FSMEventItemProvider(this);
		}

		return fsmEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.gemoc.ardurobotml.FSMClock} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FSMClockItemProvider fsmClockItemProvider;

	/**
	 * This creates an adapter for a {@link org.gemoc.ardurobotml.FSMClock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFSMClockAdapter() {
		if (fsmClockItemProvider == null) {
			fsmClockItemProvider = new FSMClockItemProvider(this);
		}

		return fsmClockItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.gemoc.ardurobotml.EvaluateGuard} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluateGuardItemProvider evaluateGuardItemProvider;

	/**
	 * This creates an adapter for a {@link org.gemoc.ardurobotml.EvaluateGuard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEvaluateGuardAdapter() {
		if (evaluateGuardItemProvider == null) {
			evaluateGuardItemProvider = new EvaluateGuardItemProvider(this);
		}

		return evaluateGuardItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.gemoc.ardurobotml.Region} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionItemProvider regionItemProvider;

	/**
	 * This creates an adapter for a {@link org.gemoc.ardurobotml.Region}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRegionAdapter() {
		if (regionItemProvider == null) {
			regionItemProvider = new RegionItemProvider(this);
		}

		return regionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.gemoc.ardurobotml.StopAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StopActionItemProvider stopActionItemProvider;

	/**
	 * This creates an adapter for a {@link org.gemoc.ardurobotml.StopAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStopActionAdapter() {
		if (stopActionItemProvider == null) {
			stopActionItemProvider = new StopActionItemProvider(this);
		}

		return stopActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.gemoc.ardurobotml.MoveForwardAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveForwardActionItemProvider moveForwardActionItemProvider;

	/**
	 * This creates an adapter for a {@link org.gemoc.ardurobotml.MoveForwardAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMoveForwardActionAdapter() {
		if (moveForwardActionItemProvider == null) {
			moveForwardActionItemProvider = new MoveForwardActionItemProvider(this);
		}

		return moveForwardActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.gemoc.ardurobotml.EmergencyStopAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmergencyStopActionItemProvider emergencyStopActionItemProvider;

	/**
	 * This creates an adapter for a {@link org.gemoc.ardurobotml.EmergencyStopAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEmergencyStopActionAdapter() {
		if (emergencyStopActionItemProvider == null) {
			emergencyStopActionItemProvider = new EmergencyStopActionItemProvider(this);
		}

		return emergencyStopActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.gemoc.ardurobotml.AllActionFinishedCondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllActionFinishedConditionItemProvider allActionFinishedConditionItemProvider;

	/**
	 * This creates an adapter for a {@link org.gemoc.ardurobotml.AllActionFinishedCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAllActionFinishedConditionAdapter() {
		if (allActionFinishedConditionItemProvider == null) {
			allActionFinishedConditionItemProvider = new AllActionFinishedConditionItemProvider(this);
		}

		return allActionFinishedConditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.gemoc.ardurobotml.SystemPropertyCondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemPropertyConditionItemProvider systemPropertyConditionItemProvider;

	/**
	 * This creates an adapter for a {@link org.gemoc.ardurobotml.SystemPropertyCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemPropertyConditionAdapter() {
		if (systemPropertyConditionItemProvider == null) {
			systemPropertyConditionItemProvider = new SystemPropertyConditionItemProvider(this);
		}

		return systemPropertyConditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.gemoc.ardurobotml.ActionSequence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionSequenceItemProvider actionSequenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.gemoc.ardurobotml.ActionSequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionSequenceAdapter() {
		if (actionSequenceItemProvider == null) {
			actionSequenceItemProvider = new ActionSequenceItemProvider(this);
		}

		return actionSequenceItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (timedSystemItemProvider != null) timedSystemItemProvider.dispose();
		if (tfsmItemProvider != null) tfsmItemProvider.dispose();
		if (stateItemProvider != null) stateItemProvider.dispose();
		if (transitionItemProvider != null) transitionItemProvider.dispose();
		if (namedElementItemProvider != null) namedElementItemProvider.dispose();
		if (temporalGuardItemProvider != null) temporalGuardItemProvider.dispose();
		if (eventGuardItemProvider != null) eventGuardItemProvider.dispose();
		if (fsmEventItemProvider != null) fsmEventItemProvider.dispose();
		if (fsmClockItemProvider != null) fsmClockItemProvider.dispose();
		if (evaluateGuardItemProvider != null) evaluateGuardItemProvider.dispose();
		if (regionItemProvider != null) regionItemProvider.dispose();
		if (stopActionItemProvider != null) stopActionItemProvider.dispose();
		if (moveForwardActionItemProvider != null) moveForwardActionItemProvider.dispose();
		if (emergencyStopActionItemProvider != null) emergencyStopActionItemProvider.dispose();
		if (allActionFinishedConditionItemProvider != null) allActionFinishedConditionItemProvider.dispose();
		if (systemPropertyConditionItemProvider != null) systemPropertyConditionItemProvider.dispose();
		if (actionSequenceItemProvider != null) actionSequenceItemProvider.dispose();
	}

}
