package Practica1;
import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);
    Almacen db= new Almacen();
    public void Datos(){
        System.out.println(
            "Nombre: " + "Victor Alfredo Reyes Escobar \n"+
            "Carnet: "+ "202400000\n" +
            "IPC1"
        );
    }

    public void VerDatosPersonaje(){
        System.out.println("Ingrese ID de personaje: ");
        String id=scan.nextLine();
        db.VerPersonaje(id);
    }
    public void EliminarPersonaje(){
        System.out.println("Ingrese ID de personaje a eliminar: ");
        String id=scan.nextLine();
        db.EliminarPersonaje(id);
    }
    public void RealizarPelea(){
        System.out.println("Ingrese el ID de personaje 1");
        String id1= scan.nextLine();
        System.out.println("Ingrese el ID de personaje 2");
        String id2= scan.nextLine();
        db.Peleas(id1, id2);
    }

    public void Modificar(){
        System.out.println("1. Ingrese el ID o nombre");
        String id=scan.nextLine().strip();
        Personaje p=this.db.Buscar(id);
        if(p==null){
            System.out.println("No se encontró el personaje con ID: "+ id);
            return;
        }
        
        System.out.println("1. Nombre personaje: ");
        String nombre= scan.nextLine();
        System.out.println("2. Arma de personaje: ");
        String arma= scan.nextLine();
        //["","","","",""]
        
        String hab="";
        for (int i = 0; i < 5; i++) {
            System.out.println(i+1 + ". Ingrese habilidad "+ (i+1)+ ":");
            hab+=(i+1)+ ". "  +scan.nextLine()+"\n";
        }

        System.out.println("8. Nivel de poder");
        int poder= scan.nextInt();

        p.setNombre(nombre);
        p.setArma(arma);
        p.setHab(hab);
        p.setPoder(poder);
        System.out.println("Personaje con id: "+ id + " modificado");

    }

    public void Agregar(){
        
        System.out.println("Ingrese ID: ");
        String id=scan.nextLine();
        System.out.println("1. Nombre personaje: ");
        //scan.nextLine();
        String nombre= scan.nextLine();
        System.out.println("2. Arma de personaje: ");
        //scan.nextLine();
        String arma= scan.nextLine();
        //["","","","",""]
        
        
        String hab="";
        for (int i = 0; i < 5; i++) {
            System.out.println(i+1 + ". Ingrese habilidad "+ (i+1)+ ":");
            hab+=(i+1)+ ". "  +scan.nextLine()+"\n";
        }

        System.out.println("8. Nivel de poder");
        int poder= scan.nextInt();
        
        Personaje p1= new Personaje(id,nombre, arma, hab, poder);
        this.db.GuardarPersonaje(p1);
        System.out.println("Personaje agregado \n");
        


    }
    public int Menu1(){
        System.out.println("1. Agregar personaje");
        System.out.println("2. Modificar personaje");
        System.out.println("3. Eliminar persona");
        System.out.println("4. Ver datos de un personaje");
        System.out.println("5. Ver listado de personajes");
        System.out.println("6. Realizar pelea entre personajes");
        System.out.println("7. Ver historial");
        System.out.println("8. Ver datos de Estudiante");
        System.out.println("9. Salir");
        System.out.println("Ingrese opción: ");
        int opc= scan.nextInt();
        scan.nextLine();
        switch (opc) {
            case 1:
                Agregar();
                break;
            case 2:
                Modificar();
                break;
            case 3:
                EliminarPersonaje();
                break;
            case 4:
                VerDatosPersonaje();
                break;
            case 5: 
                db.VerListado();
                break;
            case 6:
                RealizarPelea();
                break;
            case 7:
                db.VerPeleas();
                break;
            case 8:
                Datos();
            default:
                break;
        }


        return opc;
    }

    public void Principal(){
        int opc=0;
        while (opc!=9) {
            opc=Menu1();
        }
    }
}
