import java.util.Scanner;

public class UserInputKmToMiles {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the kilometers: ");
        double km = sc.nextDouble();
        double miles = km * 0.621; // 1 miles = 1.6 km
        System.out.println("The total miles is " + miles + " mile for the given kilometers "+ km+" km");

    }
}
