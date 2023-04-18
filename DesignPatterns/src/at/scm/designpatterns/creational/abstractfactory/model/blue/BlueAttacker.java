package at.scm.designpatterns.creational.abstractfactory.model.blue;

import at.scm.designpatterns.creational.abstractfactory.model.base.Attacker;

public class BlueAttacker implements Attacker {

	@Override
	public String getAttackScream() {
		return "Heyooo!";
	}

	@Override
	public String getAttackType() {
		return "Ice Spear";
	}

}
