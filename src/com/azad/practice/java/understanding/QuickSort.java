package com.azad.practice.java.understanding;

public class QuickSort {

	// Set up a call to the actual Quicksort method
		public static void qsort(int[] items) {
			qs(items, 0, items.length - 1);
		}

		// A recursive version of Quicksort for characters.
		private static void qs(int[] items, int left, int right) {
			
			int i = left;
			int j = right;
			int comparand = items[(left + right) / 2];
			
			do {	
				while ((items[i] < comparand) && (i < right)) {
					i++;
				}
				printArr(items);
				
				while ((comparand < items[j]) && (j > left)) {
					j--;
				}
				printArr(items);
				
				int temp;
				if (i <= j) {
					temp = items[i];
					items[i] = items[j];
					items[j] = temp;
					i++;
					j--;
				}
				printArr(items);
				
			} while (i <= j);
			
			if (left < j) {
				qs(items, left, j);
			}
			if (i < right) {
				qs(items, i, right);
			}
		}
		
		private static void printArr(int[] arr) {
			System.out.println();
			for (int i = 0; i < arr.length; i++)
				System.out.print(arr[i] + " ");
		}
}
