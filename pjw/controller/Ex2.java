package com.pjw.controller;

public class Ex2 {

	public static void main(String[] args) {
		// 제어판
		boolean isRaining = true;

		if (isRaining) {
			
		  System.out.println("출력됨");
		  
		} else {
			
			System.out.println("출력안됨");
		}
		System.out.println("==========");
		
		
		/* ----------------------------------
		 * 제어문 else if 
		 * 1 = raining , 2 = sunny, 3 = cloudy 4 = 우중충한 날씨
		 * -----------------------------------*/
		
		int weather;
		weather = 100;
		
		if (weather ==1 ) {
			System.out.println("우산을 준비하세요");
		} else if (weather == 2) {
				System.out.println("눈뽕 오지는날입니다 썬그리 쓰세요");
		} else if (weather == 3) {
					System.out.println("개야르 날씨 입니다.");
		} else {
			System.out.println("우중충날씨 입니다.");
		}
			
//		3항 연사자
		String result;
		result = (isRaining) ? "참이야" : "False";
		
		System.out.println(result);
		
//		제어문 switch
		int day =4;
		
		switch (day) {
		 		case 1:
			    System.out.println("Monday");
			    break;
			  case 2:
			    System.out.println("Tuesday");
			    break;
			  case 3:
			    System.out.println("Wednesday");
			    break;
			  case 4:
			    System.out.println("Thursday");
			    break;
			  case 5:
			    System.out.println("Friday");
			    break;
			  case 6:
			    System.out.println("Saturday");
			    break;
			  case 7:
			    System.out.println("Sunday");
			    break;
			    default :
			    	System.out.println("기본");
		}
			
		
	}

}
