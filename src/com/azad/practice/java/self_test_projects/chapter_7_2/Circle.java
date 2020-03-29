package com.azad.practice.java.self_test_projects.chapter_7_2;

public class Circle extends TwoDShape {
	
	public Circle() {
		super();
	}

	public Circle(double radius) {
		super(radius, "Circle");
	}
	
	public Circle(Circle circle) {
		super(circle);
	}

	@Override
	public double area() {
		return getWidth() * getHeight() * Math.PI;
	}

}
