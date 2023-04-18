package at.scm.designpatterns.creational.abstractfactory;

import at.scm.designpatterns.creational.abstractfactory.model.base.Attacker;
import at.scm.designpatterns.creational.abstractfactory.model.base.Defender;
import at.scm.designpatterns.creational.abstractfactory.model.blue.BlueAttacker;
import at.scm.designpatterns.creational.abstractfactory.model.blue.BlueDefender;

public class BlueCreatureFactory implements AbstractCreatureFactory {

	@Override
	public Attacker createAttacker() {
		return new BlueAttacker();
	}

	@Override
	public Defender createDefender() {
		return new BlueDefender();
	}

}
