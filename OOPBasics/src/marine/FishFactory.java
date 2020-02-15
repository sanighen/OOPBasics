package marine;

public class FishFactory {

	public Fish getFish(String fishClass, String type, int weight, String habitat) {
		FishInterface f = new Fish();
		if (fishClass == null) {
			return null;
		}
		if (fishClass.equalsIgnoreCase("Sea fish")) {
			return new SeaFish(type, weight, habitat);
		} else if (fishClass.equalsIgnoreCase("River fish")) {
			return new RiverFish(type, weight, habitat);
		}
		return null;
	}

}
