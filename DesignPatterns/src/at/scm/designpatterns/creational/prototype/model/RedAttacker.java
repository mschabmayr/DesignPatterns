package at.scm.designpatterns.creational.prototype.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RedAttacker extends AbstractCreature implements Prototype<RedAttacker> {

	public static final int MAX_HEALTH = 45;
	public static final String COLOUR_RED = "Red";
	public static final String ROLE_ATTACKER = "Attacker";

	public RedAttacker() {
		super();
		this.setHealth(new Health(MAX_HEALTH));
		this.setColour(new Colour(COLOUR_RED));
		this.setRole(new Role(ROLE_ATTACKER));
	}

	@Override
	public RedAttacker cloneModel() {
		RedAttacker clone = new RedAttacker();
		clone.setPosition(new Position(this.getPosition().getPositionX(), this.getPosition().getPositionY()));
		clone.setHealth(new Health(MAX_HEALTH));
		clone.setColour(new Colour(COLOUR_RED));
		clone.setRole(new Role(ROLE_ATTACKER));

		return clone;
	}

}
