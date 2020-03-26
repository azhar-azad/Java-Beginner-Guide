package com.azad.practice.java.try_this_projects.no_5_3;

public class ShowBits {

	private int numbits; 
	
	public ShowBits(int numbits) {
		this.numbits = numbits;
	}
	
	public void show(long val) {
		
		long mask = 1;
		
		// left shift a 1 into the proper position
		mask <<= numbits - 1;
		
		int spacer = 0;
		
		for (; mask != 0; mask >>>= 1) {
			
			if ((val & mask) != 0) {
				System.out.print("1");
			} else {
				System.out.print("0");
			}
			
			spacer++;
			
			if (spacer % 8 == 0) {
				System.out.print(" ");
				spacer = 0;
			}
		}
		
		System.out.println();
	}
}
