package com.azad.practice.java.try_this_projects;

import java.io.IOException;

import com.azad.practice.java.try_this_projects.no_2_2.LogicalOpTable;
import com.azad.practice.java.try_this_projects.no_3_1.Help;
import com.azad.practice.java.try_this_projects.no_3_2.Help2;
import com.azad.practice.java.try_this_projects.no_3_3.Help3;
import com.azad.practice.java.try_this_projects.no_5_1.BubbleSort;
import com.azad.practice.java.try_this_projects.no_5_2.Queue;
import com.azad.practice.java.try_this_projects.no_5_3.ShowBits;
import com.azad.practice.java.try_this_projects.no_6_3.QuickSort;
import com.azad.practice.java.try_this_projects.no_7_1.Truck;

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
		
//		/*
//		 * Try This 5-2 ------------ Queue --------------
//		 */
//		System.out.println("Try This 5-2: Queue");
//		Queue bigQ = new Queue(100);
//		Queue smallQ = new Queue(10);
//		
//		System.out.println("Using bigQ to store the alphabet.");
//		for (int i = 0; i < 26; i++) {
//			bigQ.put((char) ('A' + i));
//		}
//		bigQ.show();
//		
//		System.out.println("Using smallQ to store the alphabet.");
//		for (int i = 0; i < 26; i++) {
//			smallQ.put((char) ('A' + i));
//		}
//		smallQ.show();
		
//		/*
//		 * Try This 5-3 ------------ ShowBits --------------
//		 */
//		System.out.println("Try This 5-3: ShowBits");
//		
//		ShowBits b = new ShowBits(8);
//		ShowBits i = new ShowBits(32);
//		ShowBits li = new ShowBits(64);
//		
//		System.out.println("123 in Binary: ");
//		b.show(123);
//		
//		System.out.println("\n87987 in Binary: ");
//		i.show(87987);
//		
//		System.out.println("\n237658768 in Binary: ");
//		li.show(237658768);
//		
//		// you can also show low-order bits of any integer
//		System.out.println("\nLow order 8 bits of 87987 in binary: ");
//		b.show(87987);
		
//		/*
//		 * Try This 6-3 ------------ Quicksort --------------
//		 */
//		System.out.println("Try This 6-3: Quicksort");
//		
//		char[] a = { 'd', 'x', 'a', 'r', 'p', 'j', 'i' };
//		
//		System.out.print("Original Array: ");
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i]);
//		}
//		
//		System.out.println();
//		
//		// now sort the array
//		QuickSort.qsort(a);
//		
//		System.out.print("Sorted Array: ");
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i]);
//		}
		
		/*
		 * Try This 7-1 ------------ TruckDemo --------------
		 */
		System.out.println("Try This 6-3: TruckDemo");
		
		// construct some trucks
		Truck semi = new Truck(2, 200, 7, 44000);
		Truck pickup = new Truck(3, 28, 15, 2000);
		double gallons; 
		int distance = 252;
		
		gallons = semi.fuelNeeded(distance);
		
		System.out.println("Semi can carry " + semi.getCargocap() + " pounds.");
		System.out.println("To go " + distance + " miles semi needs " + gallons + " gallons of fuel.\n");
		
		gallons = pickup.fuelNeeded(distance);
		
		System.out.println("Pickup can carry " + pickup.getCargocap() + " pounds.");
		System.out.println("To go " + distance + " miles semi needs " + gallons + " gallons of fuel.\n");

	}

}
