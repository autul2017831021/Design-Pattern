public class SavingAccount extends Account{
    private String accountNo;
    private float accountBalance;
    SavingAccount(String accountNo , float accountBalance){
        this.accountBalance = accountBalance;
        this.accountNo = accountNo;

    }
    @Override
    public float getBalance() {
        return accountBalance;
    }
}
