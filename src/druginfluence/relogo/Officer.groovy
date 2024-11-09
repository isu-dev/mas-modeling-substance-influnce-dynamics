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

class Officer extends ReLogoTurtle {
	
	def create() {
		color = blue()
	}

	def step() {
		def winner = maxOneOf(neighbors()) {
			count(dealersOn(it))
		}
		
		face(winner)
		forward(2)
		
		if(count(dealersHere()) > 0) {
			label = "Caught a dealer!"
			def dealer = oneOf(dealersHere())
			caught(dealer)
		}
		else {
			label = ""
		}
	}
	
	def caught(Dealer dealer) {
		dealer.die()
	}
}
