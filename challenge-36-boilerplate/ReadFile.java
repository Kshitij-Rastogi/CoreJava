import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public DoublyLinkedList readFile(String fileName) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            DoublyLinkedList list = new DoublyLinkedList();
            String line;
            while((line=br.readLine()) != null){
                MusicImage mi = new MusicImage();
                String[] temp = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                for(int i=0; i<temp.length; i++){
                    temp[i] = temp[i].replaceAll("\\s", "");
                }
                mi.setReleasedAs(temp[0]);
                mi.setArtist(temp[1]);
                mi.setSongName(temp[2]);
                mi.setGenre(temp[3]);
                mi.setYearOfRelease(temp[4]);
                mi.setNumberOfSongs(temp[5]);
                mi.setDuration(temp[6]);
                list.insert(mi);
            }
            return list;
        }
    }
}
