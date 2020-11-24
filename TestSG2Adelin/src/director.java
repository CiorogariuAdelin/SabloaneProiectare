import java.util.ArrayList;

public class director implements Fisier,visitee {

    public String dirname;
    ArrayList<Fisier> fisiere = new ArrayList<>();

    public director(String nume)
    {
        this.dirname=nume;
    }

    public void add(Fisier elem)
    {
        fisiere.add(elem);
    }
    public void remove(Fisier elem)
    {
        fisiere.remove(elem);
    }

    @Override
    public void print() {
        System.out.println("Directorul " + dirname);
        System.out.println("    contine fisierele:");
        for(Fisier e: fisiere)
        {   System.out.print("      -");
            e.print();
        }
        System.out.println("--------EndOfDir:"+dirname+"------");
    }

    @Override
    public void accept(visitor visitor) {
        for (Fisier e1:fisiere) {
            e1.accept(visitor);
        }
    }

    @Override
    public void file(visitor visitor) {
        visitor.visit(this);
    }
}
