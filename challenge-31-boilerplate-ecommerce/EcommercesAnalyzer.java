import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EcommercesAnalyzer {

    public Ecommerces[] readFile(String fileName)
    {
        try {
            int count=0;
            BufferedReader bf = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line=bf.readLine())!=null){
                count=count+1;
            }
            String[] temp=new String[7];
            Ecommerces[] ecommerces=new Ecommerces[count];
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String data;
            br.readLine();
            int j=0;//incrementor
            while ((data=br.readLine())!=null) 
            {
                temp= data.split(",");
                Ecommerces s=new Ecommerces();
                try{
                    s.setDate(temp[0]);
                    s.setCustomer_id(Long.valueOf(temp[1]));
                    s.setProduct_category(Integer.valueOf(temp[2]));
                    s.setPayment_method(temp[3]);
                    s.setValue(Float.valueOf(temp[4]));
                    s.setTimeonsite(Float.valueOf(temp[5]));
                    s.setClicks_in_site(Integer.valueOf(temp[6]));
                    ecommerces[j]=s;
                    j++;
                }
                catch(NumberFormatException n)
                {
                    n.printStackTrace();
                }
            }
        return ecommerces;
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    public int[] uniqueNumberProductCatogory(Ecommerces[] ecommerces)
    {
        int[] uniqueNumbers=new int[ecommerces.length];
        String[] temporaryArray= new String[ecommerces.length];
        for(int i=0;i<ecommerces.length-1;i++)
        {
            for(int j=0;j<ecommerces.length-1;j++)
            {
                if(ecommerces[i].getProduct_category()==ecommerces[j].getProduct_category())
                {
                    uniqueNumbers[j]=ecommerces[i].getProduct_category();
                }
                if(ecommerces[i].getDate().equals(ecommerces[j].getDate()))
                {
                    temporaryArray[j]=ecommerces[i].getDate();
                }
            }
        }
        System.out.println("The unique value are :");
        EcommercesAnalyzer ea=new EcommercesAnalyzer();
        for(int k=0;k<uniqueNumbers.length-1;k++)
        {
            boolean value=false;
            for(int r=0;r<k;r++)
            {
                if(uniqueNumbers[k]==uniqueNumbers[r]){
                value=true;
                break;
                }
            }
            if(!value)
            {
                System.out.println(uniqueNumbers[k]);
            }
        }
        return uniqueNumbers;
    }
    public void highestAndLowestValues(Ecommerces[] ecommerces)
    {
       int highestValue=ecommerces[0].getProduct_category();
        int lowestValue=ecommerces[0].getProduct_category();
        System.out.println("Enter the date for finding highest and lowest product catogory:");
        Scanner sc=new Scanner(System.in);
        String givenDate=sc.next();
        for(int i=0;i<ecommerces.length;i++)
        {
            try{
                if(ecommerces[i].getDate()!=null){
                    if(givenDate.equals(ecommerces[i].getDate()))
                    {
                        if(ecommerces[i].getProduct_category()>highestValue)
                        {
                            highestValue=ecommerces[i].getProduct_category();
                        }
                        if(ecommerces[i].getProduct_category()<lowestValue)
                        {
                            lowestValue=ecommerces[i].getProduct_category();
                        }
                    }
                }
            }
            catch(NullPointerException n){
                continue;
            }
        }
        System.out.println("for"+givenDate+"highest value is"+highestValue);
        System.out.println("for"+givenDate+"lowest value is"+lowestValue);
        System.out.println("Do you want to continue(y/n)");
        char responce=sc.next().charAt(0);
        if(responce=='y')
        {
            highestAndLowestValues(ecommerces);
        }

    }
    public void findingPreferedPayment(Ecommerces[] ecommerces)
    {
        int counterOne=0;
        int counterTwo=0;
        for(int i=0;i<ecommerces.length;i++)
        {
            try{
                if(ecommerces[i].getDate()!=null){
                    if(ecommerces[i].getPayment_method().equals("credit"))
                    {
                        counterOne=counterOne+1;
                    }
                    if(ecommerces[i].getPayment_method().equals("paypal"))
                    {
                        counterTwo=counterTwo+1;
                    }
                }
            }
            catch(NullPointerException n){
                continue;
            }
        }
        if(counterOne>counterTwo)
        {
            System.out.println("Prefered mode of payment is Credit");
        }
        else{
            System.out.println("Prefered mode of payment is Paypal");
        }
    }
    public void findingGeneratingMoreSales(Ecommerces[] ecommerces)
    {
        double totalSalesIn15Minutes=0;
        double totalSalesInLess15Minutes=0;
        for(int i=0;i<ecommerces.length;i++)
        {
            try{
                if(ecommerces[i].getDate()!=null){
                   if(ecommerces[i].getTimeonsite()>=15)
                   {
                    totalSalesIn15Minutes= totalSalesIn15Minutes + ecommerces[i].getValue();                   }
                   else{
                    totalSalesInLess15Minutes=totalSalesInLess15Minutes+ecommerces[i].getValue();
                   }
                }
            }
            catch(NullPointerException n){
                continue;
            }
        }
        if(totalSalesIn15Minutes>totalSalesInLess15Minutes)        {
            System.out.println("Spending more then 15minutes genetes more sales");
        }
        else{
            System.out.println("Spending less then 15minutes genetes less sales");
        }
    }
    public void findingMaximumSoldProduct(Ecommerces[] ecommerces,int[] uniquenumber)
    {
        int maximumSoldproduct=0;
        int number=0;
        int count=0;
        int productCatogory=0;
        int maxproduct=0;
        for(int i=0;i<ecommerces.length;i++)
        {
            try{
                if(uniquenumber[i]!=0){
                    number=uniquenumber[i];
                }
                if(number==ecommerces[i].getProduct_category()){
                    count=count+1;
                    productCatogory=ecommerces[i].getProduct_category();
                } 
            }
            catch(NullPointerException n){
                continue;
            }
            if(count>maximumSoldproduct)
            {
                maximumSoldproduct=count;
                maxproduct=productCatogory;
            }
        }
        System.out.println("category of the product which was sold the maximum no. of times is "+maxproduct);
    }
    public void findingMaximumAmountByProductCatogory(Ecommerces[] ecommerces,int[] uniquenumber)
    {
        float maximumSoldproduct=0;
        int number=0;
        float count=0;
        int productCatogory=0;
        int maxproduct=0;
        for(int i=0;i<ecommerces.length;i++)
        {
            try{
                if(uniquenumber[i]!=0){
                    number=uniquenumber[i];// assigning 501,502,....
                }
                if(number==ecommerces[i].getProduct_category()){
                    count=count+ecommerces[i].getValue();
                    productCatogory=ecommerces[i].getProduct_category();
                }

            }
            catch(NullPointerException n){
                continue;
            }
            if(count>maximumSoldproduct)
            {
                maximumSoldproduct=count;
                maxproduct=productCatogory;
            }
        }
        System.out.println("product_category which has generated the maximum amount of total sales is "+maxproduct);
    }
    public void averageNumberOfClicks(Ecommerces[] ecommerces)
    {
        int averageNumberOfClicks=0;
        int count=0;
        for(int i=0;i<ecommerces.length;i++)
        {
            try{
                if(ecommerces[i].getClicks_in_site()!=0)
                {
                    averageNumberOfClicks=averageNumberOfClicks+ecommerces[i].getClicks_in_site();
                }
                else{
                    count=count+1;
                }
            }
            catch(NullPointerException n){
                continue;
            }
        }
        int clicks=ecommerces.length-count;
        System.out.println("The average number of clicks is "+(averageNumberOfClicks-clicks)/ecommerces.length);
    }
}
    
