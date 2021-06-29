public class Latte extends Drinks {
    public Latte(){
        description = "Latte";
    }

    @Override
    public double cost() {
        return 3.00;
    }
}
