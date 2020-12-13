import java.util.Scanner;
public class AGSchool {
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
        int[][] scoresOfStudent = new int[numberOfStudents][5];
        for(int i=0; i<numberOfStudents; i++){
            System.out.println("Enter Scores of the below subject for "+ "'" +nameAndRollNo[i][0] + "'" + " in below order:"
            + "\n" + "- Math" + "\n" + "- Science" + "\n" + "- English" +
            "\n" + "- Language" + "\n" + "- Social Studies");
            for(int j=0; j<5; j++){
                scoresOfStudent[i][j] = sc.nextInt();
            }
        }
        String[][] totalMarks =  new String[numberOfStudents][3];
        for(int i=0; i<numberOfStudents; i++){
            totalMarks[i][0] = nameAndRollNo[i][0];
            totalMarks[i][1] = nameAndRollNo[i][1];
            totalMarks[i][2] = calcTotalScore(scoresOfStudent, i);
        }
        printOutput(totalMarks, numberOfStudents);
        calcAverageScore(scoresOfStudent, numberOfStudents);
        sc.close();
    }

    public static void calcAverageScore(int[][] scoresOfStudent, int numberOfStudents){
        float sumTotalMarks = 0;
        String[] subjects = {"Maths", "Science", "English", "Language", "Social Studies"};
        String[][] averageScore = new String[subjects.length][2];
        for(int i=0; i<5; i++){
            averageScore[i][0] = subjects[i];
        }
        System.out.println();
        System.out.println("The Average Score of each subject are:");
        for(int i=0; i<5; i++){
            for(int j=0; j<numberOfStudents; j++){
                sumTotalMarks += scoresOfStudent[j][i];
            }
            averageScore[i][1] = Float.toString(sumTotalMarks/numberOfStudents);
            sumTotalMarks = 0;
        }   
        for(int i=0; i<5; i++){
            for(int j=0; j<2; j++){
                System.out.print(averageScore[i][j] + "  ");
            }
            System.out.println();
        }    
    }

    public static String calcTotalScore(int[][] scoresOfStudent, int i){
        int calculateScore = 0;
        for(int j=0; j<5; j++){
            calculateScore += scoresOfStudent[i][j]; 
        }
        return Integer.toString(calculateScore);
    }

    public static void printOutput(String[][] totalMarks, int numberOfStudents){
        int heighestScore = 0;
        for(int i=0; i<numberOfStudents; i++){
            if(Integer.parseInt(totalMarks[i][2]) > heighestScore){
                heighestScore = Integer.parseInt(totalMarks[i][2]);
            }
        }
        System.out.println();
        System.out.println("The heighest scorer is: ");
        for(int i=0; i<numberOfStudents; i++){
            for(int j=0; j<3; j++){
                if(Integer.parseInt(totalMarks[i][2]) == heighestScore){
                    System.out.print(totalMarks[i][j]+ " ");
                }
            }
        }
    }
}
