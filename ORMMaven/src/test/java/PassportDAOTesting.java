import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import code.address.Address;
import code.address.AddressDAOImpl;
import code.passport.Passport;
import code.passport.PassportDAOImpl;
public class PassportDAOTesting {

	public PassportDAOTesting() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void findPassportTest() {
		
		PassportDAOImpl passportDao = new PassportDAOImpl();
		Passport passport = passportDao.findPassport(5);
		
			System.out.println(passport.toString());
		
	}
	@Test
	public void findAllPassportTest() {
		List<Passport> passportList = new ArrayList<Passport>();
		PassportDAOImpl passportDao = new PassportDAOImpl();

		passportList = passportDao.findAllPassport();
		for (Passport passport : passportList) {
			System.out.println(passport.toString());
		}
	}
	
	@Test
	public void createPassportTest() {
		
		PassportDAOImpl passportDao = new PassportDAOImpl();
		Passport passport = new Passport();
		passport.setPassportIssuedBy("Govt of India");
		passport.setPassportIssuedDate(LocalDate.of(2020, 03, 05));
		passport.setPassportNo("Passport No1");
		passportDao.createPassport(passport);
		
		System.out.println("Data persisted");
		
	}
	@Test
	public void deletePassportTest() {
		
		PassportDAOImpl passportDao = new PassportDAOImpl();
		passportDao.deletePassport(0);
		System.out.println("Passport deleted");
	}
	@Test
	public void updateAddressTest() {
		PassportDAOImpl passportDao = new PassportDAOImpl();
		Passport passport = new Passport();
		passport.setPassportIssuedBy("Govt of Sri Lanka");
		passport.setPassportIssuedDate(LocalDate.of(2019, 12, 03));
		passportDao.updatePassport(5);
		System.out.println("Data persisted");
	}

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
	
