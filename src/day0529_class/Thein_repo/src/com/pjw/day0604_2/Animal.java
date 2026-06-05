package com.pjw.day0604_2;

//abstract class Animal implements InterAnimal {
class Animal implements InterAnimal {
	
	// 공통 기능 개발
	
	@Override
	public void run() {
		System.out.println("동물이 산책합니다");
	}

	@Override
	public void sleep() {
		System.out.println("동물이 잠을 잡니다");
	}

	@Override
	public void animalSound() {
		System.out.println("동물이 소리를 냅니다");
	}


	

	
}