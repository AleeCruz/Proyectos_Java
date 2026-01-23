import java.util.Scanner;

public class Clase_String_Video_video_24 {

    public static void main(String[] args) {
        System.out.println("---------Metodos Strings --------------");

        String palabra_1, palabra_2;
        Scanner entrada = new Scanner(System.in);


        //Ingreso de datos por teclado -> Usuario ingresa las palabras (Strings)

        System.out.println("Ingrese la primera palabra: ");
        palabra_1 = entrada.next();

        System.out.println("Ingrese la segunda palabra: ");
        palabra_2 = entrada.next();

        //Vamos a usar el primero de los metodos de los Sgrings

        System.out.println("\n\n");
        if (palabra_1.equals(palabra_2)){
            System.out.println(palabra_1+" es igual a "+palabra_2);
        }else {
            System.out.println(palabra_1+ " no es igual a "+palabra_2);
        }


        //Vamos a usar las cadenas de texto que son pero sin diferenciar sobre mayusculas o minusculas

        System.out.println("\n\n");

        if (palabra_1.equalsIgnoreCase(palabra_2)){
            System.out.println(palabra_1+" es igual a "+palabra_2+" sin tener en cuenta las mayusculas o minusculas");
        }else{
            System.out.println(palabra_1+" no es igual a "+palabra_2+" sin tener en cuentas las mayusculas y minusculas");
        }

        //Vamos a realizar una comparacion de Strings con el metodo CompareTo solo por la cantidad de letras

        System.out.println("\n\n");

        if (palabra_1.compareTo(palabra_2)==0){
            System.out.println(palabra_1+" tiene la misma cantidad de letras que "+palabra_2);
            System.out.println("La longitud de la palabra 1 es "+ palabra_1.length());
            System.out.println("La longitud de la palabra 2 es "+ palabra_2.length());
        }else {
            System.out.println(palabra_1+" no tiene la misma cantidad de letras que "+palabra_2);
            System.out.println("La longitud de la palabra 1 es "+ palabra_1.length());
            System.out.println("La longitud de la palabra 2 es "+ palabra_2.length());


            if (!(palabra_1.compareTo(palabra_2)>0)){
                System.out.println(palabra_1+" tiene mayor cantidad de letras que "+palabra_2);
                System.out.println("La longitud de la palabra 1 es "+ palabra_1.length());
                System.out.println("La longitud de la palabra 2 es "+ palabra_2.length());
            }
            else {
                System.out.println(palabra_1+" tiene menor cantidad de letras que "+palabra_2);
                System.out.println("La longitud de la palabra 1 es "+ palabra_1.length());
                System.out.println("La longitud de la palabra 2 es "+ palabra_2.length());
            }
        }
        //Saber el primer caracter de una cadena de texto
        System.out.println("\n\n");

        char caracter = palabra_1.charAt(0);
        System.out.println("La primera letra de "+palabra_1+" es "+caracter);

        caracter= palabra_1.charAt(3);
        System.out.println("La cuarta letra de "+palabra_1+" es "+caracter);


        //Mostrando la cadena de textos

        System.out.println("\n\n\nLas palabras ingresadas son "+palabra_1 +" y "+palabra_2);


    }
}
