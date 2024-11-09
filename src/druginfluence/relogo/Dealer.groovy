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

class Dealer extends ReLogoTurtle {
	def lastSold = 0
	
	def create() {
		color = red()
	}
	
	def step() {
		def winner = minOneOf(neighbors()) {
			count(officersOn(it))
		} 
		
		face(winner)
		forward(0.5)
		
		if((count(civiliansHere()) > 0) && (count(civiliansHere()) < 3)) {
			label = "Do drugs!"
			lastSold = 0
		}
		else {
			label = ""
			lastSold += 1
		}
		
		if(lastSold > 15)
			die()
	}
}
