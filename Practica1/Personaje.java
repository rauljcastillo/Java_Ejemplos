package Practica1;

public class Personaje {
    String id;
    String nombre;
    String arma;
    String hab;
    int poder;

    public Personaje(String id,String nombre,String arma, String hab,int poder){
       this.id=id;
       this.nombre=nombre;
       this.arma=arma;
       this.hab=hab;
       this.poder=poder;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setArma(String arma){
        this.arma=arma;
    }

    public void setHab(String hab){
        this.hab=hab;
    }

    public void setPoder(int poder){
        this.poder=poder;
    }
}
