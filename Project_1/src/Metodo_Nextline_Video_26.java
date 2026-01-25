import java.util.Scanner;

public class Metodo_Nextline_Video_26 {
    public static void main(String[] args) {
        String texto_1, texto_2;

        Scanner entrada = new Scanner(System.in);
        //Vamos a ver la gran diferencia entre nect() y nextline()


        //Estpo permite al ususario ingresar varias palabras en la variable texto_1
        System.out.println("Ingrese la primera palabra 1....");
        texto_1 = entrada.nextLine();


        //Realizamos el mismo analisis pero con next()

        System.out.println("\nIngrese la palabra 2...");
        texto_2 = entrada.next();


        System.out.println("La cadena ingresada fue: "+texto_1);
        System.out.println("La cadena ingresada fue: "+texto_2);


    }
}
