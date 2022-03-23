package code;

public class Car extends Vehicle {
	
	private int engineNumber;
	private String brand;
	
	public Car(int numberOfWheels, String color,int numberOfPersons, int engineNumber, String brand) {
		super(numberOfWheels, color,numberOfPersons);
		System.out.println("Car is being created");
		this.engineNumber = engineNumber;
		this.brand = brand;
	}

	int getEngineNumber() {
		return engineNumber;
	}

	void setEngineNumber(int engineNumber) {
		this.engineNumber = engineNumber;
	}

	String getBrand() {
		return brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Car [engineNumber=" + engineNumber + ", brand=" + brand + ", getEngineNumber()=" + getEngineNumber()
				+ ", getBrand()=" + getBrand() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void start() {
		System.out.println("Car is started with key");
	}
	
	@Override
	public void move(int distance) {
		System.out.println("car is moved by a distance of "+distance+"m by stepping on accelerator");
	}
	
	@Override
	public void stop() {
		System.out.println("Car is stopped by stepping on brake");
	}
	
	public void turn() {
		System.out.println("Car is turned with a steering");
	}

	public void moveReverse() {
		System.out.println("Car is being moved in reverse direction");
	}
	
}
