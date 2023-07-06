package at.scm.designpatterns.creational.abstractfactory.model;

public class BlackAttacker extends BlackCreature implements IAttacker {

	@Override
	public String getAttack() {
		return "Stealth Blade";
	}

	@Override
	public String getRole() {
		return IAttacker.super.getRole();
	}

}
