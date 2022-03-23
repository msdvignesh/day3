package code;

public class Vehicle {

	private int numberOfWheels, numberOfPersons;
	private String color;

	public Vehicle(int numberOfWheels, String color, int numberOfPersons) {
		super();
		System.out.println("Vehicle is being created");
		this.numberOfWheels = numberOfWheels;
		this.color = color;
		this.numberOfWheels = numberOfPersons;

	}

	void start() {
		System.out.println("Vehicle is started");
	}

	void stop() {
		System.out.println("Vehicle is coming to a halt");
	}

	void move(int distance) {
		System.out.println("Vehicle is moving by distance of " + distance + " m");
	}

	void turn() {
		System.out.println("Vehicle is being turned");
	}
	public void setVechicle(int numberofWheels, String color) {
		this.numberOfWheels = numberofWheels;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehicle [numberOfWheels=" + numberOfWheels + ", color=" + color + "]";
	}

	
}
