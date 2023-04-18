package at.scm.designpatterns.creational.abstractfactory.model.red;

import at.scm.designpatterns.creational.abstractfactory.model.base.Defender;
import at.scm.designpatterns.creational.abstractfactory.model.base.Wall;

public class RedDefender implements Defender {

	@Override
	public Wall raiseWall() {
		return new Wall(30, 8, "Sand", "Quicksand");
	}

}
