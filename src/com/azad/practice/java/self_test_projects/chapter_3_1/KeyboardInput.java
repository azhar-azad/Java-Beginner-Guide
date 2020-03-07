package com.azad.practice.java.self_test_projects.chapter_3_1;

import java.io.IOException;

public class KeyboardInput {

	private int spaceCount;

	public KeyboardInput() {
		super();
		this.spaceCount = 0;
	}

	private void processUserInput() throws IOException {

		char userInput;

		do {
			userInput = (char) System.in.read();
			if (userInput == ' ') {
				spaceCount++;
			}
		} while (userInput != '.');
	}
	
	public void runProgram() throws IOException {
		System.out.println("Enter a period to stop.");
		processUserInput();
		System.out.println("Spaces: " + spaceCount);
	}
}
