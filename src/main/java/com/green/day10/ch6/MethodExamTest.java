package com.green.day10.ch6;

public class MethodExamTest {
    public static void main(String[] args) {
        MethodExam me = new MethodExam();
        me.checkZero(10); //0이 아닙니다.
        me.checkZero(9); //0이 아닙니다.
        me.checkZero(0); //0입니다.

        int r = me.radomValFromTo(10, 100);
        int r2 = me.radomValFromTo(5, 9);

        System.out.println(r);
        System.out.println(r2);

        me.scoreResultPrint(101); //잘못된 점수입니다.
        me.scoreResultPrint(100); //A학점
        me.scoreResultPrint(90); //A학점
        me.scoreResultPrint(80); //B학점
        me.scoreResultPrint(79); //C학점
        me.scoreResultPrint(69); //D학점 (69점이하는 전부 D학점)
        me.scoreResultPrint(-1); //잘못된 점수입니다.
    }
}
