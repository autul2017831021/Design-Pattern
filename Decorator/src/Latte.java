public class Latte implements Shop{
    @Override
    public double cost() {
        return 3.00;
    }
    @Override
    public String type() {
        return "Latte ";
    }
}
