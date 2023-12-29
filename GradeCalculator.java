import java.util.Scanner;
public class GradeCalculator
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of subjects:");
        int numSubjects = scanner.nextInt();

        int[] marks = new int[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.println("Enter marks for subject " + (i + 1) + ":");
            marks[i] = scanner.nextInt();
        }

       
        int totalMarks = 0;

        for (int mark : marks) {
            totalMarks += mark;
        }

       
        double averagePercentage = (double) totalMarks / numSubjects;

        char grade = calculateGrade(averagePercentage);

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    private static char calculateGrade(double averagePercentage) {
        char grade;

        if (averagePercentage >= 95) {
            grade = 'A';
        } else if (averagePercentage >= 85) {
            grade = 'B';
        } else if (averagePercentage >= 75){
            grade = 'C';
        } else if (averagePercentage >= 65) {
            grade = 'D';
        } else if (averagePercentage >=55) {
             grade = 'E';
        }else{
            grade ='F';
        }
            
        

        return grade;
    }
}

    
