package at.scm.designpatterns.creational.abstractfactory;

import at.scm.designpatterns.creational.abstractfactory.model.base.Attacker;
import at.scm.designpatterns.creational.abstractfactory.model.base.Defender;
import at.scm.designpatterns.creational.abstractfactory.model.red.RedAttacker;
import at.scm.designpatterns.creational.abstractfactory.model.red.RedDefender;

public class RedCreatureFactory implements AbstractCreatureFactory {

	@Override
	public Attacker createAttacker() {
		return new RedAttacker();
	}

	@Override
	public Defender createDefender() {
		return new RedDefender();
	}

}
