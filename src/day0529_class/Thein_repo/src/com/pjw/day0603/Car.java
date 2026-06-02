package com.pjw.day0603;

public class Car {

	int modelYear;
	String modelName;

	public Car() {
		System.out.println("기본생성자");

	}

//	 new Car ( "붕붕이")
	public Car(String modelName) {
//		this(2026, modelName);
		
		System.out.println(modelName);
		
		this.modelName = modelName;
		System.out.println("modelName:" + this.modelName);
		
	}

	
//	 new Car (  1969 , "현대" )
	public Car(int carYear, String carBrand) {
		System.out.println(carYear);
		System.out.println(carBrand);

//		this.modelYear = modelYear;
//		this.modelName = modelName;
		
		System.out.println("this.modelYear:"+this.modelYear);
		System.out.println("this.modelName:"+this.modelName);

	}

	public void printInfo() {
		System.out.println(modelYear +" --" + modelName);
	}

}
