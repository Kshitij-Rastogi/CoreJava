import java.util.Scanner;
public class PrintingMonthlyCalendar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month(Press 1 for Jan, 2 for Feb, 12 for Dec......):");
        int choiceOfMonth = sc.nextInt();
        System.out.println("Enter Year:");
        int choiceOfYear = sc.nextInt();
        boolean leapYear = true;
        if(choiceOfYear % 4 == 0){
            if( choiceOfYear % 100 == 0){
                // year is divisible by 400, hence the year is a leap year
                if ( choiceOfYear % 400 == 0){
                    leapYear = true;
                }
                else{
                    leapYear = false;
                }
            }
            else{
                leapYear = true;
            }
        }
        else{
            leapYear = false;
        }
        
            
        System.out.println("Enter Day of week(Press 1 for Mon, 2 for Tue, 7 for Sun......):");
        int firstDay = sc.nextInt();
        if(firstDay == 7){
            firstDay = 0;
        }
        int days = numberOfDays(choiceOfMonth, leapYear);
        System.out.println(days);
        printCalender(firstDay, days);
        sc.close();
    }

    public static int numberOfDays(int choiceOfMonth, boolean leapYear){
        if(leapYear){
            int[] daysOfMonth = {31, 29, 31, 30, 31, 30 ,31, 31, 30, 31, 30, 31};
            return(daysOfMonth[choiceOfMonth-1]);
        }
        else{
            int[] daysOfMonth = {31, 28, 31, 30, 31, 30 ,31, 31, 30, 31, 30, 31}; 
            return(daysOfMonth[choiceOfMonth-1]); 
        }
    }

    public static void printCalender(int firstDay, int days){
        int count = 1, initialDay = 6;
        System.out.printf("%16s %n", "Calender");
        System.out.println();
        System.out.printf("%2s %3s %3s %3s %3s %3s %3s", "S", "M", "T",
        "W", "Th", "F", "S");
        System.out.println();
        if(count == 1){
            if(firstDay != 0)
            {
                for(int j=0; j<firstDay; j++){
                    System.out.printf("%4s", " ");
                    initialDay--;
                }
            }
            System.out.print( " " + count );
            count++;
        while(initialDay>0){
            System.out.printf("%4s", count);
            count++;
            initialDay--;
        }
        System.out.println();
        printPattern(count, days);
    }
    }

    public static void printPattern(int count, int days){
        for(int j=0; j<7; j++){
            for(int i=0; i<7; i++){
                if(i==0){
                    if(count/10 ==0){
                        System.out.print(" ");
                    }
                    System.out.printf("%s", count);
                    count++;
                }
                else{
                    System.out.printf("%4s", count);
                    count++;
                }
                if(count > days){
                    break;
                }
            }
            if(count>days){
                break;
            }
            System.out.println();
        }
    }
}
