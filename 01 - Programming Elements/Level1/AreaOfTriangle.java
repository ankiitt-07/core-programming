import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height : ");
        float height = sc.nextFloat();
        System.out.print("Enter the base : ");
        float base = sc.nextFloat();
        float areaOfTriangle = (1/2f) * base * height;
        System.out.println("The area of Triangle is "+areaOfTriangle);
    }
    
}
