package code.person;

import code.book.Book;
import code.business.Trading;
import code.movie.Movie;
import code.restaurant.Food;
import code.shirt.Shirt;
import code.toy.Toy;

public class Person extends personMethods {

	private String name, gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Person(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;

	}

	public void wears(Shirt shirt) {

		System.out.println(this.name + " is wearing a shirt");
	}

	public void eat(Food food) {
		System.out.println(this.name + " is eating food");
	}

	public void eat(Food food, Person friend) {
		System.out.println(this.name + " " + friend.name + " are eating foood" + food.getName());
	}

	public void play(Toy toy) {
		System.out.println(this.name + "is playing with a " + toy.getName() + "toy ");
	}

	public void read(Book book) {
		System.out.println(this.name + "reads a book");
	}

	public void watchMovie(Movie movie) {
		System.out.println(this.name + " is watching movie");
	}

	public void earns(Trading trading) {
		System.out.println(this.name + "earns money through Trading");
	}
}
