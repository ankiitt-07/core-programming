import java.util.*;

public class NumbersOfHandshakes {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of Students : ");
        int n = sc.nextInt();
        int maxNoOfHandshakes = (n*(n-1)) / 2; //Here using combination formula
        System.out.println("Maximum no of handshakes are : "+maxNoOfHandshakes);


    }
    
}
