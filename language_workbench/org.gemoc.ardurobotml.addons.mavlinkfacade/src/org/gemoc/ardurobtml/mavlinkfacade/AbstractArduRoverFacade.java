package org.gemoc.ardurobtml.mavlinkfacade;

import org.gemoc.ardurobotml.k3dsa.IRobotFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractArduRoverFacade implements IRobotFacade
{

	protected Logger _logger = LoggerFactory.getLogger(ArduRoverFacade.class);

	public AbstractArduRoverFacade() 
	{
		super();
		_logger.info("Starting...");
		_logger.info("Started");
	}

}