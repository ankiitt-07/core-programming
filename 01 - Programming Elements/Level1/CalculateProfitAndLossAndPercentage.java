import java.util.*;

public class CalculateProfitAndLossAndPercentage {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        double profitPercentage = ((double)profit / costPrice) *100;
        System.out.println("The cost price is INR "+costPrice + " and the selling price is INR "+sellingPrice);
        System.out.println("The profit is INR "+profit+" and the profit percentage is "+profitPercentage);
    }
}
