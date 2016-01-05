package org.gemoc.ardurobotml.simulationfacade.addons;

import java.util.Collection;

import org.gemoc.ardurobotml.k3dsa.RobotFacadeRegistry;
import org.gemoc.ardurobotml.simulationfacade.ArduRoverSimulationFacade;
import org.gemoc.execution.engine.trace.gemoc_execution_trace.LogicalStep;
import org.gemoc.execution.engine.trace.gemoc_execution_trace.MSEOccurrence;
import org.gemoc.gemoc_language_workbench.api.core.EngineStatus.RunStatus;
import org.gemoc.gemoc_language_workbench.api.core.IBasicExecutionEngine;
import org.gemoc.gemoc_language_workbench.api.engine_addon.IEngineAddon;

public class DefineSimulationFacade implements IEngineAddon {

	@Override
	public void engineAboutToStart(IBasicExecutionEngine engine) 
	{
		RobotFacadeRegistry.registerRobotFacade(new ArduRoverSimulationFacade());
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

}
