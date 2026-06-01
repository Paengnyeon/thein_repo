package com.pjw.day0529_scan;

import java.util.Scanner;

/*
 * [ATM 메뉴 예제]
 *
 * 사용자가 숫자를 입력하면 switch문으로 메뉴를 선택하는 예제이다.
 */
public class ATMapp {

    public static void main(String[] args) {

        int input;
        int money;

        System.out.println("=== Menu ===");
        System.out.print("[1] 입금 ");
        System.out.print("[2] 출금 ");
        System.out.println("[3] 잔액확인 ");

        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴를 선택해주세요: ");
        input = sc.nextInt();

        switch (input) {
            case 1:
                System.out.println("입금을 선택하셨습니다.");
                System.out.println("입금 기능을 점검중입니다.");
                break;
            case 2:
                System.out.println("출금을 선택하셨습니다.");
                System.out.println("출금 기능을 점검중입니다.");
                break;
            case 3:
                System.out.println("잔액확인을 선택하셨습니다.");
                money = 313150;
                String moneyStr = String.format("%,d", money);
                System.out.println("고객님의 잔액은: " + moneyStr + "원 입니다.");
                break;
            default:
                System.out.println("유효한 번호만 입력해주세요.");
                break;
        }

        sc.close();
    }
}
