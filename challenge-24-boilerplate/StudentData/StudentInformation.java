package StudentData;

import java.util.Scanner;
public class StudentInformation{
    public String studentName;
    public int rollNo;

    public StudentInformation(){

    }

    public StudentInformation(String studentName, int rollNo) {
        this.studentName = studentName;
        this.rollNo = rollNo;
    }


    public static StudentInformation[] userInput(int numberOfStudents){
        Scanner sc = new Scanner(System.in);
        StudentInformation[] studentList = new StudentInformation[numberOfStudents];

        for(int i=0; i<numberOfStudents; i++){
            System.out.println("Enter Student Name : ");
            String studentName = sc.next();
            System.out.println("Enter Student Roll Number : ");
            int rollNo = sc.nextInt();

            StudentInformation student = new StudentInformation(studentName, rollNo);
            studentList[i] = student;   
        }
        return studentList;
    }

    public void displayStudentDetails(StudentInformation[] studentList){
        System.out.format("%s %15s %n", "Student Name", "Roll Number");
        for(StudentInformation s: studentList){
            System.out.format("%s %15s %n", s.studentName, s.rollNo);
        }
    }
}