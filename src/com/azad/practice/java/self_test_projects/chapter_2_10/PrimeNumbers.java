package com.azad.practice.java.self_test_projects.chapter_2_10;

public class PrimeNumbers {

	private int lowerLimit;
	private int upperLimit;

	public PrimeNumbers() {
		super();
	}

	public PrimeNumbers(int lowerLimit, int upperLimit) {
		super();
		this.lowerLimit = lowerLimit;
		this.upperLimit = upperLimit;
	}

	public String getAllPrimes(int lowerLimit, int upperLimit) {

		if (lowerLimit < 2) {
			lowerLimit = 2;
		}

		String primeString = "";

		for (int i = lowerLimit; i <= upperLimit; i++) {

			boolean canBePrime = true;
			boolean isPrime = true;

			if ((i % 2) == 0 && (i % 3) == 0 && (i % 5) == 0 && (i % 7) == 0 && (i != 2)) {
				canBePrime = false;
				isPrime = false;
			}

			if (canBePrime) {
				int sqrtOfI = (int) Math.sqrt(i);
				for (int j = 2; j <= sqrtOfI; j++) {
					if (i % j == 0) {
						isPrime = false;
						break;
					}
				}

				if (isPrime) {
					primeString += (" " + i);
				}
			}

		}

		return primeString;
	}
}
