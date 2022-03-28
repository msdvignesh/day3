package code.hotel;

import code.person.Person;

public class Room implements roomMethods {

	private int roomNo;
	
	
	public Room(int roomNo) {
		super();
		this.roomNo = roomNo;
	}


	public void usedBy(Person guest) {
		System.out.println(guest.getName()+" is staying in "+this.roomNo);
		
	}
}
