package org.gemoc.ardurobotml.design.services;

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
			res.append(((EvaluateGuard) transition.getOwnedGuard())
					.getCondition());
		}
		res.append("\n / \n");
		for (FSMEvent event : transition.getGeneratedEvents()) {
			res.append("  !");
			res.append(event.getName());
			res.append(";");
		}

		return res.toString();
	}


}
