import java.util.*;

public class TotalPriceOfItem {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the unit price : ");
        int unitPrice = sc.nextInt();
        System.out.print("Enter the quantity : ");
        int quantity = sc.nextInt();
        //finding total price
        int totalPrice = unitPrice * quantity;
        System.out.println("The total price is INR "+totalPrice+" if the unit price of an item is INR "+unitPrice+" and the quantity is "+quantity);
    }
    
}
