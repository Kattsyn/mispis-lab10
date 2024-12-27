import java.util.*;

public class Lecturer extends ResearchAssociate {

	private Collection<Course> courses;

	public Collection<Course> getCourses() {
		return this.courses;
	}

	public void setCourses(Collection<Course> courses) {
		this.courses = courses;
	}

	/**
	 * 
	 * @param socialSecurityNumber
	 * @param name
	 * @param email
	 * @param researchArea
	 */
	public Lecturer(int socialSecurityNumber, String name, String email, String researchArea) {
		// TODO - implement Lecturer.Lecturer
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param course
	 */
	public void addCourse(Course course) {
		// TODO - implement Lecturer.addCourse
		throw new UnsupportedOperationException();
	}

}