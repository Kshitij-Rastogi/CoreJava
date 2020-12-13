import java.util.Scanner;
public class TravelSavers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount invested by the company :");
        float amountInvested = sc.nextFloat();
        System.out.println("Enter the share price of the company :");
        float sharePrice = sc.nextFloat();
        calcOutput(amountInvested, sharePrice);
        sc.close();
    }

    public static void calcOutput(float amountInvested, float sharePrice){
        /***  
         ********** To calculate the exchange rate we have to multiply the invested amount 
         ********** of the exchange rate for 1 USD to INR
        ***/
        float exchangeRate = amountInvested * 74.3f;

        /***
         ********* To calculate the stock price we have to check the profit percent
         ********* that we get from the difference of the previous and the current exchange rates.
         ********* And then add it to the previous stock price so that there will be no loss.
        ***/
        float stockPrice = (float) ((((74.3-40)/40)*100) + sharePrice) ;

        /***  
         ********** To calculate the 10% tax we just have to get the 10% of the exchange rate. 
        ***/
        float taxPaid = (float)(exchangeRate * 0.1);

        /***
         ********** To calculate the profit in INR we just have to subtract the taxPaid amount from the total  
         ********** exchangeRate. 
        ***/
        float profitINR = exchangeRate - taxPaid;

        /***
         ********** To calculate the profit in USD we have to convert profirINR to USD.
        ***/
        float profitUSD = (float)(profitINR/74.3);

        printOutput(exchangeRate, stockPrice, taxPaid, profitINR, profitUSD);
    }

    public static void printOutput(float exchangeRate, float stockPrice, float taxPaid, float profitINR, float profitUSD) {
        System.out.printf("Investment amount after increase in exchange rate : %.2f%n", exchangeRate);
        System.out.printf("The new price of the stock : %.2f%n", stockPrice);
        System.out.printf("The tax to be paid on the total shares at 10 : %.2f%n", taxPaid);
        System.out.printf("The total profit in INR : %.2f%n", profitINR);
        System.out.printf("The total profit converted to dollars : " + (int)profitUSD);
    }

}