package at.scm.designpatterns.creational.abstractfactory.model;

public class WhiteAttacker extends WhiteCreature implements IAttacker {

	@Override
	public String getAttack() {
		return "Thunderbolt";
	}

	@Override
	public String getRole() {
		return IAttacker.super.getRole();
	}

}
