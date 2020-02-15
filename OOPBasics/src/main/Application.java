package main;

import marine.Fish;
import marine.FishFactory;
import marine.FishInterface;

public class Application {

	public static void main(String[] args) throws CloneNotSupportedException {

//		Fish fish = new SeaFish("Sea fish 111", 2, "Sea");
//		System.out.println(fish);
//
//		Fish anotherFish = (Fish) fish.clone();
//		anotherFish.setType("Another sea fish");
//		System.out.println(anotherFish);
//
//		System.out.println(fish.equals(anotherFish));

		// -----------------------------------------------------------------------

//		Fish riverFish = new RiverFish("River fish 111", 4, "River");
//		System.out.println(riverFish);
//
//		Fish anotherRiverFish = (Fish) riverFish.clone();
//		anotherRiverFish.setType("Another river fish");
//		System.out.println(anotherRiverFish);
//
//		System.out.println(riverFish.equals(anotherRiverFish));
		
		// -----------------------------------------------------------------------
		
		FishFactory factory = new FishFactory();
		System.out.println(factory.getFish("River fish", "Sea fish", 2, "River"));
		FishInterface f = factory.getFish("River fish", "Sea fish", 2, "River");
		
		// ???? cloneFish( ???? ...)
		Fish fact = factory.cloneFish(f);
		
		

	}

}
