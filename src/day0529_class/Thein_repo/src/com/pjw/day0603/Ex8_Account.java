package com.pjw.day0603;

public class Ex8_Account {

	public static void main(String[] args) {
		
		
		
		//성시경이 통장을 개설할때  1000000원의 초기금액을 입금
		Account acc = new Account
				("100-200", "성시경", 100000);
		
		

		// 입금
		acc.deposit(50000);
		// 출금
		acc.withdraw(30000);
		// 계좌정보
		acc.showInfo();
	}

}
