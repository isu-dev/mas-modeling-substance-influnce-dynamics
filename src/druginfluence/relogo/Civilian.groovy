package druginfluence.relogo

import static repast.simphony.relogo.Utility.*
import static repast.simphony.relogo.UtilityG.*

import druginfluence.ReLogoTurtle
import repast.simphony.relogo.Plural
import repast.simphony.relogo.Stop
import repast.simphony.relogo.Utility
import repast.simphony.relogo.UtilityG
import repast.simphony.relogo.schedule.Go
import repast.simphony.relogo.schedule.Setup

import repast.simphony.space.grid.Grid
import repast.simphony.space.grid.GridPoint

import druginfluence.relogo.util.*

import repast.simphony.random.RandomHelper

class Civilian extends ReLogoTurtle {	
	def id
	def age
	//def gender
	def usageStatus
	def influencability
	def parentIsUser
	def usageRate = 0
	def lastUsed = 0
	
	def step() {
		right(random(90))
		forward(1.5)
		
		for(Civilian civilian : civiliansHere()) {
			if(civilian.getUsageRate() >= 50) {
				//label = "Try this"
				this.usageRate += 0.2
			}
			else if (civilian.getUsageStatus().equals(UsageStatus.NonUser)) {
				//label = "Don't do drugs"
				this.usageRate -= 0.2
			}
			else {
				label = ""
			}
		}
		
		if(count(dealersHere()) > 0) {
			this.lastUsed = 0
			this.setUsageRate(this.getUsageRate() + this.getInfluencability())
		}
		else {
			lastUsed += 1
		}
			
		if(lastUsed >= 5)
			if(this.getUsageRate() >= 6)
				usageRate -= 5
		
		if(this.getUsageRate() >= 60 && this.getUsageStatus() != UsageStatus.RegularUser) {
			this.setUsageStatus(UsageStatus.RegularUser)
		} else if (this.getUsageRate() >= 10 && this.getUsageStatus() != UsageStatus.CasualUser) { 
			this.setUsageStatus(UsageStatus.CasualUser)
		} else if (this.getUsageRate() < 10 && this.getUsageStatus() != UsageStatus.NonUser) {
			this.setUsageStatus(UsageStatus.NonUser)
		}
		
		if(this.getUsageRate() > 90) {
			hatchDealers(1)
			die()
		}

	}
	
	def create() {
		id = Constants.getCivilianId()
		age = RandomHelper.nextIntFromTo(14, 50)
		color = white()
		def randStatus = random(3)
		
		
		if(randStatus == 2) {
			usageStatus = UsageStatus.RegularUser
		} else if(randStatus == 1) {
			usageStatus = UsageStatus.CasualUser
		} else if(randStatus == 0) {
			usageStatus = UsageStatus.NonUser
		}
		
		//randomly assigning influenceability rate based on age 
		if(age >= 25) {
			influencability = RandomHelper.nextDoubleFromTo(0, 0.5)
		}
		else if(age >= 18) {
			influencability = RandomHelper.nextDoubleFromTo(0.3, 1.0)
		} 
		else {
			influencability = RandomHelper.nextDoubleFromTo(0, 0.7)
			usageStatus = UsageStatus.NonUser
		}
		
		//determining the usage rate based on status
		if(usageStatus == UsageStatus.NonUser) {
			usageRate = RandomHelper.nextIntFromTo(0, 21)
		}
		else if(usageStatus == UsageStatus.CasualUser) {
			usageRate = RandomHelper.nextIntFromTo(21, 60)
		} 
		else {
			usageRate = RandomHelper.nextIntFromTo(61, 100)
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getInfluencability() {
		return influencability;
	}

	public void setInfluencability(double influencability) {
		this.influencability = influencability;
	}

	public String getParentIsUser() {
		return parentIsUser;
	}

	public void setParentIsUser(String parentIsUser) {
		this.parentIsUser = parentIsUser;
	}

	public double getUsageRate() {
		return usageRate;
	}

	public void setUsageRate(double usageRate) {
		this.usageRate = usageRate;
	}
	
	
	
}
