import java.util.ArrayList;
import java.util.List;

public class Composite extends Account{
    private float totalBalance;
    private List<Account> accountList = new ArrayList<Account>();
    @Override
    public float getBalance() {
        totalBalance = 0;
        for(Account f : accountList ){
            totalBalance = totalBalance + f.getBalance();
        }
        return totalBalance;
    }

    public void add(Account acc){
        accountList.add(acc);
    }

    public void remove(Account acc){
        accountList.remove(acc);
    }
}
