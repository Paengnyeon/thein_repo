package com.pjw.day0528_basic;

/*
 * [형변환 + 연산자]
 *
 * 형변환은 자료형을 바꾸는 것이다.
 * 예: int -> double, double -> int
 */
public class Ex02_CastingOperator {

    public static void main(String[] args) {

        // 자동 형변환: 작은 그릇의 값을 큰 그릇으로 옮기는 느낌이라 자동으로 된다.
        int myInt = 9;
        double myDouble = myInt;

        System.out.println(myInt);      // 9
        System.out.println(myDouble);   // 9.0

        // 강제 형변환: 큰 그릇의 값을 작은 그릇에 억지로 넣는 느낌이다.
        myInt = (int) myDouble;
        System.out.println(myInt);

        System.out.println("=====================");

        // 산술연산자: 더하기, 빼기, 곱하기, 나누기, 나머지
        int sum1 = 100 + 50;
        int sum2 = sum1 + 250;
        int sum3 = sum2 + sum2;

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

        System.out.println("=====================");

        int x = 10;
        int y = 3;

        System.out.println(x + y); // 더하기
        System.out.println(x - y); // 빼기
        System.out.println(x * y); // 곱하기
        System.out.println(x / y); // 나누기 몫
        System.out.println(x % y); // 나머지

        int z = 5;
        ++z; // 먼저 1 증가
        System.out.println(z);

        --z; // 먼저 1 감소
        --z;
        System.out.println(z);

        System.out.println("=====================");

        int age = 5;
        System.out.println(age >= 8);
        System.out.println(age < 8);
    }
}
