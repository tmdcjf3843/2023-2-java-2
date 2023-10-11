package com.green.day8.ch5;

import java.util.Arrays;
import java.util.SortedMap;

public class ArrayEx7 {
    public static void main(String[] args) {
        //1. 정수 10개를 저장 할수 있는 배열을 만든다.
        // 0~9 값을 순차적으로 대입한다.

        int[] number = new int[10];

        for (int i = 0; i < number.length; i++) {
            number[i] = i;
        }
        System.out.println(Arrays.toString(number));

        System.out.println("--------------------------------------");

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }
}