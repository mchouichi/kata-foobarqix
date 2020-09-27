package fr.kata.foobarqix;

/**
 * 
 * @author mchouichi Main Class
 *
 */

public class Launcher {

	public final static String FOO = "Foo";

	public final static String BAR = "Bar";

	public final static String QIX = "Qix";

	public static void main(String[] args) {

	}

	public static String applyFooBarQixRules(int numb) {

		StringBuilder msg = new StringBuilder();

		if (numb % 3 == 0) {
			msg.append(FOO);
		}

		if (numb % 5 == 0) {
			msg.append(BAR);
		}

		String numbStr = Integer.toString(numb);
		numbStr.chars().filter(car -> car == '3').forEach(x -> msg.append(FOO));

		numbStr.chars().filter(car -> car == '5').forEach(x -> msg.append(BAR));

		numbStr.chars().filter(car -> car == '7').forEach(x -> msg.append(QIX));

		return msg.toString();
	}

}
