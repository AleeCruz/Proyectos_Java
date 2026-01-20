public class Casting_Video_13 {
    public static void main(String[] args) {
        System.out.println("Vamos a castear varios ejemplos ");
        //Vamos a convertir valores de texto a entero
        String numeroTexto = "123";
        int numeroEntero = Integer.parseInt(numeroTexto);
        System.out.println("Numero entero " + numeroEntero);

        //Entero a texto int
        int entero = 456;
        String enteroTexto = String.valueOf(entero);
        System.out.println("Se cambio de entero a texto " + enteroTexto);


        //doble a entero
        double numeroDouble = 123.45;
        int dobleEntero = (int) numeroDouble;
        System.out.println("Se convirtio un numero de double a entero " + dobleEntero);

        //Se convertira de enero a doble
        int enteroNuevo = 4235;
        double nuevoDouble = (double)enteroNuevo;

        System.out.println(nuevoDouble);



    }
}
