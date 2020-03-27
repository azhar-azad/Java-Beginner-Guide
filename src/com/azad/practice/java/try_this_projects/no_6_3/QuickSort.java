package com.azad.practice.java.try_this_projects.no_6_3;

public class QuickSort {
	
	// Set up a call to the actual Quicksort method
	public static void qsort(char[] items) {
		qs(items, 0, items.length - 1);
	}

	// A recursive version of Quicksort for characters.
	private static void qs(char[] items, int left, int right) {
		
		int i = left;
		int j = right;
		char x = items[(left + right) / 2];
		
		do {	
			while ((items[i] < x) && (i < right)) {
				i++;
			}
			
			while ((x < items[j]) && (j > left)) {
				j--;
			}
			
			char temp;
			if (i <= j) {
				temp = items[i];
				items[i] = items[j];
				items[j] = temp;
				i++;
				j--;
			}
			
		} while (i <= j);
		
		if (left < j) {
			qs(items, left, j);
		}
		if (i < right) {
			qs(items, i, right);
		}
	}
}
