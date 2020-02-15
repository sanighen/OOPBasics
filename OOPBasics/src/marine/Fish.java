package marine;

public class Fish implements FishInterface, Cloneable {

	private String type;
	private int weight;
	private String habitat;

	Fish() {

	}

	Fish(String type, int weight, String habitat) {
		this.type = type;
		this.weight = weight;
		this.habitat = habitat;
	}

	@Override
	public String toString() {
		return " [type=" + type + ", weight=" + weight + ", habitate=" + habitat + "]";
	}

	@Override
	public void setType(String type) {
		this.type = type;

	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public void setWeight(int weight) {
		this.weight = weight;

	}

	@Override
	public int getWeight() {
		return weight;
	}

	@Override
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	@Override
	public String getHabitat() {
		return habitat;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

}
