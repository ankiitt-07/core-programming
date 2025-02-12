import java.util.*;

public class DistanceInMilesAndYards {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        float distanceInFeet = sc.nextFloat();
        float yard = distanceInFeet / 3;
        // float miles = distanceInFeet / 5280;
        float miles = yard / 1760;
        System.out.println("The distance in miles is "+miles+" and in yards is "+yard);

    }
    
}
