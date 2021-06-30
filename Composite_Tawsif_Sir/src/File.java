public class File implements AbstractFile{
    private String name;
    File(String name){
        this.name = name;
    }

    @Override
    public void ls() {
        System.out.println(Main.compositeBuilder + name);
    }
}
