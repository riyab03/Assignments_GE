import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int f1=0,f2=1;
        int sum=0;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(0);
        arr.add(1);
        System.out.print("Enter the number of terms:");
        int n=sc.nextInt();
        for(int i=0;i<n-2;i++){
            sum=f1+f2;
            arr.add(sum);
            f1=f2;
            f2=sum;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i)+"  ");
        }
    }
}
