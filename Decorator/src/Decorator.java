public abstract class Decorator implements Shop{
    protected Shop wrap;
    Decorator(Shop tmp){
        this.wrap = tmp;
    }
    @Override
    public double cost() {
        return wrap.cost();
    }
    @Override
    public String type() {
        return wrap.type();
    }
}
