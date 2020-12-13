import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class SortingByRating {
    public void sortByRating(SortingProductList[] productList) throws IOException {
        bubbleSort(productList);
        displaySortedPriceList(productList);

    }

    private void bubbleSort(SortingProductList[] productList) {
        int n = productList.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(productList[j].getProductRating() > productList[j+1].getProductRating()){
                    SortingProductList temp = productList[j];
                    productList[j] = productList[j+1];
                    productList[j+1] = temp;
                }
            }
        }
    }
/*
    private void mergeSort(SortingProductList[] productList, int l, int r) {
        int mid = (l+r)/2;
        
        //Dividing the array of Products into single unit
        mergeSort(productList, l, mid);
        mergeSort(productList, mid+1, r);

        //Merging and sorting the results
        merge(productList, l, mid, r);
    }

    private void merge(SortingProductList[] productList, int l, int mid, int r) {
        //Length of Left and Right Sides
        int n1 = mid-l+1;
        int n2 = r-mid;

        //Initializing left and right temp arrays
        SortingProductList[] L = new SortingProductList[n1];
        SortingProductList[] R = new SortingProductList[n2];

        //copying elements in L and R arrays
        for(int i=0; i<n1; i++){
            L[i] = productList[l+i];
        }
        for(int j=0; j<n2; j++){
            R[j] = productList[mid+1+j];
        }

        //Merging and Sorting the elements
        int i=0, j=0;
        int k=l;

        while(i<n1 && j<n2){
            if(L[i].getProductRating() <= R[j].getProductRating()){
                productList[k] = L[i];
                i++;
            }
            else{
                productList[k] = R[j];
                j++;
            }
            k++;
        }

        //filling the left out values
        while(i<n1){
            productList[k] = L[i];
            i++;
        }
        while(j<n2){
            productList[k] = L[j];
            j++;
        }
    }
*/

    public void displaySortedPriceList(SortingProductList[] productList) throws IOException {
        BufferedWriter bw1 = new BufferedWriter(new FileWriter("SortedByRating.csv"));

        for(int i=0; i<productList.length; i++){
            bw1.write(productList[i].getpID());
            bw1.write(",");
            bw1.write(productList[i].getProductName());
            bw1.write(",");
            bw1.write(Float.toString(productList[i].getProductRating()));
            bw1.write("\n");
        }
        bw1.close();
	}
}
