package org.gemoc.ardurobtml.mavlinkfacade.messages;

import java.util.ArrayList;

import org.gemoc.ardurobotml.communication.IMessageListener;
import org.gemoc.ardurobotml.communication.serial.SerialListener;
import org.mavlink.MAVLinkReader;
import org.mavlink.io.LittleEndianDataInputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SerialListenerImpl implements SerialListener {

	private Logger _logger;
	
	public SerialListenerImpl(Logger logger) {
		_logger = logger;
		if (_logger == null)
			_logger = LoggerFactory.getLogger(SerialListenerImpl.class);
	}

		private MAVLinkReader _reader;
	
	public void onSerialMessage(byte[] data) {
return;		
//		Message message = Message.fromBytes(data);
//		StringBuilder sb = new StringBuilder();
//		sb.append("Message received ID " + message.getID());
//		sb.append(" - p0=" + message.getParam(0));
//		sb.append(" - p1=" + message.getParam(1));
//		//_logger.info("Binary content : "+ Message.toBinary(data));
//		_logger.info(sb.toString());
//		for(IMessageListener l : _receivedMessageListeners) {
//			l.onMessageReceived(message);
//		}
	}

	private ArrayList<IMessageListener> _receivedMessageListeners = new ArrayList<IMessageListener>();

	public void onMessageNotify(IMessageListener listener) {
		_receivedMessageListeners.add(listener);
	}

}
