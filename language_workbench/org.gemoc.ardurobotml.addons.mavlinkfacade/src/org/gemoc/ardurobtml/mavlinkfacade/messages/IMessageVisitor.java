package org.gemoc.ardurobtml.mavlinkfacade.messages;

import org.mavlink.messages.ardupilotmega.msg_hwstatus;

public interface IMessageVisitor {

	void visit(msg_hwstatus message);
	
}
