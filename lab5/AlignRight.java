package lab5;

public class AlignRight implements AlignStrategy {
    Paragraph par;

    @Override
    public void render(Paragraph x) {
        System.out.println("+++++"+x.name);
    }
}
