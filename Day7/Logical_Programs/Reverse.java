import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int num=n;
        int m=0;
        while(n>0){
            m=(m*10+n%10);
            n/=10;
        }
        System.out.print("Reverse of "+num+" is: ");
        System.out.println(m);
    }
}
