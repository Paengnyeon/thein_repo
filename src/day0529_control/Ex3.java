package com.pjw.day0529_control;

/*
 * [반복문]
 *
 * 반복문은 같은 코드를 여러 번 실행할 때 사용한다.
 */
public class Ex3 {

    public static void main(String[] args) {

        int iRow = 3;
        int jCol = 4;

        // 중첩 for문: for문 안에 for문이 들어간 구조
        for (int i = 0; i < iRow; i++) {
            System.out.println("행: " + i);

            for (int j = 0; j < jCol; j++) {
                System.out.println("--- 열: " + j);
            }
        }

        System.out.println("==========");

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        // 향상된 for문: 배열 안의 값을 하나씩 꺼내서 c에 담는다.
        for (String c : cars) {
            System.out.println(c);
        }
    }
}
