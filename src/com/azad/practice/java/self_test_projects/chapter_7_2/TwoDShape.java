package com.azad.practice.java.self_test_projects.chapter_7_2;

public abstract class TwoDShape {

	private double width;
	private double height;
	private String name;

	// default constructor
	public TwoDShape() {
		width = height = 0.0;
		name = "none";
	}

	// parameterized constructor
	public TwoDShape(double width, double height, String name) {
		super();
		this.width = width;
		this.height = height;
		this.name = name;
	}

	// construct object with equal width and height
	public TwoDShape(double x, String name) {
		this.width = this.height = x;
		this.name = name;
	}

	// construct an object from an object
	public TwoDShape(TwoDShape object) {
		this.width = object.width;
		this.height = object.height;
		this.name = object.name;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}
	
	public void showDim() {
		System.out.println("Width and Height are " + width + " and " + height);
	}
	
	public abstract double area();

}
