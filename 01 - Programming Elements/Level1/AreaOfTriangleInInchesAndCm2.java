import java.util.Scanner;

public class AreaOfTriangleInInchesAndCm2{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
          // Input base and height for the triangle
          System.out.print("Enter base in inches: ");
          double base = sc.nextDouble();
  
          System.out.print("Enter height in inches: ");
          double heightInInches = sc.nextDouble();
  
          // Calculate area in square inches and square centimeters
          double areaInches = 0.5 * base * heightInInches;
          double areaCm = areaInches * 6.4516; // 1 square inch = 6.4516 square cm
  
  
          // Convert height to cm and feet
          double heightInCm = heightInInches * 2.54; // 1 inch = 2.54 cm
          double heightInFeet = heightInInches / 12; // 1 foot = 12 inches
       
        System.out.println("Your height in cm is "+heightInCm+" while in feet is "+String.format("%.2f",heightInFeet)+" and in Inches is "+(String.format("%.2f",heightInInches)));
       }
    }
