package at.scm.designpatterns.creational.factorymethod.model;

public class BlueDefender extends AbstractCreature {

	@Override
	public String getColour() {
		return "Blue";
	}

	@Override
	public String getRole() {
		return "Defender";
	}

	@Override
	public String getAction() {
		return "Blinding Fog";
	}

}
