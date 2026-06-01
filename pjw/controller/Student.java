package com.pjw.controller;

public class Student {

	String name;
	int age;
	String major;
	
	// 기본 생성자
	public Student() {
		name = "알 수 없음";
		age = 0;
		major = "전공 미정";
	}
	
	// 이름만 받는 생성자
	public Student(String studentName) {
		name = studentName;
		age = 18;  // 기본 나이
		major = "전공 미정";
	}
	
	// 이름과 나이를 받는 생성자
	public Student(String studentName, int studentAge) {
		name = studentName;
		age = studentAge;
		major = "전공 미정";
	}
	
	// 모든 값을 받는 생성자
	public Student(String studentName, int studentAge, String studentMajor) {
		name = studentName;
		age = studentAge;
		major = studentMajor;
	}
	
	public void displayInfo() {
		System.out.println("이름: " + name + ","
				+ " 나이: " + age + ", 전공: " + major);
	}
	
	public void changeMajor(String newMajor) {
		major = newMajor;
		System.out.println(name + "의 전공이 " + newMajor + "으로 변경되었습니다.");
    }

}
		

