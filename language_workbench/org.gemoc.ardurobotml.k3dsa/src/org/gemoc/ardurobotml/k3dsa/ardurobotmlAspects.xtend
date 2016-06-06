package org.gemoc.ardurobotml.k3dsa

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import java.io.Closeable
import java.util.ArrayList
import java.util.Collection
import org.gemoc.ardurobotml.Action
import org.gemoc.ardurobotml.CollisionSensorCondition
import org.gemoc.ardurobotml.EmergencyStopAction
import org.gemoc.ardurobotml.FSMClock
import org.gemoc.ardurobotml.MoveBackardAndTurningLeftAction
import org.gemoc.ardurobotml.MoveBackardAndTurningRightAction
import org.gemoc.ardurobotml.MoveForwardAction
import org.gemoc.ardurobotml.MoveForwardAndTurningLeftAction
import org.gemoc.ardurobotml.MoveForwardAndTurningRightAction
import org.gemoc.ardurobotml.Region
import org.gemoc.ardurobotml.RegionContainer
import org.gemoc.ardurobotml.SCANCollisionAction
import org.gemoc.ardurobotml.State
import org.gemoc.ardurobotml.StopAction
import org.gemoc.ardurobotml.TFSM
import org.gemoc.ardurobotml.Transition
import org.gemoc.ardurobotml.TurningLeftAction
import org.gemoc.ardurobotml.TurningRightAction
import org.gemoc.ardurobotml.ActionSequence
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import org.gemoc.ardurobotml.MoveBackardAction
import org.gemoc.ardurobotml.AcceleratetAction
import org.gemoc.ardurobotml.DeceleratetAction
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod
import org.gemoc.ardurobotml.facade.RobotFacadeRegistry

//@Aspect(className=ExecutionContext)
//class ExecutionContextAspect
//{
//
//	public HashMap<SystemProperty, Boolean> propertyValues = new HashMap()
//
//	private boolean _isInitialized
//	
//	def private void initialize()
//	{
//		if (!_self._isInitialized)
//		{
//			for(SystemProperty p : _self.properties)
//			{
//				_self.propertyValues.put(p, false)	
//			}
//			_self._isInitialized = true;
//		}
//	}
//
//	def public void setPropertyValue(SystemProperty property, boolean newValue)
//	{
//		_self.initialize()
//		_self.propertyValues.put(property, newValue)
//	}
//
//	def public boolean getPropertyValue(SystemProperty property)
//	{
//		_self.initialize()
//		return _self.propertyValues.get(property)
//	}
//	
//	def public boolean getPropertyValue(String propertyName)
//	{
//		_self.initialize()
//		var result = false;
//		for(SystemProperty p : _self.properties)
//		{
//			if (p.name.equals(propertyName)) {
//				result = _self.propertyValues.get(p)	
//				return result				
//			}
//		}
//		return result
//	}
//
//}


@Aspect(className=ActionSequence)
class ActionSequenceAspect extends ActionAspect 
{


	 def public void begin(){
		for(Action a : _self.actions)
		{
			a.begin()
		}
	 	
	 }

	def public void end()
	{
		for(Action a : _self.actions)
		{
			a.end()
		}
	}	

	
}



@Aspect(className=Action)
abstract class ActionAspect
{
	abstract def public void begin()

	def public void end()
	{
		RobotFacadeRegistry.getUniqueFacade().endAction(_self);		
	}	
}


@Aspect(className=CollisionSensorCondition)
class CollisionSensorConditionAspect  {
	def public boolean evaluate() { 
		return RobotFacadeRegistry.getUniqueFacade().hasDetectedPossibleCollision();
//		return false;
	}
}

@Aspect(className=EmergencyStopAction)
class EmergencyStopActionAspect extends ActionAspect  
{	
	

	def public void begin()
	{
		RobotFacadeRegistry.getUniqueFacade().stop(_self);
	}

}

@Aspect(className=FSMClock)
class FSMClockAspect 
{

	public int value = 0

	def public void ticks() 
	{
		_self.value = _self.value + 1
		RobotFacadeRegistry.getUniqueFacade().globalTick(_self);
	}

}

@Aspect(className=MoveForwardAction)
class MoveForwardActionAspect extends ActionAspect  
{

	def public void begin()
	{
		val fsm = ModelHelper.getOwningTFSM(_self);		
		_self.startTick = fsm.localClock.value
		RobotFacadeRegistry.getUniqueFacade().moveOneStepForward(_self);		
//		Thread.sleep(10000);
	}

}

@Aspect(className=MoveBackardAction)
class MoveForwardBackwardAspect  extends ActionAspect {
	def public void begin()
	{
		val fsm = ModelHelper.getOwningTFSM(_self);		
		_self.startTick = fsm.localClock.value
		RobotFacadeRegistry.getUniqueFacade().moveOneStepBackward(_self);		
	}

}

@Aspect(className=MoveForwardAndTurningRightAction)
class MoveForwardAndTurningRightAspect  extends ActionAspect {
	def public void begin()
	{
		val fsm = ModelHelper.getOwningTFSM(_self);		
		_self.startTick = fsm.localClock.value
		RobotFacadeRegistry.getUniqueFacade().moveOneStepForwardAndTurningRight(_self);		
	}

}

@Aspect(className=MoveForwardAndTurningLeftAction)
class MoveForwardAndTurningLeftAspect extends ActionAspect  {
	def public void begin()
	{
		val fsm = ModelHelper.getOwningTFSM(_self);		
		_self.startTick = fsm.localClock.value
		RobotFacadeRegistry.getUniqueFacade().moveOneStepForwardAndTurningLeft(_self);		
	}
  
}

@Aspect(className=MoveBackardAndTurningRightAction)
class MoveBackardAndTurningRightAspect extends ActionAspect{
	def public void begin()
	{
		val fsm = ModelHelper.getOwningTFSM(_self);		
		_self.startTick = fsm.localClock.value
		RobotFacadeRegistry.getUniqueFacade().moveOneStepBackardAndTurningRight(_self);		
	}

}
@Aspect(className=MoveBackardAndTurningLeftAction)
class MoveBackardAndTurningLeftAspect extends ActionAspect{
	def public void begin()
	{
		val fsm = ModelHelper.getOwningTFSM(_self);		
		_self.startTick = fsm.localClock.value
		RobotFacadeRegistry.getUniqueFacade().moveOneStepBackardAndTurningLeft(_self);		
	}

}


@Aspect(className=TurningLeftAction)
class TurningLeftAspect extends ActionAspect{
	def public void begin()
	{
		val fsm = ModelHelper.getOwningTFSM(_self);		
		_self.startTick = fsm.localClock.value
		RobotFacadeRegistry.getUniqueFacade().turnLeft(_self);		
	}

}


@Aspect(className=TurningRightAction)
class TurningRightAspect extends ActionAspect{
	def public void begin()
	{
		val fsm = ModelHelper.getOwningTFSM(_self);		
		_self.startTick = fsm.localClock.value
		RobotFacadeRegistry.getUniqueFacade().turnRight(_self);		
	}

}

@Aspect(className=SCANCollisionAction)
class SCANCollisionAspect extends ActionAspect{
	def public void begin()
	{
		RobotFacadeRegistry.getUniqueFacade().scanCollision(_self);		
	}
}


	

@Aspect(className=AcceleratetAction)
class AcceleratetAspect{
	def public void begin()
	{
		RobotFacadeRegistry.getUniqueFacade().accelerate(_self);		
	}
}

@Aspect(className=DeceleratetAction)
class DeceleratetAspect{
	def public void begin()
	{
		RobotFacadeRegistry.getUniqueFacade().decelerate(_self);		
	}
}




@Aspect(className=State)
class StateAspect 
{

	def public String onEnter() 
	{
		return "[" + _self.getClass().getSimpleName() + ":" + _self.getName() + ".onEnter()]Entering " + _self.name;	
	} 

	def public String onLeave() 
	{
		return "[" + _self.getClass().getSimpleName() + ":" + _self.getName() + ".onEnter()]Leaving " + _self.name;
	}

}

@Aspect(className=StopAction)
class StopActionAspect extends ActionAspect 
{

	def public void begin()
	{
		RobotFacadeRegistry.getUniqueFacade().stop(_self);
	}

}

@Aspect(className=TFSM)
class TFSMAspect 
{

	//public ExecutionContext executionContext

	def public String initialize() {
		if (_self.currentState == null) {
			_self.currentState = _self.initialState;
			RobotFacadeRegistry.getUniqueFacade().initialize(_self);
		}
		return "[" + _self.getClass().getSimpleName() + ":" + _self.getName() + ".initialize()]Initialized " + _self.name;
	}
}

@Aspect(className=Transition)
class TransitionAspect
{
	
	def public String fire() {
		_self.source.owningFSM.currentState = _self.target
		return ""
//		return "[" + _self.getClass().getSimpleName() + ":" + _self.getName() + ".fire()]Fired " + _self.name + " -> " +
//			_self.action
	}

}
/*
public interface IRobotFacade extends Closeable {

	def void initialize(TFSM fsm);
	
	def void accelerate(AcceleratetAction action) throws Exception;
	def void decelerate(DeceleratetAction action) throws Exception;
	def void moveOneStepForward(MoveForwardAction action) throws Exception;
	def void moveOneStepBackward(MoveBackardAction action) throws Exception;
	def void moveOneStepForwardAndTurningRight(MoveForwardAndTurningRightAction action) throws Exception;
	def void moveOneStepForwardAndTurningLeft(MoveForwardAndTurningLeftAction action) throws Exception;
	def void moveOneStepBackardAndTurningRight(MoveBackardAndTurningRightAction action) throws Exception;
	def void moveOneStepBackardAndTurningLeft(MoveBackardAndTurningLeftAction action) throws Exception;
	def void turnLeft(TurningLeftAction action) throws Exception;
	def void turnRight(TurningRightAction action) throws Exception;	
	def void scanCollision(SCANCollisionAction action) throws Exception;
	
	
	

	def int getPosition();

	def boolean hasDetectedPossibleCollision();

	def void stop(Action action);

	def void endAction(Action action);

	def void globalTick(FSMClock clock);
	
}
 */


public class ModelHelper {

	def public static Collection<State> getOwnedStates(RegionContainer regionContainer) {
		val result = new ArrayList<State>();
			if (regionContainer != null)
		{
			for (Region r : regionContainer.getOwnedRegions())
			{
				result.addAll(r.getOwnedStates());
				for (State s : r.getOwnedStates())
				{
					result.addAll(getOwnedStates(s));					
				}
			}
		}
		return result;		
	}

	def public static TFSM getOwningTFSM(State state) {
		var container = state.eContainer();
		if (container != null)
		{
			while (!(container instanceof TFSM))
			{
				container = container.eContainer();
			}
		}
		return container as TFSM;
	}

	def public static TFSM getOwningTFSM(Action action) {
		var container = action.eContainer();
		if (container != null)
		{
			while (!(container instanceof TFSM))
			{
				container = container.eContainer();
			}
		}
		return container as TFSM;
	}
	
	
}