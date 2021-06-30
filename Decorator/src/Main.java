public class Main {
    public static void main(String[] args) {
        Shop obj = new Milk(new Milk(new Chocolate(new Latte())));

        System.out.println(obj.type());
        System.out.println(obj.cost());
    }
}
