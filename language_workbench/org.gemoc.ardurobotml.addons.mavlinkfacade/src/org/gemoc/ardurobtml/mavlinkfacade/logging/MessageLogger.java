package org.gemoc.ardurobtml.mavlinkfacade.logging;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.gemoc.ardurobtml.mavlinkfacade.messages.IMessageVisitor;
import org.mavlink.messages.IMAVLinkMessageID;
import org.mavlink.messages.MAVLinkMessage;
import org.mavlink.messages.ardupilotmega.*;

public class MessageLogger implements IMessageVisitor
{

	public enum Direction
	{
		Incoming,
		Outgoing
	}	
	
	
	private Direction _direction;
	
	public MessageLogger(Direction direction)
	{
		_direction = direction;
	}
	
	public void accept(MAVLinkMessage message)
	{
    	Field[] fields = IMAVLinkMessageID.class.getDeclaredFields();
    	for(Field f : fields)
    	{
    		try {
				if (f.getInt(message) == message.messageType)
				{
					logTopStatement(f);
					if (f.getInt(message) != msg_heartbeat.MAVLINK_MSG_ID_HEARTBEAT)
					{
						Field[] messageFields = message.getClass().getFields();
						for(Field messageField : messageFields)
						{
							if ((messageField.getModifiers() & Modifier.FINAL) != Modifier.FINAL)
								System.out.println(messageField.getName() + "=" + messageField.get(message));
						}
					}
					System.out.println();
					return;
				}
			} catch (IllegalArgumentException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}

	}

	private void logTopStatement(Field f) {
		if (_direction == Direction.Incoming)
		{
			System.out.println("--> Received " + f.getName());			
		}
		else
		{
			System.out.println("<-- Sent " + f.getName());
		}
	}
	
	@Override
	public void visit(msg_hwstatus message) {
		// TODO Auto-generated method stub
		
	}

}
