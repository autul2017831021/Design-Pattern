import java.util.ArrayList;

public class Directory implements AbstractFile{
    private String name;
    private ArrayList includedFiles = new ArrayList();

    Directory(String  name){
        this.name = name;
    }

    public void add(Object obj){
        includedFiles.add(obj);
    }

    @Override
    public void ls() {
        System.out.println(Main.compositeBuilder + name);
        Main.compositeBuilder.append("   ");

        for (Object i : includedFiles){
            AbstractFile obj = (AbstractFile) i;
            obj.ls();
        }
        Main.compositeBuilder.setLength(Main.compositeBuilder.length() - 3 );
    }
}
