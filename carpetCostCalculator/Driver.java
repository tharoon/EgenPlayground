package com.carpetCostCalculator;

import java.util.Scanner;



public class Driver {
		

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What type of Carpet do you want?");
		System.out.println("*Plain --> $8 per sq.ft\n" + "*Designed --> $12 per sq.ft\n" + "*Bamboo Sticks --> $20 per sq.ft\n");
		System.out.println("Please Enter your choice:");
		String choice = in.nextLine();
		System.out.println("Enter the length of the room:");
		double length = in.nextDouble();
		System.out.println("Enter the width of the room:");
		double width = in.nextDouble();
		RoomCarpet roomCarpet = new RoomCarpet(length, width, choice);
		double cost = roomCarpet.calculateCost();
		if(cost < 0) {
			System.out.println("Sorry!We dont have that item");
		}else {
			System.out.println("The cost of the carpet is: $"+cost);
		}
		
	}

}
