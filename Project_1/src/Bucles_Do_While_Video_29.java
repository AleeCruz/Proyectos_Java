import java.util.Scanner;

public class Bucles_Do_While_Video_29 {
    public static void main(String[] args) {

        System.out.println("\nBucle Do While\n");
        //Vamos a ver la estructura basica de un bucle do_while en java desde cero
     /*   int contador = 1;
        final int valor = 5;

        do {
            System.out.println("EL valor es: "+contador);
            contador++;
        }while(contador<=valor);

        System.out.println("\n\nFin del Programa");*/




        //Ahora vamos a realizar un ejercicio con do while

        Scanner entrada = new Scanner(System.in);

        int numero =0;
        int errores = 0;

        do {
            System.out.println("\nIngrese el numero 5...");
            numero = entrada.nextInt();
            if (numero != 5){
                System.out.println("\nEL numero ingresado es incorrecto intentalo otra vez");
                errores++;
            }

        }while (numero != 5);

        System.out.println("FIN DEL PROGRAMA, Errores cometidos "+errores+" veces");



    }
}
