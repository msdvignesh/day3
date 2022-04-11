package annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class Car {
	Engine engine;
	
	public Car() {
		System.out.println("Car constructor");
		
	}
	
	public Car(Engine engineObj) {
		System.out.println("Car constructor");
		
	}
	
	public void setEngine(Engine engineObj){
		this.engine = engine;
		System.out.println("Car is being created");
	}

}
