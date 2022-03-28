package code.person;

import code.book.Book;
import code.business.Trading;
import code.movie.Movie;
import code.restaurant.Food;
import code.shirt.Shirt;
import code.toy.Toy;

abstract class personMethods {
	
	public abstract void wears(Shirt shirt);
	abstract void eat(Food food) ;
	abstract void eat(Food food, Person friend) ;
	abstract void play(Toy toy);
	abstract void read(Book book);
	abstract void watchMovie(Movie movie);
	abstract void earns(Trading trading) ;

}
