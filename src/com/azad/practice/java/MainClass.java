package com.azad.practice.java;

import com.azad.practice.java.tryThis2_2.LogicalOpTable;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("Hello World!!");
		
		/*
		 * Try This 2-2
		 * ------------
		 * LogicalOpTable
		 * --------------
		 */
		LogicalOpTable logicalOpTable = new LogicalOpTable();
		logicalOpTable.printHeaders();
		logicalOpTable.printRow(true, true);
		logicalOpTable.printRow(true, false);
		logicalOpTable.printRow(false, true);
		logicalOpTable.printRow(false, false);
	}

}
