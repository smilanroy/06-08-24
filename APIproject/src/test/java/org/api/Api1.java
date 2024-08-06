package org.api;

import java.util.List;

public class Api1 {
	private int compId;
	private String CompanyName;
	private long mobilenumber;
	private List<Api2> employees;
	

	
	public Api1(int compId, String CompanyName,long mobilenumber,List<Api2> employees) {
		
		this.compId = compId;
		this.CompanyName=CompanyName;
		this.mobilenumber=mobilenumber;
		this.employees=employees;
		
	}



	public int getCompId() {
		return compId;
	}



	public void setCompId(int compId) {
		this.compId = compId;
	}



	public String getCompanyName() {
		return CompanyName;
	}



	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}



	public long getMobilenumber() {
		return mobilenumber;
	}



	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}



	public List<Api2> getEmployees() {
		return employees;
	}



	public void setEmployees(List<Api2> employees) {
		this.employees = employees;
	}

	

}
