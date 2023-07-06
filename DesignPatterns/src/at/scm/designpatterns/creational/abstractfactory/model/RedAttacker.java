package at.scm.designpatterns.creational.abstractfactory.model;

public class RedAttacker extends RedCreature implements IAttacker {

	@Override
	public String getAttack() {
		return "Lavaspear";
	}

	@Override
	public String getRole() {
		return IAttacker.super.getRole();
	}

}
