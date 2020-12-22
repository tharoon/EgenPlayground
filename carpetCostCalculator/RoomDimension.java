package com.carpetCostCalculator;

public class RoomDimension {

	public static double length;
	public static double width;

	public RoomDimension(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double calculateRoomDimension() {
		return length * width;
	}

}
