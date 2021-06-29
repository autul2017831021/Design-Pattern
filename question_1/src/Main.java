public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.off();
        robot.cook();
        robot.walk();
        robot.cook();
        robot.walk();
        robot.off();

        robot.walk();
        robot.off();
        robot.cook();
    }
}

/// This problem can be solved using State Pattern.