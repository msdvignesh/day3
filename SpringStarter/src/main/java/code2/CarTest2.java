package code2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest2 {
	
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		System.out.println("Entering main");
		ApplicationContext acc = new ClassPathXmlApplicationContext("resources2.xml");
	}

}
