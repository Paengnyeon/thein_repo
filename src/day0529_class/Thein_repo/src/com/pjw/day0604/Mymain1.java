package com.pjw.day0604;

public class Mymain1 {

	
	public static void main(String[] args) {
		
		Account acc = new Account("100-200", " 성시경", 100000);
		
//		----- 1. 현재 고객의 잔액을 확인 -----
		System.out.println( acc.exportPrint());
		
		// 입금 50,000
		acc.deposit(50000);
		System.out.println( acc.exportPrint());
		
		// 출금 20,000
		acc.withdraw(20000);
		System.out.println( acc.exportPrint());
		

	}
}
