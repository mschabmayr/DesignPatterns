package at.scm.designpatterns.creational.abstractfactory.factory;

import at.scm.designpatterns.creational.abstractfactory.model.AbstractCreature;
import at.scm.designpatterns.creational.abstractfactory.model.RedAttacker;
import at.scm.designpatterns.creational.abstractfactory.model.RedDefender;

public class RedCreatureFactory implements AbstractCreatureFactory {

	@Override
	public AbstractCreature createAttacker() {
		return new RedAttacker();
	}

	@Override
	public AbstractCreature createDefender() {
		return new RedDefender();
	}

}
