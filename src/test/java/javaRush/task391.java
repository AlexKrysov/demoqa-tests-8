package javaRush;

import java.util.Scanner;

public class task391 {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (password.equalsIgnoreCase(secret))
        System.out.println("доступ разрешен");
        else
        System.out.println("доступ запрещен");
    }
}
