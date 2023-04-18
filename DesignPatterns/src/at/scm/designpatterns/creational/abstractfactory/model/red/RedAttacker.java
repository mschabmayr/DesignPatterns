package at.scm.designpatterns.creational.abstractfactory.model.red;

import at.scm.designpatterns.creational.abstractfactory.model.base.Attacker;

public class RedAttacker implements Attacker {

	@Override
	public String getAttackScream() {
		return "Raaaaaagh!";
	}

	@Override
	public String getAttackType() {
		return "Giant Fireball";
	}

}
