package com.carpetCostCalculator;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of the room:");
		double length = in.nextDouble();
		System.out.println("Enter the width of the room:");
		double width = in.nextDouble();
		System.out.println("Enter the cost per square foot");
		double cost = in.nextDouble();
		RoomCarpet roomCarpet = new RoomCarpet(length, width, cost);
		System.out.println("The cost of the carpet is: " + roomCarpet.calculateCost());
	}

}
