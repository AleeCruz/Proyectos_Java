public class Arreglos_Bucles_Video_36 {
    public static void main(String[] args) {
        String[] productos = {"Martillo","Destornillador","Taladro","Lave inglesa","Pinzas"};


        //Recorrido de un arreglo por un for
        System.out.println("\n\n-------------Resultado de usar un bucle for------------");
        for (int i=0;i<productos.length;i++){
            System.out.println("Producto "+(i+1)+": "+productos[i]);
        }


        //Haciedo el recorrido de un array con un bucle while

        /*De acá para delante se mostrara el resultado de hacerlo con un bucle while*/

        System.out.println("\n\n---------------_Resuñtado de usar un bucle While-----");
        int j=0;

        while (j< productos.length){
            System.out.println("Producto "+(j+1)+": "+productos[j]);
            j++;
        }


    }
}
