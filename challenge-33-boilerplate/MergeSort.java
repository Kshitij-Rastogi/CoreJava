public class MergeSort {
    public void sort(OptimizeSortingAlgo[] productList){
        mergeSort(productList, 0, productList.length-1);
        System.out.println("The Time Complexity of Merge sort in this case is : " + System.currentTimeMillis());
    }

    private void mergeSort(OptimizeSortingAlgo[] productList, int l, int r) {
        int mid = (l+r)/2;
        
        //Dividing the array of Products into single unit
        mergeSort(productList, l, mid);
        mergeSort(productList, mid+1, r);

        //Merging and sorting the results
        merge(productList, l, mid, r);
    }

    private void merge(OptimizeSortingAlgo[] productList, int l, int mid, int r) {
        //Length of Left and Right Sides
        int n1 = mid-l+1;
        int n2 = r-mid;

        //Initializing left and right temp arrays
        OptimizeSortingAlgo[] L = new OptimizeSortingAlgo[n1];
        OptimizeSortingAlgo[] R = new OptimizeSortingAlgo[n2];

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
            if(Integer.parseInt(L[i].getRetailPrice()) <= Integer.parseInt(R[j].getRetailPrice())){
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
            productList[k] = R[j];
            j++;
        }
    }

}
