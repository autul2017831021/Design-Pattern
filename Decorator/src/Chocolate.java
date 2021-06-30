public class Chocolate extends Decorator{
    Chocolate(Shop tmp) {
        super(tmp);
    }

    @Override
    public double cost() {
        return super.cost()+0.50;
    }
    @Override
    public String type() {
        return super.type()+" + Chocolate ";
    }
}
