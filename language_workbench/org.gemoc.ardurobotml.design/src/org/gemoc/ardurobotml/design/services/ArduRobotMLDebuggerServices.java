package org.gemoc.ardurobotml.design.services;

import java.util.ArrayList;
import java.util.List;

import org.gemoc.executionframework.extensions.sirius.services.AbstractGemocDebuggerServices;


public class ArduRobotMLDebuggerServices extends AbstractGemocDebuggerServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();
		
		res.add(new StringCouple("TimedSystem","Debug"));
		res.add(new StringCouple("TFSM","Debug"));
		
		return res;
	}
	
}
