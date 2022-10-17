package javaRush;

import java.util.Scanner;

public class CompareTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        double num1 = scan.nextDouble();
        String result = Math.abs(num1 - num) < 0.000001 ? "числа равны" : "числа не равны";
        System.out.println(result);
    }
}
