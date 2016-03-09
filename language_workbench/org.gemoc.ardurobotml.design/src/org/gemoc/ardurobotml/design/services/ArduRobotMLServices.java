package org.gemoc.ardurobotml.design.services;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.gemoc.ardurobotml.EvaluateGuard;
import org.gemoc.ardurobotml.EventGuard;
import org.gemoc.ardurobotml.FSMEvent;
import org.gemoc.ardurobotml.TemporalGuard;
import org.gemoc.ardurobotml.Transition;



/** ArduRobotML services.
 * 
 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
 * 
 */
public class ArduRobotMLServices {

	/**
	 * Gets the label for the given {@link Transition}.
	 * 
	 * @param transition
	 *            the {@link Transition}
	 * @return the label for the given {@link Transition}
	 */
	public String getLabel(Transition transition) {
		final StringBuilder res = new StringBuilder();

		if (transition.getOwnedGuard() instanceof EventGuard) {
			res.append("when ");
			res.append(((EventGuard) transition.getOwnedGuard())
					.getTriggeringEvent().getName());
		} else if (transition.getOwnedGuard() instanceof TemporalGuard) {
			res.append("after ");
			res.append(((TemporalGuard) transition.getOwnedGuard())
					.getAfterDuration());
			res.append(" on ");
			res.append(((TemporalGuard) transition.getOwnedGuard())
					.getOnClock().getName());
		} else if (transition.getOwnedGuard() instanceof EvaluateGuard) {
			res.append("if ");
			res.append(getLabel(((EvaluateGuard) transition.getOwnedGuard())
					.getCondition()));
		}
		res.append("\n / \n");
		for (FSMEvent event : transition.getGeneratedEvents()) {
			res.append("  !");
			res.append(event.getName());
			res.append(";");
		}

		return res.toString();
	}

	/**
	 * The {@link ComposedAdapterFactory} used to provide image and text for eObject.
	 * This reuse the ItemProvider offered by the edit plugin
	 */
	private static final ComposedAdapterFactory ADAPTER_FACTORY = initLabelProvider();
	
	private static ComposedAdapterFactory initLabelProvider() {
		final ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
		return adapterFactory;
	}
	
	protected String getLabel(EObject o){
		final IItemLabelProvider provider = (IItemLabelProvider)ADAPTER_FACTORY.adapt(o,
				IItemLabelProvider.class);
		return provider.getText(o);
	}

}
