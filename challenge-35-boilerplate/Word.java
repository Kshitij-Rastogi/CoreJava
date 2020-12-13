import java.io.IOException;

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
    
    public static void main(String[] args) throws IOException{
        try {

            String fileName = "data/daffodils.txt";
            ReadFile read = new ReadFile();
            SinglyLinkedList list = read.readFile(fileName);
            SinglyLinkedList sl = new SinglyLinkedList();
            sl.sortWord(list);
            int countRows = sl.printList(list);
            Word[] wordList = sl.Occurance(list, countRows);
            sl.showWordList(wordList);
            sl.reverseWordList(wordList);
            sl.showFrequentWords(wordList);
                 
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Exception Alert");
        }
    }
    
}