package org.pamenon.jbpm.claimfund.domain.facts;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Location implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label(value = "council")
	private java.lang.String council;

	public Location() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getCouncil() {
		return this.council;
	}

	public void setCouncil(java.lang.String council) {
		this.council = council;
	}

	public Location(java.lang.String name, java.lang.String council) {
		this.name = name;
		this.council = council;
	}

}