package org.gemoc.ardurobotml.communication.serial;

import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class SerialLink implements SerialPortEventListener {
	
	protected SerialPort _serialPort;
    	
	/** The port we're normally going to use. */
	private static final String PORT_NAMES[] = {
													// For Raspbian systems
													"/dev/ttyUSB0",
													"/dev/ttyUSB01",
													// For windows systems
													"COM1",
													"COM2",
													"COM3",
													"COM4",
													"COM5",
													"COM6"
												};

	
//	private byte[] _buffer = new byte[9];
//	private byte[] _tmp = new byte[9];
//	private int _bytesRead = 0;
	
	protected InputStream _inputStream;
	BufferedReader input;
	protected OutputStream _outputStream;
	
	private SerialListener _listener;

	public void initialize() {
		System.out.println("Initializing SerialLink");
		CommPortIdentifier portId = null;
		@SuppressWarnings("rawtypes")
		Enumeration portEnum = CommPortIdentifier.getPortIdentifiers();

		//First, Find an instance of serial port as set in PORT_NAMES.
		while (portEnum.hasMoreElements()) {
			CommPortIdentifier currPortId = (CommPortIdentifier) portEnum.nextElement();
			System.out.println("Found COM port : " + currPortId.getName());
			for (String portName : PORT_NAMES) {
				if (currPortId.getName().equals(portName)) {
					portId = currPortId;
					System.out.println("Selecting COM port : " + currPortId.getName());
					break;
				}
			}
		}
		if (portId == null) {
			System.out.println("Could not find COM port.");
			return;
		}

		try {
			// open serial port, and use class name for the appName.
			_serialPort = (SerialPort) portId.open(getClass().getName(), 
													SerialLinkConfiguration.TIME_OUT);

			// set port parameters
			_serialPort.setSerialPortParams(SerialLinkConfiguration.DATA_RATE,
											SerialPort.DATABITS_8,
											SerialPort.STOPBITS_1,
											SerialPort.PARITY_NONE);

			// open the streams
			initializeInputStream();
			initializeOutputStream();

			// add event listeners
			_serialPort.addEventListener(this);
			_serialPort.notifyOnDataAvailable(true);
		} catch (Exception e) {
			System.err.println(e.toString());
		}
	}

	protected void initializeOutputStream() throws IOException {
		_outputStream = _serialPort.getOutputStream();
	}

	protected void initializeInputStream() throws IOException {
		_inputStream = _serialPort.getInputStream();
		input = new BufferedReader(new InputStreamReader(_inputStream));
	}

	
	/**
	 * This should be called when you stop using the port.
	 * This will prevent port locking on platforms like Linux.
	 */
	public synchronized void close() {
		if (_serialPort != null) {
			_serialPort.removeEventListener();
			_serialPort.close();
		}
	}

	/**
	 * Handle an event on the serial port. Read the data and print it.
	 */
	public synchronized void serialEvent(SerialPortEvent oEvent) {
		if (oEvent.getEventType() == SerialPortEvent.DATA_AVAILABLE) {
			try {
				String inputLine=input.readLine();
				System.out.println(inputLine);
				if(this._listener != null)
					this._listener.onSerialMessage(inputLine);
			} catch (Exception e) {
				System.err.println(e.toString());
			}
		
		}
//		if (oEvent.getEventType() == SerialPortEvent.DATA_AVAILABLE) {
//			try {
//				int tmpRead = _input.read(_tmp);
//				//System.out.println("Octets lu :" + tmpRead);
//				System.arraycopy(_tmp, 0, _buffer, _bytesRead, tmpRead);
//				_bytesRead += tmpRead;
//				
//				if(_bytesRead == 9)
//				{
////					System.out.println("Message received from Arduino");
//					_bytesRead = 0;
//					if(this._listener != null)
//						this._listener.onSerialMessage(_buffer);
//					
//					_buffer = new byte[9];
//					_tmp = new byte[9];
//				}
//			} catch (Exception e) {
//				System.err.println(e.toString());
//			}
//		}
//		// Ignore all the other eventTypes, but you should consider the other ones.
	}
	
	public synchronized void write(byte[] b)
	{
    	try 
    	{    		
    		_outputStream.write(b, 0, b.length);
    	} 
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	} 
    }
	
	
	
	
	
	public void setListener(SerialListener listener){
		_listener = listener;
//		_listener.onMessageNotify(this);
	}

	
//	private Object _receivedMessagesLock = new Object();
//	private Queue<Message> _receivedMessages = new LinkedList<Message>();
//	private Semaphore _messageNotificationSemaphore;
//	
//	public Message receiveMessage() throws InterruptedException {		
//		Message receivedMessage = popMessage();
//		if (receivedMessage == null) {
//			_messageNotificationSemaphore = new Semaphore(0);
//			while (receivedMessage == null) 
//			{
//				synchronized (_messageNotificationSemaphore) {
//					_messageNotificationSemaphore.wait();					
//				}
//				receivedMessage = popMessage();
//			}
//			_messageNotificationSemaphore = null;
//		}
//		return receivedMessage;
//	}
//
//	private Message popMessage() {
//		synchronized(_receivedMessagesLock) {
//			if (!_receivedMessages.isEmpty()) {
//				return _receivedMessages.remove();
//			}
//			else
//			{
//				return null;
//			}
//		}
//	}
//
//	@Override
//	public void onMessageReceived(Message newMessage) {
//		synchronized(_receivedMessagesLock) {
//			_receivedMessages.add(newMessage);			
//				if (_messageNotificationSemaphore != null) {
//					_messageNotificationSemaphore.release();
//				}
//		}
//	}
}
