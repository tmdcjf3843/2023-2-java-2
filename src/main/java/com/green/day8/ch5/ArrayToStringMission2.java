package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayToStringMission2 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 7, 3};
        System.out.println(Arrays.toString(arr));
        // for문을 활용하여 콘솔에 [5, 10, 7, 3] 출력되도록 하시오.


        System.out.println("(1)--------------");
        System.out.print("[");
        for(int i=0; i<arr.length; i++) {
            if( i != 0 )  {
            System.out.print(", ");
        }
            System.out.print(arr[i]);
        }
        System.out.println("]");
    }
}