package com.pjw.day0604;

public abstract class Animal {
	
	
	static String MyName = "=== 동물 프로그램 ===";
	// 동물 이름
	String aniName = "동물이들";
	// 동물 소리
	String aniSound = "동물들의 소리";
	// 동물나이
	int aniAge;
	// 동물 먹이 먹기
	String aniEating;
	// 동물 잠 자기
	String aniSleeping;

	abstract void animalSound1();

	// 동물나이
	void aniAging(int age) {
		aniAge += age;
	}

	// 동물 먹이 먹기
	void eating(String eat) {
		aniEating = "동물이 먹이를 먹습니다.";
	}

	// 동물 잠 자기
	void sleeping() {
		aniSleeping = "동물이 잠을 잡니다";

	}

	void info() {
//		정보 출력
		System.out.println(
				"동물의 이름은 " + aniName + 
				"\n동물의 소리는 " + aniSound +
				"\n동물의 나이는 " + aniAge +
				"\n동물의 먹는 모습은 " + aniEating +
				"\n동물의 자는 모습은 " + aniSleeping);
		System.out.println("==============");

	}

	void animalSound() {
		// TODO Auto-generated method stub
		
	}

}
