public class CheckingAccount extends BankAccount{

    private double overDraftLimit;

    public CheckingAccount(int accountNumber, double balance, double overDraftLimit) {
        super(accountNumber, balance);
        this.overDraftLimit = overDraftLimit;
    }

    public double getOverDraftLimit() {
        return this.overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if(amount > 0 &&(balance + overDraftLimit) >= amount){
            balance -= amount;
            System.out.println("Withdrawl succesful: current balance = " + balance);
        }else{
            System.out.println("Withdraw failed: not enough funds");
        }
    }

    @Override
    public void checkStatus() {
        System.out.println(super.balance);
        System.out.println(STR."Checking account number: \{super.getAccountNumber()}");
        System.out.println(STR."Overdraft limit: \{this.overDraftLimit}");
        super.checkStatus();
    }
}
