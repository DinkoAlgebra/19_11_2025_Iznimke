public class MojaIznimka extends Exception {
    private String korisnika;

    public MojaIznimka(String message,  String korisnika) {
        super(message);
        setKorisnika(korisnika);
    }

    public String getKorisnika() {
        return korisnika;
    }

    public void setKorisnika(String korisnika) {
        this.korisnika = korisnika;
    }
}
