package javaRush;

import java.util.Scanner;

public class task452 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int max = 0;
        int a = 0;
        while (s.hasNextInt()) {
            int x = s.nextInt();
            if ((x % 2) == 0)
                x = a;
            if (a > max)
                max = x;
        }

    }
}
