package code;

public class Bike extends TwoWheeler implements Runnable {
	
	private String model;
	private String bikeNumber;
	public Bike(String model, String bikeNumber) {
		super();
		this.model = model;
		this.bikeNumber = bikeNumber;
	}

	public void run() {
		System.out.println(this.model + "is running");
	}
	
}
