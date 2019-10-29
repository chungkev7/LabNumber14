package co.grandcircus;

public class UserPlayer extends Player {

	public UserPlayer() {
		super();
	}

	@Override
	public Roshambo generateRoshambo() {
		return null;
	}
	
	public Roshambo generateRoshambo(String string) {
		if (string.equalsIgnoreCase("R") || string.equalsIgnoreCase("ROCK")) {
			return Roshambo.ROCK;
		} else if (string.equalsIgnoreCase("P") || string.equalsIgnoreCase("PAPER")) {
			return Roshambo.PAPER;
		} else if (string.equalsIgnoreCase("S") || string.equalsIgnoreCase("SCISSORS")) {
			return Roshambo.SCISSORS;
		} return null;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
