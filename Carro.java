package ClaseIPC1;

public class Carro {
    String marca;
    String linea;
    int modelo;

    public Carro(String marca,String linea,int modelo){
        this.marca=marca;
        this.linea=linea;
        this.modelo=modelo;
    }

    public void Arrancar(){
        System.out.println("El carro con marca " + this.marca+ " arranco");
    }

    public void Apagar(){
        System.out.println("El carro con marca "+ this.marca+ " se apagó");
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String modificada){
        this.marca=modificada;
    }


}