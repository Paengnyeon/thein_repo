package com.pjw.day0605_2;

import java.util.ArrayList;

public class ArrayMain5 {
	public static void main(String[] args) {
		ArrayList<Student> student = new ArrayList<Student>();
		
		
		student.add(new Student("홍길동" , 90));
		student.add(new Student("김철수" , 80));
		student.add(new Student("이영희" , 95));
		
		for (Student s : student) {
			System.out.println(s.getName()+" : "+s.getScore());
			
		}
	}
}
