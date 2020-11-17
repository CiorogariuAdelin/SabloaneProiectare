package Lab6;

import Services.Visitee;
import Services.Visitor;

import java.io.*;
import java.util.ArrayList;

    public class Section implements Element, Visitee

{
    public String sectionTitle;
    ArrayList<Element> elements = new ArrayList<>();

    public Section(String title)
    {
        this.sectionTitle=title;
    }

    public void add(Element elem)
    {
        elements.add(elem);
    }
    public void remove(Element elem)
    {
        elements.remove(elem);
    }

    public Element getElemet(int index )
    {
        return elements.get(index);
    }

    @Override
    public void pint() {
        System.out.println("Titlu:" + sectionTitle);
        for(Element e: elements)
        {
            e.pint();
        }
    }


    @Override
    public void accept(Visitor visitor) {
        for (Element e1:elements) {
            e1.accept(visitor);
        }
    }

    @Override
    public void tofile() {
        try(FileWriter fw = new FileWriter("C:\\Users\\40747\\IdeaProjects\\Test\\src\\Lab6\\Statistics.json", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println("{");
            out.println("   \"Section\":{");
            for(Element e1:elements)
                e1.tofile();
            out.println("   }");
            out.println("}");
        } catch (
                IOException e) {
            //exception handling left as an exercise for the reader
        }}

    public void BookSaveVisitor()
    {    try {
        File myObj = new File("C:\\Users\\40747\\IdeaProjects\\Test\\src\\Lab6\\Statistics.json");
        if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());
        } else {
            System.out.println("File already exists.");
        }
    } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
        try(FileWriter fw = new FileWriter("C:\\Users\\40747\\IdeaProjects\\Test\\src\\Lab6\\Statistics.json", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println("   \"Section\":{");
              for(Element e1:elements)
                  e1.tofile();
            out.println("   }");
            out.println("}");
        } catch (
                IOException e) {
            //exception handling left as an exercise for the reader
        }
    }
    public void sectionvisit(Visitor visitor)
    {
        visitor.visit(this);
    }
}