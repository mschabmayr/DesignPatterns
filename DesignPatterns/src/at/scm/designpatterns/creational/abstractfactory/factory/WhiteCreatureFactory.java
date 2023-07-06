package at.scm.designpatterns.creational.abstractfactory.factory;

import at.scm.designpatterns.creational.abstractfactory.model.AbstractCreature;
import at.scm.designpatterns.creational.abstractfactory.model.WhiteAttacker;
import at.scm.designpatterns.creational.abstractfactory.model.WhiteDefender;

public class WhiteCreatureFactory implements AbstractCreatureFactory {

	@Override
	public AbstractCreature createAttacker() {
		return new WhiteAttacker();
	}

	@Override
	public AbstractCreature createDefender() {
		return new WhiteDefender();
	}

}
