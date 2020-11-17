package Lab6;

import Services.AlignStrategy;
import Services.Visitor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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

    @Override
    public void tofile() {
        try(FileWriter fw = new FileWriter("C:\\Users\\40747\\IdeaProjects\\Test\\src\\Lab6\\Statistics.json", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println("   \"Paragraph\":{");
            out.println("         \"name\":"+"\""+this.name+ "\"");
            out.println("   },");

        } catch (
                IOException e) {
            //exception handling left as an exercise for the reader
        }}
}