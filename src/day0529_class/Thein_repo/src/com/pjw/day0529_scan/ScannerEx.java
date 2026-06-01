package com.pjw.day0529_scan;

import java.util.Scanner;

/*
 * [Scanner]
 *
 * Scanner는 콘솔에서 사용자가 입력한 값을 받아오는 도구이다.
 */
public class ScannerEx {

    public static void main(String[] args) {

        System.out.println("=== 두 숫자의 합 구하기 ===");
        System.out.println("import 단축키: Ctrl + Shift + O");

        Scanner sc = new Scanner(System.in);

        System.out.print("Num1: ");
        int num1 = sc.nextInt();

        System.out.print("Num2: ");
        int num2 = sc.nextInt();

        int result = num1 + num2;
        System.out.println("=== Sum: " + result + " ===");

        sc.close();
    }
}
