package com.pjw.day0529_class;

/*
 * [객체 여러 개 만들기]
 *
 * 같은 클래스로 객체를 여러 개 만들 수 있다.
 * 각각의 객체는 자기만의 값을 가질 수 있다.
 */
public class Ex1 {

    public static void main(String[] args) {

        Myobj myobj1 = new Myobj();
        Myobj myobj2 = new Myobj();
        Myobj myobj3 = new Myobj();

        System.out.println(myobj1.x);
        System.out.println(myobj2.x);
        System.out.println(myobj3.x);

        myobj3.x = 10;
        myobj3.name = "박진원";

        System.out.println(myobj3.x);
        System.out.println(myobj3.name);
        System.out.println(myobj2.x);

        myobj1.meNethod();
        myobj2.meNethod();
        myobj3.meNethod();

        myobj1.meNethod(1);
        myobj2.meNethod(2);
        myobj3.meNethod(3);
    }
}
