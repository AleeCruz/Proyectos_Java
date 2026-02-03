public class Arreglos_Operaciones_Video_38 {
    public static void main(String[] args) {
        int ventas_1[] ={500,600,400,100,650};
        int ventas_2[] ={600,800,500,350,900};
        int total[] = new int[ventas_1.length];
        int suma=0;




        System.out.println("Suma de valores");
        for (int i=0;i<ventas_1.length;i++){
            total[i] = ventas_1[i]+ventas_2[i];
            suma += total[i];
            System.out.println("La suma de "+ventas_1[i]+" + "+ventas_2[i]+" = "+
                                total[i]);
        }
        System.out.println("La suma total es: "+suma);

        System.out.println("\n\nResta de valores de un arreglo\n");
        for (int i=0;i<ventas_1.length;i++){
            total[i] = ventas_2[i]-ventas_1[i];
            System.out.println("La Resta de "+ventas_2[i]+" - "+ventas_1[i]+" = "+
                    total[i]);
        }

        System.out.println("\n\n------------Multiplicacion de Arreglos\n\n");
        for(int j=0;j<ventas_1.length;j++){
            total[j] = ventas_1[j] * ventas_2[j];
            System.out.println("La multiplicacion de "+ventas_1[j]+" * "+ventas_2[j]+" = "+total[j]);
        }


    }
}
