import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class StockAnalyzer {

    public int findNumberOfRows(String fileName){
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            int rows = 0;
            while((line = br.readLine()) != null) {
                rows++;
            }
            return rows;
        } catch (FileNotFoundException e) {
            //TODO: handle exception
            e.printStackTrace();
            return 0;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return 0;
        }
    }

    public Stock[] readFromFile(String fileName, int rows) {
        Stock[] stockList = new Stock[rows];
        try {
            BufferedReader b = new BufferedReader(new FileReader(fileName));
            String line;
            int pointer=0;
            b.readLine();
            while((line = b.readLine()) != null){
                Stock s = new Stock();
                String[] tempArr = line.split(",");
                s.setDate(tempArr[0]);
                s.setOpen(tempArr[1]);
                s.setHigh(tempArr[2]);
                s.setLow(tempArr[3]);
                s.setClose(tempArr[4]);
                s.setAdjClose(tempArr[5]);
                s.setVolume(tempArr[6]);
                stockList[pointer] = s;
                pointer++;
            }
        } 
        catch (FileNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return stockList;
    }

    public void displayStock(Stock[] stockList, int rows, Scanner sc){
        System.out.println("The no. of records in the file are : " + stockList.length);
        float absoluteReturn = ((Float.parseFloat(stockList[rows-2].getClose()) - Float.parseFloat(stockList[0].getClose()))/Float.parseFloat(stockList[0].getClose()))*100;
        System.out.println("The absolute return is : " + absoluteReturn + " %\n");
        System.out.println("Enter the two dates(dd-mm-yyyy) for which you need to find absolute return :");
        System.out.print("Enter Starting Date : ");
        String d1 = sc.next();
        System.out.print("Enter Ending Date : ");
        String d2 = sc.next();
        double close1=1, close2=1;
        // System.out.println(stockList[stockList.length-2].getDate());

        for(int i=0;i<stockList.length-1;i++){
            if(stockList[i].getDate().equals(d1)){
                close1 = Float.parseFloat(stockList[i].getClose());
            }
            if(stockList[i].getDate().equals(d2)){
                close2 = Float.parseFloat(stockList[i].getClose());
            }
        }
        System.out.println("The absolute return from " + d1 + " and " + d2 + " is : " + ((close2-close1)/close1)*100 + "%\n");

        System.out.println("Enter the date for checking the investment : ");
        String date = sc.next();
        for(int i=0;i<stockList.length-1;i++){
            if(stockList[i].getDate().equals(date)){
                close1 = Float.parseFloat(stockList[i].getOpen());
                close2 = Float.parseFloat(stockList[i].getClose());
            }
        }
        System.out.println("The investment on " + date + " is : " + (close1+(close2-close1)/close1 + "\n"));

        System.out.print("The Highest Stock Price is on : ");
        float high=0;
        for(int i=0;i<stockList.length-1;i++){
            if(Float.parseFloat(stockList[i].getHigh()) > high){
                high = Float.parseFloat(stockList[i].getHigh());
                date = stockList[i].getDate();
            }
        }
        System.out.println(date + " at the bid of " + high + "\n");

        System.out.print("The Lowest Stock Price is on : ");
        float low=high;
        for(int i=0;i<stockList.length-1;i++){
            if(Float.parseFloat(stockList[i].getHigh()) < low){
                high = Float.parseFloat(stockList[i].getLow());
                date = stockList[i].getDate();
            }
        }
        System.out.println(date + " at the bid of " + high + "\n");

        System.out.print("The average daily return of the stock is : ");
        float sum=0;
        int count = 0;
        for(int i=0;i<stockList.length-1;i++){
            sum = sum + Float.parseFloat(stockList[i].getClose());
            count++;
        }
        float average = sum/count;
        System.out.println(average);
    }
}
