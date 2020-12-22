package com.feetToCentimeter;

public class FeetToCentimeter {

	public int feetToCentimeter(int feet) {
		if (feet >= 0) {
			return (int)(feet * 30.48);
		}
		return -1;
	}

	public double feetToCentimeter(double feet) {
		if (feet >= 0) {
			return feet * 30.48;
		}
		return -1;
	}
}
