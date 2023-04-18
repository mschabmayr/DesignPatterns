package at.scm.designpatterns.creational.abstractfactory.model.black;

import at.scm.designpatterns.creational.abstractfactory.model.base.Attacker;

public class BlackAttacker implements Attacker {

	@Override
	public String getAttackScream() {
		return "Rrrsssrrrsss!";
	}

	@Override
	public String getAttackType() {
		return "Snakes";
	}

}
