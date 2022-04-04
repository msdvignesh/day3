package code;

import java.util.ArrayList;
import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	EntityManagerFactory emf;
	EntityManager em;
	EntityTransaction et;
	
	

	public EmployeeDAOImpl() {
		super();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		// TODO Auto-generated constructor stub
	}

	public void createEmployee(Employee employee) {
		
		et.begin();
			em.persist(employee);
		et.commit();
		
		
	}

	public void updateEmployee(Employee employee) {
		
		et.begin();
			Employee emp = em.find(Employee.class, employee.getEmployeeNumber());
			if(emp!=null) {
				emp.setEmployeeName(employee.getEmployeeName());
				emp.setJob(employee.getJob());
				emp.setSalary(employee.getSalary());
				em.merge(emp);
			}
			else {
				System.out.println("Employee not found");
			}
		
		
	}

	public Employee selectEmployee(int empId) {
		Employee emp = em.find(Employee.class,empId);
		return emp;
	}

	public void deleteEmployee(int empId) {
		
		et.begin();
		Employee emp = em.find(Employee.class, empId);
		if(emp!=null) {
			em.remove(emp);
		}
		else {
			System.out.println("Employee not found");
		}
		
		
	}

	public ArrayList<Employee> selectAllEmployees() {
		
		ArrayList<Employee> employee = (ArrayList<Employee>) em.createQuery("from Employee");
			for (Employee employee2 : employee) {
				System.out.println(employee2.toString());
			}
		
		return employee;
	}

//	public List<Employee> selectAllEmployees() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
