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

class Advertising extends ReLogoTurtle {
	def create() {
		color = pink()
	}
	
	def step() {
		for(Civilian obj : civiliansHere()) {
			if (obj.getAge() >= 18) {
				obj.setUsageRate(obj.getUsageRate() + obj.getInfluencability())
			} 
		}
	}
	
}
