package com.RockPaperScissors;

import java.util.Scanner;
/**
 * 
 * @author Tharoon
 *
 */
public class Driver {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("Enter a Choice of Rock, Paper, Scissor");
			String userChoice = in.nextLine();
			Arena arena = new Arena(userChoice);
			System.out.println(arena.decideWinner());
			System.out.println("Do you want to Continue? Y / N");
			String response = in.nextLine();
			if(response.equalsIgnoreCase("Y")) {
				continue;
			}else {
				break;
			}
		}
		System.out.println("Thank You!");
		

	}

}
