package Arreglos;

public class Arreglos_Enteros_Video_35 {
    public static void main(String[] args) {
        //declaracion e inicializacion de una variable de enteros

        //Forma 1
        int [] numeros = new int[5];

        //Asignacion de valores a una variabe
        numeros[0] =12;
        numeros[1] =80;
        numeros[2] =32;
        numeros[3] =73;
        numeros[4] =2;

        //Visualizacion de valores de un arreglo
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);
        System.out.println(numeros[4]);

        //Podriamos tranquilamente asignar los valores de un arreglo a distintas variables

        int a = numeros[0];
        int b = numeros[1];
        int c = numeros[2];
        int d = numeros[3];
        int e = numeros[4];

        System.out.println("\nSalida de datos por pantalla");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);







        //Forma 2
        int[] valores = {12,43,65,78,21};
        System.out.println("\nSalida de datos por pantalla de un arreglo");
        System.out.println(valores[3]);





    }
}
