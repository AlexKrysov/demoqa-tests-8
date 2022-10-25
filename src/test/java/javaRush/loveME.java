package javaRush;

import java.util.Scanner;

public class loveME {
    public static void main(String[] args) {
        String text = " любит меня";
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int m = 0;
        while (m<10)
        {
            System.out.println(name+text);
            m++;
        }
    }
}
