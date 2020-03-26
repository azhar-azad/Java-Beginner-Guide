package com.azad.practice.java.try_this_projects.no_5_2;

public class Queue {

	private char[] q; // holds the queue
	private int putloc; // holds the position to put an element
	private int getloc; // holds the position to get an element
	
	public Queue(int size) {
		q = new char[size];
		putloc = 0;
		getloc = 0;
	}
	
	public void put(char ch) {
		if (putloc == size()) {
			System.out.println(" - Queue is full.");
			return;
		}
		q[putloc++] = ch;
	}
	
	public char get() {
		if (putloc == getloc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}
		return q[getloc++];
	}
	
	public int size() {
		return q.length;
	}
	
	public void show() {
		for (int i = 0; i < q.length; i++) {

			char ch = get();
			
			if (ch == (char) 0) {
				break;
			}
			
			System.out.print(ch + " ");
		}
		System.out.println();
	}
}
