package com.azad.practice.java.try_this_projects.no_3_1;

import java.io.IOException;

public class Help {

	private String[] subject;
	private String[] description;

	public Help() {
		super();
		subject = new String[10];
		description = new String[10];

		subject[0] = "if";
		description[0] = "\tif(condition) statement;\n"
							+ "\telse statement;";

		subject[1] = "switch";
		description[1] = "\tswitch(expression) {\n"
							+ "\t\tcase constant:\n"
								+ "\t\t\tstatement sequence\n"
								+ "\t\t\tbreak;\n"
							+ "\t\t ...\n"
						+ "\t}";
	}
	
	public void printOpeningDialog() {
		System.out.println("Help on: ");
		System.out.println("  1. if (press 1)");
		System.out.println("  2. switch (press 2)");
		System.out.println("Choose one: ");
	}
	
	public char getUserInput() throws IOException {
		
		char userInput = (char) System.in.read();
		return userInput;
	}
	
	private int getHelpIndex(char userInput) {
		
		if (userInput == '1') {
			return 1;
		} else if (userInput == '2') {
			return 2;
		} else {
			return 0;
		}
	}
	
	public void printHelp(char userInput) {
		
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
		
		printOpeningDialog();
		char userInput = getUserInput();
		printHelp(userInput);
	}

}
