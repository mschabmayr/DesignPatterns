package at.scm.designpatterns.creational.abstractfactory.model;

public class BlackDefender extends BlackCreature implements IDefender {

	@Override
	public String getDefence() {
		return "All-Consuming Abyss";
	}

	@Override
	public String getRole() {
		return IDefender.super.getRole();
	}

}
