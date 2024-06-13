package FileSystem;

import java.util.List;

public interface IComponent {
    public String getName();
    public void ls();
    public void add(IComponent component);
//    public IComponent cd(String name);
}