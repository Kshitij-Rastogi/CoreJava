import java.util.Scanner;
public class BankAccount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Customer[] custList = Customer.customerInformation(sc);

        DisplayCustomer d = new DisplayCustomer();
        d.displayCustomer(custList, sc);
    }
}
