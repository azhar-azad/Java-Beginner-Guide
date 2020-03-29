package com.azad.practice.java.self_test_projects.chapter_6_3;

public class Stack {

	private char[] stck;
	private int tos;

	public Stack() {
		stck = new char[1];
		tos = 0;

		System.out.println("Stack of size 1 is created.");
	}

	public Stack(int size) {
		stck = new char[size];
		tos = 0;
	}

	public Stack(char[] stck) {
		this.stck = stck;
		tos = 0;
	}

	public int size() {
		return stck.length;
	}

	public void push(char ch) {
		if (tos == size()) {
			System.out.println("Stack is full.");
			return;
		}

		stck[tos++] = ch;
	}

	public char pop() {
		if (tos == 0) {
			System.out.println("Stack is empty.");
			return ' ';
		}

		return stck[--tos];
	}

	public void show() {
		System.out.println(stck.toString());
	}
}
