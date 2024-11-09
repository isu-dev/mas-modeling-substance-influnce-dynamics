package druginfluence.relogo

import static repast.simphony.relogo.Utility.*;
import static repast.simphony.relogo.UtilityG.*;
import repast.simphony.relogo.Stop;
import repast.simphony.relogo.Utility;
import repast.simphony.relogo.UtilityG;
import repast.simphony.relogo.schedule.Go;
import repast.simphony.relogo.schedule.Setup;
import druginfluence.ReLogoObserver;

import druginfluence.relogo.util.*;

class UserObserver extends ReLogoObserver{
	def currentNonUsers = 0
	def currentCasualUsers = 0
	def currentRegularUsers = 0
	def objId = 1

	@Setup
	def setup() {
		clearAll()
		
		setDefaultShape(Civilian, "person")
		createCivilians(numCivilians) {
			setxy(randomXcor(), randomYcor())
			create()
		}
		
		setDefaultShape(Dealer, "zombie")
		createDealers(numDealers) {
			setxy(randomXcor(), randomYcor())
			size = 2
			create()
		}
		
		setDefaultShape(Officer, "car")
		createOfficers(numOfficers) {
			setxy(randomXcor(), randomYcor())
			size = 2
			create()
		}
		
		setDefaultShape(Advertising, "smiley")
		createOfficers(numOfficers) {
			setxy(randomXcor(), randomYcor())
			size = 2
			create()
		}
	}
	
	@Go
	def go() {
		ask(civilians()) {
			step()
		}
		
		ask (dealers()) {
			step()
		}
		
		ask (officers()) {
			step()
		}
		
		ask(advertisings()) {
			step()
		}
		
		currentNonUsers = 0
		currentCasualUsers = 0
		currentRegularUsers = 0
		
		for(Object obj : Grid.getObjects()) {
			if(obj instanceof Civilian) {
				Civilian civilian = (Civilian) obj
				if(civilian.getUsageStatus() == UsageStatus.NonUser)
					currentNonUsers += 1
				else if(civilian.getUsageStatus() == UsageStatus.CasualUser)
					currentCasualUsers += 1
				else if(civilian.getUsageStatus() == UsageStatus.RegularUser)
					currentRegularUsers += 1
			}
		}
	}
	
	def remainingDealers() {
		count(dealers())
	}
	
	def remainingOfficers() {
		count(officers())
	}
	
	def getCurrentNonUsers() {
		currentNonUsers
	}

	def getCurrentCasualUsers() {
		currentCasualUsers
	}
	
	def getCurrentRegularUsers() {
		currentRegularUsers
	}
}