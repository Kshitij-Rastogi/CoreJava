import java.util.*;

public class Customer {
    private long custID;
    private String custFirstName;
    private String custLastName;
    private long phoneNo;
    private long ID;
    Address address;

    public Customer(){

    }

    public Customer(long custID, String custFirstName, String custLastName, long phoneNo, long ID, Address address) {
        this.custID = custID;
        this.custFirstName = custFirstName;
        this.custLastName = custLastName;
        this.phoneNo = phoneNo;
        this.ID = ID;
        this.address = address;
    }

    public long getCustID() {
        return custID;
    }

    public String getCustFirstName() {
        return custFirstName;
    }

    public String getCustLastName() {
        return custLastName;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public long getID() {
        return ID;
    }

    public Address getAddress() {
        return address;
    }    

    public static Customer[] customerInformation(Scanner sc){
        System.out.println("Enter Number Of Customers : ");
        int numberOfCustomers = sc.nextInt();

        Customer[] custList = new Customer[numberOfCustomers];
        
        for(int i=0; i<numberOfCustomers; i++){
            System.out.println("Enter Customer Aadhar ID");
            long ID=0;
            boolean validateCustID = true;
            while(validateCustID){ 
                ID = sc.nextLong();
                validateCustID = validateCustID(Long.toString(ID));
            }

            System.out.println("Enter Customer's First Name");
            String custFirstName = sc.next();

            System.out.println("Enter Customer's Last Name");
            String custLastName = sc.next();

            System.out.println("Enter Phone Number");
            long phoneNo=0;
            boolean validatePhoneNo = true;
            while(validatePhoneNo){
                phoneNo = sc.nextLong();
                validatePhoneNo = validatePhoneNo(Long.toString(phoneNo));
            }

            Address address = new Address();
            System.out.println("Enter Address : ");
            System.out.println("Enter House Number : ");
            String houseNo = sc.next();
            address.setHouseNo(houseNo);

            System.out.println("Enter Street");
            String street = sc.next();
            address.setStreet(street);

            System.out.println("Enter Area");
            String area = sc.next();
            address.setArea(area);

            long custID = generateCustID();

            System.out.println("Enter City");
            String city = sc.next();
            address.setCity(city);

            Customer c = new Customer(custID, custFirstName, custLastName, phoneNo, ID, address);
            custList[i] = c;
        }
        return custList;      
    }


    public static boolean validateCustID(String ID){
        if(ID.matches("\\d{14}")){
            return false;
        }
        else{
            System.out.println("Please Enter Valid Aadhar ID");
            return true;
        }
    }


    public static boolean validatePhoneNo(String phoneNo){
        if(phoneNo.matches("\\d{10}")){
            return false;
        }
        else{
            System.out.println("Please Enter Valid Phone Number");
            return true;
        }
    }


    public static long generateCustID(){
        long custID = 100000000;
        custID++;
        return custID;
    }
}