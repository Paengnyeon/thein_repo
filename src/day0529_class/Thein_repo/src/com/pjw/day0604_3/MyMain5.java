package com.pjw.day0604_3;

class MyMain5 {

	public static void main(String[] args) {
		
		Payment p0 =new Payment();
		Payment p1 = new CardPayment();
		Payment p2 = new TossPay();

		p1.pay(10000);
		p2.pay(20000);
		
		//자식이 부모의 매소드에 접근
		
	}

}