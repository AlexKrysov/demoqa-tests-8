package javaRush;

import java.util.Scanner;

public class task441 {
    public static void main(String[] args) {
        System.out.println("Введите предполагаемое число");

        checkNumber(3);
    }

    public static void checkNumber(int number) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber;
        //напишите тут ваш код
        while (true)
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a == b)
                System.out.println("Загадочное число равно " + a);
                break;


        }

    }
}
