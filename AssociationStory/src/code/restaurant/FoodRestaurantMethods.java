package code.restaurant;

import code.hotel.GasBill;
import code.hotel.LPG;
import code.person.Person;

public interface FoodRestaurantMethods {
	
	void usedBy(Person personObj1, Person personObj2);
	GasBill consumes(LPG lpg) ;

}
