package at.scm.designpatterns.creational.abstractfactory.factory;

import at.scm.designpatterns.creational.abstractfactory.model.AbstractCreature;

public interface AbstractCreatureFactory {

	AbstractCreature createAttacker();

	AbstractCreature createDefender();

}
