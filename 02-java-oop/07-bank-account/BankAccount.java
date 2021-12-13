public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int allAccounts = 0;
    private static double totalMoolah = 0;
    
    public BankAccount(){
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        allAccounts++;
    }
    public static void getAllAccounts(){
        System.out.println(allAccounts);
    }
    private void setChecking(double a) {
        this.checkingBalance = a;
    }
    public double getChecking() {
        return this.checkingBalance;
    }
    private void setSavings(double a) {
        this.savingsBalance = a;
    }
    public double getSavings() {
        return this.savingsBalance;
    }
    public void makeDeposit(double a, String accountType){
        if(accountType.equals("checking")){
            this.setChecking(this.getChecking() + a);
        }
        else if(accountType.equals("savings")){
            this.setSavings(this.getSavings() + a);
        }
        BankAccount.totalMoolah += a;
    }
    public void makeWithdrawl(double a, String accountType){
        if(accountType.equals("checking")){
            if(a > this.checkingBalance){
                System.out.println("Ya messed up, there is not enough.");
            }
            else{ 
                this.setChecking(this.getChecking() - a);
            }
        }
        else if(accountType.equals("savings")){
            if(a > this.savingsBalance){
                System.out.println("Ya messed up, there is not enough.");
            }
            else{ 
                this.setSavings(this.getSavings() - a);
            }
        }
        BankAccount.totalMoolah -= a;
    }
    public double myMoolah(){
        return checkingBalance + savingsBalance;
    }
    public void showMoolah(){
        System.out.println("Savings: " + this.savingsBalance);
        System.out.println("Checking: " + this.checkingBalance);
    }
    public static int allAccounts(){
        return allAccounts;
    }
    public static double totalValue(){
        return totalMoolah;
    }
}