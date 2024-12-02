import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
public class PrimeNo {
    public static boolean prime(int a){
        if(a<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number up to which you want to find prime numbers");
        int n=sc.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(prime(i)){
                arr.add(i);
            }
        }
        System.out.println("LIST OF ALL PRIME NUMBER UPTO "+n+ " are: ");
        for(int i=0;i<(arr.size());i++){
            System.out.print(arr.get(i)+"  ");
        }
    }
}
