package Arreglos;

import java.util.Arrays;

public class Arreglos_Caracteres_Video_35 {
    public static void main(String[] args) {

        //Veremos la declaracion e inicializacion de los productos

        String[] productos = new String[5];
        productos[0]="manzanas";
        productos[1]="uvas";
        productos[2]="peras";
        productos[3]="fresas";
        productos[4]="kiwis";

        //Ahora vamos a visualizarlas por pantalla de la siguiente manera

        System.out.println("\n-----------Productos-----------");
        System.out.println("\n-----------Producto en orden establecido-------");
        System.out.println(productos[0]);
        System.out.println(productos[1]);
        System.out.println(productos[2]);
        System.out.println(productos[3]);
        System.out.println(productos[4]);



        //Ahora vamos a ordenarlos en orden alfabetico de la siguiente manera

        Arrays.sort(productos);
        System.out.println("\n\n-----------Productos en orden Alfabetico--------");
        System.out.println(productos[0]);
        System.out.println(productos[1]);
        System.out.println(productos[2]);
        System.out.println(productos[3]);
        System.out.println(productos[4]);






    }
}
