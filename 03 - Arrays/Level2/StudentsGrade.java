import java.util.Scanner;

public class StudentsGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int number = sc.nextInt();

        int[][] marks = new int[number][3];
        double[] percentages = new double[number];
        char[] grades = new char[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                do {
                    System.out.print("Enter marks for " + subject + " (0-100): ");
                    marks[i][j] = sc.nextInt();
                } while (marks[i][j] < 0 || marks[i][j] > 100);
            }

            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = totalMarks / 3.0;

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

        System.out.println("\nStudent Report:");
        System.out.printf("%-10s %-10s %-10s %-10s %-12s %-8s%n", "Physics", "Chemistry", "Maths", "Total", "Percentage", "Grade");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < number; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            System.out.printf("%-10d %-10d %-10d %-10d %-12.2f %-8c%n", marks[i][0], marks[i][1], marks[i][2], total, percentages[i], grades[i]);
        }
    }
}