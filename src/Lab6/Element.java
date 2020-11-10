package Lab6;

import Services.Visitor;

public interface Element {
    public void pint();
    void accept(Visitor visitor);
}
