package Arreglos;

public class Matrices_Video_41 {
    public static void main(String[] args) {
        //Ahora vamos a hablar de las matrices en java

        int[][] numeros = new int[3][3];

        //Llenando  fila 1 de la matriz
        numeros[0][0]=8;
        numeros[0][1]=7;
        numeros[0][2]=4;

        //Llenando fila 2 de la matriz

        numeros[1][0] = 2;
        numeros[1][1] = 3;
        numeros[1][2] = 9;

        //Llenando fila 3 de la matriz

        numeros[2][0] = 3;
        numeros[2][1] = 4;
        numeros[2][2] = 3;


        //Para mostrar por consola lo que se deberia hacer es usar el doble indice

        System.out.println(numeros[0][0]+" "+numeros[0][1]+" "+numeros[0][2]);
        System.out.println(numeros[1][0]+" "+numeros[1][1]+" "+numeros[1][2]);
        System.out.println(numeros[2][0]+" "+numeros[2][1]+" "+numeros[2][2]);






    }
}
