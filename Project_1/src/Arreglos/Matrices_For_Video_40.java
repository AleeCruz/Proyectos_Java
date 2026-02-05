package Arreglos;

public class Matrices_For_Video_40 {
    public static void main(String[] args) {
        //Vamos a ver otra forma de declarar y asignar valores a una matriz

        int[][] cantidades = {
                {10,20,30,20},
                {50,70,60,30},
                {40,30,90,12}
        };

        //Para el recorrido de cada uno de los elementos de mi arreglo-bidimensional

       /* for (int i=0;i< cantidades.length;i++){
            for (int j=0;j<cantidades[i].length;j++){
                System.out.print("cantidades["+i+"}["+j+"]: "+cantidades[i][j]+" ");
            }
            System.out.printf("\n");
        }*/

        for (int i=0;i<cantidades.length;i++){
            for (int j=0;j<cantidades[i].length;j++){
                System.out.printf(cantidades[i][j]+" ");
            }
            System.out.printf("\n");
        }


    }
}
