package co.grandcircus;

public class RandomPerson extends Player {

	public RandomPerson() {
		super();
	}
	
	@Override
	public Roshambo generateRoshambo(String string) {
		return null;
	}

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}

	@Override
	public String toString() {
		return super.toString();
	}


}
