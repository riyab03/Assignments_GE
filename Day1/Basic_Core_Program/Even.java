import java.util.Scanner;

public class Even{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println(n+" is Even number.");
        }
        else{
            System.out.println(n+" is Odd number.");
        }
    }
}
// Java Program to Check Whether a Number is Even or Odd

