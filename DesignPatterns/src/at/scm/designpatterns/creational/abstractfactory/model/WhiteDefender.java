package at.scm.designpatterns.creational.abstractfactory.model;

public class WhiteDefender extends WhiteCreature implements IDefender {

	@Override
	public String getDefence() {
		return "Dancing Blades";
	}

	@Override
	public String getRole() {
		return IDefender.super.getRole();
	}

}
