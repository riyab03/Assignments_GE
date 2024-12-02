import java.util.Scanner;
import java.lang.Math;

public class Quadratic{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input values of a,b and c:");
        int a=sc.nextInt();        
        int b=sc.nextInt();        
        int c=sc.nextInt();  
        double delta=Math.pow(b,2)-4*a*c;
        System.out.print("Root 1:");
        System.out.println(((-1*b)+Math.sqrt(delta))/(2*a));
        System.out.print("Root 2:");
        System.out.println(((-1*b)-Math.sqrt(delta))/(2*a));
    }
}


// Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
// Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
// can be found using a formula (Note: Take a, b and c as input values)
// delta = b*b - 4*a*c
// Root 1 of x = (-b + sqrt(delta))/(2*a)
// Root 2 of x = (-b - sqrt(delta))/(2*a)