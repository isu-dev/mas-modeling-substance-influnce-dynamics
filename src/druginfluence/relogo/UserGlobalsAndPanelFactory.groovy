package druginfluence.relogo

import repast.simphony.relogo.factories.AbstractReLogoGlobalsAndPanelFactory

public class UserGlobalsAndPanelFactory extends AbstractReLogoGlobalsAndPanelFactory{
	public void addGlobalsAndPanelComponents(){
		
		addSliderWL("numCivilians", "Number of Civilians", 1, 1, 1000, 700)
		addSliderWL("numDealers", "Number of Dealers", 1, 1, 100, 30)
		addSliderWL("numOfficers", "Number of Officers", 1, 1, 10, 5)
		addSliderWL("numAdvertising", "Number of Advertisments", 1, 1, 10, 5)

		addMonitorWL("remainingDealers", "Remaining Dealers", 5)
		//addMonitorWL("remainingOfficers", "Remaining Officers", 5)
		addMonitorWL("getCurrentNonUsers", "Current Non-Users", 5)
		addMonitorWL("getCurrentCasualUsers", "Current Casual Users", 5)
		addMonitorWL("getCurrentRegularUsers", "Current Regular Users", 5)
	}
}