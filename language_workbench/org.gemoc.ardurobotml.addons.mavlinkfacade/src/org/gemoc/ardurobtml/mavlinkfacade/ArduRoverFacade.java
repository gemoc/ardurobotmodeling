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
import org.gemoc.ardurobotml.communication.serial.SerialLink;
import org.gemoc.ardurobotml.communication.serial.SerialListener;
import org.gemoc.ardurobotml.facade.IRobotFacade;
import org.gemoc.ardurobotml.k3dsa.ActionAspect;

public class ArduRoverFacade extends AbstractArduRoverFacade implements
		IRobotFacade, SerialListener {

	SerialLink l;

	public ArduRoverFacade() {
		l = new SerialLink();
		l.initialize();
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		l.setListener(this);
	}

	@Override
	public void close() throws IOException {
		l.close();
	}

	TFSM fsm = null;

	@Override
	public void initialize(TFSM fsm) {
		this.fsm = fsm;
	}

	@Override
	public void moveOneStepForward(MoveForwardAction action) throws Exception {
		l.write(("AVANCER " + action.getSpeed() + "\r\n").getBytes());
//		Thread.sleep(action.getDuration() * 10);
//		l.write("STOP\r\n".getBytes());
	}

	@Override
	public int getPosition() {

		return 0;
	}

	@Override
	public boolean hasDetectedPossibleCollision() {
		return false;
	}

	@Override
	public void stop(Action action) {
		l.write("STOP\r\n".getBytes());
	}

	@Override
	public void endAction(Action action) {
		if (action instanceof MoveForwardAction)
			l.write("STOP\r\n".getBytes());		
		// TODO Auto-generated method stub

	}

	@Override
	public void globalTick(FSMClock clock) {
		// TODO Auto-generated method stub

	}

	@Override
	public void moveOneStepBackward(MoveBackardAction action) throws Exception {
		l.write(("RECULER " + action.getSpeed() + "\r\n").getBytes());
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

	int lastDistance = 300;
	Boolean detectColision = false;

	@Override
	public void onSerialMessage(String message) {
		lastDistance = Integer.parseInt(message);
		if (lastDistance < 20)
			detectColision = true;
	}

	@Override
	public void beginAction(Action action) {
		ActionAspect.begin(action);
		
	}

}
