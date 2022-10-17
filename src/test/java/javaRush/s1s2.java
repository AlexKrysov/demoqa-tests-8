package javaRush;

import java.util.Scanner;

public class s1s2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        if (s1.equals(s2))
            System.out.println("строки одинаковые");
        else
            System.out.println("строки разные");
    }
}
