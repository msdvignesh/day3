package code;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;

@Entity
@Table(name="emp_tbl")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int employeeNumber;
	
	@Column(name="EMP_NAME", length = 30)
	private String employeeName;
	
	@Column(name="EMP_JOB", length = 20)
	private String job;
	
	@Column(name="EMP_JOINING_DATE")
	private LocalDate joiningDate;
	
	@Column(name="EMP_SALARY")
	private double salary;
	
	public Employee() {
		super();
		System.out.println("Employee created");
		// TODO Auto-generated constructor stub
	}
	
	Employee(int employeeNumber, String employeeName, String job, LocalDate joiningDate, double salary) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.job = job;
		this.joiningDate = joiningDate;
		this.salary = salary;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName + ", job=" + job
				+ ", joiningDate=" + joiningDate + ", salary=" + salary + "]";
	}
	
	
	
	
	
	
}
