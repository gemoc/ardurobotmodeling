package org.gemoc.ardurobotml.design.services;

import java.util.ArrayList;
import java.util.List;

import org.gemoc.gemoc_language_workbench.extensions.sirius.services.AbstractGemocAnimatorServices;

public class ArduRobotMLAnimatorServices extends AbstractGemocAnimatorServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();
		
		res.add(new StringCouple("TFSM","Animation"));
		res.add(new StringCouple("TimedSystem","Animation"));
		
		return res;
	}

}