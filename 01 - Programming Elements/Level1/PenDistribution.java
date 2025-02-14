import java.util.*;

public class PenDistribution {
    public static void main(String[] args) {
        
        int noOfPens = 14;
        int noOfStudents = 3;
        int noOfPensDistributedEqually = noOfPens / noOfStudents; 
        int noOfPensUndistributed = noOfPens % noOfStudents;
        System.out.println("The pen per Student is "+noOfPensDistributedEqually+" and the remaining pen not distributed is "+noOfPensUndistributed);

    }
}
