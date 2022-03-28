package code.restaurant;

import code.hotel.FeedbackForm;
import code.hotel.GasBill;
import code.hotel.LPG;
import code.person.Person;

public class FoodRestaurant extends Restaurant implements FoodRestaurantMethods {
	
	private String name;
	FeedbackForm feedBackFormObj;
	
	public FoodRestaurant(String name) {
		super();
		this.name = name;
		
	}



	public void usedBy(Person personObj1, Person personObj2) {
		System.out.println("FoodRestaurant is used by "+ personObj1.getName() + " and "+personObj2.getName() );
	}

	public GasBill consumes(LPG lpg) {
		
		GasBill gasBill = new GasBill();
		gasBill.setTotalAmount(500);
		return gasBill;
	}
	
	
	
}
