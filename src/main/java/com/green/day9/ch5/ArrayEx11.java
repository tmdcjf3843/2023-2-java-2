package com.green.day9.ch5;

import com.green.day6.ch4.While;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

public class ArrayEx11 {
    public static void main(String[] args) {
        final  int LEN = 10;
        int [] numArr = new int[LEN];
        int [] cntArr = new int[LEN];

        /*
        numArr 각 방에 0~9사이의 랜덤값을 대입한다 (중복 허용)
        numArr 각 방의 값도 출력
        cntArr의 0번 방은 0의 개수, 1번 방은 1의 개수 count값을 넣는다.
        0~9의 개수를 출력

         [4,4,4,6,5,7,9,7,5,3]
         0의 개수: 0
         1의 개수: 0
         2의 개수: 0
         3의 개수: 1
         4의 개수: 3
         5의 개수: 2
         6의 개수: 1
         7의 개수: 2
         8의 개수: 0
         9의 개수: 1
         */

        /*
        for(int i=0; i<LEN; i++) {
            int val = numArr[i];
            cntArr[val]++;
            }
         */
        for(int zz : numArr) {
            cntArr[zz]++;
        }


        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int)(Math.random() * numArr.length);
        }
        System.out.print(Arrays.toString(numArr));
        for (int i = 0; i < numArr.length; i++) {
            cntArr[numArr[i]] ++;
        }
        for (int i = 0; i < numArr.length; i++) {

            System.out.println(i+"의 갯수 "+ cntArr[i]);
        }
    }
}
