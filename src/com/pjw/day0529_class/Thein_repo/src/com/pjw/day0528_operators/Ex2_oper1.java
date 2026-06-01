package com.pjw.day0528_operators;

/*
 * [산술연산자 + 증감연산자]
 *
 * 연산자는 계산할 때 쓰는 기호이다.
 */
public class Ex2_oper1 {

    public static void main(String[] args) {

        int x = 5;
        int y = 10;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);

        System.out.println("=====================");

        int i = 0;
        System.out.println("[i] : " + i);

        while (i < 3) {
            System.out.println("++i : " + ++i);
        }

        System.out.println("[i] : " + i);

        while (i > 0) {
            System.out.println("--i : " + --i);
        }

        System.out.println("[i] : " + i);

        while (i < 3) {
            System.out.println("i++ : " + i++);
        }

        System.out.println("[i] : " + i);

        while (i > 0) {
            System.out.println("i-- : " + i--);
        }

        System.out.println("[i] : " + i);
    }
}
