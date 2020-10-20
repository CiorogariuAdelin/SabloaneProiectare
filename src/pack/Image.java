package pack;

public class Image implements Element{
    private String name;

    Image(String name) {
        this.name=name;
    }


    @Override
    public void pint() {
        System.out.println("Image with name: " + this.name);
    }
}