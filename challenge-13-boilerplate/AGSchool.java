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
        float[][] scoresOfStudent = new float[numberOfStudents][5];
        for(int i=0; i<numberOfStudents; i++){
            System.out.println();
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
        calcAverageScore(totalMarks, numberOfStudents, scoresOfStudent);

        sc.close();
    }





    public static void calcAverageScore(String[][] totalMarks, int numberOfStudents, float[][] scoresOfStudent){
        String[][] averageScore = new String[numberOfStudents][4];
        for(int i=0; i<numberOfStudents; i++){
            averageScore[i][0] = totalMarks[i][0];
            averageScore[i][2] = totalMarks[i][2];
            averageScore[i][1] = Float.toString((Float.parseFloat(totalMarks[i][2]))/5);
            if(Float.parseFloat(averageScore[i][1]) >= 95.0){
                averageScore[i][3] = "A";
            }
            else if(Float.parseFloat(averageScore[i][1]) >= 80.0){
                averageScore[i][3] = "B";
            }
            else if(Float.parseFloat(averageScore[i][1]) >= 70.0){
                averageScore[i][3] = "C";
            }
            else if(Float.parseFloat(averageScore[i][1]) >= 60){
                averageScore[i][3] = "D";
            }
            else if(Float.parseFloat(averageScore[i][1]) >= 50){
                averageScore[i][3] = "E";
            }
            else{
                averageScore[i][3] = "F";
            }
        }
        System.out.println();
        System.out.println("The Average Score of Students are:");
        for(int i=0; i < numberOfStudents; i++){
            for(int j=0; j < 4; j++)
            {
                if(averageScore[i][3] == "A"){
                    System.out.print(averageScore[i][j] + " ");
                }
            }
            if(averageScore[i][3] == "A"){
                System.out.println();
            }
        }
        for(int i=0; i < numberOfStudents; i++){
            for(int j=0; j < 4; j++)
            {
                if(averageScore[i][3] == "B"){
                    System.out.print(averageScore[i][j] + " ");
                }
            }
            if(averageScore[i][3] == "B"){
                System.out.println();
            }
        }
        for(int i=0; i < numberOfStudents; i++){
            for(int j=0; j < 4; j++)
            {
                if(averageScore[i][3] == "C"){
                    System.out.print(averageScore[i][j] + " ");
                }
            }
            if(averageScore[i][3] == "C"){
                System.out.println();
            }
        }
        for(int i=0; i < numberOfStudents; i++){
            for(int j=0; j < 4; j++)
            {
                if(averageScore[i][3] == "D"){
                    System.out.print(averageScore[i][j] + " ");
                }
            }
            if(averageScore[i][3] == "D"){
                System.out.println();
            }
        }
        for(int i=0; i < numberOfStudents; i++){
            for(int j=0; j < 4; j++)
            {
                if(averageScore[i][3] == "E"){
                    System.out.print(averageScore[i][j] + " ");
                }
            }
            if(averageScore[i][3] == "E"){
                System.out.println();
            }
        }
        for(int i=0; i < numberOfStudents; i++){
            for(int j=0; j < 4; j++)
            {
                if(averageScore[i][3] == "F"){
                    System.out.print(averageScore[i][j] + " ");
                }
            }
            if(averageScore[i][3] == "F"){
                System.out.println();
            }
        }
        printOutput(averageScore, numberOfStudents, totalMarks, scoresOfStudent);       
    }






    public static String calcTotalScore(float[][] scoresOfStudent, int i){
        float calculateScore = 0;
        for(int j=0; j<5; j++){
            calculateScore += scoresOfStudent[i][j]; 
        }
        return Float.toString(calculateScore);
    }

    

    

    public static void printOutput(String[][] averageScore, int numberOfStudents, String[][] totalMarks, float[][] scoresOfStudent){
        System.out.println();
        System.out.println("The Generated Report Card For Each Student is:");
        for(int i=0; i<numberOfStudents; i++){
            System.out.println("- Name: " + averageScore[i][0]);
            System.out.println("- Roll No: " + totalMarks[i][1]);
            System.out.println("- Maths: " + scoresOfStudent[i][0] );
            System.out.println("- Science: " + scoresOfStudent[i][1] );
            System.out.println("- English: " + scoresOfStudent[i][2] );
            System.out.println("- Language: " + scoresOfStudent[i][3] );
            System.out.println("- Social Studies: " + scoresOfStudent[i][4] );
            System.out.println("- Total Marks: " + totalMarks[i][2]);
            System.out.println("- Grade: " + averageScore[i][3]);
            System.out.println();
        }
    }
}
