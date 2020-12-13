import java.util.Scanner;
public class CurrencyConverter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the source currency:");
        String sourceCurrency = sc.next();
        System.out.println("Enter the amount :");
        float amount = sc.nextFloat();
        switch(sourceCurrency){
            case "USD":{
                float temp = amount * 74.3f;
                formatCurrency(temp, amount, sourceCurrency);
                break;
            }
            case "GBP":{
                float temp = amount * 94.5f;
                formatCurrency(temp, amount, sourceCurrency);
                break;
            }
            case "JPY":{
                float temp = amount * 0.67f;
                formatCurrency(temp, amount, sourceCurrency);
                break;
            }
            case "EUR":{
                float temp = amount * 85.37f;
                formatCurrency(temp, amount, sourceCurrency);
                break;
            }
            case "AED":{
                float temp = amount * 20.25f;
                formatCurrency(temp, amount, sourceCurrency);
                break;
            }
            default:{
                System.out.println("Invalid Source Currency");
            }
        }
        sc.close();
    } 

    public static void formatCurrency(float temp, float amount, String sourceCurrency){
        String amountFormat = String.format("%.2f", amount);
        String convertCurrency = String.format("%.2f", temp);
        System.out.println("The Exchange rate for " + amountFormat + " " + sourceCurrency + " is : " + convertCurrency + " INR");               
    }
}