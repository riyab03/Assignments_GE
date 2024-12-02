import java.util.Scanner;

public class Factors{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println(2);
            while(n%2==0){
                n=n/2;
            }
        }
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0){
                System.out.println(i);
                while(n%i==0){
                    n=n/i;
                }
            }
        }
        if(n>2){
            System.out.println(n);
        }
    }
}
// Factors
// a. Desc -> Computes the prime factorization of N using brute force.
// b. I/P -> Number to find the prime factors
// c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
// d. O/P -> Print the prime factors of number N.