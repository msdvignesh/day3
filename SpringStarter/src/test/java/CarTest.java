import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import code4.Car;

public class CarTest {
	
	@Test
	public void carTest() {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("resources4.xml");
		
		Car car = (Car)ac.getBean("carObj");
		
	}

}
