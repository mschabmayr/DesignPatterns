package at.scm.designpatterns.creational.abstractfactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import at.scm.designpatterns.creational.abstractfactory.model.base.Attacker;
import at.scm.designpatterns.creational.abstractfactory.model.base.Defender;
import at.scm.designpatterns.creational.abstractfactory.model.base.Wall;

class AbstractFactoryTest {

	@Test
	void testBlackAttackType() {
		SummonerApp summonerApp = new SummonerApp("Black");
		Attacker attacker = summonerApp.getAttacker();
		assertNotNull(attacker);
		assertEquals("Snakes", attacker.getAttackType());
	}

	@Test
	void testBlackDefenseMaterial() {
		SummonerApp summonerApp = new SummonerApp("Black");
		Defender defender = summonerApp.getDefender();
		assertNotNull(defender);
		Wall wall = defender.raiseWall();
		assertNotNull(wall);
		assertEquals("Fog", wall.getMaterial());
	}

	@Test
	void testBlueAttackType() {
		SummonerApp summonerApp = new SummonerApp("Blue");
		Attacker attacker = summonerApp.getAttacker();
		assertNotNull(attacker);
		assertEquals("Ice Spear", attacker.getAttackType());
	}

	@Test
	void testBlueDefenseMaterial() {
		SummonerApp summonerApp = new SummonerApp("Blue");
		Defender defender = summonerApp.getDefender();
		assertNotNull(defender);
		Wall wall = defender.raiseWall();
		assertNotNull(wall);
		assertEquals("Ice", wall.getMaterial());
	}

	@Test
	void testRedAttackType() {
		SummonerApp summonerApp = new SummonerApp("Red");
		Attacker attacker = summonerApp.getAttacker();
		assertNotNull(attacker);
		assertEquals("Giant Fireball", attacker.getAttackType());
	}

	@Test
	void testRedDefenseMaterial() {
		SummonerApp summonerApp = new SummonerApp("Red");
		Defender defender = summonerApp.getDefender();
		assertNotNull(defender);
		Wall wall = defender.raiseWall();
		assertNotNull(wall);
		assertEquals("Sand", wall.getMaterial());
	}

}
