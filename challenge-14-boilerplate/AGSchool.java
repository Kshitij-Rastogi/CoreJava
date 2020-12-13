import java.util.Scanner;
public class AGSchool{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int numberOfStudents = sc.nextInt();
        System.out.println("Enter name and the respective Roll Number of the student");
        String[][] nameAndRollNo = new String[numberOfStudents][2];
        for(int i=0; i<numberOfStudents; i++){
            for(int j=0; j<2; j++){
                nameAndRollNo[i][j] = sc.next();
            }
        }
        float[][] scoresOfStudent = new float[numberOfStudents][5];
        for(int i=0; i<numberOfStudents; i++){
            System.out.println("Enter Scores of the below subject for "+ "'" +nameAndRollNo[i][0] + "'" + " in below order:"
            + "\n" + "- Math" + "\n" + "- Science" + "\n" + "- English" +
            "\n" + "- Language" + "\n" + "- Social Studies");
            for(int j=0; j<5; j++){
                scoresOfStudent[i][j] = sc.nextFloat();
            }
        }
        String[][] totalMarks =  new String[numberOfStudents][3];
        for(int i=0; i<numberOfStudents; i++){
            totalMarks[i][0] = nameAndRollNo[i][0];
            totalMarks[i][1] = nameAndRollNo[i][1];
            totalMarks[i][2] = calcTotalScore(scoresOfStudent, i);
        }
        calcAverageScore(totalMarks, numberOfStudents);
        sc.close();
    }

    public static void calcAverageScore(String[][] totalMarks, int numberOfStudents){
        float[] averageScore = new float[numberOfStudents];
        for(int i=0; i<numberOfStudents; i++){
            averageScore[i] = (Float.parseFloat(totalMarks[i][2]))/5;
            System.out.println(averageScore[i]);
        }
        printOutput(averageScore, numberOfStudents, totalMarks);
        
    }

    public static String calcTotalScore(float[][] scoresOfStudent, int i){
        int calculateScore = 0;
        for(int j=0; j<5; j++){
            calculateScore += scoresOfStudent[i][j]; 
        }
        return Integer.toString(calculateScore);
    }



    public static void printOutput(float[] averageScore, int numberOfStudents, String[][] totalMarks){
        String[][] star = new String[numberOfStudents][10];
        String[][] transpose = new String[10][numberOfStudents];

        for(int i=0; i<numberOfStudents; i++){
            for(int j=0; j<averageScore[i]/10; j++){
                star[i][j] = " * "; 
            }
        }
        for(int i=0; i<numberOfStudents; i++){
            for(int j=0; j<averageScore[i]/10; j++){
                transpose[j][i] = star[i][j];
            }
        }
        for(int i=9; i>=0; i--){
            for(int j=numberOfStudents; j>=0; j--){
                if(transpose[i][j]==null){
                    System.out.print("");
                }
                else{
                    System.out.print(transpose[i][j]);
                }
            }
            System.out.println();
        }

        for(int column=0; column<numberOfStudents; column++){
            System.out.print(totalMarks[column][1] + " ");
        }
    }
}
