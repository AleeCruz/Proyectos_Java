public class Condicional_if_Or_Video_20 {
    public static void main(String[] args) {
        boolean domingo = false;
        boolean vacaciones = false, licencia = false;


        //Validacion de datos en java

        if (domingo == true || vacaciones == true  || licencia ==true ){
            System.out.println("ACCESO AL SISTEMA DENEGADO ");
        }else{
            System.out.println("ACCESO CONCEDIDO");
            System.out.println("---------------------------");
            System.out.println("BIENVENIDO AL SISTEMA PRINCIPAL");
        }


    }
}
