package com.pjw.controller;

public class ExMyclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		클래스:new 생성자를 부른다
		var myPoint = new MyPoint();
		
		//Objeat 객체
		
		myPoint.MyStr(); 
		
//		=====Students 클래스 만들기 =======
//		=====st01, st02, st03 오브젝트 만들자=====
//		=====st_name 값을 출력하자 =======
		
//		var st01 =new Students();
//		var st02 =new Students();
//		var st03 =new Students();
		
//		st01.st_name 
//		System.out.println(st01.getSt_name());
//		st01.toString();
//		st01.myprint();
		
//		st01.setSt_name("새로 전학온 홍길동");
//		st01.myprint();
	
		var student1 = new Student();  
		var student2 = new Student("알리스");  
		var student3 = new Student("밥", 20);  
		var student4 = new Student("캐롤", 19, "컴과학");
		
		System.out.println("=== 학생 정보 ===");
		student1.displayInfo();
		student2.displayInfo();
		student3.displayInfo();
		student4.displayInfo();
		
		System.out.println();
		System.out.println("=== 변경 후 ===");
		student2.changeMajor("수학");
		student3.changeMajor("물리학");
		
		System.out.println();
		System.out.println("=== 변경된 학생 정보 ===");
		student1.displayInfo();
		student2.displayInfo();
		student3.displayInfo();
		student4.displayInfo();
	
	}
	
}
