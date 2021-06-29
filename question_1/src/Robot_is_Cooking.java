public class Robot_is_Cooking implements  State{
    private final Robot robot;
    public Robot_is_Cooking(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void walk() {
        System.out.println("The Robot is Walking...");
        robot.setState(robot.getRobot_is_On());
    }

    @Override
    public void cook() {
        System.out.println("The Robot is Cooking...");
    }

    @Override
    public void off() {
        robot.setState(robot.getRobot_is_Off());
        System.out.println("The Robot is switched off");
    }
}
