import java.util.Scanner;
import java.util.Arrays;
public class SumThree {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of integers:");
        int n=sc.nextInt();
        System.out.println("Enter numbers:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // Arrays.sort(arr);
        int m=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if((arr[i]+arr[j]+arr[k])==0){
                        m++;
                        System.out.println("Triplet "+m+":"+arr[i]+","+arr[j]+","+arr[k]);
                    }
                }
            }
        }
        System.out.println("Total Number of triplets:"+m);
    }
}

// Sum of three Integer adds to ZERO
// a. Desc -> A program with cubic running time. Read in N integers and counts the
// number of triples that sum to exactly 0.
// b. I/P -> N number of integer, and N integer input array
// c. Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
// d. O/P -> One Output is number of distinct triplets as well as the second output is to
// print the distinct triplets.