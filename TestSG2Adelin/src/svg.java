public class svg implements Fisier {

    public String name;
    public final int size = 45; //kb
    public String continut =" ";
    Alignment filealignment;
    public void setAlignStrategy(Alignment strat){
        this.filealignment=strat;
    }
    svg(String name) {
        this.name=name;}

    public void SetContinut(String continut) {
        this.continut = continut;
    }

    public String getContinut(){
        return this.continut;
    }

    @Override
    public void print() {
        System.out.println(this.name+".svg");
        System.out.println("          "+getContinut());
    }

    @Override
    public void accept(visitor visitor) {
        visitor.visit(this);
    }
}
