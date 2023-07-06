package at.scm.designpatterns.creational.abstractfactory.model;

public class BlueAttacker extends BlueCreature implements IAttacker {

	@Override
	public String getAttack() {
		return "Crushing Wave";
	}

	@Override
	public String getRole() {
		return IAttacker.super.getRole();
	}

}
