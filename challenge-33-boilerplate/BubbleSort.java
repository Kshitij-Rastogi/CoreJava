public class BubbleSort {
    public void sort(OptimizeSortingAlgo[] productList){
        int n = productList.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(Integer.parseInt(productList[j].getRetailPrice()) > Integer.parseInt(productList[j+1].getRetailPrice())){
                    OptimizeSortingAlgo temp = productList[j];
                    productList[j] = productList[j+1];
                    productList[j+1] = temp; 
                } 
            }
        }
        System.out.println("The Time Complexity of Bubble sort in this case is : " + System.currentTimeMillis());
    }
}
