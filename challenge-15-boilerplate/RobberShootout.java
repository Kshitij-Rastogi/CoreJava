import java.util.Scanner;

public class RobberShootout{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter No. of Robbers:");
        int numberOfRobbers = sc.nextInt();
        System.out.println("Enter The Robber with whom Sam will start shooting:");
        int startShoot = sc.nextInt();
        System.out.println("Enter the gap between the robbers:");
        int gap = sc.nextInt();
        target(numberOfRobbers, startShoot, gap);
        sc.close();
    }

    public static void target(int numberOfRobbers, int startShoot, int gap){
        int bullets = 1;
        int noOfRobbers = numberOfRobbers;
        int gapCount = gap;
        int initial = startShoot-1; 
        int[] arrayOfTarget = new int[numberOfRobbers];

        while(noOfRobbers>0){
            
            if(arrayOfTarget[initial] == 0){
                if(gapCount == gap){
                    arrayOfTarget[initial] = 1;
                    System.out.println("Target = " + (initial+1) + ", " + bullets + " shots completed");
                    gapCount = -1;
                    bullets++;
                    noOfRobbers--;
                }
                gapCount++;
            }
            initial++;

            if(initial>=numberOfRobbers){
                initial = 0;
            }
            
        }
    }
}