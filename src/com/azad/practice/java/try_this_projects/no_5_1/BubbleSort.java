package com.azad.practice.java.try_this_projects.no_5_1;

public class BubbleSort {

	private int[] unsortedArray;
	private int[] sortedArray;
		
	public BubbleSort() {
		
		unsortedArray = new int[10];
		for (int i = 0; i < unsortedArray.length; i++) {
			unsortedArray[i] = i + (int) Math.random();
		}
		
		setSortedArray();
	}

	public BubbleSort(int[] unsortedArray) {
		
		this.unsortedArray = unsortedArray;
		setSortedArray();
		
	}
	
	public void sort() {
		for (int i = 1; i < getSize(); i++) {	
			for (int j = getSize() - 1; j >= i; j--) {
				if (sortedArray[j - 1] > sortedArray[j]) {
					int temp = sortedArray[j - 1];
					sortedArray[j - 1] = sortedArray[j];
					sortedArray[j] = temp;
				}
			}
		}
	}

	public int getSize() {
		return unsortedArray.length;
	}
	
	public void printUnsorted() {
		printArray(unsortedArray);
	}
	
	public void printSorted() {
		printArray(sortedArray);
	}

	private void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
		System.out.println();
	}
	
	private void setSortedArray() {
		sortedArray = new int[getSize()];
		for (int i = 0; i < sortedArray.length; i++) {
			sortedArray[i] = unsortedArray[i];
		}
	}
}
