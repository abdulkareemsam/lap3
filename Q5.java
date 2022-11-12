package lap3.HomeWork3;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Three Numbers:" );
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        if (a<b&&b<c)
        {
            System.out.println("In order");
        }
        else if (a>b&&b>c)
        {
            System.out.println("In order");
        }
        else System.out.println("Not order");
    }
}
