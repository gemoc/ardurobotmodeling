import 'platform:/resource/org.gemoc.ardurobotml.model/model/Ardurobotml.ecore'
import 'http://www.eclipse.org/emf/2002/Ecore'

ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"
--ECLimport "platform:/resource/org.gemoc.sample.robotml.moc.lib/MoC.ccslLib"

package ardurobotml


	/*
	 * 
	 * Clock definitions
	 * 
	 */

	context FSMClock
    	def: tickClock: Event = self.ticks()
    	

	context TFSM
		def: initializeEvent: Event = self.initialize()
   	
	    		    	
	context Action
		def: beginClock: Event = self.begin()
		def: endClock: Event = self.end()
	    		    		 				 
			 
	context State
     	def : enteringClock: Event = self.onEnter()
     	def : leavingClock: Event = self.onLeave()


	context Transition
		def: fireClock: Event = self.fire()
	 
	 
	 context FSMEvent
	 	def: happenedClock: Event = self
	 	 
	 
--	 context EvaluateGuard
--	 	def: okClock: Event = self
--	 	def: nokClock: Event = self
	 	
	 
------------------------------------------------------------------------------------------
	    	
	    	
	/*
	 * 
	 * Invariant definitions
	 * 
	 */
	 
	 context FSMEvent
	 
	 	inv noTickingUntilFSMInitialized:
			let initClock: Event = self.oclAsType(ecore::EObject).eContainer().oclAsType(ardurobotml::TFSM).initializeEvent in
			let firstHappenedClock: Event = Expression OneTickAndNoMore(self.happenedClock) in
	 		Relation Precedes(initClock, firstHappenedClock)

	 
	context Action
	
		-- begin always happens before end.
		inv beginThenEndInvariant:
			Relation Alternates(self.beginClock, self.endClock) 

		-- begin can only tick when the previous action ended.
	 	inv tickAfterLast:
	 		((self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(ardurobotml::State))
	 		and (self.oclAsType(ecore::EObject).eContainer().oclAsType(ardurobotml::State).actions->first() <> self))
	 		implies
				let lastEndClock: Event = self
											.oclAsType(ecore::EObject)
											.eContainer()
											.oclAsType(ardurobotml::State)
											.actions->at(self
															.oclAsType(ecore::EObject)
															.eContainer()
															.oclAsType(ardurobotml::State)
															.actions->indexOf(self)-1)
											.oclAsType(ardurobotml::Action)
											.endClock in
				(Relation Precedes(lastEndClock, self.beginClock))
	    	
	    			
	context TFSM
	
		-- The initialize clock SHOULD tick only ONCE.
		inv initializeOnlyOnceInvariant:
			let oneTickOnlyClock : Event = Expression OneTickAndNoMore(self.initializeEvent) in
			Relation Coincides(self.initializeEvent, oneTickOnlyClock)	
	
		-- The initialize clock MUST tick before ANY entering clock' states.
		inv initFirstInvariant:
			Relation Precedes(self.initializeEvent, self.initialState.oclAsType(ardurobotml::State).enteringClock)

		inv oneTransitionAtATime:
			Relation Exclusion(self.ownedStates.outgoingTransitions->selectByType(ardurobotml::Transition).fireClock)


	context State
	
		-- The entering clock MUST precede the leaving clock.
		inv enterThenLeaveInvariant:
			Relation Alternates(self.enteringClock, self.leavingClock) 
	
		-- Only one action can execute at a single time.
		inv oneActionAtATime:
			Relation Exclusion(self.actions->selectByType(ardurobotml::Action).beginClock)

		-- entering always happens before the first action begins.
	 	inv tickWhenEnteringState:
			(self.actions->size() > 0)
			implies	 	
				let firstBegin: Event = self.actions->first().oclAsType(ardurobotml::Action).beginClock in
		 		Relation Precedes(self.enteringClock, firstBegin)

		inv leaveWhenOneTransitionFires:
			(self.outgoingTransitions->size() > 0)
			implies
				let allOutgoingTransition : Event = Expression Union(self.outgoingTransitions->selectByType(ardurobotml::Transition).fireClock) in
				Relation Coincides(allOutgoingTransition, self.leavingClock)
				
		inv enterWhenOneTransitionFires:
			(self.incomingTransitions->size() > 0) 
			implies
				let allInputTransition : Event = Expression Union(self.incomingTransitions->selectByType(ardurobotml::Transition).fireClock) in
				Relation Precedes(allInputTransition, self.enteringClock)
		
		
	context Transition
	
		inv fireWhenLasActionEnds:
			(self.ownedGuard <> null
			and self.ownedGuard.oclIsKindOf(ardurobotml::EvaluateGuard)
			and self.ownedGuard.oclAsType(ardurobotml::EvaluateGuard).condition.oclIsKindOf(ardurobotml::AllActionFinishedCondition))
			implies
				let lastEndClock: Event = self.source.actions->last().oclAsType(ardurobotml::Action).endClock in
				(Relation Precedes(lastEndClock, self.fireClock))

		inv fireWhenEventHappens:
			(self.ownedGuard <> null
			and self.ownedGuard.oclIsKindOf(ardurobotml::EventGuard))
			implies
				let eventHappenedClock: Event = self.ownedGuard.oclAsType(ardurobotml::EventGuard).triggeringEvent.oclAsType(ardurobotml::FSMEvent).happenedClock in
				let sensitiveEvent: Event = Expression SampledOn(self.source.oclAsType(ardurobotml::State).enteringClock, eventHappenedClock) in
				(Relation Coincides(sensitiveEvent, self.fireClock))				

		inv fireWhenNoGuard:
			(self.ownedGuard = null)
			implies
				let leavingClock: Event = self.source.oclAsType(ardurobotml::State).leavingClock in
				(Relation Coincides(leavingClock, self.fireClock))				
							
endpackage