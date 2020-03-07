package com.azad.practice.java.try_this_projects.no_3_2;

import java.io.IOException;

public class Help2 {

	private String[] subject;
	private String[] description;

	public Help2() {
		super();
		subject = new String[10];
		description = new String[10];

		populateHelpData();
	}

	private void populateHelpData() {

		subject[0] = "if";
		description[0] = "\tif(condition) statement;\n" + "\telse statement;";

		subject[1] = "switch";
		description[1] = "\tswitch(expression) {\n" + "\t\tcase constant:\n" + "\t\t\tstatement sequence\n"
				+ "\t\t\tbreak;\n" + "\t\t ...\n" + "\t}";

		subject[2] = "for";
		description[2] = "\tfor(init; condition; iteration) {\n" + "\t\tstatement(s);\n" + "\t}";

		subject[3] = "while";
		description[3] = "\twhile(condition) {\n" + "\t\tstatement(s);\n" + "\t}";

		subject[4] = "do-while";
		description[4] = "\tdo {\n" + "\t\tstatement(s);\n" + "\t} while(condition);";
	}

	private void printOpeningDialog() {
		System.out.println("Help on: ");
		System.out.println("  1. if (press 1)");
		System.out.println("  2. switch (press 2)");
		System.out.println("  3. for (press 3)");
		System.out.println("  4. while (press 4)");
		System.out.println("  5. do-while (press 5)");
		System.out.println("Choose one: ");
	}

	private char getUserInput() throws IOException {

		char userInput;

		do {
			printOpeningDialog();

			userInput = (char) System.in.read();

			char ignore;
			do {
				ignore = (char) System.in.read();
			} while (ignore != '\n');

		} while (userInput < '1' | userInput > '5');

		return userInput;
	}

	private int getHelpIndex(char userInput) {

		if (userInput == '1') {
			return 1;
		} else if (userInput == '2') {
			return 2;
		} else if (userInput == '3') {
			return 3;
		} else if (userInput == '4') {
			return 4;
		} else if (userInput == '5') {
			return 5;
		} else {
			return 0;
		}
	}

	private void printHelp(char userInput) {

		int helpIndex = getHelpIndex(userInput);

		if (helpIndex == 0) {
			System.out.println("Invalid input");
			return;
		}

		System.out.println(subject[helpIndex - 1]);
		System.out.println("========");
		System.out.println(description[helpIndex - 1]);
	}

	public void runProgram() throws IOException {

		char userInput = getUserInput();
		printHelp(userInput);
	}

}
