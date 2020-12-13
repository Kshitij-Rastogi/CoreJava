import java.io.IOException;

public class QuickSort {

    public void sortByPrice(OptimizeSortingAlgo[] priceArray) throws IOException {
        int low = 0;
        int high = priceArray.length;
        quickSort(priceArray, low, high - 1);
        System.out.println("The Time Complexity of Quick sort in this case is : " + System.currentTimeMillis());
    }

    private void quickSort(OptimizeSortingAlgo[] priceArray, int low, int high) {
        if (low < high) {
            int pivot = partiton(priceArray, low, high);

            quickSort(priceArray, low, pivot - 1);
            quickSort(priceArray, pivot + 1, high);
        }
    }

    private int partiton(OptimizeSortingAlgo[] priceArray, int low, int high) {
        int pivot = Integer.parseInt(priceArray[high].getRetailPrice());
        int startIndex = low - 1;
        for (int i = low; i < high; i++) {
            if (Integer.parseInt(priceArray[i].getRetailPrice()) <= pivot) {
                startIndex++;

                OptimizeSortingAlgo temp = priceArray[startIndex];
                priceArray[startIndex] = priceArray[i];
                priceArray[i] = temp;
            }
        }

        OptimizeSortingAlgo temp = priceArray[startIndex + 1];
        priceArray[startIndex + 1] = priceArray[high];
        priceArray[high] = temp;

        return startIndex + 1;
    }
}
