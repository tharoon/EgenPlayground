package com.carpetCostCalculator;

public class RoomCarpet extends RoomDimension {

	double cost;
	public static RoomDimension roomDimension;

	public RoomCarpet(double length, double width, double cost) {
		super(length, width);
		this.cost = cost;
	}

	public double calculateCost() {
		double area = super.calculateRoomDimension();
		return area * cost;
	}

}
