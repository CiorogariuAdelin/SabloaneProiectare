package Lab6;

import Services.Visitor;

public class BookStatistics implements Visitor {
    int imageCounter =0;
    int tableCounter =0;
    int paragraphCounter =0;
    @Override
    public void visit(Image image) {
        this.imageCounter++;
    }

    @Override
    public void visit(imageProxy ImageProxy) {
    this.imageCounter++;
    }

    @Override
    public void visit(Paragraph paragraph) {
    this.paragraphCounter++;
    }

    @Override
    public void visit(Table table) {
    this.tableCounter++;
    }

    public void printStatistics(){
        System.out.println("Book Statistics: ");
        System.out.println("***Number of images: "+imageCounter);
        System.out.println("***Number of paragraphs: "+paragraphCounter);
        System.out.println("***Number of tables: "+tableCounter);
    }
}
