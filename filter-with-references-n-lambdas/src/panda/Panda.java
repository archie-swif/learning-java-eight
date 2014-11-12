package panda;

public class Panda {

	private String color;
	private int weight;

	public Panda(String color, int weight) {
		this.color = color;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setString(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return (color + " " + weight + " kg panda");
	}

}
