package Clases;//Teoria y practica de creacion de clases e instancias de un objeto


//Creacion de una clase
public class Automovil {
    //crear atributos de los objetos
    String marca = "Honda";
    String modelo = "CRV";
    int anio = 2024;
    int cant_ruedas = 4;
    boolean camara =true;





    static void main() {
        //Vamos a instaciar un objeto auto a partir de la clase
        //Instanciacion de una clase
        Automovil  auto_1 = new Automovil();

        //COnsulta de valores de un objeto
        System.out.println("La marca del automovil es: "+auto_1.marca);
        System.out.println("El modelo del automovil es: "+auto_1.modelo);
        System.out.println("EL año del automovil es: "+auto_1.anio);
        System.out.println("La cantidad de ruedas es: "+auto_1.cant_ruedas);
        System.out.println("Tiene camara: "+auto_1.camara);
    }

}
