package com.green.day10.ch6;

public class NumberBoxTest {
    public static void main(String[] args) {
        NumberBox nb1;
        nb1 = new NumberBox();

        System.out.printf("%d + %d = %d\n", 10, 20, (10 + 20));
        System.out.printf("%d + %d = %d\n", 30, 40, (30 + 40));

        System.out.println("-------------------------------");

        nb1.minus(40, 20);

        nb1.abs(-10);
        nb1.abs(10);
        nb1.abs(-33);
        nb1.abs(39);
    }
}
