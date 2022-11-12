package lap3.HomeWork3;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner out=new Scanner(System.in);
        System.out.print("ENTER LETTER AND NUMBER=");
        String l = out.next();
        int n=out.nextInt();

        if( l=="a" || l=="c" || l=="e" || l=="g" )
        {    System.out.println("white");}
        else {System.out.println("black");}
       if(n%2==0)
       {System.out.println("white");}
       else System.out.println("black");



    }
}
