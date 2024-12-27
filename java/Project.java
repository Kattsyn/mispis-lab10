public class Project {

	private String name;
	private java.time.LocalDate startingDate;
	private java.time.LocalDate endDate;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public java.time.LocalDate getStartingDate() {
		return this.startingDate;
	}

	public void setStartingDate(java.time.LocalDate startingDate) {
		this.startingDate = startingDate;
	}

	public java.time.LocalDate getEndDate() {
		return this.endDate;
	}

	public void setEndDate(java.time.LocalDate endDate) {
		this.endDate = endDate;
	}

	/**
	 * 
	 * @param name
	 * @param startingDate
	 * @param endDate
	 */
	public Project(String name, java.time.LocalDate startingDate, java.time.LocalDate endDate) {
		// TODO - implement Project.Project
		throw new UnsupportedOperationException();
	}

}