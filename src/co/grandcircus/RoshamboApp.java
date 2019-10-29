/*
 * @Author: Kevin
 */
package co.grandcircus;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the Rock Paper Scissors game!");
		System.out.println();
		String userName = Validator.getString(scan, "Enter your name:");
		String opponentChoice = Validator.getValidOpponent(scan, "\nWould you like to play against RockOrBust or RandomPerson? "
				+ "(Choose B for Rock, or R for Random): ", "([BR])");
		
		Player user = new UserPlayer();
		user.setName(userName);
		Player opponentOne = new RockOrBust();
		opponentOne.setName("RockOrBust");
		
		// opponent two will always choose rock
		Player opponentTwo = new RandomPerson();
		opponentTwo.setName("RandomPerson");
		
		String toContinue = "Y";
		int numberOfRounds = 0;
		int totalWins = 0;
		int totalLosses = 0;
		
		while (toContinue.equals("Y")) {
			
		String userChoice = Validator.getValidRPS(scan, "\nRock, paper, or scissors? (Choose R/P/S): ", "([RPS])");
		Roshambo rockOpponentResult = opponentOne.generateRoshambo();
		Roshambo randomOpponentResult = opponentTwo.generateRoshambo();
		
		if (opponentChoice.equals("B")) {
			System.out.println();
			System.out.println(opponentOne.getName() + ": " + rockOpponentResult);
			System.out.println(user.getName() + ": " + user.generateRoshambo(userChoice));
			if (user.generateRoshambo(userChoice).equals(Roshambo.ROCK)) {
				if (rockOpponentResult.equals(Roshambo.ROCK)) {
					System.out.println("Draw!");
					numberOfRounds++;
					toContinue = Validator.getValidContinue(scan, "\nPlay again? (Y/N): ", "([YN])");
				} else if (rockOpponentResult.equals(Roshambo.PAPER)) {
					System.out.println(opponentOne.getName() + " wins!");
					numberOfRounds++;
					totalLosses++;
					toContinue = Validator.getValidContinue(scan, "\nPlay again? (Y/N): ", "([YN])");
				} else if (rockOpponentResult.equals(Roshambo.SCISSORS)) {
					System.out.println(user.getName() + " wins!");
					numberOfRounds++;
					totalWins++;
					toContinue = Validator.getValidContinue(scan, "\nPlay again? (Y/N): ", "([YN])");
				}
			} else if (user.generateRoshambo(userChoice).equals(Roshambo.PAPER)) {
				if (rockOpponentResult.equals(Roshambo.ROCK)) {
					System.out.println(user.getName() + " wins!");
					numberOfRounds++;
					totalWins++;
					toContinue = Validator.getValidContinue(scan, "\nPlay again? (Y/N): ", "([YN])");
				} else if (rockOpponentResult.equals(Roshambo.PAPER)) {
					System.out.println("Draw!");
					numberOfRounds++;
					toContinue = Validator.getValidContinue(scan, "\nPlay again? (Y/N): ", "([YN])");
				} else if (rockOpponentResult.equals(Roshambo.SCISSORS)) {
					System.out.println(opponentOne.getName() + " wins!");
					numberOfRounds++;
					totalLosses++;
					toContinue = Validator.getValidContinue(scan, "\nPlay again? (Y/N): ", "([YN])");
				}
			} else if (user.generateRoshambo(userChoice).equals(Roshambo.SCISSORS)) {
				if (rockOpponentResult.equals(Roshambo.ROCK)) {
					System.out.println(opponentOne.getName() + " wins!");
					numberOfRounds++;
					totalLosses++;
					toContinue = Validator.getValidContinue(scan, "\nPlay again? (Y/N): ", "([YN])");
				} else if (rockOpponentResult.equals(Roshambo.PAPER)) {
					System.out.println(user.getName() + " wins!");
					numberOfRounds++;
					totalWins++;
					toContinue = Validator.getValidContinue(scan, "\nPlay again? (Y/N): ", "([YN])");
				} else if (rockOpponentResult.equals(Roshambo.SCISSORS)) {
					System.out.println("Draw!");
					numberOfRounds++;
					toContinue = Validator.getValidContinue(scan, "\nPlay again? (Y/N): ", "([YN])");
				}
			}
		} else if (opponentChoice.equals("R")) {
			System.out.println();
			// randomOpponent result is always rock
			System.out.println(opponentTwo.getName() + ": " + randomOpponentResult);
			System.out.println(user.getName() + ": " + user.generateRoshambo(userChoice));
			if (user.generateRoshambo(userChoice).equals(Roshambo.ROCK)) {
				System.out.println("Draw!");
				numberOfRounds++;
				toContinue = Validator.getValidContinue(scan, "\nPlay again? (Y/N): ", "([YN])");
			} else if (user.generateRoshambo(userChoice).equals(Roshambo.PAPER)) {
				System.out.println(user.getName() + " wins!");
				numberOfRounds++;
				totalWins++;
				toContinue = Validator.getValidContinue(scan, "\nPlay again? (Y/N): ", "([YN])");
			} else if (user.generateRoshambo(userChoice).equals(Roshambo.SCISSORS)) {
				System.out.println(opponentTwo.getName() + " wins!");
				numberOfRounds++;
				totalLosses++;
				toContinue = Validator.getValidContinue(scan, "\nPlay again? (Y/N): ", "([YN])");
			}
		}
		}
		System.out.println("\nTotal rounds: " + numberOfRounds);
		System.out.println("Total wins: " + totalWins);
		System.out.println("Total losses: " + totalLosses);
		System.out.println("\nGoodbye!");
		scan.close();
	}

}
