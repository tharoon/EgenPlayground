package com.carpetCostCalculator;


public class RoomCarpet extends RoomDimension {

	
	public CarpetType carpetType;
	public RoomCarpet(double length, double width, String choice) {
		super(length, width);
		this.carpetType = new CarpetType(choice); 
		
	}

	public double calculateCost() {
		double area = super.calculateRoomDimension();
		double carpetCost = carpetType.getCarpetCost();
		return area * carpetCost;
	}

}
