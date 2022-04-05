package code.address;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AddressDAOImpl implements AddressDAO{
	
	EntityManagerFactory emf ;
	EntityManager em ;
	EntityTransaction et ;
	
	public AddressDAOImpl() {
		emf = Persistence.createEntityManagerFactory("MyJPA");
		em = emf.createEntityManager();
		et = em.getTransaction();
		
	}
	

	public void createAddress(Address address) {
		
		
		
		et.begin();
			em.persist(address);
		et.commit();
		
		
	}

	public void updateAddress(Address address) {
		et.begin();
		Address address1 = em.find(Address.class, address.getAddressId());
		if(address1!=null) {
			
			address1.setCity(address.getCity());
			address1.setDoorNo(address.getDoorNo());
			address1.setPincode(address.getPincode());
			address1.setState(address.getState());
			address1.setStreeName(address.getStreeName());
			em.merge(address1);
			et.commit();
		}
		else
			System.out.println("Address not found");
		
		
	}

	public void deleteAddress(int addressId) {
		et.begin();
		Address address1 = em.find(Address.class, addressId);
		if(address1!=null) {
			em.remove(address1);
		}
		
		else
			System.out.println("Address not found");
		
	}

	public Address findAddress(int addressId) {
		
		et.begin();
		Address address1 = em.find(Address.class,addressId);
		if(address1!=null) {
			return address1; 
		}
		
		else {
			System.out.println("Address not found");
			return null;
			
		}
		
		
	}

	public List findAllAddress() {
		List<Address> addressList =  new ArrayList<Address>();
		Query query = em.createQuery("from Address");
		addressList = query.getResultList();
		for (Address address : addressList) {
			System.out.println(address.toString());
		}
		
		return addressList;
	}

	
}
