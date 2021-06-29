public class Robot_is_Off implements State{
    private final Robot robot;
    public Robot_is_Off(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void walk() {
        System.out.println("The Robot is Walking...");
        robot.setState(robot.getRobot_is_On());
    }

    @Override
    public void cook() {
        System.out.println("Can not Cook in this state");
    }

    @Override
    public void off() {
        System.out.println("Already switched off...");
    }
}
