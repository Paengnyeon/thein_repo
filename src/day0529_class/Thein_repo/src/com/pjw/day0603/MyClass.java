package com.pjw.day0603;

import javax.print.attribute.SetOfIntegerSyntax;

public class MyClass {

	public static void main(String[] args) {
		
////		데이터타입(클래스) 오브젝트이름=클래스를 오브젝트로생성
////		Car1 car1 = new Car1();
//		
//		Car car1 = new Car();
//		Car car2 = new Car("붕붕이");
//		Car car3 = new Car(1969, "현대");
//		
//		car1.printInfo();
//		car2.printInfo();
//		car3.printInfo();
//		

//		캡슐화 private
		Person person1 = new Person();
		
//		person1.getPersonName: private 본인클래스 소속
		person1.setPersonName("세종대왕");
		System.out.println(	person1.getPersonName());
		
		
	}

}
