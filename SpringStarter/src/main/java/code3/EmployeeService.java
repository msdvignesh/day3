package code3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class EmployeeService {
	
DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		
		this.dataSource = dataSource;
		
	}
	
	public List<Employee> findAll(){
		
		List<Employee> employeeList = new ArrayList<Employee>();
		try {
		Connection conn = dataSource.getConnection();
		Statement statement = conn.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from employee");
		
		while(resultSet.next()) {
			
			Employee temp = new Employee();
			temp.setEmployeeId(resultSet.getInt(1));
			temp.setEmployeeName(resultSet.getString(2));
			temp.setHireDate(resultSet.getDate(3).toLocalDate());
			
			temp.setSalary(resultSet.getFloat(4));
			//temp.setManager(resultSet.getString(5));
			//temp.setJob(resultSet.getString(6));
			
			employeeList.add(temp);
		}
		
		
		
		}catch(SQLException sqle) {
			System.out.println(sqle);
		}
		return employeeList;
	}
	
	public List<Employee> findSortedSalary(){
		
		List<Employee> employeeList = new ArrayList<Employee>();
		try {
		Connection conn = dataSource.getConnection();
		Statement statement = conn.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from employee where salary<2000");
		
		while(resultSet.next()) {
			
			Employee temp = new Employee();
			temp.setEmployeeId(resultSet.getInt(1));
			temp.setEmployeeName(resultSet.getString(2));
			temp.setHireDate(resultSet.getDate(3).toLocalDate());
			
			temp.setSalary(resultSet.getFloat(4));
			//temp.setManager(resultSet.getString(5));
			//temp.setJob(resultSet.getString(6));
			
			employeeList.add(temp);
			
		}
		
		
		}catch(SQLException sqle) {
			System.out.println(sqle);
		}
		return employeeList;
	}
	
public List<Employee> findHiToLowSalary(int high,int low){
		
		List<Employee> employeeList = new ArrayList<Employee>();
		try {
		Connection conn = dataSource.getConnection();
		Statement statement = conn.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from employee where salary between "+high+" and "+low);
		
		while(resultSet.next()) {
			
			Employee temp = new Employee();
			temp.setEmployeeId(resultSet.getInt(1));
			temp.setEmployeeName(resultSet.getString(2));
			temp.setHireDate(resultSet.getDate(3).toLocalDate());
			
			temp.setSalary(resultSet.getFloat(4));
			//temp.setManager(resultSet.getString(5));
			//temp.setJob(resultSet.getString(6));
			
			employeeList.add(temp);
			
		}
		
		
		}catch(SQLException sqle) {
			System.out.println(sqle);
		}
		return employeeList;
	}


}
