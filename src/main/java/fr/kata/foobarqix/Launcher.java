package fr.kata.foobarqix;

/**
 * 
 * @author mchouichi Main Class
 *
 */

public class Launcher {

	public final static String FOO = "Foo";

	public static void main(String[] args) {

	}

	public static String applyFooBarQixRules(int numb) {

		if (numb % 3 == 0) {
			return FOO;
		}
		return null;
	}

}
