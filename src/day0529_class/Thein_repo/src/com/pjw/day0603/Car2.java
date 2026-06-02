package com.pjw.day0603;

public class Car2 extends Vehicle2{
	
	//extends Vehicle2 <class를 바라보는문법
//	 필드
	String modelName="XM3";
	
//	매소드
	public void honk(){
		System.out.println("크락션 빵빵");
		
		// 부모의 필드에 접근
		System.out.println("super필드 :"+ super.brand);
		
	}
	
}
