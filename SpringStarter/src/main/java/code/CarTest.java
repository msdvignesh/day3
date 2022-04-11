package code;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {
	
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		System.out.println("Entering main");
		ApplicationContext ac = new ClassPathXmlApplicationContext("resources.xml");
	}

}
