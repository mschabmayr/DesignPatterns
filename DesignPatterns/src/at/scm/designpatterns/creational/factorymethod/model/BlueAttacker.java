package at.scm.designpatterns.creational.factorymethod.model;

public class BlueAttacker extends AbstractCreature {

	@Override
	public String getColour() {
		return "Blue";
	}

	@Override
	public String getRole() {
		return "Attacker";
	}

	@Override
	public String getAction() {
		return "Crushing Wave";
	}

}
