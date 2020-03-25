package com.azad.practice.java.self_test_projects.chapter_3_10;

import java.io.IOException;

public class AsciiLowerUpper {

	private char[] userString;

	public AsciiLowerUpper() {
		super();
		userString = new char[50];
	}

	public AsciiLowerUpper(char[] userString) {
		super();
		this.userString = userString;
	}
	
	private char convert(char ch) {
		if (ch >= 'A' && ch <= 'Z') {
			return ch += 32;
		} else if (ch >= 'a' && ch <= 'z') {
			return ch -= 32;
		} else {
			return ch;
		}
	}
	
	public void runProgram() throws IOException {
		
		char keyStroke = (char) System.in.read();
		
		for (int index = 0; keyStroke != '.'; index++, keyStroke = (char) System.in.read()) {
			userString[index] = convert(keyStroke);		
		}
		
		System.out.println(userString.toString());
	}
}
