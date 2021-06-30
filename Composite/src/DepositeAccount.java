public class DepositeAccount extends Account{
    private String accountNo;
    private float accountBalance;
    DepositeAccount(String accountNo , float accountBalance){
        this.accountBalance = accountBalance;
        this.accountNo = accountNo;

    }
    @Override
    public float getBalance() {
        return accountBalance;
    }
}
