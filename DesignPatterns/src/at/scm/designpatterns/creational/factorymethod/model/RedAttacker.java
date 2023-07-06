package at.scm.designpatterns.creational.factorymethod.model;

public class RedAttacker extends AbstractCreature {

	@Override
	public String getColour() {
		return "Red";
	}

	@Override
	public String getRole() {
		return "Attacker";
	}

	@Override
	public String getAction() {
		return "Lavaspear";
	}

}
