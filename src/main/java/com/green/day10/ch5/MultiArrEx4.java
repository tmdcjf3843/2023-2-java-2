package com.green.day10.ch5;

import java.util.Scanner;

public class MultiArrEx4 {
    public static void main(String[] args) {
        String [] [] words = {
                  { "chair", "의자" }
                , { "computer", "컴퓨터" }
                , { "integer", "정수" }
        };
        /*
        q1. chair의 뜻은? >> 의사
        틀렸습니다. 정답은 의자입니다.

        q2. computer의 뜻은? >> 컴퓨터
        정답입니다.

        q3. integer의 뜻은? >> 정주
        틀렸습니다. 정답은 정수입니다.
         */

        Scanner scanner = new Scanner(System.in);
    for (int i=0; i< words.length; i++) {
        String[] wordArr = words[i];
        System.out.printf("%d. %s의 뜻은?", i+1, wordArr[0]);
        String answer = scanner.nextLine();
        String expextedAnswer = wordArr[1];

        if (!answer.equals(expextedAnswer)) {
            System.out.printf("오답입니다. 정답은 %s입니다.\n", expextedAnswer);
            continue;
        }
            System.out.println("정답입니다");
        }
     }
   }
