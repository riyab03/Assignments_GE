import java.util.Scanner;
import java.lang.Math;

public class Euclidean {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Value of x,y:");
        int x=Integer.parseInt(args[0]),y=Integer.parseInt(args[1]);
        System.out.println("{"+x+","+y+"}");
        System.out.print("Euclidean Distance:");
        System.out.println(Math.sqrt(Math.pow(x,2)+Math.pow(y,2)));
    }
}

// Write a program Distance.java that takes two integer command-line arguments x
// and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
// formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function