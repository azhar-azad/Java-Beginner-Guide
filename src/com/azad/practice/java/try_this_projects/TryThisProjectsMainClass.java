package com.azad.practice.java.try_this_projects;

import java.io.IOException;

import com.azad.practice.java.try_this_projects.no_2_2.LogicalOpTable;
import com.azad.practice.java.try_this_projects.no_3_1.Help;
import com.azad.practice.java.try_this_projects.no_3_2.Help2;
import com.azad.practice.java.try_this_projects.no_3_3.Help3;
import com.azad.practice.java.try_this_projects.no_5_1.BubbleSort;
import com.azad.practice.java.try_this_projects.no_5_2.Queue;

public class TryThisProjectsMainClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		/*
//		 * Try This 2-2 ------------ LogicalOpTable --------------
//		 */
//		System.out.println("Try This 2-2 : LogicalOpTable");
//		LogicalOpTable logicalOpTable = new LogicalOpTable();
//		logicalOpTable.printHeaders();
//		logicalOpTable.printRow(true, true);
//		logicalOpTable.printRow(true, false);
//		logicalOpTable.printRow(false, true);
//		logicalOpTable.printRow(false, false);
		
//		/*
//		 * Try This 3-1 ------------ Help --------------
//		 */
//		System.out.println("Try This 3-1 : Help");
//		Help help = new Help();
//		help.runProgram();
		
//		/*
//		 * Try This 3-2 ------------ Help2 --------------
//		 */
//		System.out.println("Try This 3-2: Help2");
//		Help2 help2 = new Help2();
//		help2.runProgram();
		
//		/*
//		 * Try This 3-3 ------------ Help3 --------------
//		 */
//		System.out.println("Try This 3-3: Help3");
//		Help3 help3 = new Help3();
//		help3.runProgram();
		
//		/*
//		 * Try This 5-1 ------------ BubbleSort --------------
//		 */
//		System.out.println("Try This 5-1: BubbleSort");
//		int[] nums = {3, 2, 5};
//		BubbleSort bubbleSort = new BubbleSort(nums);
//		System.out.println(bubbleSort.getSize());
//		bubbleSort.printUnsorted();
//		bubbleSort.sort();
//		bubbleSort.printSorted();
		
		/*
		 * Try This 5-2 ------------ Queue --------------
		 */
		System.out.println("Try This 5-2: Queue");
		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(10);
		
		System.out.println("Using bigQ to store the alphabet.");
		for (int i = 0; i < 26; i++) {
			bigQ.put((char) ('A' + i));
		}
		bigQ.show();
		
		System.out.println("Using smallQ to store the alphabet.");
		for (int i = 0; i < 26; i++) {
			smallQ.put((char) ('A' + i));
		}
		smallQ.show();
	}

}
