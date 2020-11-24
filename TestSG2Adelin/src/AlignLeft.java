public class AlignLeft implements Alignment {
    @Override
    public void render(txt par) {
        System.out.println("<<<<<"+par.continut);
    }

    @Override
    public void render(mp3 par) {
        System.out.println("<<<<<"+par.continut);
    }

    @Override
    public void render(svg par) {
        System.out.println("<<<<<"+par.continut);
    }
}
