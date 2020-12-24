package com.RockPaperScissors;

public class Arena {

	Bot bot;
	String userChoice;
	String botChoice;
	
	// Constructor
	public Arena(String userChoice) {
		this.bot = new Bot();
		this.userChoice = userChoice.toLowerCase();
	}
	
	/**
	 * 
	 * Based on the user choice and the bot choice we decide the winner
	 */
	public String decideWinner() {
		botChoice = bot.botChoice();
		System.out.println("Bot chose: " + botChoice);
		String win = "Congratulations! You are the winner";
		String lose = "You Lost!";
		if (userChoice.equals(botChoice)) {
			return "It is a tie!";
		}

		if (userChoice.equals("rock")) {
			if (botChoice.equals("paper")) {
				return lose;
			} else if (botChoice.equals("scissors")) {
				return win;
			}
		}
		if (userChoice.equals("paper")) {
			if (botChoice.equals("scissors")) {
				return lose;
			} else if (botChoice.equals("rock")) {
				return win;
			}
		}

		if (userChoice.equals("scissors")) {
			if (botChoice.equals("rock")) {
				return lose;
			} else if (botChoice.equals("paper")) {
				return win;
			}
		}

		return "Invalid choice! Please Try Again!";
	}

}
