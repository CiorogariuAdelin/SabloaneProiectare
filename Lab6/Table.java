package Lab6;

import Services.Visitor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Table implements Element {

    private String name;

    Table(String name) {
        this.name=name;
    }

    @Override
    public void pint() {
        System.out.println("Table with name: " + this.name);
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
        {   out.println("{");
            out.println("   \"Table\":{");
            out.println("        \"name\":"+"\""+this.name+ "\"");
            out.println("  }");
            out.println("}");
        } catch (
                IOException e) {
            //exception handling left as an exercise for the reader
        }}
}