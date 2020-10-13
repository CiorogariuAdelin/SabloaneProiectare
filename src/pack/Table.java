package pack;

public class Table {
    public String title;

    public Table(String x)
    {
        this.title=x;
    }

    public String toString(){
        return "Table:" +  this.title;

    }
}
