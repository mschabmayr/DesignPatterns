package at.scm.designpatterns.creational.abstractfactory.model;

public interface IAttacker {

	String getAttack();

	default String getRole() {
		return "Attacker";
	}
	
}
