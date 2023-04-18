package at.scm.designpatterns.creational.abstractfactory;

import at.scm.designpatterns.creational.abstractfactory.model.base.Attacker;
import at.scm.designpatterns.creational.abstractfactory.model.base.Defender;

public class SummonerApp {

	private String faction;
	private Attacker attacker;
	private Defender defender;
	private AbstractCreatureFactory summoningFactory;

	public SummonerApp() {
		super();
	}

	public SummonerApp(String faction) {
		super();
		this.faction = faction;
		this.summonCreatures();
	}

	public String getFaction() {
		return faction;
	}

	public void setFaction(String faction) {
		this.faction = faction;
		this.summonCreatures();
	}

	public Attacker getAttacker() {
		return attacker;
	}

	private void setAttacker(Attacker attacker) {
		this.attacker = attacker;
	}

	public Defender getDefender() {
		return defender;
	}

	private void setDefender(Defender defender) {
		this.defender = defender;
	}

	private void summonCreatures() {
		if (this.summoningFactory == null) {
			initializeSummoningFactory();
		}

		this.setAttacker(this.summoningFactory.createAttacker());
		this.setDefender(this.summoningFactory.createDefender());
	}

	private void initializeSummoningFactory() {
		switch (this.getFaction()) {
		case "Black":
			this.summoningFactory = new BlackCreatureFactory();
			break;
		case "Blue":
			this.summoningFactory = new BlueCreatureFactory();
			break;
		case "Red":
			this.summoningFactory = new RedCreatureFactory();
			break;
		default:
			throw new UnsupportedOperationException("Unsupported faction during summoning: " + this.getFaction());
		}
	}

}
