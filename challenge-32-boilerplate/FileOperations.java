import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileOperations {
    public int countRows(String fileName) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            int rows=0;
            while (br.readLine() != null) {
                rows++;
            }
            br.close();
            return rows;
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return 0;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return 0;
        }
        
    }

    public SortingProductList[] puttingFileInObject(int rows, String fileName) throws IOException {
        SortingProductList[] productList = new SortingProductList[rows-1];
        BufferedReader b = new BufferedReader(new FileReader(fileName));
        String line;
        int pointer=0;
        b.readLine();
        while((line = b.readLine()) != null){
            SortingProductList s = new SortingProductList();
            String[] tempArr = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
            s.setpID(tempArr[0]);
            s.setProductName(tempArr[1]);
            s.setBrand(tempArr[2]);
            s.setProductURL(tempArr[3]);
            s.setRetailPrice(tempArr[4]);
            s.setDiscountedPrice(tempArr[5]);
            if(tempArr[6].equals("No rating available")){
                s.setProductRating(0.0f);
            }
            else{
                s.setProductRating(Float.parseFloat(tempArr[6]));
            }

            productList[pointer] = s;
            pointer++;
        }
        b.close();
        return productList;
    }
}
