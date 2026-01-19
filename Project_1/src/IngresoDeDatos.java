import java.util.Scanner;

public class IngresoDeDatos {
    public static void main(String[] args) {
        System.out.println("-----------Vamos a realizar un ingreso de Datos ----------");

        System.out.println("\n\n-----INgrese su datos -----------");
        String nombre ;
        int edad;

        //Ingreso de datos desde la consola

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        nombre = entrada.next();
        System.out.println("Escribe tu edad: ");
        edad = entrada.nextInt();


        //Salida de datos por la consola

        System.out.println("Nombre: " + nombre);

        System.out.println("Tu edad es: "+ edad);





    }
}
