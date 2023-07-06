package at.scm.designpatterns.creational.prototype;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import at.scm.designpatterns.creational.prototype.model.BlueDefender;
import at.scm.designpatterns.creational.prototype.model.Position;
import at.scm.designpatterns.creational.prototype.model.RedAttacker;

class PrototypeTest {

	@Test
	public void testBlueDefenderCloning() {
		BlueDefender creature = new BlueDefender();
		creature.setPosition(new Position());
		creature.getPosition().setPositionX(21);
		creature.getPosition().setPositionY(22);

		BlueDefender clone = creature.cloneModel();

		assertEquals(creature.getPosition().getPositionX(), clone.getPosition().getPositionX());
		assertEquals(creature.getPosition().getPositionY(), clone.getPosition().getPositionY());
	}

	@Test
	public void testRedAttackerCloning() {
		RedAttacker creature = new RedAttacker();
		creature.setPosition(new Position());
		creature.getPosition().setPositionX(55);
		creature.getPosition().setPositionY(56);

		RedAttacker clone = creature.cloneModel();

		assertEquals(creature.getPosition().getPositionX(), clone.getPosition().getPositionX());
		assertEquals(creature.getPosition().getPositionY(), clone.getPosition().getPositionY());
	}

}
