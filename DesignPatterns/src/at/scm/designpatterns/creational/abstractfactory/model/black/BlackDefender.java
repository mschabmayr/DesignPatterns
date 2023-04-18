package at.scm.designpatterns.creational.abstractfactory.model.black;

import at.scm.designpatterns.creational.abstractfactory.model.base.Defender;
import at.scm.designpatterns.creational.abstractfactory.model.base.Wall;

public class BlackDefender implements Defender {

	@Override
	public Wall raiseWall() {
		return new Wall(50, 3, "Fog", "Nausea");
	}

}
