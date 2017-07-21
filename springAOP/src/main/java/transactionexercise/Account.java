package transactionexercise;

public class Account {

    private String name;
    private long balance;

    public Account() {

    }

    public Account(String name, long balance) {
        super();
        this.name = name;
        this.balance = balance;
    }

    public void debit(long debitAmount){
        this.balance = this.balance - debitAmount;
    }

    public void credit(long creditAmount) {
        this.balance = this.balance + creditAmount;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account Name :"+getName()+" Balance :"+getBalance();
    }
}

