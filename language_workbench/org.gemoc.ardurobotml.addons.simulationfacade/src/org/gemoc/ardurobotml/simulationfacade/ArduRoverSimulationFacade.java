package org.gemoc.ardurobotml.simulationfacade;

import java.io.IOException;

import org.gemoc.ardurobotml.Action;
import org.gemoc.ardurobotml.FSMClock;
import org.gemoc.ardurobotml.MoveForwardAction;
import org.gemoc.ardurobotml.TFSM;
import org.gemoc.ardurobotml.k3dsa.IRobotFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArduRoverSimulationFacade implements IRobotFacade
{

	protected Logger _logger = LoggerFactory.getLogger(ArduRoverSimulationFacade.class);
	
	private TFSM _fsm;

	@Override
	public void initialize(TFSM fsm) {
		System.out.println("Initializing SimulationFacade for TFSM "+fsm.getName());
//		_fsm = fsm;
//		for (State s : fsm.getOwnedStates())
//		{
//			for (Action a : s.getActions())
//			{
//				doNoTickInTheFuture(a);
//			}
//		}
//		for (FSMEvent e : fsm.getLocalEvents())
//		{
//			doNoTickInTheFuture(e);			
//		}
//
//
//		String viewId = Activator.MyViewId;
////		EventManagerView view = ViewHelper.retrieveView(viewId);
////		view.setClockController(_clockController);	
	}

//	private ArrayList<MoveForwardAction> _movesToFinish = new ArrayList<>();

//	@Override
//	public void moveOneStepForward(MoveForwardAction action) throws Exception 
//	{
//		if (action.getDuration() == 0)
//		{
//			String clockQualifiedName = getClockQualifiedName(action);
//			_mseStateController.forcePresenceInTheFuture(clockQualifiedName);			
//		}
//		else
//		{
//			_movesToFinish.add(action);
//		}
//	}

	@Override
	public int getPosition() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean hasDetectedPossibleCollision() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void globalTick(FSMClock clock) 
	{

	}

	@Override
	public void moveOneStepForward(MoveForwardAction action) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop(Action action) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void endAction(Action action) {
		// TODO Auto-generated method stub
		
	}

}
