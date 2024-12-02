import java.util.Scanner;

public class VowelCon{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        char n=sc.next().charAt(1);
        if(n=='a' ||n=='e'||n=='i'||n=='o'||n=='u'||n=='A'||n=='E'||n=='I'||n=='O'||n=='U'){
            System.out.println(n+" is Vowel");
        }
        else{
            System.out.println(n+" is Consonant.");
        }
    }
}
// Java Program to Check Whether an Alphabet is Vowel or Consonant

