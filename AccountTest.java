class Account {
    protected String custName;
    protected String accNo;

    public Account() {
        this.custName = "Unknown";
        this.accNo = "0000";
    }

    public Account(String custName, String accNo) {
        this.custName = custName;
        this.accNo = accNo;
    }
}

class SavingAccount extends Account {
    protected double savingBal;
    protected double minBal;

    public SavingAccount() {
        super();
        this.savingBal = 0.0;
        this.minBal = 500.0;
    }

    public SavingAccount(String custName, String accNo, double savingBal, double minBal) {
        super(custName, accNo);
        this.savingBal = savingBal;
        this.minBal = minBal;
    }
}

class AccountDetail extends SavingAccount {
    private double depositAmt;
    private double withdrawalAmt;

    public AccountDetail(String custName, String accNo, double savingBal, double minBal, double depositAmt, double withdrawalAmt) {
        super(custName, accNo, savingBal, minBal);
        this.depositAmt = depositAmt;
        this.withdrawalAmt = withdrawalAmt;
    }

    public void displayCustomerDetails() {
        System.out.println("Customer Name: " + custName);
        System.out.println("Account Number: " + accNo);
        System.out.println("Saving Balance: " + savingBal);
        System.out.println("Minimum Balance: " + minBal);
        System.out.println("Deposit Amount: " + depositAmt);
        System.out.println("Withdrawal Amount: " + withdrawalAmt);
    }
}

public class AccountTest {
    public static void main(String[] args) {
        AccountDetail accountDetail = new AccountDetail("John Doe", "12345", 1500.0, 500.0, 200.0, 100.0);
        accountDetail.displayCustomerDetails();
    }
}