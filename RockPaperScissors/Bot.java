package com.RockPaperScissors;

import java.util.Random;

public class Bot {
	
	public static String[] choice;
	
	public Bot(){
		this.choice = new String[] {"rock", "paper", "scissors"};
	}
	
	public String botChoice() {
		int index = new Random().nextInt(choice.length);
		return choice[index];
	}

}
