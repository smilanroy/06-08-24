package com.arr;

public class Employee {

	public static void main(String[] args) {
		
		int a[]=new int[4];
		
		
		a[0]=100;
		a[1]=200;
		a[2]=100;
		a[3]=399;
		
		System.out.println("for loop");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			
		}
				
		System.out.println("for each loop");
		for(int x:a) {
			System.out.println(x);
		}
	}
}
