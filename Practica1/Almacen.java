package Practica1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Almacen {
    Personaje[] arreglo = new Personaje[25];
    String peleas="";
    int tam = 0;

    public void GuardarPersonaje(Personaje p) {
        if (tam>=25){
            System.out.println("Ya no hay espacio");
            return;
        }
        this.arreglo[tam] = p;
        this.tam++;
    }

    public void EliminarPersonaje(String id) {
        for (int i = 0; i < this.tam; i++) {
            if (this.arreglo[i].id.equals(id)) {
                System.out.println("Personaje con id: " + this.arreglo[i].id + " eliminado");
                this.arreglo[i] = null;
                return;
            }
        }
        System.out.println("El persona con id: " + id + " no existe");
    }

    public void VerPersonaje(String id) {
        for (int i = 0; i < this.tam; i++) {
            if (this.arreglo[i].id.equals(id)) {
                System.out.println("********************");
                System.out.println(
                    "Nombre: " + this.arreglo[i].nombre + "\n" +
                    "Arma: " + this.arreglo[i].arma + "\n" +
                    "Habilidades: \n" + this.arreglo[i].hab +
                    "Poder: " + this.arreglo[i].poder
                );
                System.out.println("********************");
                return;
            }
        }
        System.out.println("El persona con id: " + id + " no existe");
    }

    public void VerListado() {
        if(this.arreglo.length==0){
            System.out.println("No hay personajes disponibles");
            return;
        }
        for (int i = 0; i < this.tam; i++) {
            if(this.arreglo[i]!=null){
                System.out.println("********************");
                System.out.println(
                    "Nombre: " + this.arreglo[i].nombre + "\n" +
                    "Arma: " + this.arreglo[i].arma + "\n" +
                    "Habilidades: " + this.arreglo[i].hab + "\n" +
                    "Poder: " + this.arreglo[i].poder + "\n"
                );
                System.out.println("********************\n");
            }
        }
    }

    public void Peleas(String id1, String id2){
        String n1="";
        String n2="";

        for (int i = 0; i < this.tam; i++) {
            if (this.arreglo[i].id.equals(id1)) {
                n1=this.arreglo[i].nombre;
            }

            if (this.arreglo[i].id.equals(id2)){
                n2=this.arreglo[i].nombre;
            }
        }

        if(n1.equals("")){
            System.out.println("No existe id: "+ id1);
            return;
        }
        if (n1.equals("")){
            System.out.println("No existe id: "+ id2);
            return;
        }

        DateTimeFormatter form= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        this.peleas+=LocalDateTime.now().format(form) +" "+ "Pelea: " + n1 + ", "+ n2 + "\n";

    }

    public void VerPeleas(){
        System.out.println(this.peleas);
    }

    public Personaje Buscar(String id) {
        for (int i = 0; i < this.tam; i++) {
            if (this.arreglo[i].id.equals(id) || this.arreglo[i].nombre.equals(id)) {
                return this.arreglo[i];
            }
        }
        return null;

    }
}
