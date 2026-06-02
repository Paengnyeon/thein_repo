package com.pjw.day0603;

public class Ex5 {
	public static void main(String[] args) {
//		StaticClass staticClass = new StaticClass();
		//클래스의 기준 - static
		
		System.out.println(StaticClass.staticInVol);
		
		System.out.println(StaticClass.staticVol);
		StaticClass.staticInVol=999;
		System.out.println(StaticClass.staticInVol);
		

		
		//오브젝트 기준
		StaticClass s1 = new StaticClass();
		StaticClass s2 = new StaticClass();
		StaticClass s3 = new StaticClass();

		System.out.println("변경전:"+s1.color);
		s1.color = "red";
		s2.color = "yellow";
		s3.color = "green";

		System.out.println("변경후:" + s1.color);
	}
}
