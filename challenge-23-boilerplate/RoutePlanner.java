import java.util.Scanner;
public class RoutePlanner {
    public static void main(String args[]){
        String[] route = new String[4];
        Scanner sc  = new Scanner(System.in);
        for(int i=0;i<route.length;i++){
            route[i] = sc.nextLine();
        }
        System.out.println();
        String[][] routeSplit = routeSplit(route);
        
        System.out.println("SNo.		From		To		Distance in Kms		Travel Time	Typical Airfare");
        for(int i=0; i<routeSplit.length; i++){
            System.out.print(i+1);
            for(int j=0; j<routeSplit[i].length; j++){
                System.out.print("\t\t" +  routeSplit[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("Enter the name of city you need to start your Journey from: ");
        String startCity = sc.next();
        System.out.println();
        showDirectFlights(routeSplit, startCity);
        sc.close();
    }

    public static String[][] routeSplit(String[] route){
        String[][] routeSplit = new String[route.length][5];
        for(int i=0; i<route.length; i++){
            routeSplit[i] = route[i].split(", ");
        }
        return routeSplit;
    }

    public static void showDirectFlights(String[][] routeSplit, String startCity){
        int initial = 0;
        String[][] routeInfo = new String[routeSplit.length][5];
        for(int i=0; i<routeSplit.length; i++){
            if(routeSplit[i][0].equals(startCity)){
                for(int j=0; j<routeSplit[i].length; j++){
                    routeInfo[initial][j] = routeSplit[i][j]; 
                }
                initial++;
            }
        }
        if(initial==0){
            System.out.println("We are sorry. At this point in time we do not have any information on flights in the specified route");
        }
        else{
            System.out.println("SNo.		From		To		Distance in Kms		Travel Time	Typical Airfare");
            for(int i=0; i<initial; i++){
                System.out.print(i+1);
                for(int j=0; j<routeInfo[i].length; j++){
                    System.out.print("\t\t" +  routeInfo[i][j]);
                }
                System.out.println();
            }
        }
    }
}
