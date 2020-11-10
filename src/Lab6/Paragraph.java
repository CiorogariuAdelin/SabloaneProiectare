package Lab6;

import Services.AlignStrategy;
import Services.Visitor;

public class Paragraph implements Element {
    public String name;
    AlignStrategy paragraphalignment;
    Paragraph(String name) {
        this.name=name;
    }

    public void setAlignStrategy(AlignStrategy strat){
        this.paragraphalignment=strat;
    }

    @Override
    public void pint(){

        if(paragraphalignment==null) {
            System.out.println(this.name);
        }else{
            paragraphalignment.render(this);
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
}
}