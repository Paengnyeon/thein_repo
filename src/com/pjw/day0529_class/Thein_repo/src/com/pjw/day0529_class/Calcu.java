package com.pjw.day0529_class;

/*
 * [계산기 클래스]
 *
 * 메서드는 일을 시키는 기능이다.
 * void 메서드는 출력만 하고, return 메서드는 결과값을 돌려준다.
 */
public class Calcu {

    public void addCal(int i, int j) {
        System.out.println(i + j);
    }

    public void subCal(int i, int j) {
        System.out.println(i - j);
    }

    public void mulCal(int i, int j) {
        System.out.println(i * j);
    }

    public void divCal(int i, int j) {
        System.out.println(i / j);
    }

    public void remCal(int i, int j) {
        System.out.println(i % j);
    }

    public int addCal2(int i, int j) {
        return i + j;
    }

    public int subCal2(int i, int j) {
        return i - j;
    }

    public int mulCal2(int i, int j) {
        return i * j;
    }

    public int divCal2(int i, int j) {
        return i / j;
    }

    public int remCal2(int i, int j) {
        return i % j;
    }
}
