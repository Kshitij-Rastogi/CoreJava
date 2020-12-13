import java.io.IOException;
import java.util.HashMap;

public class Word {
    String word;
    int numberOfOccurance;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getNumberOfOccurance() {
        return numberOfOccurance;
    }

    public void setNumberOfOccurance(int numberOfOccurance) {
        this.numberOfOccurance = numberOfOccurance;
    }

    public static void main(String[] args) throws IOException {
        String fileName = "data/daffodils.txt";
        WordAnalyser w = new WordAnalyser();
        HashMap<String, Integer> wordList = w.read(fileName);
        // wordList = 
        w.display(wordList);
    }

    @Override
    public String toString() {
        return "Word [numberOfOccurance=" + numberOfOccurance + ", word=" + word + "]";
    }

    
}