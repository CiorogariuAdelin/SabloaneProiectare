package pack;

public class Paragraph implements Element {
    private String name;

    Paragraph(String name) {
        this.name=name;
    }


    @Override
    public void pint() {
        System.out.println("Paragraph with name: " + this.name);
    }
}