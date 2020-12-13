import java.util.Comparator;

public class FrequencyComparator implements Comparator<Word>{

    @Override
    public int compare(Word o1, Word o2) {
        // TODO Auto-generated method stub
        return (Integer.compare(o1.getNumberOfOccurance(), o2.getNumberOfOccurance()));
    }

}
