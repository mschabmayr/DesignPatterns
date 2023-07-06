package at.scm.designpatterns.creational.prototype.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BlueDefender extends AbstractCreature implements Prototype<BlueDefender> {

	public static final int MAX_HEALTH = 65;
	public static final String COLOUR_BLUE = "Blue";
	public static final String ROLE_DEFENDER = "Defender";

	public BlueDefender() {
		super();
		this.setHealth(new Health(MAX_HEALTH));
		this.setColour(new Colour(COLOUR_BLUE));
		this.setRole(new Role(ROLE_DEFENDER));
	}

	@Override
	public BlueDefender cloneModel() {
		BlueDefender clone = new BlueDefender();
		clone.setPosition(new Position(this.getPosition().getPositionX(), this.getPosition().getPositionY()));
		clone.setHealth(new Health(MAX_HEALTH));
		clone.setColour(new Colour(COLOUR_BLUE));
		clone.setRole(new Role(ROLE_DEFENDER));

		return clone;
	}

}
