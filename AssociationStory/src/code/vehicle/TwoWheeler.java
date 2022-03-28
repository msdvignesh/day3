package code.vehicle;

import code.person.Person;

public class TwoWheeler extends Vehicle implements TwoWheelerMethods{

	public void travel(Person me, Person friend) {
		System.out.println(me.getName()+ " and "+ friend.getName()+" are travelling in twoewheeler" );
	}	
}
