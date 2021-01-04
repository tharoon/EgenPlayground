package com.driver;

import java.util.Scanner;
import com.location.*;
import com.menu.*;
import com.partyReservations.*;

public class Driver {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int option;
		System.out.println("Texas Hamburger Company");
		System.out.println("You are logged in as Admin");
		while (true) {
			int choice;
			System.out.println("Enter your choice:");
			System.out.print("1.Location" + "     " + "2.Menu" + "     " + "3.Party Reservations" + "     " + "4. Exit"
					+ "     " + "\n");
			choice = in.nextInt();
			switch (choice) {
			case 1:
				System.out.print("1.Show Locations" + "     " + "2.Add Location" + "     " + "3.Delete Location"
						+ "     " + "4. Update Location" + "     " + "\n");
				option = in.nextInt();
				LocationDriver locationDriver = new LocationDriver(option);
				break;
			case 2:
				System.out.print("1.Show Menu" + "     " + "2.Add Menu" + "     " + "3.Delete Menu" + "     "
						+ "4. Update Menu" + "     " + "\n");
				option = in.nextInt();
				MenuDriver menuDriver = new MenuDriver(option);
				break;
			case 3:
				System.out.print("1.Show Services" + "     " + "2.Add Services" + "     " + "3.Delete Services" + "     "
						+ "4. Update Services" + "     " + "\n");
				option = in.nextInt();
				PartyReservationsDriver pr = new PartyReservationsDriver(option);
				break;
			case 4:
				System.out.println("Thank you!");
				System.exit(1);
			default:
				System.out.println("Invalid Choice!");
			}
		}

	}

}
