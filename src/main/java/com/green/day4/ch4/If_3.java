package com.green.day4.ch4;

public class If_3 {
    public static void main(String[] args) {
        int val = (int)(Math.random() * 100) + 1; //1~100 랜덤한 숫자가 나오게

        System.out.printf("%d는(은) %s수입니다."
                , val, val % 2 == 0 ? "짝": "홀");
        //예를들어
        //val값이 11이면 > "11는(은) 홀수입니다."
        //val값이 12이면 > "12는(은) 짝수입니다."
    }
}
