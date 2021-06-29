public class Chocolate extends Decorator{
    Drinks drinks;
    public Chocolate(Drinks drinks){
        this.drinks = drinks;
    }

    @Override
    public String getDescription() {
        return drinks.getDescription() + ", Chocolate";
    }

    @Override
    public double cost() {
        return .50;
    }
}
