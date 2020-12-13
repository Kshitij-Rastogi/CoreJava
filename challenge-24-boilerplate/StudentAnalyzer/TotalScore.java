package StudentAnalyzer;

import StudentData.*;
public class TotalScore{

    public double[] calcTotalScore(int numberOfStudents, StudentScores[] scoreList){
        double[] totalScore = new double[numberOfStudents];
        for(int i=0; i<numberOfStudents;i++){
            totalScore[i] = scoreList[i].mathScore + scoreList[i].scienceScore + scoreList[i].englishScore + scoreList[i].languageScore + scoreList[i].socialScienceScore;
        }

        return totalScore;
    }

    public void heighestScorer(StudentInformation[] studentList, double[] totalScorer){
        double heighestScore=0;
        int pointer=0;
        for(int i=0;i<totalScorer.length;i++){
            if(totalScorer[i] > heighestScore){
                heighestScore = totalScorer[i];
                pointer = i;
            }
        }
        System.out.println("The Top Scorer is : ");
        System.out.println(studentList[pointer].studentName + "  " + studentList[pointer].rollNo);
    }

}