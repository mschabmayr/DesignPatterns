package at.scm.designpatterns.creational.abstractfactory.model;

public class GreenDefender extends GreenCreature implements IDefender {

	@Override
	public String getDefence() {
		return "Thornwall";
	}

	@Override
	public String getRole() {
		return IDefender.super.getRole();
	}

}
