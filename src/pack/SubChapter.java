package pack;

import java.awt.*;
import java.util.ArrayList;

public class SubChapter {
    public ArrayList<Table> tabs=new ArrayList<Table>();
    public ArrayList<Paragraph> paragraphs=new ArrayList<Paragraph>();
    public ArrayList<image> images=new ArrayList<image>();
    public String name;

    public SubChapter(String n)
    {
        this.name=n;
    }
    public void createTable(String z)
    {   Table x=new Table(z);
        tabs.add(x);
    }
    public void createParagraph(String z)
    {   Paragraph x=new Paragraph(z);
        paragraphs.add(x);
    }
    public void createImage(String z)
    {   image x=new image(z);
        images.add(x);
    }
    public String toString(){
        return "SubChapter:"+this.name+" "+tabs+ " "+images+" "+paragraphs;
    }

}
