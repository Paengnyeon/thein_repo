package com.pjw.day0528_operators;

/*
 * [논리연산자]
 *
 * && : 둘 다 true여야 true
 * || : 하나라도 true면 true
 * !  : 결과를 반대로 바꿈
 */
public class Ex2_oper4 {

    public static void main(String[] args) {

        int age = 20;
        boolean hasTicket = true;

        System.out.println(age >= 19 && hasTicket);
        System.out.println(age >= 19 || hasTicket);
        System.out.println(!hasTicket);
    }
}
