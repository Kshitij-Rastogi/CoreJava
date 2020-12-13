import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Customer {
   private int customerID;
   private String firstName;
   private String lastName;
   private Date dob;
   private int age;
   private char gender;
   private long phone;
   private Address address;
   private CustomerType customerType;
   private SavingsBankAccount savingsBankAccount;


   public Customer(){

   }

   public Customer(int customerID, String firstName, String lastName, Date dob, int age ,char gender, long phone, Address address,
           CustomerType customerType, SavingsBankAccount savingsBankAccount) {
       this.customerID = customerID;
       this.firstName = firstName;
       this.lastName = lastName;
       this.dob = dob;
       this.age = age;
       this.gender = gender;
       this.phone = phone;
       this.address = address;
       this.customerType = customerType;
       this.savingsBankAccount = savingsBankAccount;
   }

   public int getCustomerID() {
       return customerID;
   }

   public void setCustomerID(int customerID) {
       this.customerID = customerID;
   }

   public String getFirstName() {
       return firstName;
   }

   public void setFirstName(String firstName) {
       this.firstName = firstName;
   }

   public String getLastName() {
       return lastName;
   }

   public void setLastName(String lastName) {
       this.lastName = lastName;
   }

   public Date getDob() {
       return dob;
   }

   public void setDob(Date dob) {
       this.dob = dob;
   }

   public char getGender() {
       return gender;
   }

   public void setGender(char gender) {
       this.gender = gender;
   }

   public long getPhone() {
       return phone;
   }

   public void setPhone(long phone) {
       this.phone = phone;
   }

   public Address getAddress() {
       return address;
   }

   public void setAddress(Address address) {
       this.address = address;
   }

   public CustomerType getCustomerType(int age) {
       if(age<=17){
           return CustomerType.Minor;
       }
       else if(age>=18 && age<50){
           return CustomerType.Adult;
       }
       else{
           return CustomerType.Senior;
       }
   }

   public void setCustomerType(CustomerType customerType) {
       this.customerType = customerType;
   }

   public SavingsBankAccount getSavingsBankAccount() {
       return savingsBankAccount;
   }

   public void setSavingsBankAccount(SavingsBankAccount savingsBankAccount) {
       this.savingsBankAccount = savingsBankAccount;
   }

   Scanner sc = new Scanner(System.in);
   public void acceptCustomerDetails() throws Exception{
       System.out.println("Enter number of Customers");
       int numberOfCustomers = sc.nextInt();
       Customer[] custList = new Customer[numberOfCustomers];
       for(int i=0; i<numberOfCustomers; i++){ 

           System.out.println("Enter First Name : ");
           String firstName = sc.next();
           System.out.println("Enter Last Name : ");
           String lastName = sc.next();
           
           System.out.println("Enter Date Of Birth(DD/MM/YY) : ");
           String tempDob = sc.next();
           Date dob = new SimpleDateFormat("dd/MM/yyyy").parse(tempDob);
           int age = calculateAge(dob);

           CustomerType customerType = getCustomerType(age);

           int CustomerID = generateCustomerID();
           
           System.out.println("Enter Gender M/F/O : ");
           char gender = sc.next().charAt(0);

           System.out.println("Enter Phone Number : ");
           long phone = validatePhoneNumber();

           Address a = new Address();
           System.out.println("Enter House Number : ");
           int houseNo = sc.nextInt();
           a.setHouseNo(houseNo);
           System.out.println("Enter Village/District Name : ");
           String villageName = sc.next();
           a.setVillageName(villageName);
           System.out.println("Enter Pin Code : ");
           int pinCode = sc.nextInt();
           a.setPinCode(pinCode);

           SavingsBankAccount s = new SavingsBankAccount();
           String accountNumber = s.getAccountNumber();
           s.setAccountNumber(accountNumber);
           s.setTotalBalance(100000.00);
           s.setAvailableBalance(s.getTotalBalance());
           Date accountOpeningDate = new Date();
           s.setStatus(AccountType.Active);

           Customer c = new Customer(customerID, firstName, lastName, dob, age, gender, phone, address, customerType, savingsBankAccount);
           c.setSavingsBankAccount(s);
           custList[i] = c; 
           System.out.println(custList[i].getSavingsBankAccount().getTransaction());
       }
   }

   private int calculateAge(Date dob){
       LocalDate today = LocalDate.now();
       LocalDate birthday = LocalDate.of(dob.getYear()+1900,dob.getMonth(), dob.getDate());
       Period p = Period.between(birthday, today);
       return p.getYears();
   }

   private int generateCustomerID(){
       double initial = Math.random()*1000000000;
       return (int)initial;
   }

   private long validatePhoneNumber(){
       long phoneNumber = sc.nextLong();
       String phone = Long.toString(phoneNumber);
       while(phone.length() != 10){
           System.out.println("Please Enter a valid Phone Number");
           phoneNumber = sc.nextLong();
           phone = Long.toString(phoneNumber);
       }
       return phoneNumber;
   }
   
}
