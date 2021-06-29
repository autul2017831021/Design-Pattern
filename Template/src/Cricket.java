public class Cricket extends Game{
    @Override
    void initialize(){
        System.out.println("Cricket game initialized");
    }

    @Override
    void startplay(){
        System.out.println("Cricket game started");
    }

    @Override
    void endplay(){
        System.out.println("Cricket game ended");
    }
}
