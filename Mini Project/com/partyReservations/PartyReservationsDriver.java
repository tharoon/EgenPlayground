package com.partyReservations;

import java.util.Scanner;

public class PartyReservationsDriver {
	
	
	
	public PartyReservationsDriver(int choice) {
		Scanner in = new Scanner(System.in);
		String partyName;
		String rate;
		switch(choice) {
		case 1:
			if(PartyReservations.map.isEmpty()) {
				PartyReservations.map.put("Birthday Party", "$10/hr");
				PartyReservations.map.put("Corporate Event", "$20/hr");
			}
			PartyReservations.showParty();
			break;
		case 2:
			System.out.println("Enter the Party Name: ");
			partyName = in.nextLine();
			System.out.println("Enter the Rate per hour: ");
			rate = in.nextLine();
			PartyReservations.addParty(partyName, rate);
			break;
		case 3:
			System.out.println("Enter the Party name to be removed: ");
			String name = in.nextLine();
			PartyReservations.deleteParty(name);
			break;
		case 4:
			System.out.println("Enter the party name:");
			partyName = in.nextLine();
			System.out.println("Enter the new rate: ");
			rate = in.nextLine();
			PartyReservations.updateParty(partyName, rate);
			break;
		}
	}
}
