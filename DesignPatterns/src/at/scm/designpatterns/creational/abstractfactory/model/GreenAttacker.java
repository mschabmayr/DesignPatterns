package at.scm.designpatterns.creational.abstractfactory.model;

public class GreenAttacker extends GreenCreature implements IAttacker {

	@Override
	public String getAttack() {
		return "Wild Roar";
	}

	@Override
	public String getRole() {
		return IAttacker.super.getRole();
	}

}
