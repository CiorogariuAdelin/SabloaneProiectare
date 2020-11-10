package Lab6;

import Services.Visitor;

public class Table implements Element {

    private String name;

    Table(String name) {
        this.name=name;
    }

    @Override
    public void pint() {
        System.out.println("Table with name: " + this.name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}