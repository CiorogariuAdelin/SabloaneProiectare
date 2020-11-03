package lab5;

public class imageProxy implements Element {
    Image Name;
    String name;
    imageProxy(String name) {
        this.name=name;
    }
    @Override
    public void pint() {
        if (Name==null)
        Name=new Image(name);
           Name.pint();
    }
}
