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
		numbStr.chars().forEach(car -> {
			if (car == '3') {
				msg.append(FOO);
			} else if (car == '5') {
				msg.append(BAR);
			} else if (car == '7') {
				msg.append(QIX);
			}
		});

		return msg.toString();
	}

}
