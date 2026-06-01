package com.pjw.day0528_basic;

/*
 * [논리연산자 + 문자열]
 *
 * && : 둘 다 true일 때 true
 * || : 하나라도 true면 true
 * !  : true/false를 반대로 바꿈
 */
public class Ex03_LogicString {

    public static void main(String[] args) {

        int x = 5;

        System.out.println(x > 3 && x < 10);
        System.out.println(x > 3 || x < 4);
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(x > 3 && x < 10));

        // 로그인 판단 예제
        boolean isLoggedIn = true;
        boolean isAdmin = false;

        System.out.println("일반 사용자: " + (isLoggedIn && !isAdmin));
        System.out.println("접근 가능: " + (isLoggedIn || isAdmin));
        System.out.println("접근 불가: " + (!isLoggedIn));

        System.out.println("=====================");

        String txt = "jdkHHHHHHKfidklfkd";
        System.out.println(txt.length());      // 글자 길이
        System.out.println(txt.toUpperCase()); // 대문자로 바꾸기
        System.out.println(txt.toLowerCase()); // 소문자로 바꾸기

        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt2.indexOf("locate"));
        System.out.println(txt2.indexOf("'locate"));

        String txt3 = "Hello";
        System.out.println(txt3.charAt(0));
        System.out.println(txt3.charAt(4));

        // trim은 앞뒤 공백을 제거한다.
        String txt4 = "   Hello World   ";
        System.out.println("Before: [" + txt4 + "]");
        System.out.println("After:  [" + txt4.trim() + "]");

        // 큰따옴표를 문자열 안에 쓰고 싶으면 \" 형태로 적는다.
        String txt5 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt5);
    }
}
