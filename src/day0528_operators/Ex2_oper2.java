package com.pjw.day0528_operators;

/*
 * [할당연산자]
 *
 * = 은 오른쪽 값을 왼쪽 변수에 넣는다는 뜻이다.
 * += 처럼 쓰면 기존 값에 더해서 다시 넣는다는 뜻이다.
 */
public class Ex2_oper2 {

    public static void main(String[] args) {

        int num = 10;
        System.out.println(num);

        num += 5;
        System.out.println(num);

        num -= 3;
        System.out.println(num);

        num *= 2;
        System.out.println(num);

        num /= 4;
        System.out.println(num);
    }
}
