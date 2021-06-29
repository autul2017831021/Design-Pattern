public abstract class Template {
    abstract void monyhly_expemse();
    abstract void profession();
    abstract void work_hour();
    public final void Kaj(){
        profession();
        work_hour();
        monyhly_expemse();
        game();
    }
    public void game(){
        System.out.println("I am a football player");
    }
}
