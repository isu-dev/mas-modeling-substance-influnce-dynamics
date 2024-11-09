package druginfluence;

import static repast.simphony.relogo.Utility.*;
import static repast.simphony.relogo.UtilityG.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import groovy.lang.Closure;
import repast.simphony.relogo.*;
import repast.simphony.relogo.builder.GeneratedByReLogoBuilder;
import repast.simphony.relogo.builder.ReLogoBuilderGeneratedFor;

@GeneratedByReLogoBuilder
@SuppressWarnings({"unused","rawtypes","unchecked"})
public class ReLogoLink<T> extends BaseLink<T>	{

	/**
	 * Returns an agentset of advertisings on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of advertisings on patch p
	 */
	@ReLogoBuilderGeneratedFor("druginfluence.relogo.Advertising")
	public AgentSet<druginfluence.relogo.Advertising> advertisingsOn(Patch p){
		AgentSet<druginfluence.relogo.Advertising> result = new AgentSet<druginfluence.relogo.Advertising>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"advertising")){
			if (t instanceof druginfluence.relogo.Advertising)
			result.add((druginfluence.relogo.Advertising)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of advertisings on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of advertisings on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("druginfluence.relogo.Advertising")
	public AgentSet<druginfluence.relogo.Advertising> advertisingsOn(Turtle t){
		AgentSet<druginfluence.relogo.Advertising> result = new AgentSet<druginfluence.relogo.Advertising>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"advertising")){
			if (tt instanceof druginfluence.relogo.Advertising)
			result.add((druginfluence.relogo.Advertising)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of advertisings on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of advertisings on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("druginfluence.relogo.Advertising")
	public AgentSet<druginfluence.relogo.Advertising> advertisingsOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<druginfluence.relogo.Advertising>();
		}

		Set<druginfluence.relogo.Advertising> total = new HashSet<druginfluence.relogo.Advertising>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(advertisingsOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(advertisingsOn(p));
				}
			}
		}
		return new AgentSet<druginfluence.relogo.Advertising>(total);
	}

	/**
	 * Queries if object is a advertising.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a advertising
	 */
	@ReLogoBuilderGeneratedFor("druginfluence.relogo.Advertising")
	public boolean isAdvertisingQ(Object o){
		return (o instanceof druginfluence.relogo.Advertising);
	}

	/**
	 * Returns the advertising with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("druginfluence.relogo.Advertising")
	public druginfluence.relogo.Advertising advertising(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof druginfluence.relogo.Advertising)
			return (druginfluence.relogo.Advertising) turtle;
		return null;
	}

	/**
	 * Returns an agentset containing all advertisings.
	 * 
	 * @return agentset of all advertisings
	 */
	@ReLogoBuilderGeneratedFor("druginfluence.relogo.Advertising")
	public AgentSet<druginfluence.relogo.Advertising> advertisings(){
		AgentSet<druginfluence.relogo.Advertising> a = new AgentSet<druginfluence.relogo.Advertising>();
		for (Object e : this.getMyObserver().getContext().getObjects(druginfluence.relogo.Advertising.class)) {
			if (e instanceof druginfluence.relogo.Advertising){
				a.add((druginfluence.relogo.Advertising)e);
			}
		}
		return a;
	}

	/**
	 * Returns an agentset of civilians on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of civilians on patch p
	 */
	@ReLogoBuilderGeneratedFor("druginfluence.relogo.Civilian")
	public AgentSet<druginfluence.relogo.Civilian> civiliansOn(Patch p){
		AgentSet<druginfluence.relogo.Civilian> result = new AgentSet<druginfluence.relogo.Civilian>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"civilian")){
			if (t instanceof druginfluence.relogo.Civilian)
			result.add((druginfluence.relogo.Civilian)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of civilians on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of civilians on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("druginfluence.relogo.Civilian")
	public AgentSet<druginfluence.relogo.Civilian> civiliansOn(Turtle t){
		AgentSet<druginfluence.relogo.Civilian> result = new AgentSet<druginfluence.relogo.Civilian>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"civilian")){
			if (tt instanceof druginfluence.relogo.Civilian)
			result.add((druginfluence.relogo.Civilian)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of civilians on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of civilians on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("druginfluence.relogo.Civilian")
	public AgentSet<druginfluence.relogo.Civilian> civiliansOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<druginfluence.relogo.Civilian>();
		}

		Set<druginfluence.relogo.Civilian> total = new HashSet<druginfluence.relogo.Civilian>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(civiliansOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(civiliansOn(p));
				}
			}
		}
		return new AgentSet<druginfluence.relogo.Civilian>(total);
	}

	/**
	 * Queries if object is a civilian.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a civilian
	 */
	@ReLogoBuilderGeneratedFor("druginfluence.relogo.Civilian")
	public boolean isCivilianQ(Object o){
		return (o instanceof druginfluence.relogo.Civilian);
	}

	/**
	 * Returns the civilian with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("druginfluence.relogo.Civilian")
	public druginfluence.relogo.Civilian civilian(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof druginfluence.relogo.Civilian)
			return (druginfluence.relogo.Civilian) turtle;
		return null;
	}

	/**
	 * Returns an agentset containing all civilians.
	 * 
	 * @return agentset of all civilians
	 */
	@ReLogoBuilderGeneratedFor("druginfluence.relogo.Civilian")
	public AgentSet<druginfluence.relogo.Civilian> civilians(){
		AgentSet<druginfluence.relogo.Civilian> a = new AgentSet<druginfluence.relogo.Civilian>();
		for (Object e : this.getMyObserver().getContext().getObjects(druginfluence.relogo.Civilian.class)) {
			if (e instanceof druginfluence.relogo.Civilian){
				a.add((druginfluence.relogo.Civilian)e);
			}
		}
		return a;
	}

	/**
	 * Returns an agentset of dealers on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of dealers on patch p
	 */
	@ReLogoBuilderGeneratedFor("druginfluence.relogo.Dealer")
	public AgentSet<druginfluence.relogo.Dealer> dealersOn(Patch p){
		AgentSet<druginfluence.relogo.Dealer> result = new AgentSet<druginfluence.relogo.Dealer>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"dealer")){
			if (t instanceof druginfluence.relogo.Dealer)
			result.add((druginfluence.relogo.Dealer)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of dealers on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of dealers on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("druginfluence.relogo.Dealer")
	public AgentSet<druginfluence.relogo.Dealer> dealersOn(Turtle t){
		AgentSet<druginfluence.relogo.Dealer> result = new AgentSet<druginfluence.relogo.Dealer>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"dealer")){
			if (tt instanceof druginfluence.relogo.Dealer)
			result.add((druginfluence.relogo.Dealer)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of dealers on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of dealers on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("druginfluence.relogo.Dealer")
	public AgentSet<druginfluence.relogo.Dealer> dealersOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<druginfluence.relogo.Dealer>();
		}

		Set<druginfluence.relogo.Dealer> total = new HashSet<druginfluence.relogo.Dealer>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(dealersOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(dealersOn(p));
				}
			}
		}
		return new AgentSet<druginfluence.relogo.Dealer>(total);
	}

	/**
	 * Queries if object is a dealer.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a dealer
	 */
	@ReLogoBuilderGeneratedFor("druginfluence.relogo.Dealer")
	public boolean isDealerQ(Object o){
		return (o instanceof druginfluence.relogo.Dealer);
	}

	/**
	 * Returns the dealer with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("druginfluence.relogo.Dealer")
	public druginfluence.relogo.Dealer dealer(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof druginfluence.relogo.Dealer)
			return (druginfluence.relogo.Dealer) turtle;
		return null;
	}

	/**
	 * Returns an agentset containing all dealers.
	 * 
	 * @return agentset of all dealers
	 */
	@ReLogoBuilderGeneratedFor("druginfluence.relogo.Dealer")
	public AgentSet<druginfluence.relogo.Dealer> dealers(){
		AgentSet<druginfluence.relogo.Dealer> a = new AgentSet<druginfluence.relogo.Dealer>();
		for (Object e : this.getMyObserver().getContext().getObjects(druginfluence.relogo.Dealer.class)) {
			if (e instanceof druginfluence.relogo.Dealer){
				a.add((druginfluence.relogo.Dealer)e);
			}
		}
		return a;
	}

	/**
	 * Returns an agentset of officers on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of officers on patch p
	 */
	@ReLogoBuilderGeneratedFor("druginfluence.relogo.Officer")
	public AgentSet<druginfluence.relogo.Officer> officersOn(Patch p){
		AgentSet<druginfluence.relogo.Officer> result = new AgentSet<druginfluence.relogo.Officer>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"officer")){
			if (t instanceof druginfluence.relogo.Officer)
			result.add((druginfluence.relogo.Officer)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of officers on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of officers on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("druginfluence.relogo.Officer")
	public AgentSet<druginfluence.relogo.Officer> officersOn(Turtle t){
		AgentSet<druginfluence.relogo.Officer> result = new AgentSet<druginfluence.relogo.Officer>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"officer")){
			if (tt instanceof druginfluence.relogo.Officer)
			result.add((druginfluence.relogo.Officer)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of officers on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of officers on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("druginfluence.relogo.Officer")
	public AgentSet<druginfluence.relogo.Officer> officersOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<druginfluence.relogo.Officer>();
		}

		Set<druginfluence.relogo.Officer> total = new HashSet<druginfluence.relogo.Officer>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(officersOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(officersOn(p));
				}
			}
		}
		return new AgentSet<druginfluence.relogo.Officer>(total);
	}

	/**
	 * Queries if object is a officer.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a officer
	 */
	@ReLogoBuilderGeneratedFor("druginfluence.relogo.Officer")
	public boolean isOfficerQ(Object o){
		return (o instanceof druginfluence.relogo.Officer);
	}

	/**
	 * Returns the officer with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("druginfluence.relogo.Officer")
	public druginfluence.relogo.Officer officer(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof druginfluence.relogo.Officer)
			return (druginfluence.relogo.Officer) turtle;
		return null;
	}

	/**
	 * Returns an agentset containing all officers.
	 * 
	 * @return agentset of all officers
	 */
	@ReLogoBuilderGeneratedFor("druginfluence.relogo.Officer")
	public AgentSet<druginfluence.relogo.Officer> officers(){
		AgentSet<druginfluence.relogo.Officer> a = new AgentSet<druginfluence.relogo.Officer>();
		for (Object e : this.getMyObserver().getContext().getObjects(druginfluence.relogo.Officer.class)) {
			if (e instanceof druginfluence.relogo.Officer){
				a.add((druginfluence.relogo.Officer)e);
			}
		}
		return a;
	}

	/**
	 * Returns an agentset of userTurtles on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of userTurtles on patch p
	 */
	@ReLogoBuilderGeneratedFor("druginfluence.relogo.UserTurtle")
	public AgentSet<druginfluence.relogo.UserTurtle> userTurtlesOn(Patch p){
		AgentSet<druginfluence.relogo.UserTurtle> result = new AgentSet<druginfluence.relogo.UserTurtle>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"userTurtle")){
			if (t instanceof druginfluence.relogo.UserTurtle)
			result.add((druginfluence.relogo.UserTurtle)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of userTurtles on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of userTurtles on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("druginfluence.relogo.UserTurtle")
	public AgentSet<druginfluence.relogo.UserTurtle> userTurtlesOn(Turtle t){
		AgentSet<druginfluence.relogo.UserTurtle> result = new AgentSet<druginfluence.relogo.UserTurtle>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"userTurtle")){
			if (tt instanceof druginfluence.relogo.UserTurtle)
			result.add((druginfluence.relogo.UserTurtle)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of userTurtles on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of userTurtles on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("druginfluence.relogo.UserTurtle")
	public AgentSet<druginfluence.relogo.UserTurtle> userTurtlesOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<druginfluence.relogo.UserTurtle>();
		}

		Set<druginfluence.relogo.UserTurtle> total = new HashSet<druginfluence.relogo.UserTurtle>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(userTurtlesOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(userTurtlesOn(p));
				}
			}
		}
		return new AgentSet<druginfluence.relogo.UserTurtle>(total);
	}

	/**
	 * Queries if object is a userTurtle.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a userTurtle
	 */
	@ReLogoBuilderGeneratedFor("druginfluence.relogo.UserTurtle")
	public boolean isUserTurtleQ(Object o){
		return (o instanceof druginfluence.relogo.UserTurtle);
	}

	/**
	 * Returns the userTurtle with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("druginfluence.relogo.UserTurtle")
	public druginfluence.relogo.UserTurtle userTurtle(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof druginfluence.relogo.UserTurtle)
			return (druginfluence.relogo.UserTurtle) turtle;
		return null;
	}

	/**
	 * Returns an agentset containing all userTurtles.
	 * 
	 * @return agentset of all userTurtles
	 */
	@ReLogoBuilderGeneratedFor("druginfluence.relogo.UserTurtle")
	public AgentSet<druginfluence.relogo.UserTurtle> userTurtles(){
		AgentSet<druginfluence.relogo.UserTurtle> a = new AgentSet<druginfluence.relogo.UserTurtle>();
		for (Object e : this.getMyObserver().getContext().getObjects(druginfluence.relogo.UserTurtle.class)) {
			if (e instanceof druginfluence.relogo.UserTurtle){
				a.add((druginfluence.relogo.UserTurtle)e);
			}
		}
		return a;
	}

	/**
	 * Queries if object is a userLink.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a userLink
	 */
	@ReLogoBuilderGeneratedFor("druginfluence.relogo.UserLink")
	public boolean isUserLinkQ(Object o){
		return (o instanceof druginfluence.relogo.UserLink);
	}

	/**
	 * Returns an agentset containing all userLinks.
	 * 
	 * @return agentset of all userLinks
	 */
	@ReLogoBuilderGeneratedFor("druginfluence.relogo.UserLink")
	public AgentSet<druginfluence.relogo.UserLink> userLinks(){
		AgentSet<druginfluence.relogo.UserLink> a = new AgentSet<druginfluence.relogo.UserLink>();
		for (Object e : this.getMyObserver().getContext().getObjects(druginfluence.relogo.UserLink.class)) {
			if (e instanceof druginfluence.relogo.UserLink){
				a.add((druginfluence.relogo.UserLink)e);
			}
		}
		return a;
	}

	/**
	 * Returns the userLink between two turtles.
	 * 
	 * @param oneEnd
	 *            an integer
	 * @param otherEnd
	 *            an integer
	 * @return userLink between two turtles
	 */
	@ReLogoBuilderGeneratedFor("druginfluence.relogo.UserLink")
	public druginfluence.relogo.UserLink userLink(Number oneEnd, Number otherEnd) {
		return (druginfluence.relogo.UserLink)(this.getMyObserver().getNetwork("UserLink").getEdge(turtle(oneEnd),turtle(otherEnd)));
	}

	/**
	 * Returns the userLink between two turtles.
	 * 
	 * @param oneEnd
	 *            a turtle
	 * @param otherEnd
	 *            a turtle
	 * @return userLink between two turtles
	 */
	@ReLogoBuilderGeneratedFor("druginfluence.relogo.UserLink")
	public druginfluence.relogo.UserLink userLink(Turtle oneEnd, Turtle otherEnd) {
		return userLink(oneEnd.getWho(), otherEnd.getWho());
	}

	/**
	 * Returns the value of the global variable numCivilians.
	 *
	 * @return the value of the global variable numCivilians
	 */
	@ReLogoBuilderGeneratedFor("global: numCivilians")
	public Object getNumCivilians(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numCivilians");
	}

	/**
	 * Sets the value of the global variable numCivilians.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numCivilians")
	public void setNumCivilians(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numCivilians",value);
	}

	/**
	 * Returns the value of the global variable numDealers.
	 *
	 * @return the value of the global variable numDealers
	 */
	@ReLogoBuilderGeneratedFor("global: numDealers")
	public Object getNumDealers(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numDealers");
	}

	/**
	 * Sets the value of the global variable numDealers.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numDealers")
	public void setNumDealers(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numDealers",value);
	}

	/**
	 * Returns the value of the global variable numOfficers.
	 *
	 * @return the value of the global variable numOfficers
	 */
	@ReLogoBuilderGeneratedFor("global: numOfficers")
	public Object getNumOfficers(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numOfficers");
	}

	/**
	 * Sets the value of the global variable numOfficers.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numOfficers")
	public void setNumOfficers(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numOfficers",value);
	}

	/**
	 * Returns the value of the global variable numAdvertising.
	 *
	 * @return the value of the global variable numAdvertising
	 */
	@ReLogoBuilderGeneratedFor("global: numAdvertising")
	public Object getNumAdvertising(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numAdvertising");
	}

	/**
	 * Sets the value of the global variable numAdvertising.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numAdvertising")
	public void setNumAdvertising(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numAdvertising",value);
	}


}