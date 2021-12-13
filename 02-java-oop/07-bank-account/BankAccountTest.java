public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount accounta = new BankAccount();
        accounta.makeDeposit(20.00, "savings");
        accounta.makeDeposit(20.00, "checking");
        accounta.makeWithdrawl(10.00, "savings");
        accounta.makeWithdrawl(10.00, "checking");
        accounta.showMoolah();
        System.out.println(BankAccount.totalValue());
    }
}
