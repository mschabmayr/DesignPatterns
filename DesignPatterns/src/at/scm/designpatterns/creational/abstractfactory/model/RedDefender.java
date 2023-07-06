package at.scm.designpatterns.creational.abstractfactory.model;

public class RedDefender extends RedCreature implements IDefender {

	@Override
	public String getDefence() {
		return "Flamewall";
	}

	@Override
	public String getRole() {
		return IDefender.super.getRole();
	}

}
