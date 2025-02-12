import java.util.Scanner;

public class LengthOfSquare {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the perimeter of square : ");
        float perimeter = sc.nextFloat();
        float squareSideLength = perimeter / 4;
        System.out.println("The length of side of square is "+squareSideLength);
        
    }
    
}
