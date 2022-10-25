package javaRush;

import java.util.Scanner;

public class task443 {
    public static void main(String[] args) {


        int i = 1;
        int sum = 0;
        while (i<=100)
        {
            i++;
            if ((i%3) == 0)
                continue;
            sum = sum + i;
        }
        System.out.println(sum);


    }
}
