package org.gemoc.ardurobtml.mavlinkfacade.addons;

import java.util.Collection;
import java.util.List;

import org.gemoc.ardurobotml.k3dsa.RobotFacadeRegistry;
import org.gemoc.ardurobtml.mavlinkfacade.ArduRoverFacade;
import org.gemoc.executionframework.engine.mse.LogicalStep;
import org.gemoc.executionframework.engine.mse.MSEOccurrence;
import org.gemoc.xdsmlframework.api.core.EngineStatus.RunStatus;
import org.gemoc.xdsmlframework.api.core.IBasicExecutionEngine;
import org.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;

public class DefineSimulationFacade implements IEngineAddon {

	@Override
	public void engineAboutToStart(IBasicExecutionEngine engine) 
	{
			RobotFacadeRegistry.registerRobotFacade(new ArduRoverFacade());
		
	}

	
	@Override
	public void aboutToExecuteLogicalStep(IBasicExecutionEngine arg0,
			LogicalStep arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aboutToExecuteMSEOccurrence(IBasicExecutionEngine arg0,
			MSEOccurrence arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aboutToSelectLogicalStep(IBasicExecutionEngine arg0,
			Collection<LogicalStep> arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void engineAboutToDispose(IBasicExecutionEngine arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void engineAboutToStop(IBasicExecutionEngine arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void engineStarted(IBasicExecutionEngine arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void engineStatusChanged(IBasicExecutionEngine arg0, RunStatus arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void engineStopped(IBasicExecutionEngine arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logicalStepExecuted(IBasicExecutionEngine arg0, LogicalStep arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logicalStepSelected(IBasicExecutionEngine arg0, LogicalStep arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mseOccurrenceExecuted(IBasicExecutionEngine arg0,
			MSEOccurrence arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void proposedLogicalStepsChanged(IBasicExecutionEngine arg0,
			Collection<LogicalStep> arg1) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<String> validate(List<IEngineAddon> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
