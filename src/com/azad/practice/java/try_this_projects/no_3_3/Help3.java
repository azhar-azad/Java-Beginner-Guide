package com.azad.practice.java.try_this_projects.no_3_3;

import java.io.IOException;

public class Help3 {

	private String[] subject;
	private String[] description;

	public Help3() {
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

		subject[5] = "break";
		description[5] = "\tbreak; or break label;";

		subject[6] = "continue";
		description[6] = "\tcontinue; or continue label;";
	}

	private void printOpeningDialog() {
		System.out.println("Help on: ");
		System.out.println("  1. if (press 1)");
		System.out.println("  2. switch (press 2)");
		System.out.println("  3. for (press 3)");
		System.out.println("  4. while (press 4)");
		System.out.println("  5. do-while (press 5)");
		System.out.println("  6. break (press 6)");
		System.out.println("  7. continue (press 7)");
		System.out.println("Choose one (q to quit): ");
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

		} while (userInput < '1' | userInput > '7' & userInput != 'q');

		return userInput;
	}

	private int getHelpIndex(char userInput) {

		switch (userInput) {
		case '1':
			return 1;
		case '2':
			return 2;
		case '3':
			return 3;
		case '4':
			return 4;
		case '5':
			return 5;
		case '6':
			return 6;
		case '7':
			return 7;
		default:
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
	
	private void printDivider() {
		System.out.println("\n=================================\n");
	}

	public void runProgram() throws IOException {

		for (;;) {
			char userInput = getUserInput();

			if (userInput == 'q') {
				break;
			}

			printHelp(userInput);
			printDivider();
		}
	}
}
