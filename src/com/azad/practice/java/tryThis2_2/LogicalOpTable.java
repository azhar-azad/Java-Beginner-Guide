package com.azad.practice.java.tryThis2_2;

public class LogicalOpTable {

	public LogicalOpTable() {
		super();
	}

	public void printHeaders() {
		System.out.println();
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
	}

	public void printRow(boolean p, boolean q) {
		System.out.println(p + "\t" + q + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p));
	}
}
