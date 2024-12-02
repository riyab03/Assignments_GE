import java.util.Scanner;

public class HarmonicNum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0){
            System.out.println("Infinite Number");
            return;
        }else{
            double ans=1.0;
            for(int i=2;i<=n;i++){
                ans=ans+(1.0/i);
            }
            System.out.println("ans"+ans);
        }
    }
}