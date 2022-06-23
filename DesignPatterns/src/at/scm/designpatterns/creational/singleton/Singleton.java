package at.scm.designpatterns.creational.singleton;

public class Singleton {

	// keep single static instance
	private static Singleton instance;

	private Singleton() {
		// prevent outside access
	}

	public static Singleton sharedInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}
