package com.azad.practice.java.try_this_projects.no_5_2;

public class Queue {

	private char[] q; // holds the queue
	private int putloc; // holds the position to put an element
	private int getloc; // holds the position to get an element
	
	// construct an empty Queue given its size
	public Queue(int size) {
		q = new char[size];
		putloc = 0;
		getloc = 0;
	}
	
	// construct a Queue with initial value
	public Queue(char[] q) {
		q = new char[q.length];
		putloc = 0;
		getloc = 0;
		
		for (int i = 0; i < q.length; i++) {
			put(q[i]);
		}
	}
	
	// construct a Queue from a Queue
	public Queue(Queue queue) {
		q = new char[queue.q.length];
		putloc = queue.putloc;
		getloc = queue.getloc;
		
		// copy elements
		for (int i = getloc; i < putloc; i++) {
			q[i] = queue.q[i];
		}
	}
	
	// put a character into the Queue
	public void put(char ch) {
		if (putloc == size()) {
			System.out.println(" - Queue is full.");
			return;
		}
		q[putloc++] = ch;
	}
	
	// get a character from the Queue
	public char get() {
		if (putloc == getloc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}
		return q[getloc++];
	}
	
	// get the Queue size/length
	public int size() {
		return q.length;
	}
	
	// print the Queue
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
