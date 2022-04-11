package code4;

import org.springframework.stereotype.Component;

@Component
public class Piston {
	String pistonType;
	
	public Piston(){
		System.out.println("Piston constructed");
		
	}
	
	public Piston(String string){
		System.out.println("Piston constructed");
		
	}
	public void setPistonType(String pistonType){
		this.pistonType = pistonType;
		System.out.println("Piston is being created"+pistonType);
	}

}
