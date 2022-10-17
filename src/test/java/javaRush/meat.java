package javaRush;

import java.util.Scanner;

public class meat {
    public static String NOT_YET = "скусственное мясо еще не готово.";
    public static String DONE = "скусственное мясо готово.";
    public static String HORRIBLY_DONE = "скусственное мясо превратилось в мясного монстра!";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        if (hour==0 && minute==30)
            System.out.println(DONE);
        else if (hour<=0 && minute<30)
            System.out.println(NOT_YET);
        else if (hour>0 || minute>30)
            System.out.println(HORRIBLY_DONE);


    }
}
