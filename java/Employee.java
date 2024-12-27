public abstract class Employee {

	protected int socialSecurityNumber;
	protected String name;
	protected String email;
	public static int counter;

	public int getSocialSecurityNumber() {
		return this.socialSecurityNumber;
	}

	public void setSocialSecurityNumber(int socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 
	 * @param socialSecurityNumber
	 * @param name
	 * @param email
	 */
	public Employee(int socialSecurityNumber, String name, String email) {
		// TODO - implement Employee.Employee
		throw new UnsupportedOperationException();
	}

}