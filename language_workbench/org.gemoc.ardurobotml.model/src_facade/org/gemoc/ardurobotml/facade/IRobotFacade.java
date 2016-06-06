package org.gemoc.ardurobotml.facade;


import java.io.Closeable;
import org.gemoc.ardurobotml.AcceleratetAction;
import org.gemoc.ardurobotml.Action;
import org.gemoc.ardurobotml.DeceleratetAction;
import org.gemoc.ardurobotml.FSMClock;
import org.gemoc.ardurobotml.MoveBackardAction;
import org.gemoc.ardurobotml.MoveBackardAndTurningLeftAction;
import org.gemoc.ardurobotml.MoveBackardAndTurningRightAction;
import org.gemoc.ardurobotml.MoveForwardAction;
import org.gemoc.ardurobotml.MoveForwardAndTurningLeftAction;
import org.gemoc.ardurobotml.MoveForwardAndTurningRightAction;
import org.gemoc.ardurobotml.SCANCollisionAction;
import org.gemoc.ardurobotml.TFSM;
import org.gemoc.ardurobotml.TurningLeftAction;
import org.gemoc.ardurobotml.TurningRightAction;

@SuppressWarnings("all")
public interface IRobotFacade extends Closeable {
  public abstract void initialize(final TFSM fsm);
  
  public abstract void accelerate(final AcceleratetAction action) throws Exception;
  
  public abstract void decelerate(final DeceleratetAction action) throws Exception;
  
  public abstract void moveOneStepForward(final MoveForwardAction action) throws Exception;
  
  public abstract void moveOneStepBackward(final MoveBackardAction action) throws Exception;
  
  public abstract void moveOneStepForwardAndTurningRight(final MoveForwardAndTurningRightAction action) throws Exception;
  
  public abstract void moveOneStepForwardAndTurningLeft(final MoveForwardAndTurningLeftAction action) throws Exception;
  
  public abstract void moveOneStepBackardAndTurningRight(final MoveBackardAndTurningRightAction action) throws Exception;
  
  public abstract void moveOneStepBackardAndTurningLeft(final MoveBackardAndTurningLeftAction action) throws Exception;
  
  public abstract void turnLeft(final TurningLeftAction action) throws Exception;
  
  public abstract void turnRight(final TurningRightAction action) throws Exception;
  
  public abstract void scanCollision(final SCANCollisionAction action) throws Exception;
  
  public abstract int getPosition();
  
  public abstract boolean hasDetectedPossibleCollision();
  
  public abstract void stop(final Action action);
  
  public abstract void endAction(final Action action);
  public abstract void beginAction(final Action action);
  
  public abstract void globalTick(final FSMClock clock);
}
