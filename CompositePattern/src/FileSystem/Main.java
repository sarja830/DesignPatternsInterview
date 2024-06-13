package FileSystem;

public class Main {
    public static void main(String[] args) {
        IComponent root = new Directory("root");
        IComponent home = new Directory("home");
        IComponent images = new Directory("images");
        IComponent docs = new Directory("docs");
        IComponent user = new Directory("user");
        IComponent file1 = new File("file1.jpg");
        IComponent file2 = new File("file2.txt");
        IComponent file3 = new File("file3.doc");
        root.add(user);
        user.add(home);
        home.add(docs);
        home.add(images);
        docs.add(file3);
        images.add(file2);
        images.add(file1);

        root.ls();

    }
}
