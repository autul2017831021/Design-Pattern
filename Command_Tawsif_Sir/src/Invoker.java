public class Invoker{
    ICommand obj;
    void setCommand(ICommand obj){
        this.obj = obj;
    }
    void button_was_pressed(){
        obj.execute();
    }
}
