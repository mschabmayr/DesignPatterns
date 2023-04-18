package at.scm.designpatterns.creational.abstractfactory.model.blue;

import at.scm.designpatterns.creational.abstractfactory.model.base.Defender;
import at.scm.designpatterns.creational.abstractfactory.model.base.Wall;

public class BlueDefender implements Defender {

	@Override
	public Wall raiseWall() {
		return new Wall(15, 12, "Ice", "Sharpness");
	}

}
