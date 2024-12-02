import java.lang.Math;

public class WindChill{
    public static void main(String[] args){
        System.out.print("Input values of t(temperature) and v(wind speed):");
        Double t=Double.parseDouble(args[0]);  
        Double v=Double.parseDouble(args[0]); 
        if(Math.abs(t)>50 ||(v>120)||v<3){
            System.out.println("Enter temp larger than 50 or wind speed larger than 120 or less than 3");
            return;
        }
        else{
            double w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v,0.16);
            System.out.println("Wind chill:"+w);
        }
    }
}


// Write a program WindChill.java that takes two double command-line arguments t
// and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the
// temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the
// National Weather Service defines the effective temperature (the wind chill) to be:
// Note: the formula is not valid if t is larger than 50 in absolute value or if v is larger
// than 120 or less than 3 (you may assume that the values you get are in that range).