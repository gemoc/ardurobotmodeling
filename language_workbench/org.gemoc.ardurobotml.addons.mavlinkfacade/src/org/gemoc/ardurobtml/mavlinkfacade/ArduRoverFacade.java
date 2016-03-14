package org.gemoc.ardurobtml.mavlinkfacade;

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
import org.gemoc.ardurobotml.communication.IMessage;
import org.gemoc.ardurobotml.communication.IMessageListener;
import org.gemoc.ardurobotml.communication.serial.SerialLink;
import org.gemoc.ardurobotml.k3dsa.IRobotFacade;

public class ArduRoverFacade extends AbstractArduRoverFacade implements IRobotFacade, IMessageListener {

	
	SerialLink l ;
	
	public ArduRoverFacade() {
		l = new SerialLink();
		l.initialize();
	}
	
	@Override
	public void close() throws IOException {
		l.close();
	}

	@Override
	public void onMessageReceived(IMessage newMessage) {
		
	}
	TFSM fsm =null;

	@Override
	public void initialize(TFSM fsm) {
		this.fsm =fsm;
	}

	@Override
	public void moveOneStepForward(MoveForwardAction action) throws Exception {
		l.write("AVANCER\r\n".getBytes());	
	}

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
	public void stop(Action action) {
		l.write("STOP\r\n".getBytes());			
	}

	@Override
	public void endAction(Action action) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void globalTick(FSMClock clock) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveOneStepBackward(MoveBackardAction action) throws Exception {
		l.write("RECULER\r\n".getBytes());					
	}

	@Override
	public void moveOneStepForwardAndTurningRight(
			MoveForwardAndTurningRightAction action) throws Exception {
		l.write("AVANCERDROITE\r\n".getBytes());					
	}

	@Override
	public void moveOneStepForwardAndTurningLeft(
			MoveForwardAndTurningLeftAction action) throws Exception {
		l.write("AVANCERGAUCHE\r\n".getBytes());					
		
	}

	@Override
	public void moveOneStepBackardAndTurningRight(
			MoveBackardAndTurningRightAction action) throws Exception {
		l.write("RECULERDROITE\r\n".getBytes());					
		
	}

	@Override
	public void moveOneStepBackardAndTurningLeft(
			MoveBackardAndTurningLeftAction action) throws Exception {
		l.write("RECULERGAUCHE\r\n".getBytes());					
		
	}

	@Override
	public void turnLeft(TurningLeftAction action) throws Exception {
		l.write("TOURNERGAUCHE\r\n".getBytes());					
		
	}

	@Override
	public void turnRight(TurningRightAction action) throws Exception {
		l.write("TOURNERDROITE\r\n".getBytes());					
		
	}

	@Override
	public void scanCollision(SCANCollisionAction action) throws Exception {
		l.write("BALAYER\r\n".getBytes());					
	}

	@Override
	public void accelerate(AcceleratetAction action) throws Exception {
		l.write("ACCELERER\r\n".getBytes());					
		
	}

	@Override
	public void decelerate(DeceleratetAction action) throws Exception {
		l.write("RALENTIR\r\n".getBytes());					
		
	}

}
