package com.azad.practice.java.self_test_projects.chapter_3_9;

public class ForControl {

	private int lowerLimit;
	private int upperLimit;

	public ForControl() {
		super();
	}

	public ForControl(int lowerLimit, int upperLimit) {
		super();
		this.lowerLimit = lowerLimit;
		this.upperLimit = upperLimit;
	}

	private void generateAndDisplayProgression() {

		for (int i = lowerLimit; i <= upperLimit; i *= 2) {
			System.out.print(" " + i);
		}
	}
	
	public void runProgram() {
		generateAndDisplayProgression();
	}
}
