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

		StringBuilder msg = new StringBuilder();

		if (numb % 3 == 0) {
			msg.append(FOO);
		}
		if (Integer.toString(numb).contains("3")) {
			msg.append(FOO);
		}
		return msg.toString();
	}

}
