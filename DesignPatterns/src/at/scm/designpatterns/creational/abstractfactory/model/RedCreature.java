package at.scm.designpatterns.creational.abstractfactory.model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class RedCreature extends AbstractCreature {

	@Override
	public String getColour() {
		return "Red";
	}

}
