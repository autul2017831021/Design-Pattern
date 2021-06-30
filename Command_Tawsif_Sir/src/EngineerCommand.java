public class EngineerCommand implements ICommand{
    Engineer engineer;
    EngineerCommand(Engineer engineer){
        this.engineer = engineer;
    }
    @Override
    public void execute() {
        engineer.do_your_work();
    }
}
