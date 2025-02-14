import java.util.*;

public class DistanceInMilesAndYards {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        float distanceInFeet = sc.nextFloat();
        float yard = distanceInFeet / 3; // 1 yard = 3 feet
        // float miles = distanceInFeet / 5280; // 1 miles = 5280 feet
        float miles = yard / 1760; // 1 miles = 1760 yards
        System.out.println("The distance in miles is "+miles+" and in yards is "+yard);

    }
    
}
