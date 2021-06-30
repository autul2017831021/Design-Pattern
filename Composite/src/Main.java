public class Main {
    public static void main(String[] args) {
        Composite component = new Composite();

        component.add(new DepositeAccount("DA001", 100));
        component.add(new DepositeAccount("DA002", 150));
        component.add(new SavingAccount("SA001", 200));

        System.out.println(component.getBalance());
    }
}
