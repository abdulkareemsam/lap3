package lap3.HomeWork3;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the first number=");
        int a=in.nextInt();
        System.out.print("enter the second number=");
        int b=in.nextInt();
        System.out.print("enter the Third number=");
        int c=in.nextInt();

        if (a==b&&a==c&&c==b)
        {
            System.out.println("the numbers simulated");
        } else System.out.println("the numbers dissimilar");

        }


    }


