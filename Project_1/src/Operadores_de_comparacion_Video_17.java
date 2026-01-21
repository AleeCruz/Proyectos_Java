public class Operadores_de_comparacion_Video_17 {
    public static void main(String[] args) {
        //Veremos el uso de operadores logicos puntualmente
        int valor_1 = 90,valor_2=90;
        boolean resultado;


        resultado = valor_1 == valor_2;
        System.out.println(valor_1+ " es igual a "+valor_2 +": "+resultado);

        resultado = valor_1 != valor_2;
        System.out.println(valor_1+ " es distinto a "+valor_2 +": "+resultado);

        resultado = valor_1 > valor_2;
        System.out.println(valor_1+ " es mayor a "+valor_2 +": "+resultado);

        resultado = valor_1 < valor_2;
        System.out.println(valor_1+ " es menor a "+valor_2 +": "+resultado);

        resultado = valor_1 >= valor_2;
        System.out.println(valor_1+ " es mayor o igual a "+valor_2 +": "+resultado);

        resultado = valor_1 <= valor_2;
        System.out.println(valor_1+ " es menor o igual a "+valor_2 +": "+resultado);


    }
}
