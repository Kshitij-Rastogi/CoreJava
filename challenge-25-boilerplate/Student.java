public class Student {
    public static void main(String[] args){
        StudentImpl student = new StudentImpl();
        StudentImpl[] studentList = StudentImpl.studentInformation();
        
        StudentAnalyzer sAnalyzer = new StudentAnalyzer();
        sAnalyzer.printStudent(studentList);
        sAnalyzer.printHeighestScore(studentList);

        student.averageScore(studentList);
        sAnalyzer.printFailStudents(studentList);
        sAnalyzer.printGrades(studentList);
        sAnalyzer.printGraph(studentList);
    }
}
