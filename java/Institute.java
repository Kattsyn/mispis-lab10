import java.util.*;

public class Institute {

	private String name;
	private String address;
	private Collection<ResearchAssociate> researchAssociates;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Collection<ResearchAssociate> getResearchAssociates() {
		return this.researchAssociates;
	}

	public void setResearchAssociates(Collection<ResearchAssociate> researchAssociates) {
		this.researchAssociates = researchAssociates;
	}

	/**
	 * 
	 * @param name
	 * @param address
	 */
	public Institute(String name, String address) {
		// TODO - implement Institute.Institute
		throw new UnsupportedOperationException();
	}

}