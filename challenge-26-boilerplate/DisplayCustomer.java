import java.util.*;
public class DisplayCustomer {

    public void displayCustomer(Customer[] custList, Scanner sc){
        System.out.println("Enter the Last Name of the Customer");
        String lastName = sc.next();
        System.out.println();
        for(int i=0; i<custList.length; i++){
            if(custList[i].getCustLastName().toUpperCase().equals(lastName.toUpperCase())){
                System.out.format("%s %5s %5s %5s %5s", custList[i].getCustFirstName(), custList[i].getCustLastName(), custList[i].getID(), custList[i].getPhoneNo(), custList[i].getCustID());
                System.out.println();
            }
        }
    }
}
