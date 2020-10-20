package pack;
import java.util.ArrayList;

public class Book implements Element
{
    protected String title;

    protected ArrayList<Element> content= new ArrayList();
    protected ArrayList<Author> AutorList= new ArrayList();


    public Book (String title)
    {
        this.title=title;
    }


    public void addContent(Element elem)
    {
        content.add(elem);
    }

    public void addAuthor(Author autor)
    {
        AutorList.add(autor);
    }


    public String toString()
    {
        return "Book{" +
                "title='" + title + '\'' +
                ", content=" + content +
                '}';
    }


    @Override
    public void pint() {
        System.out.println("Titlu:" + title);
        for (Author s: AutorList)
        {
            s.print();
        }

        for (Element e: content)
        {
            e.pint();
        }
    }
}