package code;

public class Bicycle extends Vehicle {

	int noOfGears;

	public Bicycle(int numberOfWheels, String color, int numberOfPersons, int noOfGears) {
		super(numberOfWheels, color, numberOfPersons);
		System.out.println("Bicycle is being created");
		this.noOfGears = noOfGears;
	}

	int getNoOfGears() {
		return noOfGears;
	}

	void setNoOfGears(int noOfGears) {
		this.noOfGears = noOfGears;
	}

	@Override
	public String toString() {
		return "Bicycle [noOfGears=" + noOfGears + ", toString()=" + super.toString() + "]";
	}

	@Override
	void move(int distance) {
		System.out.println("Bicycle is moved by stepping on pedal");
	}

	@Override
	void stop() {
		System.out.println("Bicycle is stopped by pressing the brakes");
	}

	@Override
	void turn() {
		System.out.println("Bicycle is turned with help of handlebar");
	}

}
