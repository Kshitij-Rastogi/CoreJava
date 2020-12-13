import java.util.Comparator;

public class DestintionComparator implements Comparator<RoutePlanner>{

    @Override
    public int compare(RoutePlanner o1, RoutePlanner o2) {
        // TODO Auto-generated method stub
        return (o1.getDestinationCity().compareTo(o2.getDestinationCity()));
    }
    
}
