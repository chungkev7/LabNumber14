package co.grandcircus;

public enum Roshambo {
	ROCK, PAPER, SCISSORS;
	
	public String toString() {
		switch (this) {
		case ROCK:
			return "Rock";
		case PAPER:
			return "Paper";
		case SCISSORS:
			return "Scissors";
		default:
			return "No dice";
		}
	}
}
