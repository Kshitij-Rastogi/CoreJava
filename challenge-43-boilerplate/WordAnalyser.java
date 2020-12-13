import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.TreeMap;

public class WordAnalyser {
    public HashMap<String, Integer> read(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        HashMap<String, Integer> list = new HashMap<>();
        while ((line = br.readLine()) != null) {
            Word w = new Word();
            String[] temp = line.split(" ");
            for (int i = 0; i < temp.length; i++) {
                temp[i] = temp[i].replaceAll("[()?:!.,;{}]+", "");
            }
            for (String s : temp) {
                if (s != null && s != "") {
                    w.setWord(s);
                    w.setNumberOfOccurance(1);
                    
                    if(list.containsKey(w.getWord())){
                        list.computeIfPresent(w.getWord(), (k, v) -> v + 1);
                    }
                    else{
                        list.put(w.getWord(), w.getNumberOfOccurance());
                    }
                }
            }
        }
        br.close();
        return list;
    }

    public HashMap<String, Integer> display(HashMap<String, Integer> list) {
        System.out.println(list);
        System.out.println();
        System.out.println("After Sort By Key");
        TreeMap<String, Integer> sorted = new TreeMap<>();
        sorted.putAll(list);
        System.out.println(sorted);

        System.out.println();
        return list;
    }
}
