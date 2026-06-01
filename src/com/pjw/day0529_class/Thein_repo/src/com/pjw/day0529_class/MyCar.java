package com.pjw.day0529_class;

/*
 * [생성자 오버로딩]
 *
 * 생성자는 객체가 만들어질 때 자동으로 실행되는 특별한 메서드이다.
 */
public class MyCar {

    int num1;
    int num;

    public MyCar() {
        System.out.println("기본 생성자 실행");
    }

    public MyCar(int cnt) {
        num = cnt;
        System.out.println("숫자 하나를 받은 생성자: " + num);
    }

    public MyCar(int myYear, String brand) {
        System.out.println(myYear + "   " + brand);
    }
}
