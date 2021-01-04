package com.menu;

import java.util.Scanner;

public class MenuDriver {

	
	public static Scanner in = new Scanner(System.in);
	public MenuDriver(int choice) {
		int sNo;
		String price = "";
		int option;
		switch (choice) {
		case 1:
			if (Menu.main.isEmpty() && Menu.dailySpecial.isEmpty() && Menu.combo.isEmpty()) {
				Menu.main.add(new String[] { "Hamburger", "Burger", " $6.00" });
				Menu.main.add(new String[] { "Chili Cheese Burger", "Burger", "$6.50" });
				Menu.main.add(new String[] { "Angus Burger", "Burger", " $9.00" });
				Menu.main.add(new String[] { "Avocado Burger", "Burger", " $7.00" });
				Menu.main.add(new String[] { "Turkey Garden Salad", "Salad", " $8.50" });
				Menu.main.add(new String[] { "Grilled Chicken Salad", "Salad", " $8.50" });
				Menu.main.add(new String[] { "Philly Cheese Steak", "Sandwich", " $9.50" });
				Menu.main.add(new String[] { "Chicken Fried Steak Sandwich", "Sandwich", " $8.75" });
				Menu.main.add(new String[] { "Hot Dog", "Hot Dog", " $4.25" });
				Menu.dailySpecial
						.add(new String[] { "Monday: Chicken Fried Chicken Plate", "Daily Special", "$10.50" });
				Menu.dailySpecial.add(new String[] { "Tuesday: Angus Plate", "Daily Special", "$10.50" });
				Menu.combo.add(new String[] { "Mushroom Swiss Burger", "Burger Combo", "$9.50" });
			}
			System.out.println("Select the Menu: 1. Daily Specials  2. Main Menu  3.Combo");
			option = in.nextInt();
			if (option == 1) {
				Menu.showDailySpecial();
			} else if (option == 2) {
				Menu.showMain();
			} else if (option == 3) {
				Menu.showCombo();
			} else {
				System.out.println("Invalid Option!");
			}
			break;
		case 2:
			System.out.println("Select the Menu to be added: 1. Daily Specials  2. Main Menu  3.Combo");
			option = in.nextInt();
			if (option == 1) {
				Menu.addDailySpecial();
			} else if (option == 2) {
				Menu.addMain();
			} else if (option == 3) {
				Menu.addCombo();
			} else {
				System.out.println("Invalid Option!");
			}
			break;
		case 3:
			System.out.println("Select the Menu to be deleted: 1. Daily Specials  2. Main Menu  3.Combo");
			option = in.nextInt();
			System.out.print("Enter the S.no of the menu to be deleted:");
			sNo = in.nextInt();
			if (option == 1) {
				Menu.deleteDailySpecial(sNo);
			} else if (option == 2) {
				Menu.deleteMain(sNo);
			} else if (option == 3) {
				Menu.deleteCombo(sNo);
			} else {
				System.out.println("Invalid Option!");
			}
			break;
		case 4:
			System.out.println("Select the Menu to be Updated: 1. Daily Specials  2. Main Menu  3.Combo");
			option = in.nextInt();
			System.out.print("Enter the S.no of the menu to be updated:");
			sNo = in.nextInt();
			if (option == 1) {
				Menu.updateDailySpecial(sNo);
			} else if (option == 2) {
				Menu.updateMain(sNo);
			} else if (option == 3) {
				Menu.updateCombo(sNo);
			} else {
				System.out.println("Invalid Option!");
			}
			break;
		}
	}
}
