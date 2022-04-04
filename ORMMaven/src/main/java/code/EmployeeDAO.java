package code;

import java.util.ArrayList;
import java.util.List;

public interface EmployeeDAO {
	
	public void createEmployee(Employee employee);
	public void updateEmployee(Employee employee);
	public Employee selectEmployee(int employeeNumber);
	public void deleteEmployee(int employeeNumber);
	public ArrayList<Employee> selectAllEmployees();

}
