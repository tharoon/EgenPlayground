package com.menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	private static String itemName;
	private static String category;
	private static String price;

	public static ArrayList<String[]> main = new ArrayList<>();
	public static ArrayList<String[]> dailySpecial = new ArrayList<>();
	public static ArrayList<String[]> combo = new ArrayList<>();

	public static Scanner in = new Scanner(System.in);

	public static void showMain() {
		if (main.size() == 0) {
			System.out.println("Sorry there are no Menus added. Add Menus");
		} else {
			String[] dummy = new String[] {};
			int i = 0;
			while (i < main.size()) {
				dummy = main.get(i);
				System.out.print(i + 1 + ".");
				for (int j = 0; j < dummy.length; j++) {
					System.out.print(dummy[j] + "\t");
				}
				System.out.println();
				i++;
			}
		}
	}

	public static void showDailySpecial() {
		if (dailySpecial.size() == 0) {
			System.out.println("Sorry there are no Menus added. Add Menus");
		} else {
			String[] dummy = new String[] {};
			int i = 0;
			while (i < dailySpecial.size()) {
				dummy = dailySpecial.get(i);
				System.out.print(i + 1 + ".");
				for (int j = 0; j < dummy.length; j++) {
					System.out.print(dummy[j] + "\t");
				}
				System.out.println();
				i++;
			}
		}

	}

	public static void showCombo() {
		if (combo.size() == 0) {
			System.out.println("Sorry there are no Menus added. Add Menus");
		} else {
			String[] dummy = new String[] {};
			int i = 0;
			while (i < combo.size()) {
				dummy = combo.get(i);
				System.out.print(i + 1 + ".");
				for (int j = 0; j < dummy.length; j++) {
					System.out.print(dummy[j] + "\t");
				}
				System.out.println();
				i++;
			}
		}
	}

	public static void addDailySpecial() {
		System.out.println("Enter the item name: ");
		itemName = in.nextLine();
		System.out.println("Enter the Category: ");
		category = in.nextLine();
		System.out.println("Enter the price: ");
		price = in.nextLine();
		dailySpecial.add(new String[] { itemName, category, price });
		System.out.println("Menu added successfully!");
	}

	public static void addMain() {
		System.out.println("Enter the item name: ");
		itemName = in.nextLine();
		System.out.println("Enter the Category: ");
		category = in.nextLine();
		System.out.println("Enter the price: ");
		price = in.nextLine();
		main.add(new String[] { itemName, category, price });
		System.out.println("Menu added successfully!");
	}

	public static void addCombo() {
		System.out.println("Enter the item name: ");
		itemName = in.nextLine();
		System.out.println("Enter the Category: ");
		category = in.nextLine();
		System.out.println("Enter the price: ");
		price = in.nextLine();
		combo.add(new String[] { itemName, category, price });
		System.out.println("Menu added successfully!");
	}

	public static void deleteDailySpecial(int index) {
		dailySpecial.remove(index - 1);
		System.out.println("Menu removed successfully!");
	}

	public static void deleteMain(int index) {
		main.remove(index - 1);
		System.out.println("Menu removed successfully!");
	}

	public static void deleteCombo(int index) {
		combo.remove(index - 1);
		System.out.println("Menu removed successfully!");
	}

	public static void updateDailySpecial(int index) {
		String[] menu = dailySpecial.get(index - 1);
		System.out.println("Enter the new price:");
		price = in.nextLine();
		menu[2] = price;
		System.out.println("Menu updated successfully!");
	}

	public static void updateMain(int index) {
		String[] menu = main.get(index - 1);
		System.out.println("Enter the new price:");
		price = in.nextLine();
		menu[2] = price;
		System.out.println("Menu updated successfully!");
	}

	public static void updateCombo(int index) {
		String[] menu = combo.get(index - 1);
		System.out.println("Enter the new price:");
		price = in.nextLine();
		menu[2] = price;
		System.out.println("Menu updated successfully!");
	}

}
