package com.carpetCostCalculator;

import java.util.HashMap;

public class CarpetType {
	
	public HashMap<String, Double> map = new HashMap<String, Double>();
	public String choice;
	public CarpetType(String choice) {
		map.put("plain", 8.00);
		map.put("designed", 12.00);
		map.put("bamboo sticks", 20.00);
		this.choice = choice.toLowerCase();
	}
	
	public double getCarpetCost() {
		try {
			return map.get(choice);
		}catch(Exception e){}
		return -1;
		
	}

}
