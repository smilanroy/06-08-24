package org.demo;

//child class
public class League2 extends League{

	public void Position() {
		System.out.println("Top of the Table");
		super.teamGame();
	}
	
	public void Teamposition() {
		System.out.println("1");
		this.Position();
		
	}
	
	public static void main(String[] args) {
		
		League2 l2=new League2();
		
		l2.Teamposition();
		
	}
}

