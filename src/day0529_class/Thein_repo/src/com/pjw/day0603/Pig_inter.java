package com.pjw.day0603;

public class Pig_inter implements Animal_inter {

//	implements는  구현
//	@Override 는 덮어씌운다.
	
	@Override
	public void animalSound() {
		System.out.println("꿀꿀꿀~인터페이스 구현완료");
	}

	@Override
	public void sleep() {
		System.out.println("꿈나라~ 인터페이스 구현완료");

	}

}
