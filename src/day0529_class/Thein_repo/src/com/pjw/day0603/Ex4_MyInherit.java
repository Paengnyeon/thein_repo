package com.pjw.day0603;


public class Ex4_MyInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pig pig = new Pig();
		Dog dog = new Dog();
		Cat cat = new Cat();

		
		/*		1.고양이오브젝트 생성
		2.동물들의 털색깔
		3.치즈냥이털색상출력
						*/
		pig.animalSound();
		dog.animalSound();
//		cat.animalSound();
		System.out.println("============");
		cat.animalColor();
//		boolean flag 문으로 if/else로 받기 
//		cat.animalColor(true);
//		cat.animalColor(false);
//		pig.animalColor();
//		dog.animalColor();

	}

}
