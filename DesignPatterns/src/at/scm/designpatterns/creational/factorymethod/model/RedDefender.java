package at.scm.designpatterns.creational.factorymethod.model;

public class RedDefender extends AbstractCreature {

	@Override
	public String getColour() {
		return "Red";
	}

	@Override
	public String getRole() {
		return "Defender";
	}

	@Override
	public String getAction() {
		return "Flamewall";
	}

}
