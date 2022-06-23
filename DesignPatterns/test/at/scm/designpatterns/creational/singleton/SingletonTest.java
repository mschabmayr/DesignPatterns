package at.scm.designpatterns.creational.singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import at.scm.designpatterns.creational.singleton.Singleton;

class SingletonTest {

	@Test
	void testSingleton() {
		Singleton singleton1 = Singleton.sharedInstance();
		Singleton singleton2 = Singleton.sharedInstance();
		assertEquals(singleton2, singleton1);
	}

}
