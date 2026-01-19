import java.util.Scanner;

public class Ejercicio_1_video_11 {
    public static void main(String[] args) {

        String nombre ;
        String apellido;
        String ciudadDeResidencia;
        int codigoPostal;

        //Vamos a realizar el ingreso de datos por consola
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.nextLine();

        System.out.println("Ingrese su apellido: ");
        apellido = entrada.nextLine();

        System.out.println("Ingrese la ciudad de residencia: ");
        ciudadDeResidencia = entrada.nextLine();

        System.out.println("Ingrese su codigo postal: ");
        codigoPostal = entrada.nextInt();




        //Salida por pantalla
        System.out.println("Hola "+nombre+ apellido+", sabemos que vives en "
                +ciudadDeResidencia+" con el código postal "+codigoPostal+".");
    }
}
