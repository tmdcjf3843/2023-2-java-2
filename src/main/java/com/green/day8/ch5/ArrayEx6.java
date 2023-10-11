package com.green.day8.ch5;

import com.green.day3.ch4.IfElseIf;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95, 2, 200};

        // score안에서 min값과 max값을 찾아서 출력해 주세요

        int max = score[0];
        int min = score[0];

        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) {
            max = score[i];

            } else if (score[i] < min)  {
            min = score[i];
            }
        }
        System.out.println("max값 :" + max);
        System.out.println("min값 :" + min);
    }
}
