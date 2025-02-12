import java.util.*;

public class UniversityDiscount {
    public static void main(String[] args) {
        
        double fee = 125000;
        double discountPercent = 0.1;
        double discountedAmount = fee*discountPercent;
        double  discountedFee = fee - discountedAmount;
        System.out.println("The discount amount is INR "+ discountedAmount +" and final discounted fee is INR "+discountedFee);
    }
}
