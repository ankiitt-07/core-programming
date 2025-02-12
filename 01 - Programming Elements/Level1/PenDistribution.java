import java.util.*;

public class PenDistribution {
    public static void main(String[] args) {
        
        int pens = 14;
        int noOfStudents = 3;
        int noOfPensDistributedEqually = pens / noOfStudents;
        int noOfPensUndistributed = pens % noOfStudents;
        System.out.println("The pen per Student is "+noOfPensDistributedEqually+" and the remaining pen not distributed is "+noOfPensUndistributed);

    }
}
