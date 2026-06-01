package com.pjw.day0529_class;

/*
 * [계산기 실행 파일]
 *
 * Calcu 클래스의 기능을 main에서 불러와서 사용한다.
 */
public class Ex3_cal {

    public static void main(String[] args) {

        int result;
        Calcu calcu = new Calcu();

        calcu.addCal(100, 200);
        calcu.subCal(100, 200);
        calcu.mulCal(100, 200);
        calcu.divCal(100, 200);
        calcu.remCal(100, 200);

        System.out.println("=============");

        result = calcu.addCal2(100, 200);
        System.out.println("덧셈 리턴값은: " + result);

        result = calcu.subCal2(100, 200);
        System.out.println("뺄셈 리턴값은: " + result);

        result = calcu.mulCal2(100, 200);
        System.out.println("곱셈 리턴값은: " + result);

        result = calcu.divCal2(100, 200);
        System.out.println("나눗셈 리턴값은: " + result);

        result = calcu.remCal2(100, 200);
        System.out.println("나머지 리턴값은: " + result);
    }
}
