public class Espresso implements Shop{
    @Override
    public double cost() {
        return 2.50;
    }
    @Override
    public String type() {
        return "Espresso ";
    }
}
