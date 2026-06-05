package com.pjw.day0605_1;

public class Mymain2 {

	public static void main(String[] args) {

//		Level myVar = Level.MEDIUM;
//		System.out.println(myVar);
//		
//		switch(myVar) {
//		
//		case LOW:
//			System.out.println("LOW 커피 로스트 주문");
//			break;
//			
//		case MEDIUM:
//			System.out.println("MEDIM 커피 로스트 주문");
//			break;
//			
//		case HIGH:
//			System.out.println("HIGH 커피 로스트 주문");
//			break;
//		}
//		System.out.println("=====Level====");
//		for (Level v : Level.values()) {
//			  System.out.println(v);

//			}
		System.out.println("===Level2=====");

		Level2 myVar2 = Level2.MEDIUM;
		System.out.println(myVar2);
		for (Level2 v2 : Level2.values()) {
			System.out.println(v2 + ":" + v2.getDescription());
		}
	}

}
