package PrincipioPoo;

public class Tester {
    public static void main(String[] args) {

        Padre padre = new Padre("solito");//santiago
        Padre carlos = new Padre("acompañado");
        String nombrePadreQueMandaDato = "Juan";//ALEXANDRA
        padre.setNombrePadre(nombrePadreQueMandaDato);//VALENTINA
        System.out.println(padre.getNombrePadre()+""+ padre.getApellidoPadre());//ERIKA
        carlos.setNombrePadre(nombrePadreQueMandaDato);
        System.out.println(carlos.getNombrePadre() +""+ carlos.getApellidoPadre());
        padre.verPadre();
        carlos.verPadre();
        padre.crearPadre();
        carlos.verPadre();

    }
}
