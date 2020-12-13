import java.util.Scanner;
public class DayFinder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the current day of week(For Monday Enter 1, Tuesday, Enter 2 and so on):");
        int currentDay = sc.nextInt();
        System.out.println("Enter the no. of days from today:");
        int numberOfDays = sc.nextInt();
        findDay(currentDay, numberOfDays);
        sc.close();
    } 

    public static void findDay(int currentDay, int numberOfDays){
        int sumOfDays = currentDay + numberOfDays;
        int correctDay;
        
        if(sumOfDays > 0 && sumOfDays % 7 != 0){
            correctDay = sumOfDays % 7;
            chooseDay(correctDay);
        }
        else if(sumOfDays < 0 && sumOfDays % 7 != 0){
            correctDay = sumOfDays % 7;
            chooseDay(7 - (-1*(correctDay)));
        }
        else{
            correctDay = currentDay;
            chooseDay(correctDay);
        }
    }

    public static void chooseDay(int correctDay){
        switch(correctDay){
            case 1: {
                System.out.println("Its a Monday");
                break;
            }
            case 2: {
                System.out.println("Its a Tuesday");
                break;
            }
            case 3: {
                System.out.println("Its a Wednesday");
                break;
            }
            case 4: {
                System.out.println("Its a Thursday");
                break;
            }
            case 5: {
                System.out.println("Its a Friday");
                break;
            }
            case 6: {
                System.out.println("Its a Saturday");
                break;
            }
            case 7: {
                System.out.println("Its a Sunday");
                break;
            }
        }
    }
}