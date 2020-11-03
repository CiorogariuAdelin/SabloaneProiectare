package lab5;

public class AlignCenter implements AlignStrategy {

    @Override
    public void render(Paragraph x) {
        System.out.println("+++++"+x.name+"+++++");
    }
}
