package com.pjw.day0603;

public class Ex2_Inheritance extends Vehicle {
	
	 private String modelName = "Mustang";

	public static void main(String[] args) {
		
		
//		Vehicle vihicle = new Vehicle();
//		vihicle.honk();
		
		Ex2_Inheritance ex2_Inheritance = new Ex2_Inheritance();
		
		ex2_Inheritance.honk();
		System.out.println(ex2_Inheritance.modelName);
		System.out.println(ex2_Inheritance.brand);
	}

}
