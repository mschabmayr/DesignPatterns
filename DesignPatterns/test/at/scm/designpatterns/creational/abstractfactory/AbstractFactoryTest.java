package at.scm.designpatterns.creational.abstractfactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import at.scm.designpatterns.creational.abstractfactory.factory.AbstractCreatureFactory;
import at.scm.designpatterns.creational.abstractfactory.factory.CreatureFactoryProducer;
import at.scm.designpatterns.creational.abstractfactory.model.AbstractCreature;
import at.scm.designpatterns.creational.abstractfactory.model.IAttacker;
import at.scm.designpatterns.creational.abstractfactory.model.IDefender;

class AbstractFactoryTest {

	@Test
	public void testBlackCreatureCreation() {
		AbstractCreatureFactory factory = CreatureFactoryProducer.getFactory("Black");
		assertCreature(factory.createAttacker(), "Black", "Attacker", "Stealth Blade");
		assertCreature(factory.createDefender(), "Black", "Defender", "All-Consuming Abyss");
	}

	@Test
	public void testBlueCreatureCreation() {
		AbstractCreatureFactory factory = CreatureFactoryProducer.getFactory("Blue");
		assertCreature(factory.createAttacker(), "Blue", "Attacker", "Crushing Wave");
		assertCreature(factory.createDefender(), "Blue", "Defender", "Blinding Fog");
	}

	@Test
	public void testGreenCreatureCreation() {
		AbstractCreatureFactory factory = CreatureFactoryProducer.getFactory("Green");
		assertCreature(factory.createAttacker(), "Green", "Attacker", "Wild Roar");
		assertCreature(factory.createDefender(), "Green", "Defender", "Thornwall");
	}

	@Test
	public void testRedCreatureCreation() {
		AbstractCreatureFactory factory = CreatureFactoryProducer.getFactory("Red");
		assertCreature(factory.createAttacker(), "Red", "Attacker", "Lavaspear");
		assertCreature(factory.createDefender(), "Red", "Defender", "Flamewall");
	}

	@Test
	public void testWhiteCreatureCreation() {
		AbstractCreatureFactory factory = CreatureFactoryProducer.getFactory("White");
		assertCreature(factory.createAttacker(), "White", "Attacker", "Thunderbolt");
		assertCreature(factory.createDefender(), "White", "Defender", "Dancing Blades");
	}

	private static void assertCreature(AbstractCreature creature, String expectedColour, String expectedRole,
			String expectedAction) {
		assertNotNull(creature);
		assertEquals(expectedColour, creature.getColour());
		assertEquals(expectedRole, creature.getRole());

		if (creature instanceof IAttacker) {
			assertAttacker((IAttacker) creature, expectedAction);
		} else if (creature instanceof IDefender) {
			assertDefender((IDefender) creature, expectedAction);
		}
	}

	private static void assertAttacker(IAttacker attacker, String expectedAttack) {
		assertEquals(expectedAttack, attacker.getAttack());
	}

	private static void assertDefender(IDefender defender, String expectedDefence) {
		assertEquals(expectedDefence, defender.getDefence());
	}

}
