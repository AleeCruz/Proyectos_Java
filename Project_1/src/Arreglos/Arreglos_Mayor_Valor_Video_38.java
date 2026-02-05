package Arreglos;

import java.util.Scanner;

public class Arreglos_Mayor_Valor_Video_38 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];
        int mayor =0;

        //Llenando un array de numeros enteros
        for (int i=0;i<numeros.length;i++){
            System.out.println("Ingrese un valor numerico...");
            numeros[i] = entrada.nextInt();
            //Logica del numero mayor
            if (numeros[i]>mayor){
                mayor = numeros[i];
            }


        }

        System.out.println("EL numero mayor ingresado es: "+mayor);



    ;}
}
