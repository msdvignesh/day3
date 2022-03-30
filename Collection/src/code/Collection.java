package code;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class Collection {

	
		
		public static void main(String[] args) {
			HashSet<Book> bookSet = new HashSet<>();
			bookSet.add(new Book(123,"Head on Java",LocalDate.of(2022,03,05),"Ryan Gosling"));
			System.out.println("Book1 created");
			bookSet.add(new Book(123,"Head on Java",LocalDate.of(2022,03,05),"Ryan Gosling"));
			System.out.println("Book2 created");
			
			
			Iterator<Book> iterator = bookSet.iterator();
			
			while(iterator.hasNext()) {
				Book bookSample = iterator.next();
				System.out.println(/*"Hashcode : "+bookSample.hashCode()+" "+*/bookSample.toString());
				
			}
			
			
			LinkedList<Log> logList = new LinkedList<>();
			logList.add(new Log("Missed", "Name 1 ", LocalDate.of(2022, 12, 03)));
			logList.add(new Log("Received", "Name 2 ", LocalDate.of(2021, 04, 12)));
			logList.add(new Log("Dialled", "Name 3 ", LocalDate.of(2020, 10, 05)));
			
			Iterator<Log> iterator1 = logList.iterator();
			
			while(iterator1.hasNext()) {
				Log logSample = iterator1.next();
				System.out.println(logSample.toString());
				
			}
			
			
			TreeSet<ChemicalElement> chemicalTree = new TreeSet<>();
			chemicalTree.add(new ChemicalElement(1.000078f, 1, "H"));
			chemicalTree.add(new ChemicalElement(51.996f,24,  "Cr"));
			chemicalTree.add(new ChemicalElement(107.87f, 47, "Ag"));
			
			Iterator<ChemicalElement> iterator2 = chemicalTree.iterator();
			
			while(iterator2.hasNext()) {
				ChemicalElement chemical = iterator2.next();
				System.out.println(contact.toString());
				
			}
			
			
			ArrayList<Contact> contactList = new ArrayList<>();
			contactList.add(new Contact("Vignesh","Office","9578323986"));
			contactList.add(new Contact("Vignesh 1","Home","9456567878"));
			contactList.add(new Contact("Vignesh 2","Family","5657768888"));
			
			Iterator<Contact> iterator3 = contactList.iterator();
			
			while(iterator3.hasNext()) {
				Contact contact = iterator3.next();
				System.out.println(contact.toString());
				
			}
			
			
			
//			try {
//				
//				Class.forName("oracle.jdbc.odbc.OracleDriver");
//				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
//				Statement statement = conn.createStatement();
//				ResultSet rs = statement.executeQuery("select * from table ");
//				while(rs.next()) {
//					System.out.println(rs.getInt()+rs.getString(2));
//				}
//				
//				
//				
//			}catch( ClassNotFoundException se) {
//				
//			}
			

//			try {
//				Class.forName("oracle.jdbc.odbc.OracleDriver");
//				Connection con = new Connection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
//				Statement statement = con.createStatement();
//				ResultSet rs = statement.executeQuery("select * from table");
//				
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			

//		@Test
//		public void testBookConstructor(int isbn, String name, LocalDate year, String author) {
//			
//			Book book = new Book(123,"Head on Java",LocalDate.of(2022,03,05),"Ryan Gosling");
//			Asser
//			System.out.println("Book created");
//		}
		
	}


		/*@Override
		public int hashCode() {
			return Objects.hash(author, isbn, name, year);
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Book other = (Book) obj;
			return Objects.equals(author, other.author) && isbn == other.isbn && Objects.equals(name, other.name)
					&& Objects.equals(year, other.year);
			
			
		}
	*/
		// TODO Auto-generated constructor stub
	}


