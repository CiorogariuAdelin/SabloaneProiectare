package Lab6;

public class OpenCommand implements command {
    @Override
    public void execute() {
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        cap1.add(new imageProxy("ImageOne"));
        cap1.add(new Image("ImageTwo"));
        cap1.add(new Paragraph("Some text"));
        cap1.add(new Table("Table 1"));
        Book book1=new Book("Book1");
        book1.addContent(cap1);
        DocumentManager.getInstance().setBook(book1);

    }
}
