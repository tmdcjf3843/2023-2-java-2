package com.green.day7.ch4;

public class BreakConntinue {
    public static void main(String[] args) {
        // break를 사용할수 있는 곳 : switch, 반복문

        // contunue를 사용할수 있는곳 ㅣ 반복문

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) {break;}
        }
        System.out.println("----------------------------------");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {continue;}
            System.out.println(i);

        }
    }
}