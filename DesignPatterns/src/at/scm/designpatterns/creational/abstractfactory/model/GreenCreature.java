package at.scm.designpatterns.creational.abstractfactory.model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class GreenCreature extends AbstractCreature {

	@Override
	public String getColour() {
		return "Green";
	}

}
