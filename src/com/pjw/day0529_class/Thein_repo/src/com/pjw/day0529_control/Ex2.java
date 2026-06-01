package com.pjw.day0529_control;

/*
 * [if / else if / switch]
 *
 * 조건문은 상황에 따라 다른 코드를 실행하게 만드는 문법이다.
 */
public class Ex2 {

    public static void main(String[] args) {

        boolean isRaining = true;

        if (isRaining) {
            System.out.println("우산을 챙긴다");
        } else {
            System.out.println("우산 없이 나간다");
        }

        System.out.println("==========");

        int weather = 100;

        if (weather == 1) {
            System.out.println("우산을 준비하세요");
        } else if (weather == 2) {
            System.out.println("눈뽕 오지는 날입니다. 선글라스 쓰세요");
        } else if (weather == 3) {
            System.out.println("개야르 날씨입니다");
        } else {
            System.out.println("우중충한 날씨입니다");
        }

        // 삼항연산자: 조건 ? 참일 때 값 : 거짓일 때 값
        String result = isRaining ? "참이야" : "False";
        System.out.println(result);

        int day = 4;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("기본값");
                break;
        }
    }
}
