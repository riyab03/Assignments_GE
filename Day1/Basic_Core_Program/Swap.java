import java.util.Scanner;

public class Swap{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n=sc.nextInt();
        System.out.print("Enter second number: ");
        int m=sc.nextInt();
        n=n+m;m=n-m;n=n-m;
        System.out.println("Enter first number: "+n);
        System.out.println("Enter second number: "+m);
    }
}
// Java Program to Swap Two Numbers

