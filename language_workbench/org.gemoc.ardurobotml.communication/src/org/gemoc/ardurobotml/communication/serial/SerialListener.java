package org.gemoc.ardurobotml.communication.serial;

import org.gemoc.ardurobotml.communication.IMessageListener;


public interface SerialListener {
	
	public void onSerialMessage(byte[] message);

	public void onMessageNotify(IMessageListener messageInterpreter);
	
}
