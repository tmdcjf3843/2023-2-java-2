package com.green.day10.ch6;

public class MethodExam {
    void checkZero(int n1) {
        System.out.println(n1 == 0 ? "0입니다" : "0아닙니다");
    }
    int radomValFromTo(int n1, int n2) {
        return (int) (Math.random()* (n2-n1+1)) + n1;
        }
    void scoreResultPrint(int score) {
        if(score < 0 || score > 100) {
            System.out.println("잘못된 점수입니다.");
            return;
        }
        String grade = "D";
        if(score >= 90) {
            grade = "A";
        } else if(score >= 80) {
            grade = "B";
        } else if(score >= 70) {
            grade = "C";
        }
        System.out.printf("%s학점\n",grade);
    }
}