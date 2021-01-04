package com.partyReservations;

import java.util.HashMap;

public class PartyReservations {
	

	public static HashMap<String, String> map = new HashMap<String, String>();
	
	
	public static void showParty() {
		if (map.size() == 0) {
			System.out.println("Sorry there are no Menus added. Add Menus");
		} else {
			for(String key : map.keySet()) {
				System.out.println(key + "    " + map.get(key));
			}
		}
	}
	
	
	public static void addParty(String partyName, String rate) {
		map.put(partyName, rate);
		System.out.println("New Party added successfully!");
	}
	
	
	public static void deleteParty(String partyName) {
		map.remove(partyName);
		System.out.println("Party Name removed!");
	}
	
	public static void updateParty(String partyName, String rate) {
		map.put(partyName, rate);
		System.out.println("New rate updated!");
	}
}
