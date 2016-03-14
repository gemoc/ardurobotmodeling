package org.gemoc.ardurobotml.simulationfacade;

import java.io.IOException;

import org.gemoc.ardurobotml.AcceleratetAction;
import org.gemoc.ardurobotml.Action;
import org.gemoc.ardurobotml.DeceleratetAction;
import org.gemoc.ardurobotml.FSMClock;
import org.gemoc.ardurobotml.MoveBackardAction;
import org.gemoc.ardurobotml.MoveBackardAndTurningLeftAction;
import org.gemoc.ardurobotml.MoveBackardAndTurningRightAction;
import org.gemoc.ardurobotml.MoveForwardAction;
import org.gemoc.ardurobotml.MoveForwardAndTurningLeftAction;
import org.gemoc.ardurobotml.MoveForwardAndTurningRightAction;
import org.gemoc.ardurobotml.SCANCollisionAction;
import org.gemoc.ardurobotml.TFSM;
import org.gemoc.ardurobotml.TurningLeftAction;
import org.gemoc.ardurobotml.TurningRightAction;
import org.gemoc.ardurobotml.k3dsa.IRobotFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArduRoverSimulationFacade implements IRobotFacade
{

	protected Logger _logger = LoggerFactory.getLogger(ArduRoverSimulationFacade.class);
	
	private TFSM _fsm;

	@Override
	public void initialize(TFSM fsm) {
		
		System.err.println("init");
		
		_fsm = fsm;
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
		System.err.println("getPosition");

		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean hasDetectedPossibleCollision() {
		// TODO Auto-generated method stub
		System.err.println("hasDetectedPossibleCollision");
		return false;
	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		System.err.println("close");


	}

	@Override
	public void globalTick(FSMClock clock) 
	{
		System.err.println("globalTick " + clock.getName() + " : " + clock.getValue());

	}

	@Override
	
	public void moveOneStepForward(MoveForwardAction action) throws Exception {
	
		System.err.println("moveOneStepForward");

		
	}

	@Override
	public void stop(Action action) {
		System.err.println("stop Robot");
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void endAction(Action action) {
		
		System.err.println("endAction "  + action.getName());
		
	}

	@Override
	public void moveOneStepBackward(MoveBackardAction action) throws Exception {
		System.err.println("moveOneStepBackward");
			
	}

	@Override
	public void moveOneStepForwardAndTurningRight(
			MoveForwardAndTurningRightAction action) throws Exception {
		System.err.println("moveOneStepForwardAndTurningRight");
		
	}

	@Override
	public void moveOneStepForwardAndTurningLeft(
			MoveForwardAndTurningLeftAction action) throws Exception {
		System.err.println("moveOneStepForwardAndTurningLeft");
		
	}

	@Override
	public void moveOneStepBackardAndTurningRight(
			MoveBackardAndTurningRightAction action) throws Exception {
		System.err.println("moveOneStepBackardAndTurningRight");
		
	}

	@Override
	public void moveOneStepBackardAndTurningLeft(
			MoveBackardAndTurningLeftAction action) throws Exception {
		System.err.println("moveOneStepBackardAndTurningLeft");
		
	}

	@Override
	public void turnLeft(TurningLeftAction action) throws Exception {
		System.err.println("turnLeft");
		
	}

	@Override
	public void turnRight(TurningRightAction action) throws Exception {
		System.err.println("turnRight");
		
	}

	@Override
	public void scanCollision(SCANCollisionAction action) throws Exception {
		System.err.println("scanCollision");
		
	}

	@Override
	public void accelerate(AcceleratetAction action) throws Exception {
		System.err.println("accelerate");
		
	}

	@Override
	public void decelerate(DeceleratetAction action) throws Exception {
		System.err.println("decelerate");

	}

}
