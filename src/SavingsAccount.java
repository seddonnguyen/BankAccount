public class SavingsAccount extends BankAccount{

    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance  >= amount){
            balance -= amount;
            System.out.println("Withdrawl succesful: current balance = " + balance);
        }else{
            System.out.println("Withdraw failed: not enough funds");
        }
    }

    @Override
    public void checkStatus() {
        System.out.println(STR."Savings account number: \{super.getAccountNumber()}");
        System.out.println(STR."Interest rate: \{this.interestRate}");
        super.checkStatus();
    }
}
