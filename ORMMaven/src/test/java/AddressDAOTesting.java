import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import code.address.Address;
import code.address.AddressDAOImpl;

public class AddressDAOTesting {
	


	public AddressDAOTesting() {
		super();
	
	
	}
	
//	
//	public void createAddressTest() {
//		Address address = new Address();
//		address.setCity("City 1");
//		address.setDoorNo("Door no 1");
//		address.setPincode(958650);
//		address.setState("State 1");
//		address.setStreeName("Street 1");
//		
//	}
//	
	@Test
	public void findAddressTest() {
		
		AddressDAOImpl addressDao = new AddressDAOImpl();
		Address address = addressDao.findAddress(5);
		
			System.out.println(address.toString());
		
	}
	@Test
	public void findAllAddressTest() {
		List<Address> addressList = new ArrayList<Address>();
		AddressDAOImpl addressDao = new AddressDAOImpl();

		addressList = addressDao.findAllAddress();
		for (Address address : addressList) {
			System.out.println(address.toString());
		}
	}
	
	@Test
	public void createAddressTest() {
		
		AddressDAOImpl addressDao = new AddressDAOImpl();
		Address address = new Address();
		address.setCity("City 4");
		address.setDoorNo("Door no 3");
		address.setPincode(641999);
		address.setState("State 4");
		address.setStreeName("String 4");
		addressDao.createAddress(address);
		System.out.println("Data persisted");
		
	}
	@Test
	public void deleteAddressTest() {
		
		AddressDAOImpl addressDao = new AddressDAOImpl();
		addressDao.deleteAddress(4);
		System.out.println("Address deleted");
	}
	@Test
	public void updateAddressTest() {
		AddressDAOImpl addressDao = new AddressDAOImpl();
		Address address = new Address();
		address.setCity("City 1");
		address.setDoorNo("Door no 1");
		address.setPincode(641999);
		address.setState("State 1");
		address.setStreeName("String 1");
		addressDao.createAddress(address);
		System.out.println("Data persisted");
		addressDao.updateAddress(address);
	}
}
