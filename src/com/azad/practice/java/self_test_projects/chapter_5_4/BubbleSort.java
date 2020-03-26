package com.azad.practice.java.self_test_projects.chapter_5_4;

public class BubbleSort {

	private String[] unsortedArray;
	private String[] sortedArray;

	public BubbleSort() {

		unsortedArray = new String[10];
		for (int i = 0; i < unsortedArray.length; i++) {
			unsortedArray[i] = i + "";
		}

		setSortedArray();
	}

	public BubbleSort(String[] unsortedArray) {

		this.unsortedArray = unsortedArray;
		setSortedArray();

	}

	public void sort() {
		for (int i = 1; i < getSize(); i++) {
			for (int j = getSize() - 1; j >= i; j--) {
//				if (sortedArray[j - 1] > sortedArray[j]) {
				if ((sortedArray[j - 1].compareToIgnoreCase(sortedArray[j])) > 0) {
					String temp = sortedArray[j - 1];
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

	private void printArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
		System.out.println();
	}

	private void setSortedArray() {
		sortedArray = new String[getSize()];
		for (int i = 0; i < sortedArray.length; i++) {
			sortedArray[i] = unsortedArray[i];
		}
	}
}
