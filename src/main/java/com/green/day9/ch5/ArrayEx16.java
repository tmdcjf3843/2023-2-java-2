package com.green.day9.ch5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx16 {
    public static void main(String[] args) {
        /* 3개의 string값을 담을 수 있는 배열을 생성
            3번 문자열로 입력을 받는다.(scanner이용)
            입력받은 문자열들을 순차적으로 배열에 값을 넣는다.
            값 넣는게 종료가 되면 향상된 for문을 이용하여 저장되어있는 값들을 콘솔에 출력한다.
         */

        String [] ss = new String [3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < ss.length; i++) {
            System.out.println();
           String ww = scanner.nextLine();
           ss[i]= ww;
        }
        for (String str : ss)
        System.out.println(str);
    }
}
