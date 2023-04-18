package at.scm.designpatterns.creational.abstractfactory;

import at.scm.designpatterns.creational.abstractfactory.model.base.Attacker;
import at.scm.designpatterns.creational.abstractfactory.model.base.Defender;

public interface AbstractCreatureFactory {
	
	abstract public Attacker createAttacker();
	abstract public Defender createDefender();

}
