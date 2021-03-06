import java.io.IOException;

public class OptimizeSortingAlgo {
    private String pID;
    private String productName;
    private String brand;
    private String productURL;
    private String retailPrice;
    private String discountedPrice;
    private Float productRating;

    public String getpID() {
        return pID;
    }

    public void setpID(String pID) {
        this.pID = pID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProductURL() {
        return productURL;
    }

    public void setProductURL(String productURL) {
        this.productURL = productURL;
    }

    public String getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(String retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(String discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public Float getProductRating() {
        return productRating;
    }

    public void setProductRating(Float productRating) {
        this.productRating = productRating;
    }

    public static void main(String[] args) throws IOException {
        FileOperations fo = new FileOperations();
        QuickSort q = new QuickSort();
        BubbleSort b = new BubbleSort();
        MergeSort m = new MergeSort();
        String fileName = "data/flipkart_product_sample.csv";
        int rows = fo.countRows(fileName);
        OptimizeSortingAlgo[] productList = fo.puttingFileInObject(rows, fileName);
        q.sortByPrice(productList);
        b.sort(productList);
        //m.sort(productList);  ----> StackOverflow
    }
    
}
