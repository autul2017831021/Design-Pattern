public class Milk extends Decorator{

    Milk(Shop tmp) {
        super(tmp);
    }

    @Override
    public double cost() {
        return super.cost()+0.12;
    }

    @Override
    public String type() {
        return super.type()+" + Milk ";
    }
}
