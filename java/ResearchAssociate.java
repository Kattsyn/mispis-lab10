import java.util.*;

public class ResearchAssociate extends Employee {

	private String researchArea;
	private Collection<Project> projects;

	public String getResearchArea() {
		return this.researchArea;
	}

	public void setResearchArea(String researchArea) {
		this.researchArea = researchArea;
	}

	public Collection<Project> getProjects() {
		return this.projects;
	}

	public void setProjects(Collection<Project> projects) {
		this.projects = projects;
	}

	/**
	 * 
	 * @param socialSecurityNumber
	 * @param name
	 * @param email
	 * @param researchArea
	 */
	public ResearchAssociate(int socialSecurityNumber, String name, String email, String researchArea) {
		// TODO - implement ResearchAssociate.ResearchAssociate
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param project
	 */
	public void addProject(Project project) {
		// TODO - implement ResearchAssociate.addProject
		throw new UnsupportedOperationException();
	}

}