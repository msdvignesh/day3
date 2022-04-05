package code.project;

import java.util.List;



public interface ProjectDAO {


	public void createProject(Project project);
	public void updateProject(Project project);
	public void deleteProject(int projecttId);
	public Project findProject(int projectId);
	public List findAllProject();


}
