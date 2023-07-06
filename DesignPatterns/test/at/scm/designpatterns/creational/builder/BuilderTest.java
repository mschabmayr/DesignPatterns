package at.scm.designpatterns.creational.builder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class BuilderTest {

	@Test
	public void testBlueAttackerCreation() {
		Creature creature = new Creature.Builder().colour("Blue").role("Attacker").action("Crushing Wave").build();
		assertCreature(creature, "Blue", "Attacker", "Crushing Wave");
	}

	@Test
	public void testBlueDefenderCreation() {
		Creature creature = new Creature.Builder().colour("Blue").role("Defender").action("Blinding Fog").build();
		assertCreature(creature, "Blue", "Defender", "Blinding Fog");
	}

	@Test
	public void testRedAttackerCreation() {
		Creature creature = new Creature.Builder().colour("Red").role("Attacker").action("Lavaspear").build();
		assertCreature(creature, "Red", "Attacker", "Lavaspear");
	}

	@Test
	public void testRedDefenderCreation() {
		Creature creature = new Creature.Builder().colour("Red").role("Defender").action("Flamewall").build();
		assertCreature(creature, "Red", "Defender", "Flamewall");
	}

	private static void assertCreature(Creature creature, String expectedColour, String expectedRole,
			String expectedAction) {
		assertNotNull(creature);
		assertEquals(expectedColour, creature.getColour());
		assertEquals(expectedRole, creature.getRole());
		assertEquals(expectedAction, creature.getAction());
	}

}
