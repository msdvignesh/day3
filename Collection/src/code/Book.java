package code;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.sql.*;
public class Book {
	private int isbn;
	private String name;
	private LocalDate year;
	private String author;

	public Book() {
		
		
		
	}
	

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", year=" + year + ", author=" + author + "]";
	}


	public Book(int isbn, String name, LocalDate year, String author) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.year = year;
		this.author = author;
	}
	
	
}


