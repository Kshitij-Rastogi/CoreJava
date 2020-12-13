public class StudentAnalyzer {
    public static void printStudent(StudentImpl[] studentList){
        System.out.format("%s %12s %n", "Name", "RollNo");
        for(int i=0; i<studentList.length; i++){
            System.out.format("%s %5s %n", studentList[i].getStudentName(), studentList[i].getRollNumber());
        }
    }

    public static void printHeighestScore(StudentImpl[] studentList){
        double heighestScore = 0, sumTotal;
        int pointer=0;
        System.out.println("The Heighest Scorer is: ");
        for(int i=0; i<studentList.length; i++){
            sumTotal = studentList[i].getMathsScore() + studentList[i].getEnglishScore() + studentList[i].getScienceScore() + studentList[i].getLanguageScore() + studentList[i].getSocialScienceScore();
            if(sumTotal>heighestScore){
                heighestScore = sumTotal;
                pointer = i;
            }
        }
        System.out.println(studentList[pointer].getStudentName() + "\t" + studentList[pointer].getRollNumber());
    }


    public static void printFailStudents(StudentImpl[] studentList){
        System.out.println("Students needs to mandatorily repeat the examination : ");
        for(int i=0; i<studentList.length; i++){
            if(studentList[i].getMathsScore() < 35 || studentList[i].getScienceScore() < 35 || studentList[i].getEnglishScore() < 35 || studentList[i].getLanguageScore() < 35 || studentList[i].getSocialScienceScore() < 35){
                System.out.println(studentList[i].getStudentName() + "   " + studentList[i].getRollNumber());
            }
        }
    }


    public static void printGrades(StudentImpl[] studentList){
        for(int i=0; i<studentList.length; i++){
            if(studentList[i].gettotalScore()/5 >= 95){
                System.out.println("Name : " + studentList[i].getStudentName());
                System.out.println("RollNo : " + studentList[i].getRollNumber());
                System.out.println("Maths Score : " + studentList[i].getMathsScore());
                System.out.println("Science Score : " + studentList[i].getScienceScore());
                System.out.println("English Score : " + studentList[i].getEnglishScore());
                System.out.println("Language Score : " + studentList[i].getLanguageScore());
                System.out.println("Social Sudies Score : " + studentList[i].getSocialScienceScore());
                System.out.println("Total Score : " + studentList[i].gettotalScore());
                System.out.println("Grade : A ");
                System.out.println();
            }
            else if(studentList[i].gettotalScore()/5 >= 80){
                System.out.println("Name : " + studentList[i].getStudentName());
                System.out.println("RollNo : " + studentList[i].getRollNumber());
                System.out.println("Maths Score : " + studentList[i].getMathsScore());
                System.out.println("Science Score : " + studentList[i].getScienceScore());
                System.out.println("English Score : " + studentList[i].getEnglishScore());
                System.out.println("Language Score : " + studentList[i].getLanguageScore());
                System.out.println("Social Sudies Score : " + studentList[i].getSocialScienceScore());
                System.out.println("Total Score : " + studentList[i].gettotalScore());
                System.out.println("Grade : B ");
                System.out.println();
            }
            else if(studentList[i].gettotalScore()/5 >= 70){
                System.out.println("Name : " + studentList[i].getStudentName());
                System.out.println("RollNo : " + studentList[i].getRollNumber());
                System.out.println("Maths Score : " + studentList[i].getMathsScore());
                System.out.println("Science Score : " + studentList[i].getScienceScore());
                System.out.println("English Score : " + studentList[i].getEnglishScore());
                System.out.println("Language Score : " + studentList[i].getLanguageScore());
                System.out.println("Social Sudies Score : " + studentList[i].getSocialScienceScore());
                System.out.println("Total Score : " + studentList[i].gettotalScore());
                System.out.println("Grade : C ");
                System.out.println();
            }
            else if(studentList[i].gettotalScore()/5 >= 60){
                System.out.println("Name : " + studentList[i].getStudentName());
                System.out.println("RollNo : " + studentList[i].getRollNumber());
                System.out.println("Maths Score : " + studentList[i].getMathsScore());
                System.out.println("Science Score : " + studentList[i].getScienceScore());
                System.out.println("English Score : " + studentList[i].getEnglishScore());
                System.out.println("Language Score : " + studentList[i].getLanguageScore());
                System.out.println("Social Sudies Score : " + studentList[i].getSocialScienceScore());
                System.out.println("Total Score : " + studentList[i].gettotalScore());
                System.out.println("Grade : D ");
                System.out.println();
            }
            else if(studentList[i].gettotalScore()/5 >= 50){
                System.out.println("Name : " + studentList[i].getStudentName());
                System.out.println("RollNo : " + studentList[i].getRollNumber());
                System.out.println("Maths Score : " + studentList[i].getMathsScore());
                System.out.println("Science Score : " + studentList[i].getScienceScore());
                System.out.println("English Score : " + studentList[i].getEnglishScore());
                System.out.println("Language Score : " + studentList[i].getLanguageScore());
                System.out.println("Social Sudies Score : " + studentList[i].getSocialScienceScore());
                System.out.println("Total Score : " + studentList[i].gettotalScore());
                System.out.println("Grade : E ");
                System.out.println();
            }
            else if(studentList[i].gettotalScore()/5 < 50){
                System.out.println("Name : " + studentList[i].getStudentName());
                System.out.println("RollNo : " + studentList[i].getRollNumber());
                System.out.println("Maths Score : " + studentList[i].getMathsScore());
                System.out.println("Science Score : " + studentList[i].getScienceScore());
                System.out.println("English Score : " + studentList[i].getEnglishScore());
                System.out.println("Language Score : " + studentList[i].getLanguageScore());
                System.out.println("Social Sudies Score : " + studentList[i].getSocialScienceScore());
                System.out.println("Total Score : " + studentList[i].gettotalScore());
                System.out.println("Grade : F ");
                System.out.println();
            }
        }
    }

    public static void printGraph(StudentImpl[] studentList){
        int[] height = new int[studentList.length];
        for(int i=0; i<studentList.length; i++){
            if(studentList[i].gettotalScore()/5 >= 90){
                height[i] = 10;
            }
            else if(studentList[i].gettotalScore()/5 >= 80){
                height[i] = 9;
            }
            else if(studentList[i].gettotalScore()/5 >= 70){
                height[i] = 8;
            }
            else if(studentList[i].gettotalScore()/5 >= 60){
                height[i] = 7;
            }
            else if(studentList[i].gettotalScore()/5 >= 50){
                height[i] = 6;
            }
            else if(studentList[i].gettotalScore()/5 >= 40){
                height[i] = 5;
            }
            else if(studentList[i].gettotalScore()/5 >= 30){
                height[i] = 4;
            }
            else if(studentList[i].gettotalScore()/5 >= 20){
                height[i] = 3;
            }
            else if(studentList[i].gettotalScore()/5 >= 10){
                height[i] = 2;
            }
            else {
                height[i] = 1;
            }
        }

        String star = "*";
        String space = " ";
        System.out.println("\n\tGraph");
        System.out.println();
        for(int i=0; i<10; i++){
            System.out.printf("%4d", (10 - i) * 10);
            for(int j=0 ;j<studentList.length; j++){
                if(height[j] == (10-i)){
                    System.out.printf("%4s", star);
                    height[j]--;
                }
                else{
                    System.out.printf("%4s", space);
                }
            }
            System.out.println();
        }
        System.out.printf("%4s", space);
        for(int i=0; i<studentList.length; i++){
           System.out.printf("%4d", i); 
        }
    }
}
