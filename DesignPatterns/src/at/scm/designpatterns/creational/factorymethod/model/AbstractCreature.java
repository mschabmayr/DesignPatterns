package at.scm.designpatterns.creational.factorymethod.model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class AbstractCreature {

	public abstract String getColour();

	public abstract String getRole();

	public abstract String getAction();

}
