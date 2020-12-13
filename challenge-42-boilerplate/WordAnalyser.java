import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public class WordAnalyser {
    public LinkedList<Word> read(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        LinkedList<Word> list = new LinkedList<>();
        while((line=br.readLine()) != null){
            Word w = new Word();
            String[] temp = line.split(" ");
            for(int i=0; i<temp.length; i++){
                temp[i] = temp[i].replaceAll("[()?:!.,;{}]+", "");
            }
            for(String s: temp){
                if(s!=null){
                    w.setWord(s);
                    w.setNumberOfOccurance(0);
                    list.add(w);
                }
            }
        }
        return list;
    }

    public LinkedList<Word> display(LinkedList<Word> list){
        for(Word w: list){
            System.out.println(w);
        }
        System.out.println();

        Collections.sort(list, new WordComparator());
        System.out.println("After Sort");
        for(Word w: list){
            System.out.println(w);
        }
        return list;
    }

    public void removeDuplicates(LinkedList<Word> list){
        LinkedList<Word> uniqueList = new LinkedList<>();
        for(int i=0; i<list.size(); i++){
            Word w = new Word();
            int count = 1;
            for(int j=i; j<list.size()-1; j++){
                if(list.get(j).getWord().equals(list.get(j+1).getWord())){
                    count++;
                }
                else{
                    w.setWord(list.get(i).getWord());
                    w.setNumberOfOccurance(count);
                    uniqueList.add(w);
                    i = j;
                    break;
                }
            }
        }

        System.out.println();
        System.out.println("This is unique list");
        for(Word w: uniqueList){
            System.out.println(w);
        }

        Collections.sort(uniqueList, new FrequencyComparator());
        System.out.println();
        System.out.println("Sorted By Frequency");
        for(Word w: uniqueList){
            System.out.println(w);
        }

        Collections.reverse(uniqueList);
        System.out.println();
        System.out.println("Reverse Sorted by Frequeny");
        for(Word w: uniqueList){
            System.out.println(w);
        }

    }
}
