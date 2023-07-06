package at.scm.designpatterns.creational.abstractfactory.model;

public class BlueDefender extends BlueCreature implements IDefender {

	@Override
	public String getDefence() {
		return "Blinding Fog";
	}

	@Override
	public String getRole() {
		return IDefender.super.getRole();
	}

}
