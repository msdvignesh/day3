import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import code.project.Project;
import code.project.ProjectDAOImpl;

;
public class ProjectDAOTesting {

	public ProjectDAOTesting() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void findProjectTest() {
		
		ProjectDAOImpl projectDao = new ProjectDAOImpl();
		Project project = projectDao.findProject(5);
		
			System.out.println(project.toString());
		
	}
	@Test
	public void findAllProjectTest() {
		List<Project> projectList = new ArrayList<Project>();
		ProjectDAOImpl projectDao = new ProjectDAOImpl();

		projectList = projectDao.findAllPassport();
		for (Project project : projectList) {
			System.out.println(project.toString());
		}
	}
	
	@Test
	public void createProjectTest() {
		
		ProjectDAOImpl projectDao = new ProjectDAOImpl();
		Project project = new Project();
		project.setProjectTitle("Title 1");
		projectDao.createProject(project);
		System.out.println("Data persisted");
		
	}
	@Test
	public void deletePassportTest() {
		
		ProjectDAOImpl passportDao = new ProjectDAOImpl();
		passportDao.deleteProject(0);
		System.out.println("Passport deleted");
	}
	@Test
	public void updateAddressTest() {
		ProjectDAOImpl projectDao = new ProjectDAOImpl();
		Project project = new Project();
		project.setProjectTitle("Changed Tilke");
		
		projectDao.updateProject(5);
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
	
