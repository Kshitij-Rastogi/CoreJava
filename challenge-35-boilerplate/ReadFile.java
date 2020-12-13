import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public SinglyLinkedList readFile(String fileName) throws IOException {
        BufferedReader b = new BufferedReader(new FileReader(fileName));
        String line;
        //Start with empty list
        SinglyLinkedList list = new SinglyLinkedList();

        while((line=b.readLine()) != null){
            String tempArr[] = line.split(" ");
            for(int i=0; i<tempArr.length; i++){
                tempArr[i] = tempArr[i].replaceAll("[()?:!.,;{}]+", "");
            }
            for(int i=0; i<tempArr.length; i++){
                //Insertion
                //Insert Values
                list = list.insert(list, tempArr[i]);
            }
        }
        b.close();
        return list;
    }
}
