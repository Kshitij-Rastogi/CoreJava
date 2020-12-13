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
        printOutput(scoresOfStudent, numberOfStudents, nameAndRollNo);
        sc.close();
    }

    public static void printOutput(int[][] scoresOfStudent, int numberOfStudents, String[][] nameAndRollNo){
        int count=0;
        System.out.println();
        System.out.println("Students who have cleared the examination: ");
        for(int i=0; i<numberOfStudents; i++){
            for(int j=0; j<5; j++){
                if(scoresOfStudent[i][j]>35){
                    count++;
                }
            }
            if(count==5){
                System.out.println(nameAndRollNo[i][0] + ": " + nameAndRollNo[i][1]);
            }
            count = 0;
        }

        System.out.println();
        System.out.println("Students who needs to mandatorily repeat the examination");
        for(int i=0; i<numberOfStudents; i++){
            for(int j=0; j<5; j++){
                if(scoresOfStudent[i][j]>35){
                    count++;
                }
            }
            if(count<5){
                System.out.println(nameAndRollNo[i][0] + ": " + nameAndRollNo[i][1]);
            }
            count = 0;
        }
    }
}
