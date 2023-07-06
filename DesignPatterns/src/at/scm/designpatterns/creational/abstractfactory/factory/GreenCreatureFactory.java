package at.scm.designpatterns.creational.abstractfactory.factory;

import at.scm.designpatterns.creational.abstractfactory.model.AbstractCreature;
import at.scm.designpatterns.creational.abstractfactory.model.GreenAttacker;
import at.scm.designpatterns.creational.abstractfactory.model.GreenDefender;

public class GreenCreatureFactory implements AbstractCreatureFactory {

	@Override
	public AbstractCreature createAttacker() {
		return new GreenAttacker();
	}

	@Override
	public AbstractCreature createDefender() {
		return new GreenDefender();
	}

}
