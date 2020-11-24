public class txt implements Fisier {
    public String name;
    public final int size = 5; //kb
    public String continut =" ";
    Alignment filealignment;
    public void setAlignStrategy(Alignment strat){
        this.filealignment=strat;
    }
    txt(String name) {
        this.name=name;}

    public void SetContinut(String continut) {
        this.continut = continut;
    }

    public String getContinut(){
        return this.continut;
    }
    @Override
    public void print() {

        if(filealignment==null) {
            {System.out.println(this.name+".txt");
            System.out.println("          "+getContinut());}
        }else{
            System.out.println(this.name+".txt");
            filealignment.render(this);
        }
    }

    @Override
    public void accept(visitor visitor) {
        visitor.visit(this);
    }
}
