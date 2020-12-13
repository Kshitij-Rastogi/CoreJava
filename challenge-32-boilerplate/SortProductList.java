import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SortProductList {
    public void sortByPrice(SortingProductList[] priceArray) throws IOException {
        int low = 0;
        int high = priceArray.length;
        SortProductList s = new SortProductList();
        s.quickSort(priceArray, low, high - 1);
        displaySortedPriceList(priceArray);
    }

    private void quickSort(SortingProductList[] priceArray, int low, int high) {
        if (low < high) {
            int pivot = partiton(priceArray, low, high);

            quickSort(priceArray, low, pivot - 1);
            quickSort(priceArray, pivot + 1, high);
        }
    }

    private int partiton(SortingProductList[] priceArray, int low, int high) {
        int pivot = Integer.parseInt(priceArray[high].getRetailPrice());
        int startIndex = low - 1;
        for (int i = low; i < high; i++) {
            if (Integer.parseInt(priceArray[i].getRetailPrice()) <= pivot) {
                startIndex++;

                SortingProductList temp = priceArray[startIndex];
                priceArray[startIndex] = priceArray[i];
                priceArray[i] = temp;
            }
        }

        SortingProductList temp = priceArray[startIndex + 1];
        priceArray[startIndex + 1] = priceArray[high];
        priceArray[high] = temp;

        return startIndex + 1;
    }

    public void displaySortedPriceList(SortingProductList[] sortedPriceArray) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("SortedByPrice.csv"));

        for(int i=0; i<sortedPriceArray.length; i++){
            bw.write(sortedPriceArray[i].getpID());
            bw.write(",");
            bw.write(sortedPriceArray[i].getProductName());
            bw.write(",");
            bw.write(sortedPriceArray[i].getRetailPrice());
            bw.write("\n");
        }
        bw.close();
	}
}
