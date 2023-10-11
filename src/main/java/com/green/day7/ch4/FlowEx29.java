package com.green.day7.ch4;

public class FlowEx29 {
    public static void main(String[] args) {
        //3, 6, 9 게임
        /*
        i=1
        i=2
        i=3 짝
        i=4
        i=5
        i=6 짝
        i=7
        i=8
        i=9 짝
        i=30 짝
        i=33 짝짝
         */
        for(int i=1; i<101; i++) {
            System.out.printf("i=%d", i);
            int temp = i;
            while (temp > 0) {
                int modval = temp % 10;
                if(modval != 0 && modval % 3 == 0) {
                    System.out.print("짝");
                }
                temp /=10;
            }
            System.out.println();
            }
        }
    }
