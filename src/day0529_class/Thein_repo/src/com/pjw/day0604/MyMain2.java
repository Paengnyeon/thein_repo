package com.pjw.day0604;

public class MyMain2 {
	
public static void main(String[] args) {
		
//	프로그램 이름
	System.out.println(Animal.MyName); 
	
//	이름출력
//	소리출력
//	먹기() 출력
//	자기() 출력
	
	
	Pig pig1 = new Pig();
//	System.out.println(pig1.pig_name);
	pig1.aniName = "꿀꿀이";
	System.out.println(pig1.aniName);
	pig1.aniSound = "꾸울꿀~~";
	pig1.aniAging(3);
	pig1.eating("와구와구");
	pig1.sleeping();
	pig1.info();
	
			
	
	Cat cat1 = new Cat();
	cat1.aniName = "야옹이";
	cat1.aniAging(0);
	cat1.eating();
	cat1.info();
	
	Dog dog1 = new Dog();
	dog1.aniName = "멍멍이";
	dog1.aniSound = "멍멍왈왈";
	dog1.info();

	
	Bird bird1 = new Bird();
	bird1.babing();
	System.out.println(bird1.baby); 
	bird1.info();
	

	}

}
