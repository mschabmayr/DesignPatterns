package at.scm.designpatterns.creational.factorymethod.factory;

import at.scm.designpatterns.creational.factorymethod.model.AbstractCreature;
import at.scm.designpatterns.creational.factorymethod.model.BlueAttacker;
import at.scm.designpatterns.creational.factorymethod.model.BlueDefender;
import at.scm.designpatterns.creational.factorymethod.model.RedAttacker;
import at.scm.designpatterns.creational.factorymethod.model.RedDefender;

public class CreatureFactory {

	public static AbstractCreature createCreature(String type) {
		AbstractCreature creature;

		switch (type) {
		case "BlueAttacker":
			creature = new BlueAttacker();
			break;
		case "BlueDefender":
			creature = new BlueDefender();
			break;
		case "RedAttacker":
			creature = new RedAttacker();
			break;
		case "RedDefender":
			creature = new RedDefender();
			break;
		default:
			throw new UnsupportedOperationException("Encountered unsupported creature type during creation: " + type);
		}

		return creature;
	}

}
