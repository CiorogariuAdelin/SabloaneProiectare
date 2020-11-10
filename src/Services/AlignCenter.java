package Services;

import Lab6.Paragraph;
import Services.AlignStrategy;

public class AlignCenter implements AlignStrategy {

    @Override
    public void render(Paragraph x) {
        System.out.println("+++++"+x.name+"+++++");
    }
}
