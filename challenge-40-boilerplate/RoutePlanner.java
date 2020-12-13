import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RoutePlanner {
    private String sourceCity;
    private String destinationCity;
    private int distance;
    private String flightTime;
    private String cost;

    public String getSourceCity() {
        return sourceCity;
    }

    public void setSourceCity(String sourceCity) {
        this.sourceCity = sourceCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(String flightTime) {
        this.flightTime = flightTime;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    

    public static void main(String[] args) throws IOException {
        String fileName = "sample-inputs.txt";
        ReadFromFile read = new ReadFromFile();
        ArrayList<RoutePlanner> routeDetails = read.readFile(fileName);
        read.display(routeDetails);

        //Task 2
        Scanner sc = new Scanner(System.in);
        // System.out.println("Do you want to add a route information: Y/N");
        // char input = sc.next().charAt(0);
        // if(input == 'Y' || input == 'y'){
        //     read.addRoute(routeDetails, sc);
        // }
        // read.display(routeDetails);

        //Task 3
        Collections.sort(routeDetails, new DestintionComparator()); //to compare
        read.display(routeDetails);

        //Task 4
        System.out.println("Do you want to find route: Y/N");
        char input1 = sc.next().charAt(0);
        if(input1 == 'Y' || input1 == 'y'){
            read.findRoute(routeDetails, sc);
        }
    }

    @Override
    public String toString() {
        return "RoutePlanner [cost=" + cost + ", destinationCity=" + destinationCity + ", distance=" + distance
                + ", flightTime=" + flightTime + ", sourceCity=" + sourceCity + "]" + "\n";
    }

    
}