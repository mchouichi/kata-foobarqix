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
	
	@Test
	public void containsOnlyMany3Test() {
		Assert.assertTrue(Launcher.applyFooBarQixRules(33).equals("FooFooFoo"));
	}
	
	@Test
	public void dividedOnlyBy5Test() {
		Assert.assertTrue(Launcher.applyFooBarQixRules(10).equals(Launcher.BAR));
	}
	
	@Test
	public void containsOnlyOne5Test() {
		Assert.assertTrue(Launcher.applyFooBarQixRules(59).equals(Launcher.BAR));
	}

}
