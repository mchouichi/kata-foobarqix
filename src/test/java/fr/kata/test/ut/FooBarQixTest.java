package fr.kata.test.ut;

import org.junit.Assert;
import org.junit.Test;

import fr.kata.foobarqix.Launcher;

/**
 * 
 * @author mchouichi Unit Test Class
 *
 */

public class FooBarQixTest {

	@Test
	public void dividedOnlyBy3Test() {
		Assert.assertTrue(Launcher.applyFooBarQixRules(9).equals(Launcher.FOO));
	}
	
	@Test
	public void containsOnlyOne3Test() {
		Assert.assertTrue(Launcher.applyFooBarQixRules(13).equals(Launcher.FOO));
	}

}
