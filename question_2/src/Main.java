public class Main {
    public static void main(String[] args) {
        Drinks drinks = new Cold_Coffee();

        drinks = new Milk(drinks);
        drinks = new Chocolate(drinks);
        System.out.println("Cold Coffee Items : " + drinks.getDescription() + "\n"+"total price: $" + drinks.cost());

        Drinks drinks2 = new Latte();
        drinks2 = new Chocolate(drinks2);
        System.out.println("Latte Items : " + drinks2.getDescription() + "\n"+"total price: $" + drinks2.cost());

        Drinks drinks3 = new Cappuccino();
        drinks3 = new Milk(drinks3);
        //drinks3 = new Whip(drinks3);
        System.out.println("Cappuccino Items : " + drinks3.getDescription() + "\n"+"total price: $" + drinks3.cost());
    }
}

/// Cappuccino , Cold Coffee , Latte are 3 types of coffee
/// Milk , Chocolate are 2 add-ons