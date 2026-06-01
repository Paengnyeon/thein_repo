package com.pjw.day0529_class;

/*
 * [객체 필드 + 메서드 오버로딩]
 *
 * 같은 이름의 메서드라도 매개변수가 다르면 여러 개 만들 수 있다.
 * 이것을 메서드 오버로딩이라고 한다.
 */
public class Myobj {

    int x = 5;
    String name = "진원";

    public void meNethod() {
        System.out.println("meNethod 실행됨");
    }

    public void meNethod(int i) {
        System.out.println("meNethod 실행됨");
        System.out.println(i);
        System.out.println("myobj" + i);

        String str1 = "myobj1_";
        System.out.println(str1 + i);

        String result = "myobj_" + i;
        System.out.println(result);

        String result2 = str1 + i;
        System.out.println(result2);
    }
}
