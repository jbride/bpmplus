package com.bacop.bpmplus;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Person implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "firstName")
	private java.lang.String firstName;
	@org.kie.api.definition.type.Label(value = "Last Name")
	private java.lang.String lastName;

	public Person() {
	}

	public java.lang.String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(java.lang.String firstName) {
		this.firstName = firstName;
	}

	public java.lang.String getLastName() {
		return this.lastName;
	}

	public void setLastName(java.lang.String lastName) {
		this.lastName = lastName;
	}

	public Person(java.lang.String firstName, java.lang.String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String toString() {
	    StringBuilder sBuilder = new StringBuilder();
	    sBuilder.append("firstName: " +firstName);
	    sBuilder.append("\tlastName: "+lastName);
	    return sBuilder.toString();
	}

}