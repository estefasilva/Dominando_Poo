package PrincipioPoo;

import java.util.Scanner;

public class Padre {
    Scanner sc = new Scanner(System.in);
    int idPadre;
    private String nombrePadre;//SANTIAGO //JUANES
    private String apellidoPadre;
    private int edadPadre;
    private String ocupacion;

    //constructor

    public Padre(String apellidoPadre){
        this.apellidoPadre = apellidoPadre;
    }
    //Getter and setter

    public void setNombrePadre(String nombrePadreQueRecibeDato){//ESTEFANIA
      this.nombrePadre = nombrePadreQueRecibeDato;//ESTEFANIA
    }
    public String getNombrePadre(){
        return this.nombrePadre;
    }

    public String getApellidoPadre() {
        return apellidoPadre;
    }

    public void setApellidoPadre(String apellidoPadre) {
        this.apellidoPadre = apellidoPadre;
    }

    //Metodo
    public void crearPadre(){
        System.out.println("Dé un nombre al padre: ");
        nombrePadre = sc.nextLine();
    }
    public void verPadre(){
        System.out.println("Nombre del padre: " + nombrePadre);
    }




}
