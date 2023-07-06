package at.scm.designpatterns.creational.factorymethod;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import at.scm.designpatterns.creational.factorymethod.factory.CreatureFactory;
import at.scm.designpatterns.creational.factorymethod.model.AbstractCreature;

class FactoryMethodTest {

	@Test
	public void testBlueAttackerCreation() {
		AbstractCreature creature = CreatureFactory.createCreature("BlueAttacker");
		assertCreature(creature, "Blue", "Attacker", "Crushing Wave");
	}

	@Test
	public void testBlueDefenderCreation() {
		AbstractCreature creature = CreatureFactory.createCreature("BlueDefender");
		assertCreature(creature, "Blue", "Defender", "Blinding Fog");
	}

	@Test
	public void testRedAttackerCreation() {
		AbstractCreature creature = CreatureFactory.createCreature("RedAttacker");
		assertCreature(creature, "Red", "Attacker", "Lavaspear");
	}

	@Test
	public void testRedDefenderCreation() {
		AbstractCreature creature = CreatureFactory.createCreature("RedDefender");
		assertCreature(creature, "Red", "Defender", "Flamewall");
	}

	private static void assertCreature(AbstractCreature creature, String expectedColour, String expectedRole,
			String expectedAction) {
		assertNotNull(creature);
		assertEquals(expectedColour, creature.getColour());
		assertEquals(expectedRole, creature.getRole());
		assertEquals(expectedAction, creature.getAction());
	}

}
