
package code.stroy;

import code.business.Trading;
import code.classRoom.ClassRoom;
import code.classRoom.Grades;
import code.classRoom.LearningGuitar;
import code.hotel.GasBill;
import code.hotel.LPG;
import code.hotel.Room;
import code.movie.Movie;
import code.person.Person;
import code.restaurant.Food;
import code.restaurant.FoodRestaurant;
import code.toy.Toy;
import code.vehicle.TwoWheeler;

public class AssociationStory {
	public static void main(String[] args) {

		Person personObj1 = new Person("Vignesh", "M");
		Person personObj2 = new Person("Avinash", "M");
		Food foodObj1 = new Food("Food 1 ");
		TwoWheeler bikeObj1 = new TwoWheeler();

		personObj1.eat(foodObj1);
		personObj1.eat(foodObj1);

		bikeObj1.travel(personObj1, personObj2);

		Movie movieObj1 = new Movie();
		personObj1.watchMovie(movieObj1);

		Toy toy = new Toy("Car");
		personObj1.play(toy);
		
		
		Room room = new Room(101);
		room.usedBy(personObj1);
		FoodRestaurant foodRestaurantObj1 = new FoodRestaurant("KFC");
		foodRestaurantObj1.usedBy(personObj1, personObj2);
		LPG lpg = new LPG();
		GasBill gasBillObj1 = foodRestaurantObj1.consumes(lpg);
		System.out.println("Fuel expenses for FoodRestuarant is "+ gasBillObj1.getTotalAmount());
		
		Trading tradingObj1 = new Trading();
		personObj2.earns(tradingObj1);
		
		ClassRoom classRoomObj1 = new ClassRoom();
		LearningGuitar learningGuitarObj1 = new LearningGuitar();
		classRoomObj1.teach(learningGuitarObj1);
		Grades g = new Grades();
		classRoomObj1.result(g);

	}
}
