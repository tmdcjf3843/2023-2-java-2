package com.green.day8.ch5;

import com.green.day7.ch5.Array;

import java.util.Arrays;

public class ArrayToStringMission {
    public static void main(String[] args) {
        int[] arr = {5, 10, 7, 3};
        System.out.println(Arrays.toString(arr));
        // for문을 활용하여 콘솔에 [5, 10, 7, 3] 출력되도록 하시오.


        System.out.print("[");
        int commaLen = arr.length - 1;
        for (int i=0; i<arr.length; i++) {

            if(i < commaLen) {
                System.out.printf("%d,",arr[i]);
            } else {
                System.out.printf("%d,",arr[i]); }
        System.out.print("]");
            System.out.println("------------");
        }
    }
}