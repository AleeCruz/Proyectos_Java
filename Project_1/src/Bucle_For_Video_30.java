public class Bucle_For_Video_30 {
    public static void main(String[] args) {
        System.out.println("--------Bucle For----------");

        //Bucle Ascendente

        System.out.println("\nBucle Ascendente");
        for (int i =0; i<=10;i++){
            System.out.println("VUelta No: "+i);
        }
        System.out.println("Fin del bucle");

        System.out.println("\n\n");

        //Bucle Descendente

        System.out.println("Bucle Descendente");
        for (int i=10;i>=0;i--){
            System.out.println("Vuelta No: "+i);
        }
        System.out.println("Fin del programa");


        //Suma

        System.out.println("\n\nSuma de numeros pares");
        int suma =0;

        for (int i=0;i<=20;i++){
            if (i%2 ==0){
                suma = suma +i;
                System.out.println("VUelta No: "+i+" suma: "+suma);
            }
        }

        System.out.println("Suma total es: "+suma);

        System.out.println("FIN DEL PROGRAMA");

    }
}
