package at.scm.designpatterns.creational.singleton;

import java.util.UUID;

public class Singleton {

	// keep single static instance
	private static Singleton instance;

	private UUID id;

	private Singleton() {
		// prevent outside access
		super();
		this.id = UUID.randomUUID();
	}

	public static Singleton sharedInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	public UUID getId() {
		return this.id;
	}

	public String getIdString() {
		return String.valueOf(this.id);
	}

}
