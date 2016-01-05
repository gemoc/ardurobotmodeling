package org.gemoc.ardurobtml.mavlinkfacade.messages;

import gnu.io.SerialPortEvent;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.gemoc.ardurobotml.communication.serial.SerialLink;
import org.gemoc.ardurobtml.mavlinkfacade.logging.MessageLogger;
import org.gemoc.ardurobtml.mavlinkfacade.logging.MessageLogger.Direction;
import org.mavlink.MAVLinkReader;
import org.mavlink.io.LittleEndianDataInputStream;
import org.mavlink.io.LittleEndianDataOutputStream;
import org.mavlink.messages.MAVLinkMessage;
import org.mavlink.messages.MAV_COMPONENT;
import org.mavlink.messages.MAV_DATA_STREAM;
import org.mavlink.messages.ardupilotmega.msg_request_data_stream;

public class ArduRoverSerialLink extends SerialLink
{

	
	private MAVLinkReader _reader;
	private boolean _isDead = false;
	
	public ArduRoverSerialLink()
	{
	}
	
	private LittleEndianDataInputStream _dataInputStream;
	@Override
	protected void initializeInputStream() 
			throws IOException 
	{
		_dataInputStream = new LittleEndianDataInputStream(_serialPort.getInputStream());
		_inputStream = _dataInputStream;
	}
	
	private LittleEndianDataOutputStream _dataOutputStream;	
	@Override
	protected void initializeOutputStream() 
			throws IOException 
	{
		_dataOutputStream = new LittleEndianDataOutputStream(_serialPort.getOutputStream());
		_outputStream = _dataOutputStream;
	}
	
	private Map<Integer, Boolean> _activeDataStreams = new HashMap<Integer, Boolean>();
	
	static public final int SystemId = 255;
	static public final int ComponentId = MAV_COMPONENT.MAV_COMP_ID_SYSTEM_CONTROL;
	
	@Override
	public void initialize() {
		super.initialize();
		try {
			
			for (Field f : MAV_DATA_STREAM.class.getFields())
			{
				try {
					_activeDataStreams.put((Integer)f.get(null), false);
				} catch (IllegalArgumentException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			//_activeDataStreams.put(MAV_DATA_STREAM.MAV_DATA_STREAM_RC_CHANNELS, true);
			
			for (Entry<Integer, Boolean> entry : _activeDataStreams.entrySet())
			{
				msg_request_data_stream message = new msg_request_data_stream(SystemId, ComponentId);
				message.target_component = 1;
				message.target_system = 1;
				message.req_message_rate = entry.getValue() ? 200000 : 0; // in ms???
				message.req_stream_id = entry.getKey();
				message.start_stop = entry.getValue() ? 1 : 0;
				write(message);
				Thread.sleep(200);
			}
			
			_reader = new MAVLinkReader(_dataInputStream);			
			runReader();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	private MessageLogger _incomingLogger = new MessageLogger(Direction.Incoming);
	private MessageLogger _outgoingLogger = new MessageLogger(Direction.Outgoing);

	public void write(MAVLinkMessage message) 
			throws IOException 
	{
		_outgoingLogger.accept(message);
		byte[] bytes = message.encode();
		write(bytes);
	}
		
	private void runReader() {
		Runnable r = new Runnable()
		{

			@Override
			public void run() {
				readConstantlyIncomingMessages();
			}
			
		};
		Thread t = new Thread(r);
		t.start();
	}
	
	private void readConstantlyIncomingMessages() 
	{
		while(!_isDead)
		{
			MAVLinkMessage msg = null;
			try 
			{
				msg = _reader.getNextMessage();
				if (msg != null)
					_incomingLogger.accept(msg);
				Thread.sleep(50);
			}
			catch (IOException e) 
			{
				//e.printStackTrace();
				// do not pint the exception, it is thrown when there is nothing to read.
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}	
	}

	@Override
	public synchronized void serialEvent(SerialPortEvent oEvent) {
//		MAVLinkMessage msg = readMessage();
//		if (msg != null)
//		{
//			return;
//		}
//		return;
	}
	
	@Override
	public synchronized void close() {
		// TODO Auto-generated method stub
		super.close();
		_isDead = true;
	}
}
