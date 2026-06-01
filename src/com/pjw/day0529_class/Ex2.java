package com.pjw.day0529_class;

/*
 * [생성자 사용]
 *
 * new MyCar()처럼 객체를 만들 때 어떤 생성자를 부를지 정할 수 있다.
 */
public class Ex2 {

    public static void main(String[] args) {

        MyCar mycar = new MyCar();
        MyCar mycar2 = new MyCar(2);
        MyCar mycar3 = new MyCar(1969, "Mustang");
    }
}
