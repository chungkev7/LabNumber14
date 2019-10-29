package co.grandcircus;

public abstract class Player {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract Roshambo generateRoshambo();

	public abstract Roshambo generateRoshambo(String string);
	
	public String toString() {
		return name;
	}
	
}
