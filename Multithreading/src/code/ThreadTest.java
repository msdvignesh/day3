package code;

public class ThreadTest {


	public static void main(String[] args) {
		 
		Bike bikeObj1 = new Bike("JAWA 42","TN-38-AU-2335");
		Bike bikeObj2 = new Bike("RE METEOR","TN-39-BH-3454");
		Bike bikeObj3 = new Bike("YEZDI","TN-99-GF-7877");
		
		Thread t1 = new Thread(bikeObj1);
		Thread t2 = new Thread(bikeObj2);
		Thread t3 = new Thread(bikeObj3);
		
		Bicycle bicycleObj1 = new Bicycle("Bicycle 1");
		Bicycle bicycleObj2 = new Bicycle("Bicycle 2");
		Bicycle bicycleObj3 = new Bicycle("Bicycle 3");
		
		t1.start();
		t2.start();
		t3.start();
		bicycleObj1.start();
		bicycleObj2.start();
		bicycleObj3.start();
	}

}
