import java.util.*;

public class Transactions {
    private int transID;
    private Date transDate;
    double amount;
    TransactionType transactionType;

    public int getTransID() {
        return transID;
    }

    public void setTransID(int transID) {
        this.transID = transID;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    
}
