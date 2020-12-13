public class Ecommerces{
    private String date;
    private long customer_id;
    private int product_category;
    private String payment_method;
    private float value;
    private float timeonsite;
    private int clicks_in_site;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(long customer_id) {
        this.customer_id = customer_id;
    }

    public int getProduct_category() {
        return product_category;
    }

    public void setProduct_category(int product_category) {
        this.product_category = product_category;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public float getTimeonsite() {
        return timeonsite;
    }

    public void setTimeonsite(float timeonsite) {
        this.timeonsite = timeonsite;
    }

    public int getClicks_in_site() {
        return clicks_in_site;
    }

    public void setClicks_in_site(int clicks_in_site) {
        this.clicks_in_site = clicks_in_site;
    }
    public static void main(String[] args) {
        EcommercesAnalyzer ea=new EcommercesAnalyzer();
        Ecommerces[] ecommerces=ea.readFile("data/purchase_details.csv");
        int[] uniquenumber=ea.uniqueNumberProductCatogory(ecommerces);
        ea.highestAndLowestValues(ecommerces);
        ea.findingPreferedPayment(ecommerces);
        ea.findingGeneratingMoreSales(ecommerces);
        ea.findingMaximumSoldProduct(ecommerces,uniquenumber);
        ea.findingMaximumAmountByProductCatogory(ecommerces,uniquenumber);
        ea.averageNumberOfClicks(ecommerces);
    }
}