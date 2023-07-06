package at.scm.designpatterns.creational.abstractfactory.factory;

import at.scm.designpatterns.creational.abstractfactory.model.AbstractCreature;
import at.scm.designpatterns.creational.abstractfactory.model.BlackAttacker;
import at.scm.designpatterns.creational.abstractfactory.model.BlackDefender;

public class BlackCreatureFactory implements AbstractCreatureFactory {

	@Override
	public AbstractCreature createAttacker() {
		return new BlackAttacker();
	}

	@Override
	public AbstractCreature createDefender() {
		return new BlackDefender();
	}

}
