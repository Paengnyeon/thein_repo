package com.pjw.day0603;

public class Dog extends Animal {

	// 재정의

	public void animalSound() {
		System.out.println("멍멍");
	}

	public void animalColor() {
		System.out.println("흰색");
		// 부모의 매소드도 사용
		super.animalSound();
	}

}
