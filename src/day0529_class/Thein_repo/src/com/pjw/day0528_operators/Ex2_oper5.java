package com.pjw.day0528_operators;

/*
 * [비트연산자]
 *
 * 비트연산자는 숫자를 2진수 기준으로 계산한다.
 * 처음에는 자주 안 쓰이니까 이런 게 있다는 정도로 보면 된다.
 */
public class Ex2_oper5 {

    public static void main(String[] args) {

        int a = 5; // 0101
        int b = 3; // 0011

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
    }
}
