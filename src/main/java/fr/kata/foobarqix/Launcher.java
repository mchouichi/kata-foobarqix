package fr.kata.foobarqix;

/**
 * 
 * @author mchouichi Main Class
 *
 */

public class Launcher {

	public final static String FOO = "Foo";

	public final static String BAR = "Bar";

	public static void main(String[] args) {

	}

	public static String applyFooBarQixRules(int numb) {

		StringBuilder msg = new StringBuilder();

		if (numb % 3 == 0) {
			msg.append(FOO);
		}

		Integer.toString(numb).chars().filter(car -> car == '3').forEach(x -> msg.append(FOO));

		return msg.toString();
	}

}
