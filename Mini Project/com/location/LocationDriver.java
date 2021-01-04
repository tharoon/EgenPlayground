package com.location;

import java.util.Scanner;

public class LocationDriver {
	public static Scanner in = new Scanner(System.in);
	public LocationDriver(int choice) {
		int sNo;
		switch(choice) {
		case 1:
			if(Location.list.isEmpty()) {
				Location.list.add(new String[] {"9010 Huebner Rd", " San Antonio", "Texas", "78240", "210-699-1189"});
				Location.list.add(new String[] {"507 Summit Ave", "Arlington", "Texas", "76013", "682-240-6433"});	
				Location.list.add(new String[] {"1006 Greek Row Dr", "Austin", "Texas", "79621", "562-587-9898"});
			}
			Location.displayLocation();
			break;
		case 2:
			System.out.print("Enter Street name: ");
			String streetName = in.nextLine();
			System.out.print("\nEnter City: ");
			String city = in.nextLine();
			System.out.print("\nEnter State: ");
			String state = in.nextLine();
			System.out.print("\nEnter Zip: ");
			String zip = in.nextLine();
			System.out.print("\nEnter Phone number: ");
			String phoneNumber = in.nextLine();
			Location location = new Location(streetName, city, state, zip, phoneNumber);
			break;
		case 3:
			System.out.print("Enter the S.no of the address to be deleted:");
			sNo = in.nextInt();
			Location.deleteLocation(sNo);
			break;
		case 4:
			System.out.println("Enter the S.no of the address to be updated:");
			sNo = in.nextInt();
			System.out.println("Do you want to update: 1. Street Address  2. Phone Number");
			int part = in.nextInt();
			Location.updateLocation(sNo, part);
			break;
		}
	}

}
