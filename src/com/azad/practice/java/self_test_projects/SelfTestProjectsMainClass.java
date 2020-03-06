package com.azad.practice.java.self_test_projects;

import com.azad.practice.java.self_test_projects.chapter_2_10.PrimeNumbers;

public class SelfTestProjectsMainClass {

	public static void main(String[] args) {

		/*
		 * Self Test Chapter 2 No 10 - Write a program that finds all of the prime
		 * numbers between 2 and 100
		 */
		System.out.println("Self Test Chapter 2 No 10");
		PrimeNumbers primeNumber = new PrimeNumbers();
		System.out.println(primeNumber.getAllPrimes(1, 1000));
		System.out.println();
	}

}
