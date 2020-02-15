package marine;

public class SeaFish extends Fish{

	SeaFish() {
		super();
	}

	SeaFish(String type, int weight, String habitat) {
		super(type, weight, habitat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SeaFish " + "[type=" + getType() + ", weight=" + getWeight()
		+ ", habitat=" + getHabitat()  + "]";
	}

	
	
	
}
