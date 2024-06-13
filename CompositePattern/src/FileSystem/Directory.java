package FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements IComponent {
    private String name;

    private List<IComponent> directoryComponents;

    public Directory(String name) {
        this.name = name;
        directoryComponents = new ArrayList<>();
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void ls() {
        System.out.println("Directory: " + name);
        System.out.println("Directory components: ");
        for(IComponent component : directoryComponents) {
            component.ls();
        }
    }
    @Override
    public void add(IComponent component) {
        directoryComponents.add(component);
    }
// for cd we can implement it using hashmap
//    @Override
//    public IComponent cd(String name) {
//        return null;
//    }

}
