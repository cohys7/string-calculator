package org.example;

public class Main {
    public static void main(String[] args) {
        StringCalculator calculator = new StringCalculator();

        // 잘 동작하는 예제
        System.out.println("1+2=" + calculator.calculate("1+2"));
        System.out.println("3-2=" + calculator.calculate("3-2"));
        System.out.println("4-2=" + calculator.calculate("4*2"));
        System.out.println("6/2=" + calculator.calculate("6/2"));

        // 잘 동작 하지 않는 예제
//        System.out.println("1/0=" + calculator.calculate("1/0"));
//        System.out.println("1/0=" + calculator.calculate("a-b"));
    }
}