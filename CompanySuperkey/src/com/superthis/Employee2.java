package com.superthis;

//child class

public class Employee2  extends Employee{
	
	public void employeeAddress() {
		
		System.out.println("annanagar");
		super.employeeName();
		
	}

	public void employeeId() {
		
		System.out.println("123");
		this.employeeAddress();
		
		
		
	}
	
	public static void main(String[] args) {
		Employee2 e2=new Employee2();
		
		e2.employeeId();
		
	}
	
}
