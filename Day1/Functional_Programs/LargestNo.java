import java.util.Scanner;

public class LargestNo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        System.out.println((n1>n2)?(n1>n3)?n1:((n2>n3)?n2:n3):((n2>n3)?n2:n3));
    }
}
// Java Program to Find the Largest Among Three number

