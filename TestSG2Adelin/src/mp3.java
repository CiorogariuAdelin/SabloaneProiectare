public class mp3 implements Fisier {
    public String name;
    public final int size = 3; //mb
    public String continut =" ";
    Alignment filealignment;
    public void setAlignStrategy(Alignment strat){
        this.filealignment=strat;
    }
    mp3(String name) {
        this.name=name;}

    public void SetContinut(String continut) {
        this.continut = continut;
    }

    public String getContinut(){
        return this.continut;
    }
    @Override
    public void print() {
        System.out.println(this.name+".mp3");
        System.out.println("         "+getContinut());
    }
}
