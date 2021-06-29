public class Robot implements State{
    private State robot_is_on;
    private State robot_is_cooking;
    private State robot_is_off;
    private State obostha;
    public Robot(){
        this.robot_is_on = new Robot_is_On(this);
        this.robot_is_cooking = new Robot_is_Cooking(this);
        this.robot_is_off = new Robot_is_Off(this);
        this.obostha = robot_is_on;
    }
    public void setRobotState(State obostha){
        this.obostha = obostha;
    }

    @Override
    public void walk() {
        obostha.walk();
    }

    @Override
    public void cook() {
        obostha.cook();
    }

    @Override
    public void off() {
        obostha.off();
    }

    // On obostha
    public State getRobot_is_On() {
        return robot_is_on;
    }
    public void setRoboticOn(State robot_is_on) {
        this.robot_is_on = robot_is_on;
    }

    // Cooking Obostha
    public State getRobot_is_Cooking() {
        return robot_is_cooking;
    }
    public void setRobot_is_Cooking(State robot_is_cooking) {
        this.robot_is_cooking = robot_is_cooking;
    }

    //Off obostha
    public State getRobot_is_Off() {
        return robot_is_off;
    }
    public void setRobot_is_Off(State robot_is_off) {
        this.robot_is_off = robot_is_off;
    }

    public State getState() {
        return obostha;
    }
    public void setState(State obostha) {
        this.obostha = obostha;
    }
}