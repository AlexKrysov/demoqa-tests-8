package javaRush;

import java.util.Scanner;

public class task4300 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean isExit = true;
        while (scanner.hasNextInt())
        {
            int number = scanner.nextInt();
            sum = sum + number;
            String s = scanner.nextLine();
            isExit = s.equals("ENTER");
        }
        System.out.println(sum);

    }
}
