package com.pjw.day0529_class;

/*
 * [getter / setter]
 *
 * private 변수는 클래스 밖에서 바로 못 건드린다.
 * 대신 getter로 꺼내고, setter로 바꾼다.
 */
public class Students {

    private String stName = "홍길동";

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public void myprint() {
        System.out.println(stName);
    }
}
