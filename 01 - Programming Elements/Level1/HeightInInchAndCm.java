import java.util.Scanner;

public class HeightInInchAndCm {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your height in cm : ");
        double height = sc.nextDouble();
        double heightInInches = height / 2.54;
        double heightInFeet = heightInInches / 12;
       
        System.out.println("Your height in cm is "+height+" while in feet is "+String.format("%.2f",heightInFeet)+" and in Inches is "+(String.format("%.2f",heightInInches)));
       }
    }
