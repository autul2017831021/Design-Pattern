public class ProgrammerCommand implements ICommand{
    Programmer programmer;
    ProgrammerCommand(Programmer programmer){
        this.programmer = programmer;
    }

    @Override
    public void execute() {
        programmer.do_your_work();
    }
}
