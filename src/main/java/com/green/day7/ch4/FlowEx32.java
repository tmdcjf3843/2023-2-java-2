package com.green.day7.ch4;

import com.green.day6.ch4.While;

import javax.print.attribute.standard.MediaSize;
import java.util.Scanner;

public class FlowEx32 {
    /*
    (1) square
    (2) tri
    (3) log
    원하는 메뉴(1~3)를 선택하세요. (종료:0) >>

    위 내용이 계속 반복 (0을 입력하기 전까지)

     e.g.

      (1) square
      (2) tri
      (3) log
      원하는 메뉴(1~3)를 선택하세요. (종료:0) >> 1 (엔터)
      선택하신 메뉴는 1번입니다.

      (1) square
      (2) tri
      (3) log
      원하는 메뉴(1~3)를 선택하세요. (종료:0) >> 2 (엔터)
      선택하신 메뉴는 2번입니다.

       (1) square
       (2) tri
       (3) log
      원하는 메뉴(1~3)를 선택하세요. (종료:0) >> 4 (엔터)
      메뉴를 잘못 선택하셨습니다.

       (1) square
       (2) tri
       (3) log
      원하는 메뉴(1~3)를 선택하세요. (종료:0) >> 0 (엔터)
      프로그램을 종료합니다.

     */
    public static void main(String[] args) {

        int menu = 0, num = 0;
        Scanner scanner = new Scanner(System.in);
        outer:
        while (true) {
            System.out.println("(1) square");
            System.out.println("(2) tri");
            System.out.println("(3) log");
            System.out.print("원하는 메뉴(1~3)를 선택하세요. (종료:0)>");

            String tmp = scanner.nextLine();
            menu = Integer.parseInt(tmp);

            if (menu == 0) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("메뉴를 잘못 선택하였습니다.(종료는 0)");
                continue;
            }
            System.out.println("선택하신 메뉴는 " + menu +"번입니다");
        }
    }
}
