package com.location;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Location {

	private String streetName;
	private String city;
	private String state;
	private String zip;
	private String phone;

	public static ArrayList<String[]> list = new ArrayList<>();
	public static Scanner in = new Scanner(System.in); 

	public Location() {
	}

	public Location(String streetName, String city, String state, String zip, String phone) {
		super();
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		addLocation();
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Location [streetName=" + streetName + ", city=" + city + ", state=" + state + ", zip=" + zip
				+ ", phone=" + phone + "]";
	}

	public void addLocation() {
		list.add(new String[] { getStreetName(), getCity(), getState(), getZip(), getPhone() });
		System.out.println("Location added Successfully!");
	}

	public static void displayLocation() {

		if (list.size() == 0) {
			System.out.println("Sorry there are no locations added. Add locations");
		} else {
			String[] dummy = new String[] {};
			int i = 0;
			while (i < list.size()) {
				dummy = list.get(i);
				System.out.print(i + 1 + ".");
				for (int j = 0; j < dummy.length; j++) {
					System.out.print(dummy[j] + "    ");
				}
				System.out.println();
				i++;
			}
		}

	}

	public static void deleteLocation(int index) {
		list.remove(index - 1);
		System.out.println("Location removed successfully!");
	}

	public static void updateLocation(int index, int part) {
		String[] location = list.get(index - 1);

		if (part == 1) {
			System.out.println("Enter the Street Address:");
			String address = in.nextLine();
			location[0] = address;
			System.out.println("Location Updated Successfully!");
		} else if (part == 2) {
			System.out.println("Enter the phone number");
			String phone = in.nextLine();
			location[4] = phone;
			System.out.println("Location Updated Successfully!");
		} else {
			System.out.println("Invalid Input!");
		}
		
	}

}
