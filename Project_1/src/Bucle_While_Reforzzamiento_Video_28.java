import java.io.PushbackInputStream;
import java.util.Scanner;

public class Bucle_While_Reforzzamiento_Video_28 {
    public static void main(String[] args) {

        /*Tabla de multiplicar*/

/*

        int resultado,numero;

        System.out.println("------Tabla de multiplicar-----------");
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n\nIngrese el numero de la tabla a consultar: ");
        numero = entrada.nextInt();


        System.out.println("\n\nLa tabla a consultar es: ");
        int i=0;
        while (i<=10){

            System.out.println(i +" * "+numero+" = "+i*numero);
            i++;
        }
*/
        //Sistema de login con los bucles de java

        //Datos extraidos de una posible base de datos y ahora estaran almacenadas en un par de
        //variables

        final String usuario = "GammaStream";
        final String contrasenia = "contraseña";

        Scanner entrada = new Scanner(System.in);
        boolean acceso = false;




      /*  while (acceso == false ){

            System.out.println("\nIngrese su usuario: ");
            String user = entrada.next();

            System.out.println("\nIngrese su contraseña: ");
            String password = entrada.next();

            if (user.equals(usuario)){
                System.out.println("Usuario Correcto");
            }else {
                System.out.println("Usuario incorrecto");
            }


            if (contrasenia.equals(password)){
                System.out.println("COntraseña correcta");
            }else {
                System.out.println("Contraseña incorrecta");
            }

            if (user.equals(usuario) && contrasenia.equals(password)){
                System.out.println("Bienvenido al Sistemas "+user);
                acceso = true;
            }else {
                System.out.println("El usuario/contraseña son incorrectos");
                acceso = false;
            }

        }*/

        //Vamos a simplificar el login de usuarios de una manera mucho mas sencillas


        while (!acceso){
            System.out.println("\n\nIngrese su usuario: ");
            String user = entrada.next();
            System.out.println("Ingrese su contraseña: ");
            String password = entrada.next();

            if (user.equals(usuario) && password.equals(contrasenia)){
                System.out.println("\n\nBienvenido al sistema principal "+user);
                acceso= true;
            }else {
                System.out.println("\nINTENTELO DE NUEVO\n");
            }
        }






    }
}
