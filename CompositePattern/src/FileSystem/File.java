package FileSystem;

import java.util.List;

public class File implements IComponent {

    private  String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void add(IComponent component) {
        System.out.println("Cannot perform add operation on a file");
    }


    @Override
    public void ls() {
        System.out.println("Cannot perform ls operation on a file");
    }

//    @Override
//    public IComponent cd(String name) {
//        System.out.println("Cannot perform cd operation on a file");
//        return null;
//    }

}
