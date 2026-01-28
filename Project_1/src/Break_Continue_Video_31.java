public class Break_Continue_Video_31 {
    public static void main(String[] args) {

        //Veremos sobre la sentecias de break and continue

        System.out.println("\n--------Sentencia break------------\n");

        int control =0,f =0;

        System.out.println("\n-------Cargando Resgistros---------\n");

        while (f<=10){
            System.out.println("Ciclo numero: "+f);
            f++;
            if(f==7){
                break;
            }
        }


        //Ahora veremos lo que hace la sentencia continue

        //Veremos otro ejemplo concreto para ver el comportamiento de la sentencia continue


        System.out.println("\n---------Sentencia Continue----------\n");

        System.out.println("Se uso un bucle for para numeros pares ");

        for (int i=0;i<=10;i++){
            if(i%2 ==0){
                continue;
            }
            System.out.println("Valor: "+i);

        }


    //Se vera sobre la sentencia continue desde usando la palabra reservada continue

        System.out.println("Se uso un bucle for para numeros que no sean impares ");
        for (int j=0;j<=20;j++){
            if (j%2 != 0){
                continue;
            }
            System.out.println("Valor: "+j);

        }



    }
}
