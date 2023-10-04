package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5MissionResult {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력해 주세요(남자, 여자) >>");
        String gender = scan.nextLine();
        System.out.print("키를 입력해 주세요 >>");
        int height = scan.nextInt();
        if("남자".equals(gender)) { //남자 170
            if(height > 170) {
                System.out.printf("%dcm는 남자 평균 초과입니다.", height);
            } else if(height < 170) {
                System.out.printf("%dcm는 남자 평균 미만입니다.", height);
            } else {
                System.out.printf("%dcm는 남자 평균입니다.", height);
            }
        } else { //여자 157
            if(height > 157) {
                System.out.printf("%dcm는 여자 평균 초과입니다.", height);
            } else if(height < 157) {
                System.out.printf("%dcm는 여자 평균 미만입니다.", height);
            } else {
                System.out.printf("%dcm는 여자 평균입니다.", height);
            }
        }
    }
}
