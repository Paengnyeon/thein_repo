package com.pjw.controller;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i;
//		i = 0;
//		while (i <= 5) {
//		  System.out.println(i);
//		  
//		  i++;
//		  
//		}
////		제어문
//		int j;
//		j = 4;
//		do {
//			System.out.println(j);
//		j--;
//		}while(j > 2);
		
//		for 제어문
//		for (int i = 0; i < 5; i++) {
//			  System.out.println(i);
//			}
//
		int i_row;
		int j_col;
		
		i_row = 3;
		j_col = 4;
		
		
		for (int i = 0; i < i_row; i++) {
		  System.out.println("행: " + i); // Executes 2 times
		  
		  // Inner loop
		  for (int j = 0; j < j_col; j++) {
		    System.out.println("--- 열: " + j); // Executes 6 times (2 * 3)
		  }
		}
//		배열
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

		for (String c : cars) {
		  System.out.println(c);
		}
		
	}
}
