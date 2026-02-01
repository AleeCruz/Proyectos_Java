import java.util.Scanner;

public class Clase_MAth_VIdeo_34 {
    public static void main(String[] args) {

        System.out.println("\n-------------FUnciones Matematicas -----------------");

        System.out.println("INgrese un numero...");
        Scanner entrada = new Scanner(System.in);
        int valor = entrada.nextInt();


        //Raiz de un numero
        System.out.println("Raiz de: "+valor+" = "+Math.sqrt(valor));

        //Calculo de una potencia
        int base =2;
        var exponente = 3;
        System.out.println("Potencia de w elevada a la 3 es: "+Math.pow(base,exponente));

        //Calculo de los valores absolutos
        var absoluto = -2.5;
        System.out.println("Valor absoluto de: "+absoluto+" = "+Math.abs(absoluto));


        //Identificación de numeros mayores o menores dado 2 numeros
        var numero_1 = 50.2;
        var numero_2 = 100;
        System.out.println("El mayor numero es = "+Math.max(numero_2,numero_1));
        System.out.println("El menor numero es = "+Math.min(numero_1,numero_2));


        //Ejemplo del redondeo entero mas cercano
        var total = 5.2827;
        System.out.println(total+" redondeada a : "+Math.round(total));


        //Redondear numero hacia arriba

        System.out.println(total+" redondeada hacia abajo es: "+Math.floor(total));

        //Rendondear numero hacia abajo

        System.out.println(total+" redondear hacia arriba es: "+Math.ceil(total));

        //Ejemplo del numero aleatorio

        double aleatorio = Math.random();
        System.out.println("Valor aleatorio entre 0 y 1 es: "+aleatorio);

        //Valor aleatorio entre numeros del 1 al 10
        double aleatorio_2 = Math.round(Math.random() * 10);
        System.out.println("Valor aleatorio entre 0 y 10 es: "+aleatorio_2);


        //Funcion numero de PI

        System.out.println("Valor de PI: "+Math.PI);


        //Funcion del seno de un angulo

        System.out.println("El seno del angulo de 90 es: "+Math.sin(90));

        //Funcion del coseno de un angulo
        System.out.println("El coseno del angulo de 180 es: "+Math.cos(180));

        //Logaritmo Natural de un numero
        var log = 100;
        System.out.println("Logaritmo de: "+log+" = "+Math.log(log));



        //Logaritmo de base 10 de un numero
        var logaritmo = 100;

        System.out.println("Logaritmo de base 10 de un numero es: "+Math.log10(logaritmo));




    }
}
