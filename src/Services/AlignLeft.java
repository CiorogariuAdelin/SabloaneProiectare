package Services;

import Lab6.Paragraph;
import Services.AlignStrategy;

public class AlignLeft implements AlignStrategy {
    Paragraph par;

    @Override
    public void render(Paragraph x) {
        System.out.println(x.name+"+++++");
    }
}
