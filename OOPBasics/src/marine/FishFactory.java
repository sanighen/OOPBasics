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
	
	public Fish cloneFish( FishInterface original ) {
		FishInterface fish = new Fish();
		fish.setType(original.getType());
		fish.setWeight(original.getWeight());
		fish.setHabitat(original.getHabitat());
		return (Fish) fish;
	}

}
