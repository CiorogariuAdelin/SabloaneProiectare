package lab5;

public class Paragraph implements Element {
    public String name;
    AlignStrategy x;
    Paragraph(String name) {
        this.name=name;
    }

    public void setAlignStrategy(AlignStrategy strat){
        this.x=strat;
    }

    @Override
    public void pint(){

        if(x==null) {
            System.out.println(this.name);
        }else{
            x.render(new Paragraph(this.name));
        }
    }
}