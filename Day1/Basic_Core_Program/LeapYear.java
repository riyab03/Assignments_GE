import java.util.Scanner;

public class LeapYear{
    public static void main(String[] agrs){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Year(Four digit like 2024)");
        String s=sc.next();
        int year=Integer.parseInt(s);
        if(s.length()<4){
            System.out.println("enter valid 4 digit number");
            return;
        }
        else{
            if((year%4==0 && year%100!=0) || (year%400==0)){
                System.out.println(year+" is a Leap Year");
            }else{
                System.out.println(year+" is Not a Leap Year");
            }
        }
    }
}
