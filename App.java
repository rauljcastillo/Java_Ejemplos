package ClaseIPC1;

public class App {

    public static int Multi(int a,int b){
        System.out.println("El numero es de: "+a*b);

        return a*b;
    }
    public static void main(String[] args) {
        //int num= 1;

        //Bucle while
        while(num<=5){
            System.out.println("El numero es: "+ num);
            num=num+5;
            num++;
        }
        
        //Bucle for
        for(int i=1;i<=5;i++){
            System.out.println("El numero es "+ i);
        }

        //Arreglos
        int arreglo[]=new int[10];
        arreglo[0]=1;
        arreglo[1]=2;
        arreglo[2]=3;
        arreglo[3]=4;

        String arreglo1[]={"Raul","Saul","Victor"};
        System.out.println("El numero en la posicion 2 es: "+ arreglo1[2]);

        // //Matrices
        int x[][]= new int[3][4];
        x[0][0]=1;
        x[0][1]=2;

        //LLamada a metodo con parametros y retorna un numero
        //int c=Multi(2,3);
        
        //Objetos Carro
        Carro carro1=new Carro("Honda", "Civic", 2020);
        Carro carro2=new Carro("Toyota","Hilux",2025);
        System.out.println(carro2.getMarca());

    }
}
