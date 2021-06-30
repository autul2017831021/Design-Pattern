public class Main {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Engineer engineer = new Engineer();
        Programmer programmer = new Programmer();

        EngineerCommand engineerCommand = new EngineerCommand(engineer);
        ProgrammerCommand programmerCommand = new ProgrammerCommand(programmer);

        invoker.setCommand(engineerCommand);
        invoker.button_was_pressed();

        invoker.setCommand(programmerCommand);
        invoker.button_was_pressed();
    }
}
