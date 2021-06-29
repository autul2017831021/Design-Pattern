public class Robot_is_On implements State{
    private final Robot robot;
    public Robot_is_On(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void walk() {
        System.out.println("The Robot is Walking...");
    }

    @Override
    public void cook() {
        System.out.println("The Robot is Cooking...");
        robot.setState(robot.getRobot_is_Cooking());
    }

    @Override
    public void off() {
        robot.setState(robot.getRobot_is_Off());
        System.out.println("The Robot is switched off");
    }
}
