package com.azad.practice.java.try_this_projects.no_7_1;

public class Truck extends Vehicle {

	private int cargocap; // cargo capacity in pounds

	public Truck(int passengers, int fuelcap, int mpg, int cargocap) {
		super(passengers, fuelcap, mpg);

		this.cargocap = cargocap;
	}

	public int getCargocap() {
		return cargocap;
	}

	public void setCargocap(int cargocap) {
		this.cargocap = cargocap;
	}

}
