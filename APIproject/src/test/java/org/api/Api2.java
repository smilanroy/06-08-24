package org.api;

public class Api2 {

	private int id;
	private String firstName;
	private String department;

	public Api2(int id, String firstName, String department) {

		this.id = id;
		this.firstName = firstName;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}