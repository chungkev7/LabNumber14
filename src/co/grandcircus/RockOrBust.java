package co.grandcircus;

public class RockOrBust extends Player {

	public RockOrBust() {
		super();
	}
	
	@Override
	public Roshambo generateRoshambo(String string) {
		return null;
	}

	@Override
	public Roshambo generateRoshambo() {
		double roshamboResult = Math.random();
		if (roshamboResult < 0.33) {
			return Roshambo.ROCK;
		} else if (roshamboResult > 0.33 && roshamboResult < 0.66) {
			return Roshambo.PAPER;
		} else {
			return Roshambo.SCISSORS;
		}
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
