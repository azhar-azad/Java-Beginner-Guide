package com.azad.practice.java.self_test_projects;

import java.io.IOException;

import com.azad.practice.java.self_test_projects.chapter_2_10.PrimeNumbers;
import com.azad.practice.java.self_test_projects.chapter_3_1.KeyboardInput;

public class SelfTestProjectsMainClass {

	public static void main(String[] args) throws IOException {

//		/*
//		 * Self Test Chapter 2 No 10 - Write a program that finds all of the prime
//		 * numbers between 2 and 100
//		 */
//		System.out.println("Self Test Chapter 2 No 10");
//		PrimeNumbers primeNumber = new PrimeNumbers();
//		System.out.println(primeNumber.getAllPrimes(1, 1000));
//		System.out.println();

		/*
		 * Self Test Chapter 3 No 1 - Write a program that reads characters from the
		 * keyboard until a period is received. Have the program count the number of
		 * spaces. Report the total at the end of the program.
		 */
		System.out.println("Self Test Chapter 3 No 1");
		KeyboardInput keyboardInput = new KeyboardInput();
		keyboardInput.runProgram();
		System.out.println();
	}

}
