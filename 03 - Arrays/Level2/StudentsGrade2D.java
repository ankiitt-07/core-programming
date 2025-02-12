import java.util.Scanner;

public class StudentsGrade2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        
        int[][] marks = new int[numberOfStudents][3];
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + " (Physics, Chemistry, Maths):");

            for (int j = 0; j < 3; j++) {
                int mark;
                do {
                    mark = scanner.nextInt();
                    if (mark < 0) {
                        System.out.println("Marks cannot be negative. Enter again:");
                    }
                } while (mark < 0);
                marks[i][j] = mark;
            }

            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 3.0);

            if (percentages[i] >= 90) {
                grades[i] = 'A';
            } else if (percentages[i] >= 80) {
                grades[i] = 'B';
            } else if (percentages[i] >= 70) {
                grades[i] = 'C';
            } else if (percentages[i] >= 60) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }

        System.out.printf("%-10s %-10s %-10s %-10s %-12s %-8s%n", "Physics", "Chemistry", "Maths", "Total", "Percentage", "Grade");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < numberOfStudents; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            System.out.printf("%-10d %-10d %-10d %-10d %-12.2f %-8c%n", 
                marks[i][0], marks[i][1], marks[i][2], total, percentages[i], grades[i]);
        }
    }
}