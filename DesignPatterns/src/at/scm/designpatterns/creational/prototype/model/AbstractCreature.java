package at.scm.designpatterns.creational.prototype.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public abstract class AbstractCreature {

	private Position position;
	private Health health;
	private Colour colour;
	private Role role;

}
