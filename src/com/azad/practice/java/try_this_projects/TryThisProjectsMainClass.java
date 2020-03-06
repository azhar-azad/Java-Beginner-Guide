package com.azad.practice.java.try_this_projects;

import com.azad.practice.java.try_this_projects.no_2_2.LogicalOpTable;

public class TryThisProjectsMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Try This 2-2 ------------ LogicalOpTable --------------
		 */
		LogicalOpTable logicalOpTable = new LogicalOpTable();
		logicalOpTable.printHeaders();
		logicalOpTable.printRow(true, true);
		logicalOpTable.printRow(true, false);
		logicalOpTable.printRow(false, true);
		logicalOpTable.printRow(false, false);
	}

}
