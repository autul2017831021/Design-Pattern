public abstract class Drinks {
    protected String description = "Name of the Drink";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
