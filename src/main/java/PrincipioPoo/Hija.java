package PrincipioPoo;

public class Hija extends Padre{
    private String apellidoMadre;

    public Hija(String apellidoPadre, String apellidoMadre) {
        super(apellidoPadre);
        this.apellidoMadre = apellidoMadre;
    }
    //getter y setter

    public String getApellidoMadre() {
        return apellidoMadre;
    }

    public void setApellidoMadre(String apellidoMadre) {
        this.apellidoMadre = apellidoMadre;
    }
}
