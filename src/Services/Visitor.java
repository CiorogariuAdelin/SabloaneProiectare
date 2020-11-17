package Services;

import Lab6.*;

public interface Visitor {
    public abstract void visit(Image image);
    public abstract void visit(imageProxy ImageProxy);
    public abstract void visit(Paragraph paragraph);
    public abstract void visit(Table table);

    public abstract void visit(Section section);

    public abstract void visit(Book book);
}
