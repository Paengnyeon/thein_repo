package com.pjw.day0528_basic;

/*
 * [첫 Java 수업]
 *
 * 이 파일은 Java의 가장 기본 문법을 연습하는 파일이다.
 * 변수, 자료형, final, 출력문을 한 번에 확인한다.
 */
public class Hello {

    public static void main(String[] args) {

        // String은 글자 여러 개를 담는 자료형이다.
        String name = "John";
        System.out.println(name);
        System.out.println("문자열 name");

        // int는 소수점 없는 숫자, 즉 정수를 담는 자료형이다.
        int intValue = 15;
        System.out.println(intValue);
        System.out.println("intValue는 정수 값을 담는 변수");

        // final은 한 번 넣은 값을 바꿀 수 없게 만드는 키워드이다.
        final int finalKeyword = 9999;
        System.out.println(finalKeyword);

        // boolean은 true 또는 false만 담을 수 있다.
        System.out.println(false);

        // print는 줄바꿈이 없고, println은 출력 후 줄바꿈이 있다.
        System.out.print("Hello World6");
        System.out.println();

        // 데이터타입 기본 예제
        int intValue5 = 5, intValue6 = 6, intValue7 = 7;
        float floatValue = 5.99f;
        char charValue = 'D';
        boolean boolValue = true;
        String strValue = "Hello";
        String strValue2 = "반가워용";

        System.out.println(intValue5);
        System.out.println(intValue6);
        System.out.println(intValue7);
        System.out.println(floatValue);
        System.out.println(charValue);
        System.out.println(boolValue);
        System.out.println(strValue + " Java~!!! 자바");
        System.out.println(strValue + strValue2);
    }
}
