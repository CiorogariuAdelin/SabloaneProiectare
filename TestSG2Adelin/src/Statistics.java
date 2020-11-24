public class Statistics implements visitor{
    int txt =0;
    int mp3 =0;
    int svg =0;
    @Override
    public void visit(mp3 file) {
        this.txt++;
    }

    @Override
    public void visit(svg file) {
        this.mp3++;
    }

    @Override
    public void visit(txt file) {
        this.svg++;
    }

    @Override
    public void visit(director file) {

    }

    public void printStatistics(){
        System.out.println("Book Statistics: ");
        System.out.println("***Size of txt files: "+txt*5 +"kb");
        System.out.println("***Size of mp3 files: "+mp3*3+"mb");
        System.out.println("***Size of svg files: "+svg*45+"kb");
    }
}
