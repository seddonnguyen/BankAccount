public class MainRunner {
    public static void main(String[] args) {



        Bank<BankAccount> myBank = new Bank<>();

        CheckingAccount pncChecking = new CheckingAccount(42,5000.00,100.00);
        SavingsAccount pncSavings = new SavingsAccount(43,3500.00,3.5);
        CreditCard chase = new CreditCard(12,4000.00,"4485-3322-8347-9987");
        CreditCard amex = new CreditCard(12,4000.00,"4335-3322-1011-0000");

        myBank.addAccount(pncChecking);
        myBank.addAccount(pncSavings);
        myBank.addAccount(chase);
        myBank.addAccount(amex);

        System.out.println(STR."Amex Credit Card Teir: \{CreditCard.tierCheck(amex.getCcNumber())}");
        System.out.println("=============================================");
        System.out.println();

        System.out.println(STR."Total balance in bank: \{myBank.getTotalBalance()}");
        System.out.println("=============================================");
        System.out.println();

        System.out.println(STR."PNC Checking balance: \{pncChecking.getBalance()}");
        pncSavings.withdraw(300);
        System.out.println("=============================================");
        System.out.println();

        System.out.println(STR."PNC Savings balance: \{pncSavings.getBalance()}");
        pncChecking.withdraw(200);
        System.out.println("=============================================");
        System.out.println();


        System.out.println(STR."Total balance in bank: \{myBank.getTotalBalance()}");
        System.out.println("=============================================");
        System.out.println();

        for(BankAccount account : myBank.getAccounts()){
            System.out.println("Account Status");
            account.checkStatus();
            System.out.println("=============================================");
            System.out.println();
        }

    }
}
