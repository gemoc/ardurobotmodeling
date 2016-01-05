package org.gemoc.ardurobotml.communication;


public interface IMessageListener {

	void onMessageReceived(IMessage newMessage);
	
}
