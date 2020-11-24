public class Main {
    public static void main(String[] args) {
        director DirPrincipal = new director("DirPrincipal");
        director DirSecundar = new director("DirSecundar");
        DirPrincipal.add(new txt("file1"));
        DirPrincipal.add(new txt("file2"));
        DirSecundar.add(new txt("file3"));
        DirSecundar.add(new txt("file4"));
        DirPrincipal.add(DirSecundar);
        mp3 file5 = new mp3("file5");
        file5.SetContinut("sometext");
        DirPrincipal.add(file5);
        file5.setAlignStrategy(new AlignLeft());
        DirPrincipal.print();
    }
}
