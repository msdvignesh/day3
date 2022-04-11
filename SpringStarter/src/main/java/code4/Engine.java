package code4;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	Piston piston;
	
	public Engine(){
		System.out.println("Engine constructor ");
		
	}
	
	public Engine(Piston piston){
		System.out.println("Engine constructor ");
		
	}
	public void setPiston(Piston p){
		this.piston = p;
		System.out.println("Engine is being created");
	}

}
