package annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Engine {
	Piston piston;
	
	public Engine(){
		System.out.println("Engine 1constructor ");
		
	}
	
	public Engine(Piston piston){
		System.out.println("Engine2 constructor ");
		
	}
	public void setPiston(Piston p){
		this.piston = p;
		System.out.println("Engine3 is being created");
	}

}
