

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import code.Employee;

public class CrudTesting {
	@Test
	public void createEmployee() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Employee emp = new Employee();
		emp.setEmployeeName("Employee 1");
		//emp.setEmployeeNumber(8098506);
		emp.setJob("Developer ");
		emp.setJoiningDate(LocalDate.of(2021, 05, 01));
		emp.setSalary(50000);
		
		et.begin();
			em.persist(emp);
		et.commit();	
		
		
		Employee emp1 = new Employee();
		emp1.setEmployeeName("Employee 2");
		//emp1.setEmployeeNumber(80985061);
		emp1.setJob("Developer ");
		emp1.setJoiningDate(LocalDate.of(2021, 05, 01));
		emp1.setSalary(50000);
		
//		ArrayList<Employee> empList = new ArrayList<Employee>();
//		empList.add(emp1);
//		empList.add(emp1);
//		
//		et.begin();
//			em.persist(empList);
//			//em.remove(emp1);
//		et.commit();
		
		
		
	}
	@Test
	public void findEmplTest() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Employee emp = em.find(Employee.class, 6);
		Assertions.assertTrue(emp!=null);
		System.out.println(emp.toString());
		
		
	}
	
	@Test
	public void findAllEmplTest() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Query query = em.createQuery("from Employee");
		
		ArrayList<Employee> empList= (ArrayList<Employee>) query.getResultList();
		
		for (Employee employee : empList) {
			System.out.println(employee.toString());
		}
		
	}
	
	
	@Test
	public void updateEmp() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Employee emp = em.find(Employee.class, 5);
		Assertions.assertTrue(emp!=null);
		System.out.println(emp.toString());
		emp.setEmployeeName("Changed Employee");
		emp.setSalary(emp.getSalary()+500);
		emp.setJob("Employee Job Changed");
		em.merge(emp);
		et.commit();
		
	}
	
	@Test
	public void deleteEmp() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Employee emp = em.find(Employee.class, 5);
		Assertions.assertTrue(emp!=null);
		System.out.println(emp.toString());
		
		em.remove(emp);
		et.commit();
	}
	
}
