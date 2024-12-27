import java.util.*;

public class Faculty {

	private String name;
	private Employee dean;
	private Collection<Institute> institutes;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee getDean() {
		return this.dean;
	}

	public void setDean(Employee dean) {
		this.dean = dean;
	}

	public Collection<Institute> getInstitutes() {
		return this.institutes;
	}

	public void setInstitutes(Collection<Institute> institutes) {
		this.institutes = institutes;
	}

	/**
	 * 
	 * @param name
	 * @param dean
	 */
	public Faculty(String name, Employee dean) {
		// TODO - implement Faculty.Faculty
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param institute
	 */
	public void addInstitute(Institute institute) {
		// TODO - implement Faculty.addInstitute
		throw new UnsupportedOperationException();
	}

}