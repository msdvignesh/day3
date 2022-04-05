package code.passport;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import code.address.Address;

public class PassportDAOImpl implements PassportDAO {
	EntityManagerFactory emf ;
	EntityManager em ;
	EntityTransaction et ;
	
	public PassportDAOImpl() {
		emf = Persistence.createEntityManagerFactory("MyJPA");
		em = emf.createEntityManager();
		et = em.getTransaction();
		
	}
	public void createPassport(Passport passport) {
		// TODO Auto-generated method stub
		
		et.begin();
			em.persist(passport);
		et.commit();
		
	}

	public void updatePassport(int passportId) {
		et.begin();
		Passport passport1 = em.find(Passport.class, passportId);
		if(passport1!=null) {
			
			passport1.setPassportIssuedBy(passport1.getPassportIssuedBy());
			passport1.setPassportIssuedDate(passport1.getPassportIssuedDate());
			passport1.setPassportNo(passport1.getPassportNo());
			em.merge(passport1);
			et.commit();
		}
		else
			System.out.println("Passport not found");		
	}

	public void deletePassport(int passportId) {
		et.begin();
		Passport passport1 = em.find(Passport.class, passportId);
		if(passport1!=null) {
			em.remove(passport1);
		}
		
		else
			System.out.println("Passport not found");		
	}

	public Passport findPassport(int passportId) {
		et.begin();
		Passport passport1 = em.find(Passport.class, passportId);
		if(passport1!=null) {
			return passport1; 
		}
		
		else {
			System.out.println("Passport not found");
			return null;
			
		}
		
	}

	public List findAllPassport() {
		List<Passport> passportList =  new ArrayList<Passport>();
		Query query = em.createQuery("from Address");
		passportList = query.getResultList();
		for (Passport passport : passportList) {
			System.out.println(passport.toString());
		}
		
		return passportList;
	}

}
