import java.util.*;

public class SavingsBankAccount {
    private String accountNumber;
    private double totalBalance;
    private double availableBalance;
    private Date accountOpeningDate;
    private AccountType status;
    private Transactions[] transaction;

    public String getAccountNumber() {
        double accountSuffix = Math.random()*1000000;
        this.accountNumber = "ACC0000" + (int)accountSuffix;
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public Date getAccountOpeningDate() {
        return accountOpeningDate;
    }

    public void setAccountOpeningDate(Date accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }

    public AccountType getStatus() {
        return status;
    }

    public void setStatus(AccountType status) {
        this.status = status;
    }

    public Transactions[] getTransaction() {
        return transaction;
    }

    public void setTransaction(Transactions[] transaction) {
        this.transaction = transaction;
    }

    public void balanceInquiry(double amount){
        System.out.println("Your Current Balance is : " + amount);
    }

    
}
