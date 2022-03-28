package code.vehicle;

import code.person.Person;

public class TwoWheeler extends Vehicle implements TwoWheelerMethods{

	public void travel(Person me, Person friend) {
		TwoWheeler tw = new TwoWheeler();
		tw.key ="key1";
		
		System.out.println(me.getName()+ " and "+ friend.getName()+" are travelling in twoewheeler" );
	}	
}
