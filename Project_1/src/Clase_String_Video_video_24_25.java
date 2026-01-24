import java.util.Scanner;

public class Clase_String_Video_video_24_25 {

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



        //Ahora vamos a ver sobre algunos metodos mas de la clase string
        /*Veremos sobre el metodo lenght() */
        System.out.println("\n\n");
        System.out.println("El tamaño de la palabra "+palabra_1+" es "+palabra_1.length());
        System.out.println("El tamaño de la palabra "+palabra_2+" es "+palabra_2.length());


        //Ahora vamos a usar metodos que nos permitan extraer subcadenas de texto de una cadena ya ingresada
        //El metodo que vamos a usar es substring(inicio,final)

        System.out.println("\n\n--------Metodo: substring()-------");
        System.out.println(palabra_1.substring(0,5));
        System.out.println("\n");
        System.out.println(palabra_2.substring(1,3));




        //Ahora vamos a usar un metodo que me permita encontrar una coincidencia de string
        //Usaremos el metodo indexOf que devuelve -1 si no hay coincidencias y 1 si las hay

        System.out.println("\n\n");
        int coincidencia = palabra_1.indexOf(palabra_2);

        if (coincidencia==-1){
            System.out.println(palabra_1+" No Contiene la palabra "+palabra_2);
        }else{
            System.out.println(palabra_1+" tiene coincidencia con la palabra "+palabra_2);
        }

        //Ahora vamos a usar el metodo de toUpperCase que permite cambiar a mayusculas las palabras

        System.out.println("\n\n-------Metodo toUpperCase------------");

        System.out.println(palabra_1+ " ahora en mayusculas es: "+palabra_1.toUpperCase());


        //Ahora vamos a cambiar todo a minusculas con la el metodo toLowerCase

        System.out.println("\n\n-----------Metodo toLowerCase------------");

        System.out.println(palabra_1+ " a minusculas es: "+palabra_1.toLowerCase());



        //Mostrando la cadena de textos

        System.out.println("\n\n\nLas palabras ingresadas son "+palabra_1 +" y "+palabra_2);


    }
}
