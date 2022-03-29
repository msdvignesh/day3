package code;

public class Bicycle extends Thread {

	String name;

	public Bicycle(String name) {
		super();
		this.name = name;
	}
	
	public void run() {
		System.out.println(this.name + " is running");
	}
	

}
