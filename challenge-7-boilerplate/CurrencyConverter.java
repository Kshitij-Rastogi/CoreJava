import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the source currency:");
        String sourceCurrency = sc.next();
        System.out.println("Enter the sequence of amount:");
        String amountSequence = sc.next();
        String amount[] = amountSequence.split(",");
        System.out.println("Enter the convert currency");
        String convertCurrency = sc.next(); 
        System.out.println("|Denominations(" + sourceCurrency + ") | " + convertCurrency + " | ");
        System.out.println("|------------------|--------|");
        for(int i=0; i<amount.length; i++){
            convertSourceCurrency(sourceCurrency, amount[i], convertCurrency);  
        }    
        sc.close();
    } 

    public static void convertSourceCurrency(String sourceCurrency, String amount, String convertCurrency){
        switch(sourceCurrency){
            case "USD":{
                float temp = Float.parseFloat(amount) * 74.3f;
                convert(temp, amount, convertCurrency);
                break;
            }
            case "GBP":{
                float temp = Float.parseFloat(amount) * 94.5f;
                convert(temp, amount, convertCurrency);
                break;
            }
            case "JPY":{
                float temp = Float.parseFloat(amount) * 0.67f;
                convert(temp, amount, convertCurrency);
                break;
            }
            case "EUR":{
                float temp = Float.parseFloat(amount) * 85.37f;
                convert(temp, amount, convertCurrency);
                break;
            }
            case "AED":{
                float temp = Float.parseFloat(amount) * 20.25f;
                convert(temp, amount, convertCurrency);
                break;
            }
            case "INR":{
                float temp = Float.parseFloat(amount);
                convert(temp, amount, convertCurrency);
                break;
            }
            default:{
                System.out.println("Invalid Source Currency");
            }
        }
    }

    public static void convert(float temp, String amount, String convertCurrency){
        switch(convertCurrency){
            case "USD":{
                float convertTemp = Float.parseFloat(amount) / 74.3f;
                print(amount, convertTemp);
                break;
            }
            case "GBP":{
                float convertTemp = Float.parseFloat(amount) / 94.5f;
                print(amount, convertTemp);
                break;
            }
            case "JPY":{
                float convertTemp = Float.parseFloat(amount) / 0.67f;
                print(amount, convertTemp);
                break;
            }
            case "EUR":{
                float convertTemp = Float.parseFloat(amount) / 85.37f;
                print(amount, convertTemp);
                break;
            }
            case "AED":{
                float convertTemp = Float.parseFloat(amount) / 20.25f;
                print(amount, convertTemp);
                break;
            }
            case "INR":{
                print(amount, temp);
                break;
            }
            default:{
                System.out.println("Invalid Source Currency");
            }
        }

    }


    public static void print(String amount, float convertTemp){
        String formatTemp = String.format("%.2f", convertTemp);
        System.out.println("| " + amount + " | " + formatTemp + " |");               
    }
}

