package Lab6;

import Services.Visitor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class imageProxy implements Element{
    Image Name;
    String name;
    imageProxy(String name) {
        this.name=name;
    }
    @Override
    public void pint() {
        if (Name==null)
        Name=new Image(name);
           Name.pint();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void tofile() {
    try(FileWriter fw = new FileWriter("C:\\Users\\40747\\IdeaProjects\\Test\\src\\Lab6\\Statistics.json", true);
    BufferedWriter bw = new BufferedWriter(fw);
    PrintWriter out = new PrintWriter(bw))
    {
        out.println("   \"ImageProxy\":{");
        out.println("        \"name\":"+"\""+this.name+ "\"");
        out.println("   },");

    } catch (
    IOException e) {
        //exception handling left as an exercise for the reader
    }}
}
