package Services;

import Lab6.Image;
import Lab6.Paragraph;
import Lab6.Table;
import Lab6.imageProxy;

public interface Visitor {
    public abstract void visit(Image image);
    public abstract void visit(imageProxy ImageProxy);
    public abstract void visit(Paragraph paragraph);
    public abstract void visit(Table table);

}
