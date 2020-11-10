package Lab6;

import Services.Visitor;

public class imageProxy implements Element{
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

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
