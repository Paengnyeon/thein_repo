package com.pjw.day0605_2;

import java.util.ArrayList;
import java.util.Set;

public class MyMain5 {
	public static void main(String[] args) {

//		선언부

		ArrayList<String> cars;
//		 초기화		
		cars = new ArrayList<String>();
		System.out.println(cars + "\n 갯수는:" + cars.size() + "\n");

//		값을 추가
		cars.add("볼보");
		cars.add("BMW");
		cars.add("포드");
		cars.add("마쯔다");
		System.out.println(cars + "\n 갯수는:" + cars.size() + "\n");
		;
		;

//		0번째 위치에 "추가된 자동차" 추가
		cars.add(0, "추가된 자동차");

//		0번째 위치의 값을 출력
		System.out.println(cars.get(0));

//		1번째 위치에 "추가된 자동차 ->"XM3"로 수정
		cars.set(1, "XM3");
		System.out.println(cars + "\n 갯수는:" + cars.size() + "\n");

//		4번째 데이터 삭제
		cars.remove(4);
		System.out.println(cars + "\n 갯수는:" + cars.size() + "\n");

//		데이터 전체를 깨끗하게 삭제
		cars.clear();
		System.out.println(cars + "\n 갯수는:" + cars.size() + "\n");

	}
}
