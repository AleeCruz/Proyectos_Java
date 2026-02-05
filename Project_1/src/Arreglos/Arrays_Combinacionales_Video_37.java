package Arreglos;

public class Arrays_Combinacionales_Video_37 {
    public static void main(String[] args) {
         String[] productos  = {"Martillo","Destornillador","Taladro","Llave inglesa","Pinzas"};
         double[]precios = {12.50,10.20,200.00,130.50,20.35};


         for (int i=0;i<productos.length;i++){

             if (precios[i]<100){
                 System.out.println("Producto "+(i+1)+" "+productos[i]+": $"+precios[i]+" se le aplicaran impuestos");
             }else{
                 System.out.println("Producto "+(i+1)+" "+productos[i]+": $"+precios[i]+" No se le aplicaran impuestos");
             }
         }
    }
}
