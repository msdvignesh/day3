package annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class Piston {
	String pistonType;
	
	public Piston(){
		System.out.println("Piston1 constructed");
		
	}
	
	public Piston(String string){
		System.out.println("Piston2 constructed");
		
	}
	public void setPistonType(String pistonType){
		this.pistonType = pistonType;
		System.out.println("Piston is being created"+pistonType);
	}

}
