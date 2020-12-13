import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFromFile {
    public ArrayList readFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        ArrayList<RoutePlanner> routeDetails = new ArrayList<>();
        while((line=br.readLine()) != null){
            RoutePlanner routeList = new RoutePlanner();
            String temp[] = line.split(", (?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
            routeList.setSourceCity(temp[0]);
            routeList.setDestinationCity(temp[1]);
            routeList.setDistance(Integer.parseInt(temp[2]));
            routeList.setFlightTime(temp[3]);
            routeList.setCost(temp[4]);
            routeDetails.add(routeList);
        }
        return routeDetails;       
    }

    public void display(ArrayList<RoutePlanner> routeDetails){
        System.out.println(routeDetails);
        // for (RoutePlanner route : routeDetails) {
        //     if(route.getSourceCity().equals("New York")){
        //         System.out.println(route);
        //     }
        // }
    }

    public void addRoute(ArrayList<RoutePlanner> routeDetails, Scanner sc){
        RoutePlanner r = new RoutePlanner();
        System.out.println("Enter source city: ");
        r.setSourceCity(sc.next());
        System.out.println("Enter destination city: ");
        r.setDestinationCity(sc.next());
        System.out.println("Enter diatance: ");
        r.setDistance(sc.nextInt());
        System.out.println("Enter Flight Time: ");
        r.setFlightTime(sc.next());
        System.out.println("Enter Cost along with currency code(eg USD100, INR9000): ");
        r.setCost(sc.next());
        routeDetails.add(r);
    }

    public void findRoute(ArrayList<RoutePlanner> routeDetails, Scanner sc){
        System.out.println("Enter Source City");
        String source = sc.next();
        //sc.nextLine();
        System.out.println("Enter Destination City");
        String destination = sc.next();
        boolean foundPath = true;
        ArrayList<RoutePlanner> tempRoute = new ArrayList<>();
        for(RoutePlanner route: routeDetails){
            if(route.getDestinationCity().equals(destination) && route.getSourceCity().equals(source)){
                System.out.println(route);
                foundPath = true;
            }

            if(route.getSourceCity().equals(source)){
                tempRoute.add(route);
            }
        }
        for(RoutePlanner route: tempRoute){
            if(route.getDestinationCity().equals(destination)){
                System.out.println(route);
                foundPath = true;
            }
        }

        if(!foundPath){
            System.out.println("Sorry there are no active flights between " + source + " and " + destination);
        }
    }

}
