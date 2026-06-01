package com.pjw.day0527_basic;

/*
 * [Math 클래스 + 비교 결과]
 *
 * Math는 수학 계산을 도와주는 Java 기본 도구이다.
 */
public class Ex04_MathBoolean {

    public static void main(String[] args) {

        System.out.println(Math.max(5, 10));      // 큰 값
        System.out.println(Math.min(5, 10));      // 작은 값
        System.out.println((int) Math.sqrt(64));  // 제곱근
        System.out.println(Math.abs(-4.7));       // 절댓값
        System.out.println(Math.abs(-100));
        System.out.println(Math.pow(2, 8));       // 2의 8제곱
        System.out.println(Math.random());        // 0 이상 1 미만 랜덤 숫자

        int x = 13;
        int y = 9;
        boolean isGreater = x > y;

        System.out.println(isGreater);
    }
}
