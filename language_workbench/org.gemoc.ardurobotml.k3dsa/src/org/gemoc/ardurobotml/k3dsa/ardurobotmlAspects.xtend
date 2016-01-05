package org.gemoc.ardurobotml.k3dsa

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import java.io.Closeable
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.gemoc.ardurobotml.TimedSystem
import org.gemoc.ardurobotml.TFSM
import org.gemoc.ardurobotml.State
import org.gemoc.ardurobotml.Transition
import org.gemoc.ardurobotml.NamedElement
import org.gemoc.ardurobotml.Guard
import org.gemoc.ardurobotml.TemporalGuard
import org.gemoc.ardurobotml.EventGuard
import org.gemoc.ardurobotml.FSMEvent
import org.gemoc.ardurobotml.FSMClock
import org.gemoc.ardurobotml.EvaluateGuard
import org.gemoc.ardurobotml.Region
import org.gemoc.ardurobotml.RegionContainer
import org.gemoc.ardurobotml.Condition
import org.gemoc.ardurobotml.StopAction
import org.gemoc.ardurobotml.MoveForwardAction
import org.gemoc.ardurobotml.Action
import org.gemoc.ardurobotml.EmergencyStopAction
import org.gemoc.ardurobotml.AllActionFinishedCondition
import org.gemoc.ardurobotml.SystemPropertyCondition
import org.gemoc.ardurobotml.ActionSequence

//import static extension org.gemoc.ardurobotml.k3dsa.TimedSystemAspect.*
import static extension org.gemoc.ardurobotml.k3dsa.TFSMAspect.*
import static extension org.gemoc.ardurobotml.k3dsa.StateAspect.*
import static extension org.gemoc.ardurobotml.k3dsa.TransitionAspect.*
//import static extension org.gemoc.ardurobotml.k3dsa.NamedElementAspect.*
//import static extension org.gemoc.ardurobotml.k3dsa.GuardAspect.*
//import static extension org.gemoc.ardurobotml.k3dsa.TemporalGuardAspect.*
//import static extension org.gemoc.ardurobotml.k3dsa.EventGuardAspect.*
//import static extension org.gemoc.ardurobotml.k3dsa.FSMEventAspect.*
import static extension org.gemoc.ardurobotml.k3dsa.FSMClockAspect.*
//import static extension org.gemoc.ardurobotml.k3dsa.EvaluateGuardAspect.*
//import static extension org.gemoc.ardurobotml.k3dsa.RegionAspect.*
//import static extension org.gemoc.ardurobotml.k3dsa.RegionContainerAspect.*
//import static extension org.gemoc.ardurobotml.k3dsa.ConditionAspect.*
import static extension org.gemoc.ardurobotml.k3dsa.StopActionAspect.*
import static extension org.gemoc.ardurobotml.k3dsa.MoveForwardActionAspect.*
import static extension org.gemoc.ardurobotml.k3dsa.ActionAspect.*
import static extension org.gemoc.ardurobotml.k3dsa.EmergencyStopActionAspect.*
//import static extension org.gemoc.ardurobotml.k3dsa.AllActionFinishedConditionAspect.*
//import static extension org.gemoc.ardurobotml.k3dsa.SystemPropertyConditionAspect.*
//import static extension org.gemoc.ardurobotml.k3dsa.ActionSequenceAspect.*
import java.util.Collection
import java.util.ArrayList

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


//@Aspect(className=ActionSequence)
//class ActionSequenceAspect extends ActionAspect 
//{
//
//	@OverrideAspectMethod
//	def public void perform() { 
//		for(Action a : _self.actions)
//		{
//			a.perform()
//		}
//	}
//	
//}



@Aspect(className=Action)
abstract class ActionAspect
{
	abstract def public void begin()

	def public void end()
	{
		RobotFacadeRegistry.getUniqueFacade().endAction(_self);		
	}	
}


//@Aspect(className=CollisionSensorCondition)
//class CollisionSensorConditionAspect {
//	def public boolean evaluate() { 
////		return KerCarFacade.Instance().hasDetectedPossibleCollision();
//		return false;
//	}
//}

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

public interface IRobotFacade extends Closeable {

	def void initialize(TFSM fsm);
	
	def void moveOneStepForward(MoveForwardAction action) throws Exception;

	def int getPosition();

	def boolean hasDetectedPossibleCollision();

	def void stop(Action action);

	def void endAction(Action action);

	def void globalTick(FSMClock clock);
	
}

public class RobotFacadeRegistry {

	def public static IRobotFacade getUniqueFacade()
	{
		return _uniqueFacade;
	}
	
	static IRobotFacade _uniqueFacade;
	def public static void registerRobotFacade(IRobotFacade facade)
	{
		_uniqueFacade = facade;
	}
	
}

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

	def public static TFSM getOwningTFSM(MoveForwardAction action) {
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