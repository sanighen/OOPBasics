package marine;

public class RiverFish extends Fish{

	RiverFish() {
		super();
	}

	RiverFish(String type, int weight, String habitat) {
		super(type, weight, habitat);
	}

	@Override
	public String toString() {
		return "RiverFish " + "[type=" + getType() + ", weight=" + getWeight()
				+ ", habitat=" + getHabitat()  + "]";
	}
	
	
	
	

}
