package at.scm.designpatterns.creational.abstractfactory.model;

public interface IDefender {

	String getDefence();

	default String getRole() {
		return "Defender";
	}
	
}
