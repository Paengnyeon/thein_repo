package com.pjw.day0528_datatype;

/*
 * [자료형 datatype]
 *
 * 자료형은 값을 담는 상자의 종류이다.
 * 숫자 상자, 글자 상자, 참/거짓 상자가 따로 있다고 보면 된다.
 */
public class Ex1_datatype {

    public static void main(String[] args) {

        boolean myBool = true;
        int myIntNum = 5;
        float myFloatNum = 5.99f;
        double myDouble = 20.000;
        char myLetter = 'D';
        String myText = "hello";

        System.out.println(myBool);
        System.out.println(myIntNum);
        System.out.println(myFloatNum);
        System.out.println(myDouble);
        System.out.println(myLetter);
        System.out.println(myText);

        System.out.println("Auto Typecasting:\n byte -> short -> char -> int -> long -> float -> double");
        System.out.println("Manual Typecasting:\n double -> float -> long -> int -> char -> short -> byte");

        // int -> double은 자동 형변환이 된다.
        double resultDouble = myIntNum;
        System.out.println("int -> double: " + resultDouble);

        // double -> int는 소수점이 잘릴 수 있어서 강제 형변환이 필요하다.
        int resultInt = (int) myDouble;
        System.out.println("double -> int: " + resultInt);
    }
}
