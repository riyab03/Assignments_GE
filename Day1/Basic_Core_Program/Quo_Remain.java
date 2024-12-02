import java.util.Scanner;

public class Quo_Remain{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter divisor: ");
        Double divisor=sc.nextDouble();
        System.out.println("Enter divident: ");
        Double divident=sc.nextDouble();
        Double quotient=divident/divisor;
        System.out.println("Quotient is : "+quotient);
        Double remainder=divident%divisor;
        System.out.println("Remainder is : "+remainder);
    }
}
// Java Program to Compute Quotient and Remainder