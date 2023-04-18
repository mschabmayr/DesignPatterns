package at.scm.designpatterns.creational.abstractfactory;

import at.scm.designpatterns.creational.abstractfactory.model.base.Attacker;
import at.scm.designpatterns.creational.abstractfactory.model.base.Defender;
import at.scm.designpatterns.creational.abstractfactory.model.black.BlackAttacker;
import at.scm.designpatterns.creational.abstractfactory.model.black.BlackDefender;

public class BlackCreatureFactory implements AbstractCreatureFactory {

	@Override
	public Attacker createAttacker() {
		return new BlackAttacker();
	}

	@Override
	public Defender createDefender() {
		return new BlackDefender();
	}

}
