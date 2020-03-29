package com.azad.practice.java.self_test_projects;

import java.io.IOException;

import com.azad.practice.java.self_test_projects.chapter_2_10.PrimeNumbers;
import com.azad.practice.java.self_test_projects.chapter_3_1.KeyboardInput;
import com.azad.practice.java.self_test_projects.chapter_3_10.AsciiLowerUpper;
import com.azad.practice.java.self_test_projects.chapter_3_9.ForControl;
import com.azad.practice.java.self_test_projects.chapter_5_4.BubbleSort;
import com.azad.practice.java.self_test_projects.chapter_5_7.XorEncryption;
import com.azad.practice.java.self_test_projects.chapter_6_3.Stack;
import com.azad.practice.java.self_test_projects.chapter_7_2.Circle;

public class SelfTestProjectsMainClass {

	private static Stack stack4;

	public static void main(String[] args) throws IOException {

//		/*
//		 * Self Test Chapter 2 No 10 - Write a program that finds all of the prime
//		 * numbers between 2 and 100
//		 */
//		System.out.println("Self Test Chapter 2 No 10");
//		PrimeNumbers primeNumber = new PrimeNumbers();
//		System.out.println(primeNumber.getAllPrimes(1, 1000));
//		System.out.println();

//		/*
//		 * Self Test Chapter 3 No 1 - Write a program that reads characters from the
//		 * keyboard until a period is received. Have the program count the number of
//		 * spaces. Report the total at the end of the program.
//		 */
//		System.out.println("Self Test Chapter 3 No 1");
//		KeyboardInput keyboardInput = new KeyboardInput();
//		keyboardInput.runProgram();
//		System.out.println();

//		/*
//		 * Self Test Chapter 3 No 9 - Write a program that uses a for loop to generate
//		 * and display the progression 1, 2, 4, 8, 16, 32, and so on,
//		 */
//		System.out.println("Self Test Chapter 3 No 9");
//		ForControl forControl = new ForControl(1, 1000);
//		forControl.runProgram();
//		System.out.println();

//		/*
//		 * Self Test Chapter 3 No 10 - Write a program that reads characters from the
//		 * keyboard. Have it convert all lower case letters to upper case, and vice
//		 * versa, displaying the result. Make no change to any other character.
//		 */
//		System.out.println("Self Test Chapter 3 No 10");
//		AsciiLowerUpper converter = new AsciiLowerUpper();
//		converter.runProgram();
//		System.out.println();

//		/*
//		 * Self Test Chapter 5 No 4 - Create a BubbleSort class that can sort an array
//		 * of Strings
//		 * [[ Strings will be sorted ignoring case ]]
//		 */
//		System.out.println("Self Test Chapter 5 No 4");
//		String[] strs = { "azad", "akib", "shawon", "Tipu", "ripon" };
//		BubbleSort bubbleSort = new BubbleSort(strs);
//		System.out.println(bubbleSort.getSize());
//		bubbleSort.printUnsorted();
//		bubbleSort.sort();
//		bubbleSort.printSorted();
		
//		/*
//		 * Self Test Chapter 5 No 7 - XOR encryption
//		 */
//		System.out.println("Self Test Chapter 5 No 7");
//		XorEncryption cipher = new XorEncryption("This is a test", "azadakib");
//		System.out.print("original: ");
//		cipher.showOriginal();
//		System.out.print("encrypted: ");
//		cipher.showEncryptedMsg();
//		System.out.print("decrypted: ");
//		cipher.showDecryptedMsg();
//		
//		cipher.encrypt();
//		System.out.print("encrypted: ");
//		cipher.showEncryptedMsg();
//		System.out.print("decrypted: ");
//		cipher.showDecryptedMsg();
//		
//		cipher.decrypt();
//		System.out.print("encrypted: ");
//		cipher.showEncryptedMsg();
//		System.out.print("decrypted: ");
//		cipher.showDecryptedMsg();
		
//		/*
//		 * Self Test Chapter 6 No 3 - Stack implementation
//		 */
//		System.out.println("Self Test Chapter 6 No 3");
//		
//		Stack stack1 = new Stack();
//		Stack stack2 = new Stack(5);
//		char[] chars = {'a', 'b', 'c', 'd', 'e'};
//		Stack stack3 = new Stack(chars);
//		
//		System.out.println("stack1 size: " + stack1.size());
//		System.out.println("stack2 size: " + stack2.size());
//		System.out.println("stack3 size: " + stack3.size());
//		
//		for (int i = 0; i < 3; i++) {
//			stack1.push(chars[i]);
//			stack2.push(chars[i]);
//			stack3.push(chars[i]);
//		}
//		
//		for (int i = 0; i < 3; i++) {
//			System.out.println("stack1 pop: " + stack1.pop());
//			System.out.println("stack2 pop: " + stack2.pop());
//			System.out.println("stack3 pop: " + stack3.pop());
//		}
		
		/*
		 * Self Test Chapter 7 No 2 - Inheriting TwoDShape with Circle
		 */
		System.out.println("Self Test Chapter 7 No 2");
		Circle circle = new Circle(5);
		System.out.println("Area of circle: " + circle.area());
	}

}
