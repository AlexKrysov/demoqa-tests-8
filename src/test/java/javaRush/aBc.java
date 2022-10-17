package javaRush;

import java.util.Scanner;

public class aBc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if(x==y)
        {
            if(x==z)
            {
                System.out.print(x+" "+y+" "+z);
            }
            else
            {
                System.out.print(x+" "+y);
            }
        }
        else if (x==z)
        {
            System.out.print(x+" "+z);
        }
        else if (y==z)
        {
            System.out.print(z+" "+y);
        }
        else{

        }


    }
}
