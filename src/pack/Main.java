package pack;

public class Main {

    public static void main(String[] args) {
	image something=new image("test");
	Paragraph asdf=new Paragraph("qqqaq");
	Table qqq=new Table("ceva");
	System.out.println(something);
	System.out.println(asdf);
	System.out.println(qqq);
	SubChapter subcap=new SubChapter("unu");
	subcap.createParagraph("ceva");
	System.out.println(subcap);
    }
}
