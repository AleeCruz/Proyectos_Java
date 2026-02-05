import java.lang.reflect.Array;
import java.util.Arrays;

public class Arreglos_Metodos_Video_39 {
    public static void main(String[] args) {
        int[] numeros ={ 8,4,7,0,1,2,4,5,1,5};
        //Vamos a crear una salida de datos por consola del arreglo tal cual feu definico
        System.out.println("Array Original: "+ Arrays.toString(numeros));

        //Vamos a organizar un array de enteros
        Arrays.sort(numeros);
        System.out.println("Array Ordenado: "+Arrays.toString(numeros));


        //Ahora vamos a crear un arreglo de letras que nos permita ordenarlo de manera organizada
        String[] letras = {"a","f","d","f","f","d","a","o"};

        System.out.println("Array de string ordenado:"+Arrays.toString(letras));
        Arrays.sort(letras);

        System.out.println("La cadena de texto estara organizada: "+Arrays.toString(letras));



        //Ahora vamos a ver si dos arrays son o no iguales vamos a realizar la comparacion

        int[] numeros_1 = {1,5,9};
        int[] numeros_2 = {1,5,9};

        boolean resultado = Arrays.equals(numeros_1,numeros_2);

        System.out.println("EL array "+Arrays.toString(numeros_1)+" y "+ Arrays.toString(numeros_2) +" son  iguales: "+resultado);

        //Vamos a llenar un array automaticamente
        int[] llenar = new int[5];
        Arrays.fill(llenar,0);
        System.out.println("El array llenado es: "+Arrays.toString(llenar));

        //Ahora vamos a copiar un array
        int[] original = {1,2,3};
        int[] copia = Arrays.copyOf(original,5);

        System.out.println("Array copiado y llenado: "+Arrays.toString(copia));



        //Vamos a ver otro ejemplo de Arrays copiados y llenados

        int[] original_2 = {1,2,3,4,5,6};
        int[] copiado_2 = Arrays.copyOf(original_2,10);

        System.out.println("Array copiado con llenado de longitud: "+copiado_2.length+" y "+
                Arrays.toString(copiado_2));

    }
}
