import java.io.File;
import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import code3.Employee;
import code3.EmployeeService;

public class EmployeeServiceTest {

//	@Test
//	public void createEmployeeTest() {
//		ApplicationContext ac = new ClassPathXmlApplicationContext("resources3.xml");
//		
//		EmployeeService es = (EmployeeService) ac.getBean("jdbc");
//		
//		Connection conn = 
//		Employee employee = new Employee();
//		employee.setEmployeeId(45654);
//		employee.setEmployeeName("Employee 1");
//		employee.setHireDate(LocalDate.of(2018, 12, 05));
//		employee.setJob("Clerical");
//		employee.setManager("Manager 1");
//		employee.setSalary(50000);
//		
//		
//		
//		
//		
//	}

	@Test
	public void employeeServiceTest() {

		ApplicationContext ac = new ClassPathXmlApplicationContext("resources3.xml");
		EmployeeService es = (EmployeeService) ac.getBean("jdbc");

		System.out.println("Testing ");

		// EmployeeService es = new EmployeeService();

		List<Employee> employeeList = es.findAll();

		for (Employee employee : employeeList) {

			System.out.println("Employee id:"+employee.getEmployeeId());
			System.out.println("Employee name : "+employee.getEmployeeName());
			System.out.println("Employee HireDate : "+employee.getHireDate());
			System.out.println("Employee salary :"+ employee.getSalary()+"\n--------------------------------");
		}

	}
	

	@Test
	public void findSortedSalaryTest() {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("resources3.xml");
		EmployeeService es = (EmployeeService) ac.getBean("jdbc");

		System.out.println("Testing ");

		// EmployeeService es = new EmployeeService();

		List<Employee> employeeList = es.findSortedSalary();

		for (Employee employee : employeeList) {

			System.out.println("Employee id:"+employee.getEmployeeId());
			System.out.println("Employee name : "+employee.getEmployeeName());
			System.out.println("Employee HireDate : "+employee.getHireDate());
			System.out.println("Employee salary :"+ employee.getSalary()+"\n--------------------------------");
		}
		
		
		
	}
	
	@Test
	public void findHiToLowSalaryTest() {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("resources3.xml");
		EmployeeService es = (EmployeeService) ac.getBean("jdbc");

		System.out.println("Testing ");

		// EmployeeService es = new EmployeeService();

		List<Employee> employeeList = es.findHiToLowSalary(1500,3000);

		for (Employee employee : employeeList) {

			System.out.println("Employee id:"+employee.getEmployeeId());
			System.out.println("Employee name : "+employee.getEmployeeName());
			System.out.println("Employee HireDate : "+employee.getHireDate());
			System.out.println("Employee salary :"+ employee.getSalary()+"\n--------------------------------");
		}
		
		
		
	}
	
	

}
