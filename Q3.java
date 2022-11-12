package lap3.HomeWork3;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner out=new Scanner(System.in);
        System.out.print("enter the number=");
        int num=out.nextInt();
        if (num==0)
        {
            System.out.println("number = 0");
        } else if (num>0) {
            System.out.println("number = positive");
        } else if (num<0) {
            System.out.println("number =negative");

        }


    }

}
