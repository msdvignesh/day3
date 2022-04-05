package code.project;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import code.passport.Passport;

public class ProjectDAOImpl implements ProjectDAO{
	EntityManagerFactory emf ;
	EntityManager em ;
	EntityTransaction et ;
	
	public ProjectDAOImpl() {
		emf = Persistence.createEntityManagerFactory("MyJPA");
		em = emf.createEntityManager();
		et = em.getTransaction();
		
	}

	public void createProject(Project project) {
		et.begin();
		em.persist(project);
	et.commit();		
	}

	public void updateProject(int projectId) {
		et.begin();
		Project project1= em.find(Project.class, projectId);
		if(project1!=null) {
			
			
			project1.setProjectTitle(project1.getProjectTitle());
			
			em.merge(project1);
			et.commit();
		}
		else
			System.out.println("Passport not found");				
	}

	public void deleteProject(int projectId) {
		// TODO Auto-generated method stub
		et.begin();
		Project project1 = em.find(Project.class, projectId);
		if(project1!=null) {
			em.remove(project1);
		}
		
		else
			System.out.println("Passport not found");		
		
	}

	public Project findProject(int projectId) {
		// TODO Auto-generated method stub
		
		et.begin();
		Project project1 = em.find(Project.class, projectId);
		if(project1!=null) {
			return project1; 
		}
		
		else {
			System.out.println("Project not found");
			return null;
			
		}
	
	}

	public List findAllProject() {
		List<Project> projectList =  new ArrayList<Project>();
		Query query = em.createQuery("from Address");
		projectList = query.getResultList();
		for (Project project : projectList) {
			System.out.println(project.toString());
		}
		
		return projectList;
	}

	public void updateProject(Project project) {
		// TODO Auto-generated method stub
		
	}

}
