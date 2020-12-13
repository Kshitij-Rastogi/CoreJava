import java.util.Scanner;

public class StudentImpl{
    private int numberOfStudents;
    private String studentName;
    private int rollNumber;
    private double mathsScore;
    private double scienceScore;
    private double englishScore;
    private double languageScore;
    private double socialScienceScore;
    private double totalScore;

    public StudentImpl() {

    }

    public StudentImpl(int numberOfStudents, String studentName, int rollNumber, double mathsScore, double scienceScore, double englishScore, double languageScore, double socialScienceScore, double totalScore) {
        this.numberOfStudents = numberOfStudents;
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.mathsScore = mathsScore;
        this.scienceScore = scienceScore;
        this.englishScore = englishScore;
        this.languageScore = languageScore;
        this.socialScienceScore = socialScienceScore;
        this.totalScore = totalScore;
    } 
    
	public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getMathsScore() {
        return mathsScore;
    }

    public double getScienceScore() {
        return scienceScore;
    }

    public double getEnglishScore() {
        return englishScore;
    }

    public double getLanguageScore() {
        return languageScore;
    }

    public double getSocialScienceScore() {
        return socialScienceScore;
    }

    public double gettotalScore() {
        return totalScore;
    }


    public static StudentImpl[] studentInformation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students : ");
        int numberOfStudents = sc.nextInt();

        StudentImpl[] student = new StudentImpl[numberOfStudents];
        for(int i=0; i<numberOfStudents; i++){
            System.out.println("Enter name of Student");
            String studentName = sc.next();

            System.out.println("Enter Roll Number of " + studentName + " :");
            int rollNumber = sc.nextInt();

            System.out.println("Enter Scores of " + studentName + " :");
            System.out.println("Enter Maths Score: ");
            double mathsScore = sc.nextDouble();

            System.out.println("Enter Science Score: ");
            double scienceScore = sc.nextDouble();

            System.out.println("Enter English Score: ");
            double englishScore = sc.nextDouble();

            System.out.println("Enter Language Score: ");
            double languageScore = sc.nextDouble();

            System.out.println("Enter Social Science Score");
            double socialScienceScore = sc.nextDouble();

            double totalScore = totalScore(mathsScore, scienceScore, englishScore, languageScore, socialScienceScore);
            StudentImpl s = new StudentImpl(numberOfStudents, studentName, rollNumber, mathsScore, scienceScore, englishScore, languageScore, socialScienceScore, totalScore);
            student[i] = s; 
        }
        return student;
    }

    public static double totalScore(double mathsScore, double scienceScore, double englishScore, double languageScore, double socialScienceScore){
        double total = mathsScore + scienceScore + englishScore + languageScore + socialScienceScore;
        return total;
    }

    public static void averageScore(StudentImpl[] student){
        double[] averageScore = new double[5];
        for(int i=0; i<student.length; i++){
            averageScore[0] = averageScore[0] + student[i].mathsScore;
            averageScore[1] = averageScore[1] + student[i].scienceScore;
            averageScore[2] = averageScore[2] + student[i].englishScore;
            averageScore[3] = averageScore[3] + student[i].languageScore;
            averageScore[4] = averageScore[4] + student[i].socialScienceScore;
        }

        averageScore[0] = averageScore[0]/student.length;
        averageScore[1] = averageScore[1]/student.length;
        averageScore[2] = averageScore[2]/student.length;
        averageScore[3] = averageScore[3]/student.length;
        averageScore[4] = averageScore[4]/student.length;

        for(int i=0; i<5; i++){
            if(i==0){
                System.out.println("Average Maths Score : " + averageScore[i]);
            }
            else if(i==1){
                System.out.println("Average Science Score : " + averageScore[i]);
            }
            else if(i==2){
                System.out.println("Average English Score : " + averageScore[i]);
            }
            else if(i==3){
                System.out.println("Average Language Score : " + averageScore[i]);
            }
            else if(i==4){
                System.out.println("Average SocialScience Score : " + averageScore[i]);
            }
        }
    }       
}