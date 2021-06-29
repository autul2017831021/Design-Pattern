public class Milk extends Decorator{
    Drinks drinks;
    public Milk(Drinks drinks) {
        this.drinks = drinks;
    }

    @Override
    public String getDescription() {
        return drinks.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return 0.25;
    }
}
