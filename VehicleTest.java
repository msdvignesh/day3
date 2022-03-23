package code;

public class VehicleTest {
public static void main(String[] args) {
	
	Vehicle v1 = new Vehicle(2, "Green", 2);
	v1.toString();
	v1.start();
	v1.move(10);
	v1.turn();
	v1.stop();
	System.out.println("--------------------------------");
	
	Bicycle b1 = new Bicycle(2, "Green", 2,5);
	b1.toString();
	b1.start();
	b1.move(10);
	b1.turn();
	b1.stop();
	System.out.println("--------------------------------");
	
	Car c1 = new Car(2, "Green", 2,5,"Mercedes");
	c1.toString();
	c1.start();
	c1.move(10);
	c1.turn();
	c1.stop();
	System.out.println("--------------------------------");
	
}
}
