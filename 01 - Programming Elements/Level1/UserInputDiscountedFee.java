import java.util.Scanner;

public class UserInputDiscountedFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Fee: ");
        double fee = sc.nextDouble();
        double discountPercent = 0.1;
        double discountedAmount = fee*discountPercent;
        double  discountedFee = fee - discountedAmount;
        System.out.println("The discount amount is INR "+ discountedAmount +" and final discounted fee is INR "+discountedFee);
    }
    
}
