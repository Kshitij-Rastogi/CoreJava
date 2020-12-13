import StudentData.*;
import StudentAnalyzer.*;

import java.util.Scanner;

public class AGSchool {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Students");
        int numberOfStudents = sc.nextInt();
        StudentInformation[] studentList = StudentInformation.userInput(numberOfStudents);
        StudentInformation student = new StudentInformation();
        student.displayStudentDetails(studentList);

        StudentScores[] scoreList = StudentScores.userInput(numberOfStudents); 

        TotalScore t = new TotalScore();
        double[] totalScore = t.calcTotalScore(numberOfStudents, scoreList);
        t.heighestScorer(studentList, totalScore);
        
    }
}
