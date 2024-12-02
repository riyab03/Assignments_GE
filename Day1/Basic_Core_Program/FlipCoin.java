import java.util.Random;
import java.util.Scanner;

public class FlipCoin{
    public static void main(String[] agrs){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of turns:");
        int n=sc.nextInt();
        double h_cnt=0,t_cnt=0;
        for(int j=0;j<n;j++){
            Random rn = new Random(); 
            Double rand = rn.nextDouble(1);
            //double rand=Math.random();
            if(rand<0.5){
                t_cnt++;
            }
            else{
                h_cnt++;
            }
        }
        double head=(h_cnt/n)*100;
        double tails=(t_cnt/n)*100;
        System.out.println("percentage of head:"+head);
        System.out.println("percentage of tail:"+tails);

    }
}
