package at.scm.designpatterns.creational.singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class SingletonTest {

	@Test
	void testSingleton() {
		Singleton singleton1 = Singleton.sharedInstance();
		Singleton singleton2 = Singleton.sharedInstance();
		assertNotNull(singleton1);
		assertNotNull(singleton2);
		assertEquals(singleton1, singleton2);
		assertEquals(singleton1.getId(), singleton2.getId());
	}

}
