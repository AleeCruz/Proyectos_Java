import java.util.Scanner;

public class Operadores_Aritmeticos_VIdeo_15 {
    public static void main(String[] args) {
        System.out.println("--------------Operadores aritmeticos------------");
        int valor1,valor2,resultado;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer valor: ");
        valor1 = entrada.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        valor2 = entrada.nextInt();

        //Suma

        resultado = valor1+valor2;

        System.out.println("Suma: "+resultado);

        //resta
        resultado = valor1-valor2;
        System.out.println("Resta: "+resultado);

        //Producto
        resultado = valor1*valor2;
        System.out.println("Producto: "+resultado);

        //Cociente
        resultado = valor1 /valor2;
        System.out.println("Cociente: "+resultado);

        //resto
        resultado = valor1 % valor2;
        System.out.println("Resto: "+resultado);


    }
}
