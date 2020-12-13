package StudentData;

import java.util.Scanner;

public class StudentScores{
    public double mathScore;
    public double scienceScore;
    public double englishScore;
    public double languageScore;
    public double socialScienceScore;

    public StudentScores(double mathScore, double scienceScore, double englishScore, double languageScore,
            double socialScienceScore) {
        this.mathScore = mathScore;
        this.scienceScore = scienceScore;
        this.englishScore = englishScore;
        this.languageScore = languageScore;
        this.socialScienceScore = socialScienceScore;
    }

    public static StudentScores[] userInput(int numberOfStudents){
        Scanner sc  = new Scanner(System.in);
        StudentScores[] scoreList = new StudentScores[5];

        for(int j=0; j<numberOfStudents; j++){
            double mathScore=0, scienceScore=0, englishScore=0, languageScore=0, socialScienceScore=0;
            for(int i=0; i<5; i++){
                if(i==0){
                    System.out.println("Enter Marks of Maths :");
                    mathScore = sc.nextDouble();
                }
                else if(i==1){
                    System.out.println("Enter Marks of Science :");
                    scienceScore = sc.nextDouble();
                }
                else if(i==2){
                    System.out.println("Enter Marks of English :");
                    englishScore = sc.nextDouble();
                }
                else if(i==3){
                    System.out.println("Enter Marks of Language :");
                    languageScore = sc.nextDouble();
                }
                else if(i==4){
                    System.out.println("Enter Marks of Social Science :");
                    socialScienceScore = sc.nextDouble();
                }
            }
            StudentScores score = new StudentScores(mathScore, scienceScore, englishScore, languageScore, socialScienceScore);
            scoreList[j] = score; 
        }
        return scoreList;
    }   
}