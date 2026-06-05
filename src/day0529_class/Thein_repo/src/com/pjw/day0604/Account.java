package com.pjw.day0604;

public class Account {
	

	
//		----- 선언부 -----

//		변수 선언
		String accountNumber;
		String owner;
		int balance;

//		----- 초기화 -----

//		생성자 구현
//		Account("100-200-1234", "성시경", 100000);
		Account(String accountNumber, String owner, int balance) {
			// 초기화
			this.accountNumber = accountNumber;
			this.owner = owner;
			this.balance = balance;
		}

//		----- 기능구현 -----

//		기능구현 - 입금
		void deposit(int amount) {
//			this.balance = this.balance + amount;
			this.balance += amount;
		}

//		기능구현 - 출금
		void withdraw(int amount) {
			this.balance -= amount;
		}

//		----- 출력 -----

//		기능구현 - 출력
		String exportPrint() {
			String result = "고객님의 현재 잔액은 " + balance + "원 입니다.";
			return result;

		}

}
