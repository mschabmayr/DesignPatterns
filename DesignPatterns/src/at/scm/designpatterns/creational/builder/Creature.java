package at.scm.designpatterns.creational.builder;

import lombok.Getter;

@Getter
public class Creature {

	private Creature(Builder builder) {
		this.colour = builder.colour;
		this.role = builder.role;
		this.action = builder.action;
	}

	private String colour;
	private String role;
	private String action;

	public static class Builder {

		private String colour;
		private String role;
		private String action;

		public Builder() {
			super();
		}

		public Builder colour(String colour) {
			this.colour = colour;
			return this;
		}

		public Builder role(String role) {
			this.role = role;
			return this;
		}

		public Builder action(String action) {
			this.action = action;
			return this;
		}

		public Creature build() {
			return new Creature(this);
		}

	}

}
