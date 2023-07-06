package at.scm.designpatterns.creational.abstractfactory.factory;

import at.scm.designpatterns.creational.abstractfactory.model.AbstractCreature;
import at.scm.designpatterns.creational.abstractfactory.model.BlueAttacker;
import at.scm.designpatterns.creational.abstractfactory.model.BlueDefender;

public class BlueCreatureFactory implements AbstractCreatureFactory {

	@Override
	public AbstractCreature createAttacker() {
		return new BlueAttacker();
	}

	@Override
	public AbstractCreature createDefender() {
		return new BlueDefender();
	}

}
