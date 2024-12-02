public class PowerOf2{
    public static void main(String[] args){
        System.out.println("My argument is: "+args[0]);
        int n = Integer.parseInt(args[0]);
        int ans=1;
        if(n>=31 || n<0){
            System.out.println("Enter n such that 0<n<31");
            return;
        }
        else{
            System.out.println(ans);
            for(int i=1;i<n;i++){
                ans=ans*2;
                System.out.println(ans);
            }
        }
    }
}

//Commands to run this file:( javac PowerOf2.java ) then ( java PowerOf2 10 )