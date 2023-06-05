package com.abstractclass;
public class Scooter extends Vehicle {
	void noOfWheels() {
		System.out.println("Two no.. of wheels");
		 start ="Start with key";
		 System.out.println(start);
		 mrp ="fifty thousand";
		 System.out.println(mrp);
	}
	public static void main(String [] args) {
		Scooter scooter = new Scooter();
		scooter.noOfWheels();
	}

}
