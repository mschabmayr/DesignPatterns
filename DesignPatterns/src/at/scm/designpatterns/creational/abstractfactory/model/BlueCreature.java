package at.scm.designpatterns.creational.abstractfactory.model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class BlueCreature extends AbstractCreature {

	@Override
	public String getColour() {
		return "Blue";
	}

}
