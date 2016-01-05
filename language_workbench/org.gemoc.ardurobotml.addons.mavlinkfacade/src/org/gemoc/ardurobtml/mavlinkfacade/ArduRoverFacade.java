package org.gemoc.ardurobtml.mavlinkfacade;

import java.io.IOException;
import java.lang.reflect.Field;










import org.gemoc.ardurobotml.Action;
import org.gemoc.ardurobotml.FSMClock;
import org.gemoc.ardurobotml.MoveForwardAction;
import org.gemoc.ardurobotml.TFSM;
import org.gemoc.ardurobotml.communication.IMessage;
import org.gemoc.ardurobotml.communication.IMessageListener;
import org.gemoc.ardurobotml.k3dsa.IRobotFacade;
import org.gemoc.ardurobtml.mavlinkfacade.messages.ArduRoverSerialLink;
import org.gemoc.ardurobtml.mavlinkfacade.messages.SerialListenerImpl;
import org.mavlink.messages.MAVLinkMessage;
import org.mavlink.messages.MAV_CMD;
import org.mavlink.messages.MAV_MODE;
import org.mavlink.messages.ardupilotmega.msg_command_long;
import org.mavlink.messages.ardupilotmega.msg_rc_channels_override;

public class ArduRoverFacade extends AbstractArduRoverFacade implements IRobotFacade, IMessageListener {
	
	private ArduRoverSerialLink _communicationLink;
	
	public ArduRoverFacade() throws IOException 
	{
		_communicationLink = new ArduRoverSerialLink();
		SerialListenerImpl serialListener = new SerialListenerImpl(_logger);
		serialListener.onMessageNotify(this);
		_communicationLink.setListener(serialListener);
		_communicationLink.initialize();

		try {
//			heartbeat();
			armQuad();
			setServo();
			//changeSpeed();
			Thread.sleep(1000);

			overrideRemoteControl(1500);
			Thread.sleep(1000);

			for (int i=1500; i>1100; i-=50)
			{
				overrideRemoteControl(i);
				Thread.sleep(1000);		
				overrideRemoteControl(1500);
				Thread.sleep(500);		
				
			}
			

//			overrideRemoteControl(1300);
//			Thread.sleep(1000);

		
			//			overrideRemoteControl(1300);
//			Thread.sleep(1000);
//			overrideRemoteControl(1400);
//			Thread.sleep(1000);
//			overrideRemoteControl(1450);
//			Thread.sleep(1000);
			overrideRemoteControl(1500);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			overrideRemoteControl(1500);
		}
	
	}
		
//	private void heartbeat() throws IOException {
//		msg_heartbeat msg = new msg_heartbeat(SystemId, ComponentId);
//		msg.type = MAV_TYPE.MAV_TYPE_GCS;
//		msg.autopilot = MAV_AUTOPILOT.MAV_AUTOPILOT_GENERIC;
//		byte[] bytes = msg.encode();
//		_communicationLink.write(bytes);
//	}

	private void changeSpeed() throws IOException
	{
		msg_command_long message = new msg_command_long(ArduRoverSerialLink.SystemId, ArduRoverSerialLink.ComponentId);
		setDefaultComponentAndSystemIds(message);
		message.command = MAV_CMD.MAV_CMD_DO_CHANGE_SPEED;
		message.param1 = 1;
		message.param2 = (float) 0.1;
		message.param3 = (float)5;
		_communicationLink.write(message);		
	}

	private void setServo() throws IOException {
		msg_command_long message = new msg_command_long(ArduRoverSerialLink.SystemId, ArduRoverSerialLink.ComponentId);
		setDefaultComponentAndSystemIds(message);
		message.command = MAV_CMD.MAV_CMD_DO_SET_SERVO;
		message.param1 = 3;
		message.param2 = 1000;
		_communicationLink.write(message);
	}
	
	private void armQuad() throws IOException {
		msg_command_long message = new msg_command_long(ArduRoverSerialLink.SystemId, ArduRoverSerialLink.ComponentId);
		setDefaultComponentAndSystemIds(message);
		message.command = MAV_CMD.MAV_CMD_DO_SET_MODE;
		message.param1 = MAV_MODE.MAV_MODE_MANUAL_ARMED;
		_communicationLink.write(message);
	}
	
	static private final int UShortMax = 65535;
	private void overrideRemoteControl(int channel3Value) throws IOException {
		msg_rc_channels_override message = new msg_rc_channels_override(ArduRoverSerialLink.SystemId, ArduRoverSerialLink.ComponentId);
		setDefaultComponentAndSystemIds(message);
		message.chan1_raw = UShortMax;
		message.chan2_raw = UShortMax;
		message.chan3_raw = UShortMax;
		message.chan4_raw = UShortMax;
		message.chan5_raw = UShortMax;
		message.chan6_raw = UShortMax;
		message.chan7_raw = UShortMax;
		message.chan8_raw = UShortMax;
		//message.chan1_raw = 1500;
		message.chan3_raw = channel3Value;
		_communicationLink.write(message);
	}

	private void setDefaultComponentAndSystemIds(MAVLinkMessage message) {
		try {
			Field f1 = message.getClass().getField("target_component");
			f1.set(message, 1);
			Field f2 = message.getClass().getField("target_system");
			f2.set(message, 1);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e)
		{
			// do nothing, the fields do not exist.
		}
	}

	private boolean _closeHappened = false;

	public void close() throws IOException {
		_closeHappened = true;
		_communicationLink.close();	
	}
	
	private void startPolling() {
//		Thread t = new Thread(new Runnable() {
//
//			public void run() {
//				while (!_closeHappened)
//				{
//					AskBlocked message = new AskBlocked();
//					sendMessage(message);
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			}
//
//		});
//		t.start();
	}
	
	public void moveOneStepForward() throws Exception {

	}

	private int _position = 0;

	public int getPosition() {
		return _position;
	}

	private boolean _hasDetectedPossibleCollision;

	public boolean hasDetectedPossibleCollision() {
		return _hasDetectedPossibleCollision;
	}

	public void stop() {

	}

	public void onMessageReceived(IMessage newMessage) {

	}

	@Override
	public void endAction(Action action) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop(Action action) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveOneStepForward(MoveForwardAction action) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void globalTick(FSMClock clock) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initialize(TFSM fsm) {
		// TODO Auto-generated method stub
		
	}
}
