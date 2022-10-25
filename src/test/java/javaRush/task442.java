package javaRush;

import java.util.Scanner;

public class task442 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String a = scanner.nextLine();
            if (a.equals("enough")){
                break;}
            System.out.println(a);
        }
    }
}
