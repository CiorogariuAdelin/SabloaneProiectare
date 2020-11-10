package Lab6;

import Services.Visitor;

import java.util.ArrayList;

public class Section implements Element

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
}