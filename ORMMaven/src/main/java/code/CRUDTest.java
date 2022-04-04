package code;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl;

public class CRUDTest {
	
	public static void main(String arg[]) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Employee emp = new Employee();
		emp.setEmployeeName("Employee 1");
		emp.setEmployeeNumber(8098506);
		emp.setJob("Developer ");
		emp.setJoiningDate(LocalDate.of(2021, 05, 01));
		emp.setSalary(50000);
		
		et.begin();
			em.persist(emp);
		et.commit();	
		
		
		Employee emp1 = new Employee();
		emp1.setEmployeeName("Employee 2");
		emp1.setEmployeeNumber(80985061);
		emp1.setJob("Developer ");
		emp1.setJoiningDate(LocalDate.of(2021, 05, 01));
		emp1.setSalary(50000);
		
		et.begin();
			em.persist(emp1);
			//em.remove(emp1);
		et.commit();
		
	}
}
