package org.gemoc.ardurobotml.facade;



@SuppressWarnings("all")
public class RobotFacadeRegistry {
  public static IRobotFacade getUniqueFacade() {
    return RobotFacadeRegistry._uniqueFacade;
  }
  
  private static IRobotFacade _uniqueFacade;
  
  public static void registerRobotFacade(final IRobotFacade facade) {
    RobotFacadeRegistry._uniqueFacade = facade;
  }
}
